package com.pj.service.impl;

import com.pj.model.Author;
import com.pj.service.FooService;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import static org.mockito.Mockito.when;

/**
 * @author pengjin
 * @date 1/4/16 3:27 PM
 * @description: <br>
 * <br>
 */
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = "classpath:spring-test.xml")
public class FooServiceImplTest {

    @Autowired
    @Mock
    FooService fooService;
    @Before
    public void myBefore() {
        MockitoAnnotations.initMocks(this);
    }
    @Test
    public void testGetAuthor() throws Exception {
        Author one = new Author("1","pj");
        when(fooService.getAuthor(1)).thenReturn(one);
        Assert.assertEquals(one, fooService.getAuthor(1));
    }
}