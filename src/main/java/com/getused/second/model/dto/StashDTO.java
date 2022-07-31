package com.getused.second.model.dto;

import com.getused.second.model.entity.Product;
import lombok.Getter;
import lombok.Setter;
import java.util.List;

@Getter
@Setter
public class StashDTO {
    private List<Product> productList;


}
