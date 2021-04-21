package com.example.redis.service;

import com.example.redis.entity.Person;
import com.example.redis.repository.CacheDemoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cache.annotation.Cacheable;
import org.springframework.cache.annotation.EnableCaching;

import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
@EnableCaching
public class CacheDemoService {

    @Autowired
    CacheDemoRepository cacheDemoRepository;

    @Autowired
    RedisTemplate<String,Object> redisTemplate;

    private static final String HASH_KEY="Person";


    public Person addPerson(Person person) {
        return cacheDemoRepository.save(person);
    }

    public List<Person> getAllPerson() {
        return cacheDemoRepository.findAll();
    }

    public void deletePerson(Long id) {
        cacheDemoRepository.deleteById(id);
    }

    @Cacheable(key = "#id",value = "Product")
    public Person getPersonById(Long id) {
        Optional<Person> person=cacheDemoRepository.findById(id);
        System.out.println(" Called from repository");
        if(person.isPresent()){
            return person.get();
        }else{
            return person.orElse(new Person(0L,"Empty Person","Dummy Address"));
        }
    }
}
