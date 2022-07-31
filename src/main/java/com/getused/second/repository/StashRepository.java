package com.getused.second.repository;

import com.getused.second.model.entity.Stash;
import org.springframework.data.jpa.repository.JpaRepository;

public interface StashRepository extends JpaRepository<Stash, Long> {
}
