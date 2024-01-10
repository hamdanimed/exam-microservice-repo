package ensa.courseservice.Controller;

import ensa.courseservice.Entity.Course;
import ensa.courseservice.Repository.CourseRepository;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class CourseRestController {

    private CourseRepository courseRepository;

    public CourseRestController(CourseRepository courseRepository) {
        this.courseRepository = courseRepository;
    }
    @GetMapping ("/check")
    public String check(){
        return "working";
    }
    @GetMapping("/courses")
    public List<Course> getCourses(){
        return courseRepository.findAll();
    }
    @GetMapping("/courses/{id}")
    public Course getCourseById(@PathVariable Long id){
        return courseRepository.findById(id).orElse(null);
    }
    @PostMapping("/add-course")
    public String addCourse(@RequestBody Course course){
        courseRepository.save(course);
        return "course was added";
    }
}
