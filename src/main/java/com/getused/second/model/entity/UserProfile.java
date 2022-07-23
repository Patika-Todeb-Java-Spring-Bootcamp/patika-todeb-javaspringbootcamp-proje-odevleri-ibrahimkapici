package com.getused.second.model.entity;

import com.getused.second.model.User;
import com.getused.second.model.entity.Stash;
import lombok.Data;

@Data
public class UserProfile extends User {

    private String comments;
    private String location;
    private Stash stash;
    private int completedTrades;
}
