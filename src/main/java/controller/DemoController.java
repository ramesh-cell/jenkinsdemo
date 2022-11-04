package controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("api/v1/test")
public class DemoController {

    @GetMapping("/hello")
    public String getHello(){
        return "Hello Jenkins";
    }

    @PostMapping("/say")
    public String sayHiJenkins(){
        return "sayHiJenkins";
    }

}
