package ca.gc.ircc.integration.statepersistence.route;

import org.apache.camel.builder.RouteBuilder;
import org.apache.camel.model.rest.RestBindingMode;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class RestEndpoint extends RouteBuilder {

    @Value("${camel.rest.api-component}")
    private String componentId;

    @Value("${camel.rest.api-context-path}")
    private String contextPath;

    @Override
    public void configure() throws Exception {

        restConfiguration().component(componentId).scheme("http").port("9223").bindingMode(RestBindingMode.auto);     
        rest(contextPath).get("/route/a").to("direct:sample");
    }

}
