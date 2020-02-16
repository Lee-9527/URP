package org.llw.servlet;

import org.junit.Test;

import java.net.URL;

import static org.junit.Assert.*;

public class LoginServletTest {

    @Test
    public void service() {
        URL resource = LoginServletTest.class.getClassLoader().getResource("dd.properties");
        System.out.println(resource);
    }
}