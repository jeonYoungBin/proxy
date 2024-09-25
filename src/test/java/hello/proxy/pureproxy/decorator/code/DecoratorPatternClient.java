package hello.proxy.pureproxy.decorator.code;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class DecoratorPatternClient {

    private static final Logger log = LoggerFactory.getLogger(DecoratorPatternClient.class);
    private Component component;

    public DecoratorPatternClient(Component component) {
        this.component = component;
    }

    public void execute() {
        String result = component.operation();
        log.info("result = {}", result);
    }
}
