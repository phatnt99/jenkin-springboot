package com.phnguyen.devopsjava8.hello;

import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.junit.MockitoJUnitRunner;

@RunWith(MockitoJUnitRunner.class)
public class HellloTest {

    @Test
    public void shouldHelloWorld() {
        System.out.println("hello world");
        Assert.assertTrue(true);
    }
}
