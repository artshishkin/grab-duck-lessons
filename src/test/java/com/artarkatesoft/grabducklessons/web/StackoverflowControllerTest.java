package com.artarkatesoft.grabducklessons.web;

import com.artarkatesoft.grabducklessons.model.StackoverflowWebsite;
import com.artarkatesoft.grabducklessons.service.StackoverflowService;
import com.google.common.collect.ImmutableList;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.MockitoJUnitRunner;

import java.util.List;

import static org.junit.Assert.*;
import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.when;

@RunWith(MockitoJUnitRunner.class)
public class StackoverflowControllerTest {

    @Mock
    private StackoverflowService stackoverflowService;

    @InjectMocks
    StackoverflowController sut;

//    @Before
//    public void setUp() throws Exception {
//        sut = new StackoverflowController();
//    }

    @Test
    public void getListOfProviders() {

        //prepare
        when(stackoverflowService.findAll()).thenReturn(ImmutableList.of());

        //testing
        List<StackoverflowWebsite> listOfProviders = sut.getListOfProviders();

        //validate
        verify(stackoverflowService).findAll();

    }
}