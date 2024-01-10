package ensa.studentservice.Entity;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import lombok.*;

@Entity
@Getter @Setter @AllArgsConstructor @NoArgsConstructor @Builder
public class Student {
    @Id
    Long studentid;
    String name;
    String classname;
}
