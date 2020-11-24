package uk.co.theautomatedtester.book.pages;

import com.codeborne.selenide.Condition;
import com.codeborne.selenide.Selenide;
import com.codeborne.selenide.SelenideElement;

import static com.codeborne.selenide.Selenide.$;

public class BookLandingPage {

    private SelenideElement chapterOneLink = $("a[href='/chapter1']");
    private SelenideElement mainPageText = $("div[class=mainbody]");
    //private SelenideElement chapterOneLink = $('a:contains("Chapter1")');


    public SelenideElement getChapterOneLink() {
        return chapterOneLink.shouldBe(Condition.visible);
    }

    public SelenideElement getMainPageText(){
        return mainPageText.shouldBe(Condition.visible);
    }
}
