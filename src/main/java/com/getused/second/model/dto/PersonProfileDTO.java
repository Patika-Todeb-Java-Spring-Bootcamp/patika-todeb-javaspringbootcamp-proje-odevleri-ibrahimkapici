package com.getused.second.model.dto;

import com.getused.second.model.Person;
import com.getused.second.model.entity.Stash;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class PersonProfileDTO extends Person {
    private String comments;
    private String location;
    private Stash stash;
    private int completedTrades;
}
