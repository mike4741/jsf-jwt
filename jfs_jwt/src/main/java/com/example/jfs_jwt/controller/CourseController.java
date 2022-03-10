package com.example.jfs_jwt.controller;

import com.example.jfs_jwt.model.Course;
import com.example.jfs_jwt.service.CourseService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class CourseController {
    @Autowired
   private CourseService courseService;


    @GetMapping("/api/courses")
    @CrossOrigin("*")
  public List<Course> all(){

        return courseService.all();
    }


    @PostMapping(path = "/api/courses")
     public void save(@RequestBody Course course ){

        courseService.save(course);

     }

    @DeleteMapping("/pi/courses/{courseId}")
     public  void   delete(@PathVariable("courseId") String courseId){

        courseService.delete(courseId);

     }

}
