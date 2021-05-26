package com.test.testapp.cucumber;

import com.test.testapp.TestApplicationApp;
import io.cucumber.spring.CucumberContextConfiguration;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.web.WebAppConfiguration;

@CucumberContextConfiguration
@SpringBootTest(classes = TestApplicationApp.class)
@WebAppConfiguration
public class CucumberTestContextConfiguration {}
