package io.github.kji6252.studyspringbootgateway;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.web.client.RestTemplateBuilder;
import org.springframework.cloud.client.circuitbreaker.EnableCircuitBreaker;
import org.springframework.cloud.netflix.zuul.EnableZuulProxy;
import org.springframework.context.annotation.Bean;
import org.springframework.web.client.RestTemplate;

@EnableCircuitBreaker
@EnableZuulProxy
@SpringBootApplication
public class StudySpringbootGatewayApplication {

    public static void main(String[] args) {
        SpringApplication.run(StudySpringbootGatewayApplication.class, args);
    }

    @Bean
    public SimpleFilter simpleFilter(){
        return new SimpleFilter();
    }

    @Bean
    public RestTemplate restTemplate(RestTemplateBuilder restTemplateBuilder) {
        return restTemplateBuilder.build();
    }
}
