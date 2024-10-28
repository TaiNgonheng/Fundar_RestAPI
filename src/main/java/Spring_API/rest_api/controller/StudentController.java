package Spring_API.rest_api.controller;

import Spring_API.rest_api.bean.Student;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@RestController
public class StudentController {

    @GetMapping("/student1")
    public ResponseEntity<Student> getStudent(){
        Student student = new Student(1, "Ngonheng", "Tai");
        Student student1 = new Student(2, "pate", "isco");
        System.out.println(student1);
        return ResponseEntity.ok(student1);
    }

//    @GetMapping("student")
//    public List<Student> getstudent(){
//        List<Student> students = new ArrayList<>();
//        students.add(new Student(1,"heng","zuckerberg"));
//        students.add(new Student(2,"Elon","musk"));
//        students.add(new Student(3,"bernart","annualt"));
//        students.add(new Student(4,"Jeff","Bezos"));
//        return  students;
//    }
//
    @GetMapping("student/{id}/{firstname}/{lastname}")
    public List<Student> studentPathVariable(@PathVariable("id") int studentid, @PathVariable("firstname") String stufirstname, @PathVariable("lastname") String stulastname){
        List<Student> students = new ArrayList<>();
        students.add(new Student(studentid,stufirstname,stulastname));
        return students;
    }
    @GetMapping("student/{id}/{firstname}/{lastname}")
    public Student studentpathvariable(@PathVariable("id") int stuId,
                                       @PathVariable("firstname") String stufirstname,
                                       @PathVariable("lastname") String stuLastname){
        return new Student(stuId,stufirstname,stuLastname);
   }
    @GetMapping("student/hi")
    public Student studentRequestparam(@RequestParam int id,
                                       @RequestParam String firstname,
                                       @RequestParam String lastname){
        return new Student(id,firstname,lastname);
    }
    @PostMapping("student/create")
    @ResponseStatus(HttpStatus.CREATED)
    public Student createStudent(@RequestBody Student student){
        System.out.println(student.getId());
        System.out.println(student.getFirstname());
        System.out.println(student.getLastname());
        return student;
    }

    @PutMapping("student/{id}/update")
    public ResponseEntity<Student> updateStudent(@RequestBody Student student,@PathVariable("id") int studentId){
        System.out.println(student.getFirstname());
        System.out.println(student.getLastname());
        return ResponseEntity.ok(student);
    }

    @DeleteMapping("student/{id}/delete")
    public String deleteStudent(@PathVariable("id") int studentId){
        System.out.println("I have to delete student on NO: "+studentId);
        return "Student delected successfully";
    }
}