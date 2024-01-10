package ensa.studentservice;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

import java.security.cert.CertPathBuilder;

@FeignClient(name = "ENROLLEMENT-SERVICE")
public class EnrollementRestController {

    @PostMapping("/add-enrollement")
    public String addEnrollment(@RequestBody Enrollement enrollement){
        return "add enrollemnt";
    }
}
