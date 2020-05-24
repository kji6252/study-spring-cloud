package io.github.kji6252.studyspringbootgateway;

import com.netflix.hystrix.contrib.javanica.annotation.HystrixCommand;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

@Service
public class ExampleAppService {

    @Autowired
    private RestTemplate restTemplate;

    @HystrixCommand(fallbackMethod = "reliable")
    public String getMessage() {
        return restTemplate.getForObject("http://localhost:8081/message",String.class);
    }

    public String reliable() {
        return "Cloud Native Java (O'Reilly)";
    }


}
