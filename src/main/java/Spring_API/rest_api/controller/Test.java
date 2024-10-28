package Spring_API.rest_api.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Test {

    @GetMapping("/barcelona")
    public String test(){
        return "Bayern Munchen 8 : 2 Barcelona";
    }
}
