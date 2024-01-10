package ensa.studentservice.Controller;

import ensa.studentservice.Enrollement;
import ensa.studentservice.EnrollementRestController;
import ensa.studentservice.Entity.Student;
import ensa.studentservice.Repository.StudentRepository;
import ensa.studentservice.StudentModel;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class StudentRestController {

    private StudentRepository studentRepository;
    private EnrollementRestController enrollementRestController;

    public StudentRestController(StudentRepository studentRepository,EnrollementRestController enrollementRestController) {
        this.studentRepository = studentRepository;
        this.enrollementRestController=enrollementRestController;
    }

    @GetMapping ("/check")
    public String check(){
        return "working";
    }
    @GetMapping("/students")
    public List<Student> getCourses(){
        return studentRepository.findAll();
    }
    @GetMapping("/students/{id}")
    public Student getStudentById(@PathVariable Long id){
        return studentRepository.findById(id).orElse(null);
    }
    @PostMapping("/add-student")
    public String addStudent(@RequestBody StudentModel studentModel){

        studentRepository.save(new Student().builder()
                .studentid(studentModel.getStudentid())
                .classname(studentModel.getClassname())
                .name(studentModel.getName())
                .build()
        );

        studentModel.getCourseIdList().forEach(courseId->{
            enrollementRestController.addEnrollement(new Enrollement().builder()
                    .courseid(courseId)
                    .studentid(studentModel.getStudentid())
            ).build()
        });

        return "student was added";
    }
}