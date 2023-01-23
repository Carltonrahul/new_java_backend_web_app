package newwebapp.newwebapp.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import newwebapp.newwebapp.models.Student;
import newwebapp.newwebapp.repo.StudentRespository;

@RestController
@RequestMapping(value = "/student")


public class MyController {
    @Autowired

    private StudentRespository studentRespository;


    @PostMapping("/")

    public ResponseEntity<?> addStudent(@RequestBody Student student)
    {


        Student save = this.studentRespository.save(student);

        return ResponseEntity.ok(save);
    }



    @GetMapping("/")

    public ResponseEntity<?> GetStudent()
    {


        

        return ResponseEntity.ok(this.studentRespository.findAll());
    }

    




    
}
