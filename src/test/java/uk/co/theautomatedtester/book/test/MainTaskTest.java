package uk.co.theautomatedtester.book.test;

import org.testng.Assert;
import org.testng.annotations.Test;
import uk.co.theautomatedtester.book.base.Core;
import uk.co.theautomatedtester.book.steps.BookLandingPageSteps;
import uk.co.theautomatedtester.book.steps.ChapterOnePageSteps;

public class MainTaskTest extends Core {

    @Test
    public void chapterOneTextAssertion() {
        String expected = "Assert that this text is on the page";

        BookLandingPageSteps landingPageSteps = new BookLandingPageSteps();
        ChapterOnePageSteps chapterOnePageSteps = landingPageSteps
                .visitPage()
                .clickChapterOne();

        Assert.assertEquals(
                chapterOnePageSteps.getSampleAssertionText(),
                expected,
                "Chapter one page`s 'sample assertion text' mismatch with expected");
    }

    @Test
    public void returnToHomepageAssertion() {
        String expected = "Below is a list of links to the examples needed in the chapters. Click on the links below and follow the steps in the book.";
        BookLandingPageSteps landingPageSteps = new BookLandingPageSteps();
        ChapterOnePageSteps chapterOnePageSteps = landingPageSteps
                .visitPage()
                .clickChapterOne();
        chapterOnePageSteps.clickHomePage();

        Assert.assertTrue(
                landingPageSteps.getMainPageText().contains(expected),
                "Didn't returned to home page!"
        );


    }
}
