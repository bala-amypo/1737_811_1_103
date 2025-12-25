package com.example.demo;

import org.testng.Assert;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

@Listeners(com.example.demo.listener.TestResultListener.class)
public class MasterTestNGSuiteTest {

    @Test
    public void contextLoads() {
        Assert.assertTrue(true);
    }
}
