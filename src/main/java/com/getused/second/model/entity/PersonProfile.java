package com.getused.second.model.entity;

import com.getused.second.model.Person;
import lombok.Data;

@Data
public class PersonProfile extends Person {

    private String comments;
    private String location;
    private Stash stash;
    private int completedTrades;
}
