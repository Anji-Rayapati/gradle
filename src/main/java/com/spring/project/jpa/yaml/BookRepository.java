package com.spring.project.jpa.yaml;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;
@Repository
@EnableJpaRepositories
public interface BookRepository extends JpaRepository<Books, Long>{
@Query("select b from Books b")
public List<Books> getAll();
@Query("select b from Books b where b.name=:name")
public List<Books> getBookByName(@Param("name") String name);
}
