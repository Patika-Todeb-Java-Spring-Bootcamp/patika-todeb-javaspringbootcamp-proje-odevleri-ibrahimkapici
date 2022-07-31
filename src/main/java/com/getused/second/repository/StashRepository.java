package com.getused.second.repository;

import com.getused.second.model.entity.Stash;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface StashRepository extends JpaRepository<Stash, Long> {
}
