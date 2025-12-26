package com.example.demo;

import org.springframework.boot.test.context.SpringBootTest;
import org.testng.annotations.Listeners;

@SpringBootTest
@Listeners(TestResultListener.class)
public class MasterTestNGSuiteTest {
}
