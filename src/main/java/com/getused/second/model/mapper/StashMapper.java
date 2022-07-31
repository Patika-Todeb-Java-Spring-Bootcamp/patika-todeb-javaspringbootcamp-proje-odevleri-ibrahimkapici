package com.getused.second.model.mapper;

import com.getused.second.model.dto.StashDTO;
import com.getused.second.model.entity.Stash;

import static org.springframework.data.projection.EntityProjection.ProjectionType.DTO;

public class StashMapper {
    public static StashDTO toDTO(Stash stash) {
        StashDTO stashDTO = new StashDTO();
        stashDTO.setProductList(stash.getProductList());
        return stashDTO;
    }

    public static Stash toEntity(StashDTO stashDTO) {
        Stash stash = new Stash();
        stash.setProductList(stashDTO.getProductList());
        return stash;
    }
}
