package com.getused.second.model.mapper;

import com.getused.second.model.dto.PersonProfileDTO;
import com.getused.second.model.entity.PersonProfile;

public class UserProfileMapper {
    public static PersonProfileDTO toDTO(PersonProfile userProfile) {
        PersonProfileDTO userProfileDTO = new PersonProfileDTO();
        userProfileDTO.setName(userProfile.getName());
        userProfileDTO.setSurname(userProfile.getSurname());
        userProfileDTO.setComments(userProfile.getComments());
        userProfileDTO.setCompletedTrades(userProfile.getCompletedTrades());
        userProfileDTO.setEmail(userProfile.getEmail());
        userProfileDTO.setComments(userProfile.getComments());
        userProfileDTO.setLocation(userProfile.getLocation());
        userProfileDTO.setStash(userProfile.getStash());
        return userProfileDTO;
    }

    public static PersonProfile toEntity(PersonProfileDTO userProfileDTO) {
        PersonProfile userProfile = new PersonProfile();
        userProfile.setName(userProfileDTO.getName());
        userProfile.setSurname(userProfileDTO.getSurname());
        userProfile.setComments(userProfileDTO.getComments());
        userProfile.setCompletedTrades(userProfileDTO.getCompletedTrades());
        userProfile.setEmail(userProfileDTO.getEmail());
        userProfile.setComments(userProfileDTO.getComments());
        userProfile.setLocation(userProfileDTO.getLocation());
        userProfile.setStash(userProfileDTO.getStash());
        return userProfile;
    }
}
