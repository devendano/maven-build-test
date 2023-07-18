package com.hello;

import org.junit.Assert;
import org.junit.Test;

public class GreeterTest {

    private final Greeter greeter = new Greeter();

    @Test
    public void greeterSaysHello() {
        Assert.assertTrue(greeter.sayHello().contains("Hello"));
    }

}