package ensa.enrollementservice.Repository;

import ensa.enrollementservice.Entity.Enrollement;
import org.springframework.data.jpa.repository.JpaRepository;

public interface EnrollementRepository extends JpaRepository<Enrollement,Long> {
}
