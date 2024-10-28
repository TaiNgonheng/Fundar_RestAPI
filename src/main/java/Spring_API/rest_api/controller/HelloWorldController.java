package Spring_API.rest_api.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloWorldController {
    //HTTP GET resquest
    //http://localhost:8080/heng


    @GetMapping("/heng")
    public String helloworld(){
        return "Tai Ngonheng";
    }
}
