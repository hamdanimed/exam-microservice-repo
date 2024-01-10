package ensa.studentservice;

import lombok.*;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Builder
@ToString
public class Enrollement {
    private long id;
    private long courseid;
    private long studentid;
}
