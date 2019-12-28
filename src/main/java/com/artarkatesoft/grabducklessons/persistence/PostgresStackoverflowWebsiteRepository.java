package com.artarkatesoft.grabducklessons.persistence;

import com.artarkatesoft.grabducklessons.model.StackoverflowWebsite;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface PostgresStackoverflowWebsiteRepository extends JpaRepository<StackoverflowWebsite,String> {
    List<StackoverflowWebsite> findAllByDescriptionContainingOrderByDescription(String descriptionPart);


}
