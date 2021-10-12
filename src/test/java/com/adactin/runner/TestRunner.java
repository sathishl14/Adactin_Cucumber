package com.adactin.runner;	

import java.io.IOException;    

import org.junit.BeforeClass;      
import org.junit.runner.RunWith;
import org.openqa.selenium.WebDriver;
import com.adactin.baseclass.BaseClass;
import com.adactin.helper.FileReaderManager;
import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(features ="src/test/java/com/adactin/feature",
	glue ="com/adactin/stepdefenition", 
			plugin= {"com.aventstack.extentreports.cucumber.adapter.ExtentCucumberAdapter:"})


public class TestRunner {

	public static WebDriver driver;
	
	@BeforeClass
	public static void setup() throws IOException {
		String browser =FileReaderManager.getInstance().getInstanceCR().getbrowser();
		driver = BaseClass.getbrowser("chrome");

	}
	
}
                         