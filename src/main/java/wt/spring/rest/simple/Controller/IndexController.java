package wt.spring.rest.simple.Controller;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import wt.spring.rest.simple.Model.Student;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("/")
public class IndexController {

    @GetMapping("/")
    public String hello(){

        return "Hello this is Spring Boot REST API example app. Connect to  API use /api context. For list all students /api/students. For single students with id use /api/student/{id}";
    }

}
