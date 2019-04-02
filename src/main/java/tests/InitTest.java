package tests;

import junit.framework.TestCase;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class InitTest extends TestCase {
    protected WebDriver webDriver;

    @BeforeClass
    protected void setUp() throws Exception {
        System.out.println("Tests are started");
        System.setProperty("webdriver.chrome.driver", "C:\\data\\chromedriver.exe");
        webDriver = new ChromeDriver();

    }

    @AfterClass
    protected void tearDown() throws Exception {
        System.out.println("Tests are finished");
        //webDriver.quit();
    }
}
