package com.getused.second.model.entity;

import com.getused.second.model.Person;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.RequiredArgsConstructor;

import javax.persistence.*;

@NoArgsConstructor
@Entity
@Data
@Table(name = "PersonProfile")
public class PersonProfile extends Person {
    @Id
    private Long id;

    private String comments;
    private String location;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn()
    private Stash stash;
    private int completedTrades;
}
