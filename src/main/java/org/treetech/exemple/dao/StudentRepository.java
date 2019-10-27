package org.treetech.exemple.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import org.treetech.exemple.entities.Student;

@Repository
public interface StudentRepository extends JpaRepository<Student, Long>{

}
