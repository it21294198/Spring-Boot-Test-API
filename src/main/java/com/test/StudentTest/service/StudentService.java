package com.test.StudentTest.service;

import com.test.StudentTest.model.Student;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class StudentService {

    private static Map<Integer, Student> studentMap = new HashMap<>();

    static{

        Student student1 = new Student("hello","124342432","gsa@fsd.emil","kfsjf");
        studentMap.put(studentMap.size(),student1);

        Student student2 = new Student("weerlo","124345432","gsafsf@fsd.emil","dffskfsjf");
        studentMap.put(studentMap.size()+1,student2);
    }
    public static ArrayList<Student> getAllStudents(){
       return new ArrayList<>(studentMap.values());
    }

    public static ArrayList<Student> addStudent(Student student){
        studentMap.put(student.getSid(),student);
        return getAllStudents();
    }

    public static ArrayList<Student> updateStudent(int id,Student student){
        studentMap.put(id,student);
        return getAllStudents();
    }

    public static ArrayList<Student> deleteStudent(int id){
        studentMap.remove(id);
        return getAllStudents();
    }
}
