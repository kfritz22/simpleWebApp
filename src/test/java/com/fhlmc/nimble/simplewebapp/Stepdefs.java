package com.fhlmc.nimble.simplewebapp;

import cucumber.api.java.en.*;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.junit.Assert;

public class Stepdefs {

    private WebDriver dr;

    @Given("that I have loaded the simple web application")

    public void that_I_have_loaded_the_simple_web_application() {
        System.setProperty("webdriver.chrome.driver", "/usr/local/bin/chromedriver");
        dr = new ChromeDriver();
        dr.get("http://localhost:8080/simpleWebApp/hello.jsp");
    }

    @When("I view the page")

    public void i_view_the_page() {
        String title = dr.getTitle();
        Assert.assertEquals("SimpleWebApp",title);
    }

    @Then("I see a message that says {string}")

    public void i_see_a_message_that_says(String string) {
        WebElement message = dr.findElement(By.id("greeting"));
        Assert.assertEquals("Hello!",message.getText());
    }
}
