package com.example.demo.spring.repository;

import com.example.demo.model.Author;
import org.springframework.data.domain.Page;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.awt.print.Pageable;
import java.util.List;
@Repository
public interface AuthorRepository extends JpaRepository<Author,Long> {

    List<Author> findByFioContainingIgnoreCaseOrderByFio(String fio);
    Page<Author> findByFioContainingIgnoreCaseOrderByFio(String fio, Pageable pageable);

}
