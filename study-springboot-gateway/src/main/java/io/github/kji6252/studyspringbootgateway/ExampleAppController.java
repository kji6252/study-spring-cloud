package io.github.kji6252.studyspringbootgateway;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ExampleAppController {

    @Autowired
    private ExampleAppService exampleAppService;

    @GetMapping("/message")
    public String exampleAppMessage() {
        return exampleAppService.getMessage();
    }
}
