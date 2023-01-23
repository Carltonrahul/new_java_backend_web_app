package newwebapp.newwebapp.repo;

import java.util.List;

import org.springframework.data.mongodb.repository.MongoRepository;

import newwebapp.newwebapp.models.Student;

public interface StudentRespository extends MongoRepository<Student, Integer>{
    
    

}
