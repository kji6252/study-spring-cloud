package io.github.kji6252.studyspringbootdiscoveryclient;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@EnableDiscoveryClient
@SpringBootApplication
public class StudySpringbootDiscoveryclientApplication {

    public static void main(String[] args) {
        SpringApplication.run(StudySpringbootDiscoveryclientApplication.class, args);
    }

}
