package hello.proxy.app.v3;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class OrderProxyServiceV3 {
    private final OrderProxyRepositoryV3 orderProxyRepositoryV2;
    
    public void orderItem(String itemId) {
        orderProxyRepositoryV2.save(itemId);
    }
}
