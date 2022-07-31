package com.getused.second.model;
import lombok.Data;

import javax.persistence.Inheritance;
import javax.persistence.InheritanceType;
//import javax.persistence.Inheritance;
//import javax.persistence.InheritanceType;

@Data
@Inheritance(strategy = InheritanceType.SINGLE_TABLE)
public abstract class Person {
    private String name;
    private String surname;
    private String email;
    private String phoneNumber;
    private String description;
}
