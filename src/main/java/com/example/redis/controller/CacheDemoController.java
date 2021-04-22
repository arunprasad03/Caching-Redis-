package com.example.redis.controller;

import com.example.redis.entity.Person;
import com.example.redis.service.CacheDemoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cache.annotation.EnableCaching;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class CacheDemoController {

    @Autowired
    CacheDemoService cacheDemoService;


    @PostMapping("/add/person")
    public Person addPerson(@RequestBody Person person){
        return  cacheDemoService.addPerson(person);

    }
    
    @GetMapping("/get/all")
    public List<Person> getAllPerson(){
        return cacheDemoService.getAllPerson();
    }

    @DeleteMapping("/delete/{id}")
    public String deletePerson(@PathVariable Long id){
        cacheDemoService.deletePerson(id);
        return "Deleted Successfully";
    }
    
    @GetMapping("/get/{id}")
    public Person getByPerson(@PathVariable Long id){
        return cacheDemoService.getPersonById(id);
    }

    @PutMapping("/update/person")
    public String updatePersonById(@RequestBody Person person){
        return cacheDemoService.updatePersonById(person);
    }

}
