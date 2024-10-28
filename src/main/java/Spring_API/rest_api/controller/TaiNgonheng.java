package Spring_API.rest_api.controller;


import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TaiNgonheng {

    @GetMapping("/millionare")
    public String millionare(){
        return "millionare is the only one";
    }
}
