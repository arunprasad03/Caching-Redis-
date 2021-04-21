package com.example.redis.entity;

import lombok.*;
//import org.springframework.data.redis.core.RedisHash;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import java.io.Serializable;

@NoArgsConstructor @AllArgsConstructor @Getter @Setter @ToString
@Entity
@Table(name="Person")
//@RedisHash("Person")
public class Person implements Serializable {


    @Id
    @Column(name="Id")
    private Long id;

    @Column(name="Name")
    private String name;

    @Column(name="Address")
    private String address;

}
