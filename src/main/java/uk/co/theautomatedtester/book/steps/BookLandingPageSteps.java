package uk.co.theautomatedtester.book.steps;

import com.codeborne.selenide.Selenide;
import uk.co.theautomatedtester.book.pages.BookLandingPage;

import static com.codeborne.selenide.Selenide.open;

public class BookLandingPageSteps {

    BookLandingPage landingPage = Selenide.page(BookLandingPage.class);

    public BookLandingPageSteps visitPage(){
        open("http://book.theautomatedtester.co.uk/");
        return this;
    }

    public ChapterOnePageSteps clickChapterOne(){
        landingPage.getChapterOneLink().click();
        return new ChapterOnePageSteps();
    }

    public String getMainPageText(){
        return landingPage.getMainPageText().getText();
    }
}
