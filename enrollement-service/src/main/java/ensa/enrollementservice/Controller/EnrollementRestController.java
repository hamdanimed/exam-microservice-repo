package ensa.enrollementservice.Controller;

import ensa.enrollementservice.Entity.Enrollement;
import ensa.enrollementservice.Repository.EnrollementRepository;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class EnrollementRestController {

    private EnrollementRepository enrollementRepository;

    public EnrollementRestController(EnrollementRepository enrollementRepository) {
        this.enrollementRepository = enrollementRepository;
    }

    @GetMapping ("/check")
    public String check(){
        return "working";
    }

    @GetMapping("/enrollements")
    public List<Enrollement> getEnrollements(){
        return enrollementRepository.findAll();
    }
    @GetMapping("/enrollements/{id}")
    public Enrollement getEnrollementById(@PathVariable Long id){
        return enrollementRepository.findById(id).orElse(null);
    }
    @PostMapping("/add-enrollement")
    public String addCourse(@RequestBody Enrollement enrollement){
        enrollementRepository.save(enrollement);
        return "enrollement was added";
    }
}
