package io.pragra.feb25jpa.repo;

import io.pragra.feb25jpa.entities.StudentJPA;
import org.springframework.data.jpa.repository.JpaRepository;

// In JPA Repo we provide entity and Primary key type
public interface StudentRepo extends JpaRepository<StudentJPA, Integer> {
}
