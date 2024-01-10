package ensa.studentservice;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import lombok.*;

import java.util.List;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class StudentModel {
    Long studentid;
    String name;
    String classname;
    List<Long> courseIdList;
}
