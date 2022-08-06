package com.getused.second.service;

import com.getused.second.model.dto.StashDTO;
import com.getused.second.model.entity.Product;
import com.getused.second.model.entity.Stash;
import com.getused.second.repository.ProductRepository;
import com.getused.second.repository.StashRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

import static com.getused.second.model.dto.StashDTO.StashDTOBuilder.aStashDTO;

@Service
@RequiredArgsConstructor
public class StashService {
    private final StashRepository stashRepository;
    private final ProductRepository productRepository;

    public Stash createStash(Stash stash){

        for (Product product : stash.getProductList()){
            Product productById = productRepository.findById(product.getId()).orElseThrow(RuntimeException::new);
        }
        return stashRepository.save(stash);
    }

    public List<Stash> findAll(){
        return stashRepository.findAll();
    }

    public StashDTO findById(Long id){
        Stash stash = stashRepository.findById(id).orElseThrow(RuntimeException::new);
        return aStashDTO()
                .id(stash.getId())
                .productList(stash.getProductList())
                .build();
    }


}
