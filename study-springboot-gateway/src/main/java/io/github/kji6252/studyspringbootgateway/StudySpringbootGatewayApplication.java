package io.github.kji6252.studyspringbootgateway;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.zuul.EnableZuulProxy;

@EnableZuulProxy
@SpringBootApplication
public class StudySpringbootGatewayApplication {

    public static void main(String[] args) {
        SpringApplication.run(StudySpringbootGatewayApplication.class, args);
    }

}
