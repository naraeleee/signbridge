package com.example.cms.controller.exceptions;

import com.example.cms.model.entity.Indy;
import com.example.cms.model.repository.IndyRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@CrossOrigin
@RestController
public class ClassroomController {

    @Autowired
    private final IndyRepository repository;

    public ClassroomController(IndyRepository repository){this.repository = repository;}

    @GetMapping("/classrooms")
    List<Indy> retrieveAllClassrooms() {
        return repository.findAll();
    }

    @GetMapping("/classrooms/{code}")
    Indy retrieveClassroom(@PathVariable("code") String classroomCode) {
        return repository.findById(classroomCode)
                .orElseThrow(() -> new ClassroomNotFoundException(classroomCode));
    }
}
