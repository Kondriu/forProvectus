package uk.co.theautomatedtester.book.steps;

import com.codeborne.selenide.Selenide;
import uk.co.theautomatedtester.book.pages.ChapterOnePage;

public class ChapterOnePageSteps {
    ChapterOnePage chapterOnePage = Selenide.page(ChapterOnePage.class);
    String exampleAssertionTextValue;

    public String getSampleAssertionText(){
        return chapterOnePage.getExampleAssertionText().getText();
    }
    public BookLandingPageSteps clickHomePage(){
        chapterOnePage.getBackToHomePage().click();
        return new BookLandingPageSteps();
    }
}
