package uk.co.theautomatedtester.book.pages;

import com.codeborne.selenide.Condition;
import com.codeborne.selenide.SelenideElement;

import static com.codeborne.selenide.Selenide.$;

public class ChapterOnePage {
    private SelenideElement exampleAssertionText = $("div[id='divontheleft']");
    private SelenideElement backToHomePage = $("a[href='/']");

    public SelenideElement getExampleAssertionText() {
        return exampleAssertionText.shouldBe(Condition.visible);
    }

    public SelenideElement getBackToHomePage() {
        return backToHomePage.shouldBe(Condition.visible);
    }
}
