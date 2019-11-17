package com.artarkatesoft.grabducklessons.service;

import com.artarkatesoft.grabducklessons.model.StackoverflowWebsite;

import java.util.List;

public interface StackoverflowService {
    List<StackoverflowWebsite> findAll();
}
