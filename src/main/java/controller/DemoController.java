package controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("api/v1/call")
public class DemoController {

    @GetMapping
    public String getHello(){
        return "Hello Jenkins";
    }
    @GetMapping("/getHi")
    public String getHi(){
        return "Hi Jenkins";
    }
}
