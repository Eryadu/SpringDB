package io.pragra.feb25jpa.repo;

import io.pragra.feb25jpa.entities.Instructor;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Component;

@Component
public interface InstructorRepo extends JpaRepository<Instructor, Long> {
}
