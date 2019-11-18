package com.artarkatesoft.grabducklessons.persistence;

import com.artarkatesoft.grabducklessons.model.StackoverflowWebsite;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.mongodb.core.MongoTemplate;
import org.springframework.stereotype.Repository;

import java.util.List;

//@Repository
public class StackoverflowWebsiteRepositoryOldVersion {
//    @Autowired
    private MongoTemplate template;


    public List<StackoverflowWebsite> findAll() {
        return template.findAll(StackoverflowWebsite.class);
    }
}
