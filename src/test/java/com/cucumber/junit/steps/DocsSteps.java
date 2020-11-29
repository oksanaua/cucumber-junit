package com.cucumber.junit.steps;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;

import com.cucumber.junit.pages.DocsPage;
import org.openqa.selenium.WebElement;

import java.util.List;

import static org.assertj.core.api.Assertions.assertThat;

public class DocsSteps {

    private DocsPage docsPage = new DocsPage();

    @Then("there are {int} items in the left-side menu")
    public void verifyLeftSideMenuSize(int expectedSize) {
        assertThat(docsPage.getMenuItemTitles())
                .as("The left-side menu size is not as expected")
                .hasSize(expectedSize);
    }

    @And("left-side menu contains the following links")
    public void verifyleftSideMenuContainFollowingLinks(List<String> expectedTitles) {
        assertThat(docsPage.getMenuItemTitles())
                .extracting(WebElement::getText)
                .as("Some of the left-side mene items are not as expected")
                .containsAll(expectedTitles);
    }
}
