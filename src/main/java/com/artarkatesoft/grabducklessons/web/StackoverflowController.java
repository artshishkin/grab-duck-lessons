package com.artarkatesoft.grabducklessons.web;


import com.artarkatesoft.grabducklessons.model.StackoverflowWebsite;
import com.artarkatesoft.grabducklessons.service.StackoverflowService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/api/stackoverflow")
public class StackoverflowController {


    @Qualifier("DBStackoverflowServiceImpl")
    @Autowired
    private StackoverflowService stackoverflowService;

    @RequestMapping
    public List<StackoverflowWebsite> getListOfProviders(){


        return stackoverflowService.findAll();
    }
}
