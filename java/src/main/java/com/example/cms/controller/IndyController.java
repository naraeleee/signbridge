package com.example.cms.controller;

import com.example.cms.model.entity.Indy;
import com.example.cms.model.repository.IndyRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@CrossOrigin
@RestController
public class IndyController {
    @Autowired
    private final IndyRepository repository;

//    @Autowired
//    private ManagementRepository managementRepositoryRepository;

    public IndyController(IndyRepository repository) {
        this.repository = repository;
    }

    @GetMapping("/jobs")
    List<Indy> retrieveAllJobs() {
        return repository.findAll();
    }

//    @PostMapping("/jobs")
//    Course createJobs(@RequestBody CourseDto courseDto) {
//        Course newCourse = new Course();
//        newCourse.setName(courseDto.getName());
//        newCourse.setCode(courseDto.getCode());
//        User professor = professorRepository.findById(courseDto.getProfessorId()).orElseThrow(
//                () -> new ProfessorNotFoundException(courseDto.getProfessorId()));
//        newCourse.setProfessor(professor);
//        return repository.save(newCourse);
//    }

    @GetMapping("/Indy/{parameter}")
    List<Indy> retrieveSpec(@PathVariable("parameter") String parameter) {
        return repository.searchSpec(parameter);

    }
//
//    @PutMapping("/courses/{code}")
//    Course updateCourse(@RequestBody CourseDto courseDto, @PathVariable("code") String courseCode) {
//        return repository.findById(courseCode)
//                .map(course -> {
//                    course.setName(courseDto.getName());
//                    User professor = professorRepository.findById(courseDto.getProfessorId()).orElseThrow(
//                            () -> new ProfessorNotFoundException(courseDto.getProfessorId()));
//                    course.setProfessor(professor);
//                    return repository.save(course);
//                })
//                .orElseGet(() -> {
//                    Course newCourse = new Course();
//                    newCourse.setCode(courseCode);
//                    User professor = professorRepository.findById(courseDto.getProfessorId()).orElseThrow(
//                            () -> new ProfessorNotFoundException(courseDto.getProfessorId()));
//                    newCourse.setProfessor(professor);
//                    return repository.save(newCourse);
//                });
//    }
//
//    @DeleteMapping("/courses/{code}")
//    void deleteCourse(@PathVariable("code") String courseCode) {
//        repository.deleteById(courseCode);
//    }
}