package com.artarkatesoft.grabducklessons.service;

import com.artarkatesoft.grabducklessons.model.StackoverflowWebsite;
import org.springframework.stereotype.Service;

import java.util.Arrays;
import java.util.List;

@Service
public class FakeStackoverflowServiceImpl implements StackoverflowService {

    private static List<StackoverflowWebsite> items = Arrays.asList(
            new StackoverflowWebsite("stackoverflow","http://www.stackoverflow.com","https://cdn.sstatic.net/Sites/stackoverflow/img/favicon.ico",
                    "Stack Overflow","professional and enthusiast programmers"),
            new StackoverflowWebsite("serverfault","https://serverfault.com","https://cdn.sstatic.net/Sites/serverfault/img/favicon.ico",
                    "Server Fault","system and network administrators"),
            new StackoverflowWebsite("superuser","https://superuser.com/","https://cdn.sstatic.net/Sites/superuser/img/favicon.ico",
                    "Super User","computer enthusiasts and power users")





    );

    @Override
    public List<StackoverflowWebsite> findAll() {
        return items;
    }

}
