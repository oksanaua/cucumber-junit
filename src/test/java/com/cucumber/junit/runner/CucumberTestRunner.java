package com.cucumber.junit.runner;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
        plugin = {"pretty", "html:target/cucumber-reports",
        "json:target/cucumber-reports/CucumberTests.json",
        "junit:target/cucumber-reports/CucumberTests.xml"},
        monochrome = true,
        tags = "",
        strict = true,
        glue = {"com.cucumber.junit.steps", "com.cucumber.junit.hooks"},
        features = "src/test/resources/features")

public class CucumberTestRunner {
}
