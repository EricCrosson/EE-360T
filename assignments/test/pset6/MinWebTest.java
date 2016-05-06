package pset6;

import static org.junit.Assert.*;

import org.junit.Test;
import org.junit.BeforeClass;
import org.junit.AfterClass;
import org.junit.Before;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class MinWebTest {

    private static WebDriver driver = null;

    @BeforeClass
    public static void setUpClass() {

        driver = new FirefoxDriver();  /* Launch the browser */
        /* Edit to the location of min.html on your local filesystem */
        driver.get("file:///home/eric/workspace/ee360t/assignments/src/pset6/min.html");
    }

    @AfterClass
    public static void tearDownClass() {
        
        driver.quit();  /* Close the browser */
    }

    @Before
    public void setUp() {
        
        driver.navigate().refresh();  /* Refresh the page under test (PUT) */
    }

    // execute the test <x = 0, y = 0, z = 0, submitButton = click>
    @Test public void t0() {

        WebElement we = driver.findElement(By.id("x"));
        we.sendKeys("0"); // enter 0 for x
        we = driver.findElement(By.id("y"));
        we.sendKeys("0"); // enter 0 for y
        we = driver.findElement(By.id("z"));
        we.sendKeys("0"); // enter 0 for z
        we = driver.findElement(By.id("computeButton"));
        we.click();

        WebElement result = driver.findElement(By.id("result"));
        String output = result.getText(); // read the output text
        assertEquals("min(0, 0, 0) = 0", output);
    }
}
