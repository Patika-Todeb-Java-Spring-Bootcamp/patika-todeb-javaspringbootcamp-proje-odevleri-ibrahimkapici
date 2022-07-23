package com.getused.second.model;
import lombok.Data;
//import javax.persistence.Inheritance;
//import javax.persistence.InheritanceType;

@Data
public class User {
    private String name;
    private String surname;
    private String email;
    private String phoneNumber;
    private String description;
}
