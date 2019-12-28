package com.artarkatesoft.grabducklessons.service;

import com.artarkatesoft.grabducklessons.model.StackoverflowWebsite;
import com.artarkatesoft.grabducklessons.persistence.PostgresStackoverflowWebsiteRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.annotation.PostConstruct;
import java.util.Arrays;
import java.util.List;

@Service
public class DBStackoverflowServiceImpl implements StackoverflowService {




    @Autowired
//        private MongoStackoverflowWebsiteRepository stackoverflowWebsiteRepository;
    private PostgresStackoverflowWebsiteRepository stackoverflowWebsiteRepository;

    @Override
    public List<StackoverflowWebsite> findAll() {

        return stackoverflowWebsiteRepository.findAll();
//        return stackoverflowWebsiteRepository.findAllByDescriptionContainingOrderByDescription("and");
    }

    @PostConstruct
    private void createFakeDatabase(){
        if (findAll().isEmpty()){
            List<StackoverflowWebsite> items = Arrays.asList(
                    new StackoverflowWebsite("stackoverflow","http://www.stackoverflow.com","https://cdn.sstatic.net/Sites/stackoverflow/img/favicon.ico",
                            "Stack Overflow","professional and enthusiast programmers"),
                    new StackoverflowWebsite("serverfault","https://serverfault.com","https://cdn.sstatic.net/Sites/serverfault/img/favicon.ico",
                            "Server Fault","system and network administrators"),
                    new StackoverflowWebsite("superuser","https://superuser.com/","https://cdn.sstatic.net/Sites/superuser/img/favicon.ico",
                            "Super User","computer enthusiasts and power users")
            );
            stackoverflowWebsiteRepository.saveAll(items);
        }
    }

}
