package Spring_API.rest_api.controller;

import Spring_API.rest_api.bean.Teacher;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TeacherController {

    @GetMapping("/teacher")
    public Teacher teacher(){
        Teacher teacher = new Teacher(1,"mark","zuckerberg");
        return teacher;
    }
}
