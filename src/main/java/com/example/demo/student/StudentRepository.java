package com.example.demo.student;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface StudentRepository extends JpaRepository<Student, Long> {

    /*
        @Query("SELECT s FROM Student s WHERE s.email = ?1") this following
        expression will do same work as above Query.
     */
    Optional<Student> findStudentByEmail(String email);

}
