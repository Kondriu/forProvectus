package uk.co.theautomatedtester.book.base;

import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;

import static com.codeborne.selenide.Selenide.open;

public class Core {

    @BeforeMethod
    public void setup(){
        open();

    }
}
