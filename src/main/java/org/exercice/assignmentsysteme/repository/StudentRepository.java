package org.exercice.assignmentsysteme.repository;

import org.exercice.assignmentsysteme.model.Student;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface StudentRepository extends JpaRepository<Student, Integer> {
}
