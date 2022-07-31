package com.getused.second.repository;

import com.getused.second.model.entity.PersonProfile;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PersonProfileRepository extends JpaRepository<PersonProfile, Long> {
}
