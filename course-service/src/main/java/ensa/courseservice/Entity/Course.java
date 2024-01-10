package ensa.courseservice.Entity;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import lombok.*;

@Entity
@Getter
@Setter
@AllArgsConstructor @NoArgsConstructor @Builder
public class Course {
    @Id
    Long courseid;
    String name;
    String professor;
}
