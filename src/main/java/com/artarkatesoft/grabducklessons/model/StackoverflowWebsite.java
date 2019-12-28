package com.artarkatesoft.grabducklessons.model;


import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
@Data
@NoArgsConstructor
//@AllArgsConstructor
public class StackoverflowWebsite {
    @Id
//    @GeneratedValue
    private String id;

    private String website;
    private String iconImageUrl;
    private String title;
    private String description;

    public StackoverflowWebsite(String id, String website, String iconImageUrl, String title, String description) {
        this.id = id;
        this.website = website;
        this.iconImageUrl = iconImageUrl;
        this.title = title;
        this.description = description;
    }
}
