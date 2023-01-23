package ca.gc.ircc.integration.statepersistence.route;

import org.apache.camel.builder.RouteBuilder;
import org.springframework.stereotype.Component;

@Component
public class SampleRoute extends RouteBuilder {

    @Override
    public void configure() throws Exception {
        from("direct:sample")
            .log("hello")
        .end();        
    }
}
