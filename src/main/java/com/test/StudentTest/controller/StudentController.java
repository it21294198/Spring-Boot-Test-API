package com.test.StudentTest.controller;

import com.test.StudentTest.model.Student;
import com.test.StudentTest.service.StudentService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

import java.util.logging.Logger;

@RestController // this will use if only this is RestAPI
//@RequestMapping(value = "api/v1/studentCrud")
@RequestMapping(value = "api/")
@CrossOrigin
public class StudentController {

//    @CrossOrigin(origins = "http://localhost:8080",maxAge=3600) means:
//    origins: This attribute specifies the list of allowed origins (domains) that can make
//    cross-origin requests to the annotated controller or method. In this case, it's set to "http://localhost:8080,"
//    which means that requests originating from a web page served from the "http://localhost:8080" domain are allowed.

    private static final Logger logger = Logger.getLogger(StudentController.class.getName());

//    http://localhost:8080/api/v1/studentCrud/getStudents
//    @ResponseBody //this will user when View are in api


    //    http://localhost:8080/api/getStudents
    @GetMapping(value = "/getStudents")
   public List<Student> getAllStudents(){

       return StudentService.getAllStudents();
   }

    //    http://localhost:8080/api/addStudent
    @PostMapping(value = "/addStudent")
    public List<Student> addStudent(@RequestBody Student student) {
        return StudentService.addStudent(student);
    }

    //    http://localhost:8080/api/updateStudent/123
    @PutMapping(value = "/updateStudent/{id}")
    public List<Student> updateStudent(@PathVariable int id,@RequestBody Student student){
        logger.warning("This is id : "+id);
        return StudentService.updateStudent(id,student);
    }

    //    http://localhost:8080/api/deleteStudent/123
    @DeleteMapping(value = "/deleteStudent/{id}")
    public List<Student> deleteStudent(@PathVariable int id){
        logger.warning("This is id : "+id);
        return StudentService.deleteStudent(id);
    }

    //    using parameters in URL
    //    http://localhost:8080/api/updateStudent?id=123
    @PutMapping(value = "updateStudent")
    public List<Student> updateStudentOnURL(
            @RequestParam(name = "id", required = false) int id,Student student
    ){
        logger.severe("This is id : "+id);
        logger.warning("This is id : "+id);
        logger.info("This is id : "+id);
        return StudentService.updateStudent(id,student);
    }

}
