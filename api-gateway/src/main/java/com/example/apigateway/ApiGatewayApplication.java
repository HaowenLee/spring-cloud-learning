package com.example.apigateway;

import com.example.apigateway.filter.AccessFilter;
import com.spring4all.swagger.EnableSwagger2Doc;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.zuul.EnableZuulProxy;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;
import springfox.documentation.swagger.web.SwaggerResource;
import springfox.documentation.swagger.web.SwaggerResourcesProvider;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

import java.util.ArrayList;
import java.util.List;

@EnableSwagger2Doc
@EnableZuulProxy
@SpringBootApplication
public class ApiGatewayApplication {

    @Bean
    public AccessFilter accessFilter() {
        return new AccessFilter();
    }

    public static void main(String[] args) {
        SpringApplication.run(ApiGatewayApplication.class, args);
    }

    /**
     * 添加文档来源
     */
    @Component
    @Primary
    static class DocumentationConfig implements SwaggerResourcesProvider {

        @Override
        public List<SwaggerResource> get() {
            List<SwaggerResource> resource = new ArrayList<>();
            resource.add(swaggerResource("eureka-member", "/eureka-member/v2/api-docs", "2.0"));
            resource.add(swaggerResource("eureka-order", "/eureka-order/v2/api-docs", "2.1"));
            return resource;
        }

        private SwaggerResource swaggerResource(String name, String location, String version) {
            SwaggerResource swaggerResource = new SwaggerResource();
            swaggerResource.setName(name);
            swaggerResource.setLocation(location);
            swaggerResource.setSwaggerVersion(version);
            return swaggerResource;
        }
    }
}
