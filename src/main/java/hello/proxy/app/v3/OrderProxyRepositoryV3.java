package hello.proxy.app.v3;

import org.springframework.stereotype.Repository;

@Repository
public class OrderProxyRepositoryV3 {

    public void save(String itemId) {
        if(itemId.equals("ex")) {
            throw new IllegalStateException("예외 발생");
        }
        sleep(100);
    }

    private void sleep(int millisecond) {
        try {
            Thread.sleep(millisecond);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
