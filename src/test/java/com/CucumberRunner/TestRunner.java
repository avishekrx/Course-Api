package com.CucumberRunner;

import org.junit.AfterClass;
import org.junit.runner.RunWith;
import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import utility.ExtentUtil;


@RunWith(Cucumber.class)
@CucumberOptions(features = "src\\test\\java\\features",
                 glue = {"definitions"},
                 plugin = {"pretty","html:target/cucumber-pretty",
                		   "json:target/cucumber.json",
                		   "com.aventstack.extentreports.cucumber.adapter.ExtentCucumberAdapter:"},
                 monochrome = true)
public class TestRunner {

}
