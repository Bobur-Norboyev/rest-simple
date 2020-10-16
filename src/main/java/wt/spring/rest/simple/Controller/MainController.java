package wt.spring.rest.simple.Controller;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import wt.spring.rest.simple.Model.Student;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("/api")
public class MainController {

    @GetMapping("/students")
    public ResponseEntity getAll(){
        Student student = new Student(1L,"Bobur","Norboyev","3-kurs");
        Student student2 = new Student(2L,"Pulat","Iskandarov","3-kurs");
        Student student3 = new Student(3L,"Abbos","Hafizov","3-kurs");

        List<Student> students = new ArrayList<>();
        students.add(student);
        students.add(student2);
        students.add(student3);

        return ResponseEntity.ok(students);
    }

    @GetMapping("/students/{id}")
    public ResponseEntity getOne(@PathVariable Long id){
        Student student = new Student(id,"Bobur","Norboyev","3-kurs");

        return ResponseEntity.ok(student);
    }
    @PostMapping("/students")
    public ResponseEntity create(@RequestBody Student student ){
        return ResponseEntity.ok(student);
    }


}
