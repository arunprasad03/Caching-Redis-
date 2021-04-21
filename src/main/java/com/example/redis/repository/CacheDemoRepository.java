package com.example.redis.repository;

import com.example.redis.entity.Person;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.stereotype.Component;

import java.util.List;
import java.util.Optional;

@Component
public interface CacheDemoRepository extends JpaRepository<Person,Long> {

    Optional<Person> findById(Long id);
    List<Person> findAll();
    Person save(Person person);
    void deleteById(Long id);

}
