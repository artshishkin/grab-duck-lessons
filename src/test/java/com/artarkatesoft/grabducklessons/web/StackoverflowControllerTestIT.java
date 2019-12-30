package com.artarkatesoft.grabducklessons.web;

import com.artarkatesoft.grabducklessons.model.StackoverflowWebsite;

import com.google.common.collect.ImmutableList;
import org.hamcrest.MatcherAssert;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.web.client.TestRestTemplate;
import org.springframework.core.ParameterizedTypeReference;
import org.springframework.http.HttpMethod;
import org.springframework.http.ResponseEntity;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.web.client.RestTemplate;


import java.util.List;
import java.util.stream.Collectors;

import static java.util.stream.Collectors.collectingAndThen;
import static java.util.stream.Collectors.toList;
import static org.hamcrest.MatcherAssert.*;
import static org.hamcrest.Matchers.containsInAnyOrder;
import static org.hamcrest.Matchers.is;
import static org.springframework.boot.test.context.SpringBootTest.WebEnvironment.DEFINED_PORT;
import static org.springframework.boot.test.context.SpringBootTest.WebEnvironment.RANDOM_PORT;


//@RunWith(SpringJUnit4ClassRunner.class)
@RunWith(SpringRunner.class)
@SpringBootTest(webEnvironment = DEFINED_PORT)

//@WebIntegrationTest

public class StackoverflowControllerTestIT {
    //    RestTemplate restTemplate = new TestRestTemplate();
    TestRestTemplate restTemplate = new TestRestTemplate();

//    @Autowired
//    private JdbcTemplate jdbcTemplate;

    @Before
    public void setUp() throws Exception {
//        jdbcTemplate.
    }

    @Test
    public void getListOfProviders() {
        ResponseEntity<List<StackoverflowWebsite>> responseEntity = restTemplate.exchange("http://localhost:8090/api/stackoverflow", HttpMethod.GET, null, new ParameterizedTypeReference<List<StackoverflowWebsite>>() {
        });
        List<StackoverflowWebsite> actualList = responseEntity.getBody();
        //validate
        assertThat(actualList.size(), is(3));

        List<String> actualIds = actualList.stream()
                .map(StackoverflowWebsite::getId)
                .collect(collectingAndThen(toList(), ImmutableList::copyOf));

//        assertThat(actualIds,containsInAnyOrder("website1","website2"));
//        assertThat(actualIds, containsInAnyOrder("stackoverflow", "serverfault", "superuser", "website1", "website2"));
        assertThat(actualIds, containsInAnyOrder("stackoverflow", "serverfault", "superuser"));

    }


}
