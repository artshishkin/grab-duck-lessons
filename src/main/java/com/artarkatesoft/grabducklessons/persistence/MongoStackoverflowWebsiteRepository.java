package com.artarkatesoft.grabducklessons.persistence;

import com.artarkatesoft.grabducklessons.model.StackoverflowWebsite;
import org.springframework.data.mongodb.repository.MongoRepository;

import java.util.List;

public interface MongoStackoverflowWebsiteRepository extends MongoRepository<StackoverflowWebsite,String> {
    List<StackoverflowWebsite> findAllByDescriptionContainingOrderByDescription(String descriptionPart);


}
