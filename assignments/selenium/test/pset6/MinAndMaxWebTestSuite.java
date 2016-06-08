package pset6;

import static org.junit.Assert.*;

import org.junit.Test;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.AfterClass;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class MinAndMaxWebTestSuite {
    private static WebDriver driver = null;

    @BeforeClass
    public static void setUpClass() {

        driver = new FirefoxDriver();  /* Launch the browser */
/* Edit to the location of minandmax.html on your local filesystem */
        driver.get("file:///home/eric/workspace/ee360t/assignments/src/pset6/minandmax.html");
    }

    @AfterClass
    public static void tearDownClass() {

        driver.quit();  /* Close the browser */
    }

    @Before
    public void setUp() {

        driver.navigate().refresh();  /* Refresh the page under test (PUT) */
    }


// execute the test <x = four, y = four, z = four, submitButton = clicklick>
    @Test public void t0() {

        WebElement we = driver.findElement(By.id("x"));
        we.sendKeys("four"); // enter four for x
        we = driver.findElement(By.id("y"));
        we.sendKeys("four"); // enter four for y
        we = driver.findElement(By.id("z"));
        we.sendKeys("four"); // enter four for z
        we = driver.findElement(By.id("min"));
        we.click();
        we = driver.findElement(By.id("computeButton"));
        we.click();

        WebElement result = driver.findElement(By.id("result"));
        String output = result.getText(); // read the output text
        assertEquals("Please enter integer values only!", output);
    }

// execute the test <x = four, y = four, z = four, submitButton = clicklick>
    @Test public void t1() {

        WebElement we = driver.findElement(By.id("x"));
        we.sendKeys("four"); // enter four for x
        we = driver.findElement(By.id("y"));
        we.sendKeys("four"); // enter four for y
        we = driver.findElement(By.id("z"));
        we.sendKeys("four"); // enter four for z
        we = driver.findElement(By.id("max"));
        we.click();
        we = driver.findElement(By.id("computeButton"));
        we.click();

        WebElement result = driver.findElement(By.id("result"));
        String output = result.getText(); // read the output text
        assertEquals("Please enter integer values only!", output);
    }

// execute the test <x = four, y = four, z = four, submitButton = notclicklick>
    @Test public void t2() {

        WebElement we = driver.findElement(By.id("x"));
        we.sendKeys("four"); // enter four for x
        we = driver.findElement(By.id("y"));
        we.sendKeys("four"); // enter four for y
        we = driver.findElement(By.id("z"));
        we.sendKeys("four"); // enter four for z
        we = driver.findElement(By.id("min"));
        we.click();
        we = driver.findElement(By.id("computeButton"));
    }

// execute the test <x = four, y = four, z = four, submitButton = notclicklick>
    @Test public void t3() {

        WebElement we = driver.findElement(By.id("x"));
        we.sendKeys("four"); // enter four for x
        we = driver.findElement(By.id("y"));
        we.sendKeys("four"); // enter four for y
        we = driver.findElement(By.id("z"));
        we.sendKeys("four"); // enter four for z
        we = driver.findElement(By.id("max"));
        we.click();
        we = driver.findElement(By.id("computeButton"));
    }

// execute the test <x = four, y = four, z = -1, submitButton = clicklick>
    @Test public void t4() {

        WebElement we = driver.findElement(By.id("x"));
        we.sendKeys("four"); // enter four for x
        we = driver.findElement(By.id("y"));
        we.sendKeys("four"); // enter four for y
        we = driver.findElement(By.id("z"));
        we.sendKeys("-1"); // enter -1 for z
        we = driver.findElement(By.id("min"));
        we.click();
        we = driver.findElement(By.id("computeButton"));
        we.click();

        WebElement result = driver.findElement(By.id("result"));
        String output = result.getText(); // read the output text
        assertEquals("Please enter integer values only!", output);
    }

// execute the test <x = four, y = four, z = -1, submitButton = clicklick>
    @Test public void t5() {

        WebElement we = driver.findElement(By.id("x"));
        we.sendKeys("four"); // enter four for x
        we = driver.findElement(By.id("y"));
        we.sendKeys("four"); // enter four for y
        we = driver.findElement(By.id("z"));
        we.sendKeys("-1"); // enter -1 for z
        we = driver.findElement(By.id("max"));
        we.click();
        we = driver.findElement(By.id("computeButton"));
        we.click();

        WebElement result = driver.findElement(By.id("result"));
        String output = result.getText(); // read the output text
        assertEquals("Please enter integer values only!", output);
    }

// execute the test <x = four, y = four, z = -1, submitButton = notclicklick>
    @Test public void t6() {

        WebElement we = driver.findElement(By.id("x"));
        we.sendKeys("four"); // enter four for x
        we = driver.findElement(By.id("y"));
        we.sendKeys("four"); // enter four for y
        we = driver.findElement(By.id("z"));
        we.sendKeys("-1"); // enter -1 for z
        we = driver.findElement(By.id("min"));
        we.click();
        we = driver.findElement(By.id("computeButton"));
    }

// execute the test <x = four, y = four, z = -1, submitButton = notclicklick>
    @Test public void t7() {

        WebElement we = driver.findElement(By.id("x"));
        we.sendKeys("four"); // enter four for x
        we = driver.findElement(By.id("y"));
        we.sendKeys("four"); // enter four for y
        we = driver.findElement(By.id("z"));
        we.sendKeys("-1"); // enter -1 for z
        we = driver.findElement(By.id("max"));
        we.click();
        we = driver.findElement(By.id("computeButton"));
    }

// execute the test <x = four, y = four, z = 0, submitButton = clicklick>
    @Test public void t8() {

        WebElement we = driver.findElement(By.id("x"));
        we.sendKeys("four"); // enter four for x
        we = driver.findElement(By.id("y"));
        we.sendKeys("four"); // enter four for y
        we = driver.findElement(By.id("z"));
        we.sendKeys("0"); // enter 0 for z
        we = driver.findElement(By.id("min"));
        we.click();
        we = driver.findElement(By.id("computeButton"));
        we.click();

        WebElement result = driver.findElement(By.id("result"));
        String output = result.getText(); // read the output text
        assertEquals("Please enter integer values only!", output);
    }

// execute the test <x = four, y = four, z = 0, submitButton = clicklick>
    @Test public void t9() {

        WebElement we = driver.findElement(By.id("x"));
        we.sendKeys("four"); // enter four for x
        we = driver.findElement(By.id("y"));
        we.sendKeys("four"); // enter four for y
        we = driver.findElement(By.id("z"));
        we.sendKeys("0"); // enter 0 for z
        we = driver.findElement(By.id("max"));
        we.click();
        we = driver.findElement(By.id("computeButton"));
        we.click();

        WebElement result = driver.findElement(By.id("result"));
        String output = result.getText(); // read the output text
        assertEquals("Please enter integer values only!", output);
    }

// execute the test <x = four, y = four, z = 0, submitButton = notclicklick>
    @Test public void t10() {

        WebElement we = driver.findElement(By.id("x"));
        we.sendKeys("four"); // enter four for x
        we = driver.findElement(By.id("y"));
        we.sendKeys("four"); // enter four for y
        we = driver.findElement(By.id("z"));
        we.sendKeys("0"); // enter 0 for z
        we = driver.findElement(By.id("min"));
        we.click();
        we = driver.findElement(By.id("computeButton"));
    }

// execute the test <x = four, y = four, z = 0, submitButton = notclicklick>
    @Test public void t11() {

        WebElement we = driver.findElement(By.id("x"));
        we.sendKeys("four"); // enter four for x
        we = driver.findElement(By.id("y"));
        we.sendKeys("four"); // enter four for y
        we = driver.findElement(By.id("z"));
        we.sendKeys("0"); // enter 0 for z
        we = driver.findElement(By.id("max"));
        we.click();
        we = driver.findElement(By.id("computeButton"));
    }

// execute the test <x = four, y = four, z = 1, submitButton = clicklick>
    @Test public void t12() {

        WebElement we = driver.findElement(By.id("x"));
        we.sendKeys("four"); // enter four for x
        we = driver.findElement(By.id("y"));
        we.sendKeys("four"); // enter four for y
        we = driver.findElement(By.id("z"));
        we.sendKeys("1"); // enter 1 for z
        we = driver.findElement(By.id("min"));
        we.click();
        we = driver.findElement(By.id("computeButton"));
        we.click();

        WebElement result = driver.findElement(By.id("result"));
        String output = result.getText(); // read the output text
        assertEquals("Please enter integer values only!", output);
    }

// execute the test <x = four, y = four, z = 1, submitButton = clicklick>
    @Test public void t13() {

        WebElement we = driver.findElement(By.id("x"));
        we.sendKeys("four"); // enter four for x
        we = driver.findElement(By.id("y"));
        we.sendKeys("four"); // enter four for y
        we = driver.findElement(By.id("z"));
        we.sendKeys("1"); // enter 1 for z
        we = driver.findElement(By.id("max"));
        we.click();
        we = driver.findElement(By.id("computeButton"));
        we.click();

        WebElement result = driver.findElement(By.id("result"));
        String output = result.getText(); // read the output text
        assertEquals("Please enter integer values only!", output);
    }

// execute the test <x = four, y = four, z = 1, submitButton = notclicklick>
    @Test public void t14() {

        WebElement we = driver.findElement(By.id("x"));
        we.sendKeys("four"); // enter four for x
        we = driver.findElement(By.id("y"));
        we.sendKeys("four"); // enter four for y
        we = driver.findElement(By.id("z"));
        we.sendKeys("1"); // enter 1 for z
        we = driver.findElement(By.id("min"));
        we.click();
        we = driver.findElement(By.id("computeButton"));
    }

// execute the test <x = four, y = four, z = 1, submitButton = notclicklick>
    @Test public void t15() {

        WebElement we = driver.findElement(By.id("x"));
        we.sendKeys("four"); // enter four for x
        we = driver.findElement(By.id("y"));
        we.sendKeys("four"); // enter four for y
        we = driver.findElement(By.id("z"));
        we.sendKeys("1"); // enter 1 for z
        we = driver.findElement(By.id("max"));
        we.click();
        we = driver.findElement(By.id("computeButton"));
    }

// execute the test <x = four, y = -1, z = four, submitButton = clicklick>
    @Test public void t16() {

        WebElement we = driver.findElement(By.id("x"));
        we.sendKeys("four"); // enter four for x
        we = driver.findElement(By.id("y"));
        we.sendKeys("-1"); // enter -1 for y
        we = driver.findElement(By.id("z"));
        we.sendKeys("four"); // enter four for z
        we = driver.findElement(By.id("min"));
        we.click();
        we = driver.findElement(By.id("computeButton"));
        we.click();

        WebElement result = driver.findElement(By.id("result"));
        String output = result.getText(); // read the output text
        assertEquals("Please enter integer values only!", output);
    }

// execute the test <x = four, y = -1, z = four, submitButton = clicklick>
    @Test public void t17() {

        WebElement we = driver.findElement(By.id("x"));
        we.sendKeys("four"); // enter four for x
        we = driver.findElement(By.id("y"));
        we.sendKeys("-1"); // enter -1 for y
        we = driver.findElement(By.id("z"));
        we.sendKeys("four"); // enter four for z
        we = driver.findElement(By.id("max"));
        we.click();
        we = driver.findElement(By.id("computeButton"));
        we.click();

        WebElement result = driver.findElement(By.id("result"));
        String output = result.getText(); // read the output text
        assertEquals("Please enter integer values only!", output);
    }

// execute the test <x = four, y = -1, z = four, submitButton = notclicklick>
    @Test public void t18() {

        WebElement we = driver.findElement(By.id("x"));
        we.sendKeys("four"); // enter four for x
        we = driver.findElement(By.id("y"));
        we.sendKeys("-1"); // enter -1 for y
        we = driver.findElement(By.id("z"));
        we.sendKeys("four"); // enter four for z
        we = driver.findElement(By.id("min"));
        we.click();
        we = driver.findElement(By.id("computeButton"));
    }

// execute the test <x = four, y = -1, z = four, submitButton = notclicklick>
    @Test public void t19() {

        WebElement we = driver.findElement(By.id("x"));
        we.sendKeys("four"); // enter four for x
        we = driver.findElement(By.id("y"));
        we.sendKeys("-1"); // enter -1 for y
        we = driver.findElement(By.id("z"));
        we.sendKeys("four"); // enter four for z
        we = driver.findElement(By.id("max"));
        we.click();
        we = driver.findElement(By.id("computeButton"));
    }

// execute the test <x = four, y = -1, z = -1, submitButton = clicklick>
    @Test public void t20() {

        WebElement we = driver.findElement(By.id("x"));
        we.sendKeys("four"); // enter four for x
        we = driver.findElement(By.id("y"));
        we.sendKeys("-1"); // enter -1 for y
        we = driver.findElement(By.id("z"));
        we.sendKeys("-1"); // enter -1 for z
        we = driver.findElement(By.id("min"));
        we.click();
        we = driver.findElement(By.id("computeButton"));
        we.click();

        WebElement result = driver.findElement(By.id("result"));
        String output = result.getText(); // read the output text
        assertEquals("Please enter integer values only!", output);
    }

// execute the test <x = four, y = -1, z = -1, submitButton = clicklick>
    @Test public void t21() {

        WebElement we = driver.findElement(By.id("x"));
        we.sendKeys("four"); // enter four for x
        we = driver.findElement(By.id("y"));
        we.sendKeys("-1"); // enter -1 for y
        we = driver.findElement(By.id("z"));
        we.sendKeys("-1"); // enter -1 for z
        we = driver.findElement(By.id("max"));
        we.click();
        we = driver.findElement(By.id("computeButton"));
        we.click();

        WebElement result = driver.findElement(By.id("result"));
        String output = result.getText(); // read the output text
        assertEquals("Please enter integer values only!", output);
    }

// execute the test <x = four, y = -1, z = -1, submitButton = notclicklick>
    @Test public void t22() {

        WebElement we = driver.findElement(By.id("x"));
        we.sendKeys("four"); // enter four for x
        we = driver.findElement(By.id("y"));
        we.sendKeys("-1"); // enter -1 for y
        we = driver.findElement(By.id("z"));
        we.sendKeys("-1"); // enter -1 for z
        we = driver.findElement(By.id("min"));
        we.click();
        we = driver.findElement(By.id("computeButton"));
    }

// execute the test <x = four, y = -1, z = -1, submitButton = notclicklick>
    @Test public void t23() {

        WebElement we = driver.findElement(By.id("x"));
        we.sendKeys("four"); // enter four for x
        we = driver.findElement(By.id("y"));
        we.sendKeys("-1"); // enter -1 for y
        we = driver.findElement(By.id("z"));
        we.sendKeys("-1"); // enter -1 for z
        we = driver.findElement(By.id("max"));
        we.click();
        we = driver.findElement(By.id("computeButton"));
    }

// execute the test <x = four, y = -1, z = 0, submitButton = clicklick>
    @Test public void t24() {

        WebElement we = driver.findElement(By.id("x"));
        we.sendKeys("four"); // enter four for x
        we = driver.findElement(By.id("y"));
        we.sendKeys("-1"); // enter -1 for y
        we = driver.findElement(By.id("z"));
        we.sendKeys("0"); // enter 0 for z
        we = driver.findElement(By.id("min"));
        we.click();
        we = driver.findElement(By.id("computeButton"));
        we.click();

        WebElement result = driver.findElement(By.id("result"));
        String output = result.getText(); // read the output text
        assertEquals("Please enter integer values only!", output);
    }

// execute the test <x = four, y = -1, z = 0, submitButton = clicklick>
    @Test public void t25() {

        WebElement we = driver.findElement(By.id("x"));
        we.sendKeys("four"); // enter four for x
        we = driver.findElement(By.id("y"));
        we.sendKeys("-1"); // enter -1 for y
        we = driver.findElement(By.id("z"));
        we.sendKeys("0"); // enter 0 for z
        we = driver.findElement(By.id("max"));
        we.click();
        we = driver.findElement(By.id("computeButton"));
        we.click();

        WebElement result = driver.findElement(By.id("result"));
        String output = result.getText(); // read the output text
        assertEquals("Please enter integer values only!", output);
    }

// execute the test <x = four, y = -1, z = 0, submitButton = notclicklick>
    @Test public void t26() {

        WebElement we = driver.findElement(By.id("x"));
        we.sendKeys("four"); // enter four for x
        we = driver.findElement(By.id("y"));
        we.sendKeys("-1"); // enter -1 for y
        we = driver.findElement(By.id("z"));
        we.sendKeys("0"); // enter 0 for z
        we = driver.findElement(By.id("min"));
        we.click();
        we = driver.findElement(By.id("computeButton"));
    }

// execute the test <x = four, y = -1, z = 0, submitButton = notclicklick>
    @Test public void t27() {

        WebElement we = driver.findElement(By.id("x"));
        we.sendKeys("four"); // enter four for x
        we = driver.findElement(By.id("y"));
        we.sendKeys("-1"); // enter -1 for y
        we = driver.findElement(By.id("z"));
        we.sendKeys("0"); // enter 0 for z
        we = driver.findElement(By.id("max"));
        we.click();
        we = driver.findElement(By.id("computeButton"));
    }

// execute the test <x = four, y = -1, z = 1, submitButton = clicklick>
    @Test public void t28() {

        WebElement we = driver.findElement(By.id("x"));
        we.sendKeys("four"); // enter four for x
        we = driver.findElement(By.id("y"));
        we.sendKeys("-1"); // enter -1 for y
        we = driver.findElement(By.id("z"));
        we.sendKeys("1"); // enter 1 for z
        we = driver.findElement(By.id("min"));
        we.click();
        we = driver.findElement(By.id("computeButton"));
        we.click();

        WebElement result = driver.findElement(By.id("result"));
        String output = result.getText(); // read the output text
        assertEquals("Please enter integer values only!", output);
    }

// execute the test <x = four, y = -1, z = 1, submitButton = clicklick>
    @Test public void t29() {

        WebElement we = driver.findElement(By.id("x"));
        we.sendKeys("four"); // enter four for x
        we = driver.findElement(By.id("y"));
        we.sendKeys("-1"); // enter -1 for y
        we = driver.findElement(By.id("z"));
        we.sendKeys("1"); // enter 1 for z
        we = driver.findElement(By.id("max"));
        we.click();
        we = driver.findElement(By.id("computeButton"));
        we.click();

        WebElement result = driver.findElement(By.id("result"));
        String output = result.getText(); // read the output text
        assertEquals("Please enter integer values only!", output);
    }

// execute the test <x = four, y = -1, z = 1, submitButton = notclicklick>
    @Test public void t30() {

        WebElement we = driver.findElement(By.id("x"));
        we.sendKeys("four"); // enter four for x
        we = driver.findElement(By.id("y"));
        we.sendKeys("-1"); // enter -1 for y
        we = driver.findElement(By.id("z"));
        we.sendKeys("1"); // enter 1 for z
        we = driver.findElement(By.id("min"));
        we.click();
        we = driver.findElement(By.id("computeButton"));
    }

// execute the test <x = four, y = -1, z = 1, submitButton = notclicklick>
    @Test public void t31() {

        WebElement we = driver.findElement(By.id("x"));
        we.sendKeys("four"); // enter four for x
        we = driver.findElement(By.id("y"));
        we.sendKeys("-1"); // enter -1 for y
        we = driver.findElement(By.id("z"));
        we.sendKeys("1"); // enter 1 for z
        we = driver.findElement(By.id("max"));
        we.click();
        we = driver.findElement(By.id("computeButton"));
    }

// execute the test <x = four, y = 0, z = four, submitButton = clicklick>
    @Test public void t32() {

        WebElement we = driver.findElement(By.id("x"));
        we.sendKeys("four"); // enter four for x
        we = driver.findElement(By.id("y"));
        we.sendKeys("0"); // enter 0 for y
        we = driver.findElement(By.id("z"));
        we.sendKeys("four"); // enter four for z
        we = driver.findElement(By.id("min"));
        we.click();
        we = driver.findElement(By.id("computeButton"));
        we.click();

        WebElement result = driver.findElement(By.id("result"));
        String output = result.getText(); // read the output text
        assertEquals("Please enter integer values only!", output);
    }

// execute the test <x = four, y = 0, z = four, submitButton = clicklick>
    @Test public void t33() {

        WebElement we = driver.findElement(By.id("x"));
        we.sendKeys("four"); // enter four for x
        we = driver.findElement(By.id("y"));
        we.sendKeys("0"); // enter 0 for y
        we = driver.findElement(By.id("z"));
        we.sendKeys("four"); // enter four for z
        we = driver.findElement(By.id("max"));
        we.click();
        we = driver.findElement(By.id("computeButton"));
        we.click();

        WebElement result = driver.findElement(By.id("result"));
        String output = result.getText(); // read the output text
        assertEquals("Please enter integer values only!", output);
    }

// execute the test <x = four, y = 0, z = four, submitButton = notclicklick>
    @Test public void t34() {

        WebElement we = driver.findElement(By.id("x"));
        we.sendKeys("four"); // enter four for x
        we = driver.findElement(By.id("y"));
        we.sendKeys("0"); // enter 0 for y
        we = driver.findElement(By.id("z"));
        we.sendKeys("four"); // enter four for z
        we = driver.findElement(By.id("min"));
        we.click();
        we = driver.findElement(By.id("computeButton"));
    }

// execute the test <x = four, y = 0, z = four, submitButton = notclicklick>
    @Test public void t35() {

        WebElement we = driver.findElement(By.id("x"));
        we.sendKeys("four"); // enter four for x
        we = driver.findElement(By.id("y"));
        we.sendKeys("0"); // enter 0 for y
        we = driver.findElement(By.id("z"));
        we.sendKeys("four"); // enter four for z
        we = driver.findElement(By.id("max"));
        we.click();
        we = driver.findElement(By.id("computeButton"));
    }

// execute the test <x = four, y = 0, z = -1, submitButton = clicklick>
    @Test public void t36() {

        WebElement we = driver.findElement(By.id("x"));
        we.sendKeys("four"); // enter four for x
        we = driver.findElement(By.id("y"));
        we.sendKeys("0"); // enter 0 for y
        we = driver.findElement(By.id("z"));
        we.sendKeys("-1"); // enter -1 for z
        we = driver.findElement(By.id("min"));
        we.click();
        we = driver.findElement(By.id("computeButton"));
        we.click();

        WebElement result = driver.findElement(By.id("result"));
        String output = result.getText(); // read the output text
        assertEquals("Please enter integer values only!", output);
    }

// execute the test <x = four, y = 0, z = -1, submitButton = clicklick>
    @Test public void t37() {

        WebElement we = driver.findElement(By.id("x"));
        we.sendKeys("four"); // enter four for x
        we = driver.findElement(By.id("y"));
        we.sendKeys("0"); // enter 0 for y
        we = driver.findElement(By.id("z"));
        we.sendKeys("-1"); // enter -1 for z
        we = driver.findElement(By.id("max"));
        we.click();
        we = driver.findElement(By.id("computeButton"));
        we.click();

        WebElement result = driver.findElement(By.id("result"));
        String output = result.getText(); // read the output text
        assertEquals("Please enter integer values only!", output);
    }

// execute the test <x = four, y = 0, z = -1, submitButton = notclicklick>
    @Test public void t38() {

        WebElement we = driver.findElement(By.id("x"));
        we.sendKeys("four"); // enter four for x
        we = driver.findElement(By.id("y"));
        we.sendKeys("0"); // enter 0 for y
        we = driver.findElement(By.id("z"));
        we.sendKeys("-1"); // enter -1 for z
        we = driver.findElement(By.id("min"));
        we.click();
        we = driver.findElement(By.id("computeButton"));
    }

// execute the test <x = four, y = 0, z = -1, submitButton = notclicklick>
    @Test public void t39() {

        WebElement we = driver.findElement(By.id("x"));
        we.sendKeys("four"); // enter four for x
        we = driver.findElement(By.id("y"));
        we.sendKeys("0"); // enter 0 for y
        we = driver.findElement(By.id("z"));
        we.sendKeys("-1"); // enter -1 for z
        we = driver.findElement(By.id("max"));
        we.click();
        we = driver.findElement(By.id("computeButton"));
    }

// execute the test <x = four, y = 0, z = 0, submitButton = clicklick>
    @Test public void t40() {

        WebElement we = driver.findElement(By.id("x"));
        we.sendKeys("four"); // enter four for x
        we = driver.findElement(By.id("y"));
        we.sendKeys("0"); // enter 0 for y
        we = driver.findElement(By.id("z"));
        we.sendKeys("0"); // enter 0 for z
        we = driver.findElement(By.id("min"));
        we.click();
        we = driver.findElement(By.id("computeButton"));
        we.click();

        WebElement result = driver.findElement(By.id("result"));
        String output = result.getText(); // read the output text
        assertEquals("Please enter integer values only!", output);
    }

// execute the test <x = four, y = 0, z = 0, submitButton = clicklick>
    @Test public void t41() {

        WebElement we = driver.findElement(By.id("x"));
        we.sendKeys("four"); // enter four for x
        we = driver.findElement(By.id("y"));
        we.sendKeys("0"); // enter 0 for y
        we = driver.findElement(By.id("z"));
        we.sendKeys("0"); // enter 0 for z
        we = driver.findElement(By.id("max"));
        we.click();
        we = driver.findElement(By.id("computeButton"));
        we.click();

        WebElement result = driver.findElement(By.id("result"));
        String output = result.getText(); // read the output text
        assertEquals("Please enter integer values only!", output);
    }

// execute the test <x = four, y = 0, z = 0, submitButton = notclicklick>
    @Test public void t42() {

        WebElement we = driver.findElement(By.id("x"));
        we.sendKeys("four"); // enter four for x
        we = driver.findElement(By.id("y"));
        we.sendKeys("0"); // enter 0 for y
        we = driver.findElement(By.id("z"));
        we.sendKeys("0"); // enter 0 for z
        we = driver.findElement(By.id("min"));
        we.click();
        we = driver.findElement(By.id("computeButton"));
    }

// execute the test <x = four, y = 0, z = 0, submitButton = notclicklick>
    @Test public void t43() {

        WebElement we = driver.findElement(By.id("x"));
        we.sendKeys("four"); // enter four for x
        we = driver.findElement(By.id("y"));
        we.sendKeys("0"); // enter 0 for y
        we = driver.findElement(By.id("z"));
        we.sendKeys("0"); // enter 0 for z
        we = driver.findElement(By.id("max"));
        we.click();
        we = driver.findElement(By.id("computeButton"));
    }

// execute the test <x = four, y = 0, z = 1, submitButton = clicklick>
    @Test public void t44() {

        WebElement we = driver.findElement(By.id("x"));
        we.sendKeys("four"); // enter four for x
        we = driver.findElement(By.id("y"));
        we.sendKeys("0"); // enter 0 for y
        we = driver.findElement(By.id("z"));
        we.sendKeys("1"); // enter 1 for z
        we = driver.findElement(By.id("min"));
        we.click();
        we = driver.findElement(By.id("computeButton"));
        we.click();

        WebElement result = driver.findElement(By.id("result"));
        String output = result.getText(); // read the output text
        assertEquals("Please enter integer values only!", output);
    }

// execute the test <x = four, y = 0, z = 1, submitButton = clicklick>
    @Test public void t45() {

        WebElement we = driver.findElement(By.id("x"));
        we.sendKeys("four"); // enter four for x
        we = driver.findElement(By.id("y"));
        we.sendKeys("0"); // enter 0 for y
        we = driver.findElement(By.id("z"));
        we.sendKeys("1"); // enter 1 for z
        we = driver.findElement(By.id("max"));
        we.click();
        we = driver.findElement(By.id("computeButton"));
        we.click();

        WebElement result = driver.findElement(By.id("result"));
        String output = result.getText(); // read the output text
        assertEquals("Please enter integer values only!", output);
    }

// execute the test <x = four, y = 0, z = 1, submitButton = notclicklick>
    @Test public void t46() {

        WebElement we = driver.findElement(By.id("x"));
        we.sendKeys("four"); // enter four for x
        we = driver.findElement(By.id("y"));
        we.sendKeys("0"); // enter 0 for y
        we = driver.findElement(By.id("z"));
        we.sendKeys("1"); // enter 1 for z
        we = driver.findElement(By.id("min"));
        we.click();
        we = driver.findElement(By.id("computeButton"));
    }

// execute the test <x = four, y = 0, z = 1, submitButton = notclicklick>
    @Test public void t47() {

        WebElement we = driver.findElement(By.id("x"));
        we.sendKeys("four"); // enter four for x
        we = driver.findElement(By.id("y"));
        we.sendKeys("0"); // enter 0 for y
        we = driver.findElement(By.id("z"));
        we.sendKeys("1"); // enter 1 for z
        we = driver.findElement(By.id("max"));
        we.click();
        we = driver.findElement(By.id("computeButton"));
    }

// execute the test <x = four, y = 1, z = four, submitButton = clicklick>
    @Test public void t48() {

        WebElement we = driver.findElement(By.id("x"));
        we.sendKeys("four"); // enter four for x
        we = driver.findElement(By.id("y"));
        we.sendKeys("1"); // enter 1 for y
        we = driver.findElement(By.id("z"));
        we.sendKeys("four"); // enter four for z
        we = driver.findElement(By.id("min"));
        we.click();
        we = driver.findElement(By.id("computeButton"));
        we.click();

        WebElement result = driver.findElement(By.id("result"));
        String output = result.getText(); // read the output text
        assertEquals("Please enter integer values only!", output);
    }

// execute the test <x = four, y = 1, z = four, submitButton = clicklick>
    @Test public void t49() {

        WebElement we = driver.findElement(By.id("x"));
        we.sendKeys("four"); // enter four for x
        we = driver.findElement(By.id("y"));
        we.sendKeys("1"); // enter 1 for y
        we = driver.findElement(By.id("z"));
        we.sendKeys("four"); // enter four for z
        we = driver.findElement(By.id("max"));
        we.click();
        we = driver.findElement(By.id("computeButton"));
        we.click();

        WebElement result = driver.findElement(By.id("result"));
        String output = result.getText(); // read the output text
        assertEquals("Please enter integer values only!", output);
    }

// execute the test <x = four, y = 1, z = four, submitButton = notclicklick>
    @Test public void t50() {

        WebElement we = driver.findElement(By.id("x"));
        we.sendKeys("four"); // enter four for x
        we = driver.findElement(By.id("y"));
        we.sendKeys("1"); // enter 1 for y
        we = driver.findElement(By.id("z"));
        we.sendKeys("four"); // enter four for z
        we = driver.findElement(By.id("min"));
        we.click();
        we = driver.findElement(By.id("computeButton"));
    }

// execute the test <x = four, y = 1, z = four, submitButton = notclicklick>
    @Test public void t51() {

        WebElement we = driver.findElement(By.id("x"));
        we.sendKeys("four"); // enter four for x
        we = driver.findElement(By.id("y"));
        we.sendKeys("1"); // enter 1 for y
        we = driver.findElement(By.id("z"));
        we.sendKeys("four"); // enter four for z
        we = driver.findElement(By.id("max"));
        we.click();
        we = driver.findElement(By.id("computeButton"));
    }

// execute the test <x = four, y = 1, z = -1, submitButton = clicklick>
    @Test public void t52() {

        WebElement we = driver.findElement(By.id("x"));
        we.sendKeys("four"); // enter four for x
        we = driver.findElement(By.id("y"));
        we.sendKeys("1"); // enter 1 for y
        we = driver.findElement(By.id("z"));
        we.sendKeys("-1"); // enter -1 for z
        we = driver.findElement(By.id("min"));
        we.click();
        we = driver.findElement(By.id("computeButton"));
        we.click();

        WebElement result = driver.findElement(By.id("result"));
        String output = result.getText(); // read the output text
        assertEquals("Please enter integer values only!", output);
    }

// execute the test <x = four, y = 1, z = -1, submitButton = clicklick>
    @Test public void t53() {

        WebElement we = driver.findElement(By.id("x"));
        we.sendKeys("four"); // enter four for x
        we = driver.findElement(By.id("y"));
        we.sendKeys("1"); // enter 1 for y
        we = driver.findElement(By.id("z"));
        we.sendKeys("-1"); // enter -1 for z
        we = driver.findElement(By.id("max"));
        we.click();
        we = driver.findElement(By.id("computeButton"));
        we.click();

        WebElement result = driver.findElement(By.id("result"));
        String output = result.getText(); // read the output text
        assertEquals("Please enter integer values only!", output);
    }

// execute the test <x = four, y = 1, z = -1, submitButton = notclicklick>
    @Test public void t54() {

        WebElement we = driver.findElement(By.id("x"));
        we.sendKeys("four"); // enter four for x
        we = driver.findElement(By.id("y"));
        we.sendKeys("1"); // enter 1 for y
        we = driver.findElement(By.id("z"));
        we.sendKeys("-1"); // enter -1 for z
        we = driver.findElement(By.id("min"));
        we.click();
        we = driver.findElement(By.id("computeButton"));
    }

// execute the test <x = four, y = 1, z = -1, submitButton = notclicklick>
    @Test public void t55() {

        WebElement we = driver.findElement(By.id("x"));
        we.sendKeys("four"); // enter four for x
        we = driver.findElement(By.id("y"));
        we.sendKeys("1"); // enter 1 for y
        we = driver.findElement(By.id("z"));
        we.sendKeys("-1"); // enter -1 for z
        we = driver.findElement(By.id("max"));
        we.click();
        we = driver.findElement(By.id("computeButton"));
    }

// execute the test <x = four, y = 1, z = 0, submitButton = clicklick>
    @Test public void t56() {

        WebElement we = driver.findElement(By.id("x"));
        we.sendKeys("four"); // enter four for x
        we = driver.findElement(By.id("y"));
        we.sendKeys("1"); // enter 1 for y
        we = driver.findElement(By.id("z"));
        we.sendKeys("0"); // enter 0 for z
        we = driver.findElement(By.id("min"));
        we.click();
        we = driver.findElement(By.id("computeButton"));
        we.click();

        WebElement result = driver.findElement(By.id("result"));
        String output = result.getText(); // read the output text
        assertEquals("Please enter integer values only!", output);
    }

// execute the test <x = four, y = 1, z = 0, submitButton = clicklick>
    @Test public void t57() {

        WebElement we = driver.findElement(By.id("x"));
        we.sendKeys("four"); // enter four for x
        we = driver.findElement(By.id("y"));
        we.sendKeys("1"); // enter 1 for y
        we = driver.findElement(By.id("z"));
        we.sendKeys("0"); // enter 0 for z
        we = driver.findElement(By.id("max"));
        we.click();
        we = driver.findElement(By.id("computeButton"));
        we.click();

        WebElement result = driver.findElement(By.id("result"));
        String output = result.getText(); // read the output text
        assertEquals("Please enter integer values only!", output);
    }

// execute the test <x = four, y = 1, z = 0, submitButton = notclicklick>
    @Test public void t58() {

        WebElement we = driver.findElement(By.id("x"));
        we.sendKeys("four"); // enter four for x
        we = driver.findElement(By.id("y"));
        we.sendKeys("1"); // enter 1 for y
        we = driver.findElement(By.id("z"));
        we.sendKeys("0"); // enter 0 for z
        we = driver.findElement(By.id("min"));
        we.click();
        we = driver.findElement(By.id("computeButton"));
    }

// execute the test <x = four, y = 1, z = 0, submitButton = notclicklick>
    @Test public void t59() {

        WebElement we = driver.findElement(By.id("x"));
        we.sendKeys("four"); // enter four for x
        we = driver.findElement(By.id("y"));
        we.sendKeys("1"); // enter 1 for y
        we = driver.findElement(By.id("z"));
        we.sendKeys("0"); // enter 0 for z
        we = driver.findElement(By.id("max"));
        we.click();
        we = driver.findElement(By.id("computeButton"));
    }

// execute the test <x = four, y = 1, z = 1, submitButton = clicklick>
    @Test public void t60() {

        WebElement we = driver.findElement(By.id("x"));
        we.sendKeys("four"); // enter four for x
        we = driver.findElement(By.id("y"));
        we.sendKeys("1"); // enter 1 for y
        we = driver.findElement(By.id("z"));
        we.sendKeys("1"); // enter 1 for z
        we = driver.findElement(By.id("min"));
        we.click();
        we = driver.findElement(By.id("computeButton"));
        we.click();

        WebElement result = driver.findElement(By.id("result"));
        String output = result.getText(); // read the output text
        assertEquals("Please enter integer values only!", output);
    }

// execute the test <x = four, y = 1, z = 1, submitButton = clicklick>
    @Test public void t61() {

        WebElement we = driver.findElement(By.id("x"));
        we.sendKeys("four"); // enter four for x
        we = driver.findElement(By.id("y"));
        we.sendKeys("1"); // enter 1 for y
        we = driver.findElement(By.id("z"));
        we.sendKeys("1"); // enter 1 for z
        we = driver.findElement(By.id("max"));
        we.click();
        we = driver.findElement(By.id("computeButton"));
        we.click();

        WebElement result = driver.findElement(By.id("result"));
        String output = result.getText(); // read the output text
        assertEquals("Please enter integer values only!", output);
    }

// execute the test <x = four, y = 1, z = 1, submitButton = notclicklick>
    @Test public void t62() {

        WebElement we = driver.findElement(By.id("x"));
        we.sendKeys("four"); // enter four for x
        we = driver.findElement(By.id("y"));
        we.sendKeys("1"); // enter 1 for y
        we = driver.findElement(By.id("z"));
        we.sendKeys("1"); // enter 1 for z
        we = driver.findElement(By.id("min"));
        we.click();
        we = driver.findElement(By.id("computeButton"));
    }

// execute the test <x = four, y = 1, z = 1, submitButton = notclicklick>
    @Test public void t63() {

        WebElement we = driver.findElement(By.id("x"));
        we.sendKeys("four"); // enter four for x
        we = driver.findElement(By.id("y"));
        we.sendKeys("1"); // enter 1 for y
        we = driver.findElement(By.id("z"));
        we.sendKeys("1"); // enter 1 for z
        we = driver.findElement(By.id("max"));
        we.click();
        we = driver.findElement(By.id("computeButton"));
    }

// execute the test <x = -1, y = four, z = four, submitButton = clicklick>
    @Test public void t64() {

        WebElement we = driver.findElement(By.id("x"));
        we.sendKeys("-1"); // enter -1 for x
        we = driver.findElement(By.id("y"));
        we.sendKeys("four"); // enter four for y
        we = driver.findElement(By.id("z"));
        we.sendKeys("four"); // enter four for z
        we = driver.findElement(By.id("min"));
        we.click();
        we = driver.findElement(By.id("computeButton"));
        we.click();

        WebElement result = driver.findElement(By.id("result"));
        String output = result.getText(); // read the output text
        assertEquals("Please enter integer values only!", output);
    }

// execute the test <x = -1, y = four, z = four, submitButton = clicklick>
    @Test public void t65() {

        WebElement we = driver.findElement(By.id("x"));
        we.sendKeys("-1"); // enter -1 for x
        we = driver.findElement(By.id("y"));
        we.sendKeys("four"); // enter four for y
        we = driver.findElement(By.id("z"));
        we.sendKeys("four"); // enter four for z
        we = driver.findElement(By.id("max"));
        we.click();
        we = driver.findElement(By.id("computeButton"));
        we.click();

        WebElement result = driver.findElement(By.id("result"));
        String output = result.getText(); // read the output text
        assertEquals("Please enter integer values only!", output);
    }

// execute the test <x = -1, y = four, z = four, submitButton = notclicklick>
    @Test public void t66() {

        WebElement we = driver.findElement(By.id("x"));
        we.sendKeys("-1"); // enter -1 for x
        we = driver.findElement(By.id("y"));
        we.sendKeys("four"); // enter four for y
        we = driver.findElement(By.id("z"));
        we.sendKeys("four"); // enter four for z
        we = driver.findElement(By.id("min"));
        we.click();
        we = driver.findElement(By.id("computeButton"));
    }

// execute the test <x = -1, y = four, z = four, submitButton = notclicklick>
    @Test public void t67() {

        WebElement we = driver.findElement(By.id("x"));
        we.sendKeys("-1"); // enter -1 for x
        we = driver.findElement(By.id("y"));
        we.sendKeys("four"); // enter four for y
        we = driver.findElement(By.id("z"));
        we.sendKeys("four"); // enter four for z
        we = driver.findElement(By.id("max"));
        we.click();
        we = driver.findElement(By.id("computeButton"));
    }

// execute the test <x = -1, y = four, z = -1, submitButton = clicklick>
    @Test public void t68() {

        WebElement we = driver.findElement(By.id("x"));
        we.sendKeys("-1"); // enter -1 for x
        we = driver.findElement(By.id("y"));
        we.sendKeys("four"); // enter four for y
        we = driver.findElement(By.id("z"));
        we.sendKeys("-1"); // enter -1 for z
        we = driver.findElement(By.id("min"));
        we.click();
        we = driver.findElement(By.id("computeButton"));
        we.click();

        WebElement result = driver.findElement(By.id("result"));
        String output = result.getText(); // read the output text
        assertEquals("Please enter integer values only!", output);
    }

// execute the test <x = -1, y = four, z = -1, submitButton = clicklick>
    @Test public void t69() {

        WebElement we = driver.findElement(By.id("x"));
        we.sendKeys("-1"); // enter -1 for x
        we = driver.findElement(By.id("y"));
        we.sendKeys("four"); // enter four for y
        we = driver.findElement(By.id("z"));
        we.sendKeys("-1"); // enter -1 for z
        we = driver.findElement(By.id("max"));
        we.click();
        we = driver.findElement(By.id("computeButton"));
        we.click();

        WebElement result = driver.findElement(By.id("result"));
        String output = result.getText(); // read the output text
        assertEquals("Please enter integer values only!", output);
    }

// execute the test <x = -1, y = four, z = -1, submitButton = notclicklick>
    @Test public void t70() {

        WebElement we = driver.findElement(By.id("x"));
        we.sendKeys("-1"); // enter -1 for x
        we = driver.findElement(By.id("y"));
        we.sendKeys("four"); // enter four for y
        we = driver.findElement(By.id("z"));
        we.sendKeys("-1"); // enter -1 for z
        we = driver.findElement(By.id("min"));
        we.click();
        we = driver.findElement(By.id("computeButton"));
    }

// execute the test <x = -1, y = four, z = -1, submitButton = notclicklick>
    @Test public void t71() {

        WebElement we = driver.findElement(By.id("x"));
        we.sendKeys("-1"); // enter -1 for x
        we = driver.findElement(By.id("y"));
        we.sendKeys("four"); // enter four for y
        we = driver.findElement(By.id("z"));
        we.sendKeys("-1"); // enter -1 for z
        we = driver.findElement(By.id("max"));
        we.click();
        we = driver.findElement(By.id("computeButton"));
    }

// execute the test <x = -1, y = four, z = 0, submitButton = clicklick>
    @Test public void t72() {

        WebElement we = driver.findElement(By.id("x"));
        we.sendKeys("-1"); // enter -1 for x
        we = driver.findElement(By.id("y"));
        we.sendKeys("four"); // enter four for y
        we = driver.findElement(By.id("z"));
        we.sendKeys("0"); // enter 0 for z
        we = driver.findElement(By.id("min"));
        we.click();
        we = driver.findElement(By.id("computeButton"));
        we.click();

        WebElement result = driver.findElement(By.id("result"));
        String output = result.getText(); // read the output text
        assertEquals("Please enter integer values only!", output);
    }

// execute the test <x = -1, y = four, z = 0, submitButton = clicklick>
    @Test public void t73() {

        WebElement we = driver.findElement(By.id("x"));
        we.sendKeys("-1"); // enter -1 for x
        we = driver.findElement(By.id("y"));
        we.sendKeys("four"); // enter four for y
        we = driver.findElement(By.id("z"));
        we.sendKeys("0"); // enter 0 for z
        we = driver.findElement(By.id("max"));
        we.click();
        we = driver.findElement(By.id("computeButton"));
        we.click();

        WebElement result = driver.findElement(By.id("result"));
        String output = result.getText(); // read the output text
        assertEquals("Please enter integer values only!", output);
    }

// execute the test <x = -1, y = four, z = 0, submitButton = notclicklick>
    @Test public void t74() {

        WebElement we = driver.findElement(By.id("x"));
        we.sendKeys("-1"); // enter -1 for x
        we = driver.findElement(By.id("y"));
        we.sendKeys("four"); // enter four for y
        we = driver.findElement(By.id("z"));
        we.sendKeys("0"); // enter 0 for z
        we = driver.findElement(By.id("min"));
        we.click();
        we = driver.findElement(By.id("computeButton"));
    }

// execute the test <x = -1, y = four, z = 0, submitButton = notclicklick>
    @Test public void t75() {

        WebElement we = driver.findElement(By.id("x"));
        we.sendKeys("-1"); // enter -1 for x
        we = driver.findElement(By.id("y"));
        we.sendKeys("four"); // enter four for y
        we = driver.findElement(By.id("z"));
        we.sendKeys("0"); // enter 0 for z
        we = driver.findElement(By.id("max"));
        we.click();
        we = driver.findElement(By.id("computeButton"));
    }

// execute the test <x = -1, y = four, z = 1, submitButton = clicklick>
    @Test public void t76() {

        WebElement we = driver.findElement(By.id("x"));
        we.sendKeys("-1"); // enter -1 for x
        we = driver.findElement(By.id("y"));
        we.sendKeys("four"); // enter four for y
        we = driver.findElement(By.id("z"));
        we.sendKeys("1"); // enter 1 for z
        we = driver.findElement(By.id("min"));
        we.click();
        we = driver.findElement(By.id("computeButton"));
        we.click();

        WebElement result = driver.findElement(By.id("result"));
        String output = result.getText(); // read the output text
        assertEquals("Please enter integer values only!", output);
    }

// execute the test <x = -1, y = four, z = 1, submitButton = clicklick>
    @Test public void t77() {

        WebElement we = driver.findElement(By.id("x"));
        we.sendKeys("-1"); // enter -1 for x
        we = driver.findElement(By.id("y"));
        we.sendKeys("four"); // enter four for y
        we = driver.findElement(By.id("z"));
        we.sendKeys("1"); // enter 1 for z
        we = driver.findElement(By.id("max"));
        we.click();
        we = driver.findElement(By.id("computeButton"));
        we.click();

        WebElement result = driver.findElement(By.id("result"));
        String output = result.getText(); // read the output text
        assertEquals("Please enter integer values only!", output);
    }

// execute the test <x = -1, y = four, z = 1, submitButton = notclicklick>
    @Test public void t78() {

        WebElement we = driver.findElement(By.id("x"));
        we.sendKeys("-1"); // enter -1 for x
        we = driver.findElement(By.id("y"));
        we.sendKeys("four"); // enter four for y
        we = driver.findElement(By.id("z"));
        we.sendKeys("1"); // enter 1 for z
        we = driver.findElement(By.id("min"));
        we.click();
        we = driver.findElement(By.id("computeButton"));
    }

// execute the test <x = -1, y = four, z = 1, submitButton = notclicklick>
    @Test public void t79() {

        WebElement we = driver.findElement(By.id("x"));
        we.sendKeys("-1"); // enter -1 for x
        we = driver.findElement(By.id("y"));
        we.sendKeys("four"); // enter four for y
        we = driver.findElement(By.id("z"));
        we.sendKeys("1"); // enter 1 for z
        we = driver.findElement(By.id("max"));
        we.click();
        we = driver.findElement(By.id("computeButton"));
    }

// execute the test <x = -1, y = -1, z = four, submitButton = clicklick>
    @Test public void t80() {

        WebElement we = driver.findElement(By.id("x"));
        we.sendKeys("-1"); // enter -1 for x
        we = driver.findElement(By.id("y"));
        we.sendKeys("-1"); // enter -1 for y
        we = driver.findElement(By.id("z"));
        we.sendKeys("four"); // enter four for z
        we = driver.findElement(By.id("min"));
        we.click();
        we = driver.findElement(By.id("computeButton"));
        we.click();

        WebElement result = driver.findElement(By.id("result"));
        String output = result.getText(); // read the output text
        assertEquals("Please enter integer values only!", output);
    }

// execute the test <x = -1, y = -1, z = four, submitButton = clicklick>
    @Test public void t81() {

        WebElement we = driver.findElement(By.id("x"));
        we.sendKeys("-1"); // enter -1 for x
        we = driver.findElement(By.id("y"));
        we.sendKeys("-1"); // enter -1 for y
        we = driver.findElement(By.id("z"));
        we.sendKeys("four"); // enter four for z
        we = driver.findElement(By.id("max"));
        we.click();
        we = driver.findElement(By.id("computeButton"));
        we.click();

        WebElement result = driver.findElement(By.id("result"));
        String output = result.getText(); // read the output text
        assertEquals("Please enter integer values only!", output);
    }

// execute the test <x = -1, y = -1, z = four, submitButton = notclicklick>
    @Test public void t82() {

        WebElement we = driver.findElement(By.id("x"));
        we.sendKeys("-1"); // enter -1 for x
        we = driver.findElement(By.id("y"));
        we.sendKeys("-1"); // enter -1 for y
        we = driver.findElement(By.id("z"));
        we.sendKeys("four"); // enter four for z
        we = driver.findElement(By.id("min"));
        we.click();
        we = driver.findElement(By.id("computeButton"));
    }

// execute the test <x = -1, y = -1, z = four, submitButton = notclicklick>
    @Test public void t83() {

        WebElement we = driver.findElement(By.id("x"));
        we.sendKeys("-1"); // enter -1 for x
        we = driver.findElement(By.id("y"));
        we.sendKeys("-1"); // enter -1 for y
        we = driver.findElement(By.id("z"));
        we.sendKeys("four"); // enter four for z
        we = driver.findElement(By.id("max"));
        we.click();
        we = driver.findElement(By.id("computeButton"));
    }

// execute the test <x = -1, y = -1, z = -1, submitButton = clicklick>
    @Test public void t84() {

        WebElement we = driver.findElement(By.id("x"));
        we.sendKeys("-1"); // enter -1 for x
        we = driver.findElement(By.id("y"));
        we.sendKeys("-1"); // enter -1 for y
        we = driver.findElement(By.id("z"));
        we.sendKeys("-1"); // enter -1 for z
        we = driver.findElement(By.id("min"));
        we.click();
        we = driver.findElement(By.id("computeButton"));
        we.click();

        WebElement result = driver.findElement(By.id("result"));
        String output = result.getText(); // read the output text
        assertEquals("min(-1, -1, -1) = -1", output);
    }

// execute the test <x = -1, y = -1, z = -1, submitButton = clicklick>
    @Test public void t85() {

        WebElement we = driver.findElement(By.id("x"));
        we.sendKeys("-1"); // enter -1 for x
        we = driver.findElement(By.id("y"));
        we.sendKeys("-1"); // enter -1 for y
        we = driver.findElement(By.id("z"));
        we.sendKeys("-1"); // enter -1 for z
        we = driver.findElement(By.id("max"));
        we.click();
        we = driver.findElement(By.id("computeButton"));
        we.click();

        WebElement result = driver.findElement(By.id("result"));
        String output = result.getText(); // read the output text
        assertEquals("max(-1, -1, -1) = -1", output);
    }

// execute the test <x = -1, y = -1, z = -1, submitButton = notclicklick>
    @Test public void t86() {

        WebElement we = driver.findElement(By.id("x"));
        we.sendKeys("-1"); // enter -1 for x
        we = driver.findElement(By.id("y"));
        we.sendKeys("-1"); // enter -1 for y
        we = driver.findElement(By.id("z"));
        we.sendKeys("-1"); // enter -1 for z
        we = driver.findElement(By.id("min"));
        we.click();
        we = driver.findElement(By.id("computeButton"));
    }

// execute the test <x = -1, y = -1, z = -1, submitButton = notclicklick>
    @Test public void t87() {

        WebElement we = driver.findElement(By.id("x"));
        we.sendKeys("-1"); // enter -1 for x
        we = driver.findElement(By.id("y"));
        we.sendKeys("-1"); // enter -1 for y
        we = driver.findElement(By.id("z"));
        we.sendKeys("-1"); // enter -1 for z
        we = driver.findElement(By.id("max"));
        we.click();
        we = driver.findElement(By.id("computeButton"));
    }

// execute the test <x = -1, y = -1, z = 0, submitButton = clicklick>
    @Test public void t88() {

        WebElement we = driver.findElement(By.id("x"));
        we.sendKeys("-1"); // enter -1 for x
        we = driver.findElement(By.id("y"));
        we.sendKeys("-1"); // enter -1 for y
        we = driver.findElement(By.id("z"));
        we.sendKeys("0"); // enter 0 for z
        we = driver.findElement(By.id("min"));
        we.click();
        we = driver.findElement(By.id("computeButton"));
        we.click();

        WebElement result = driver.findElement(By.id("result"));
        String output = result.getText(); // read the output text
        assertEquals("min(-1, -1, 0) = -1", output);
    }

// execute the test <x = -1, y = -1, z = 0, submitButton = clicklick>
    @Test public void t89() {

        WebElement we = driver.findElement(By.id("x"));
        we.sendKeys("-1"); // enter -1 for x
        we = driver.findElement(By.id("y"));
        we.sendKeys("-1"); // enter -1 for y
        we = driver.findElement(By.id("z"));
        we.sendKeys("0"); // enter 0 for z
        we = driver.findElement(By.id("max"));
        we.click();
        we = driver.findElement(By.id("computeButton"));
        we.click();

        WebElement result = driver.findElement(By.id("result"));
        String output = result.getText(); // read the output text
        assertEquals("max(-1, -1, 0) = 0", output);
    }

// execute the test <x = -1, y = -1, z = 0, submitButton = notclicklick>
    @Test public void t90() {

        WebElement we = driver.findElement(By.id("x"));
        we.sendKeys("-1"); // enter -1 for x
        we = driver.findElement(By.id("y"));
        we.sendKeys("-1"); // enter -1 for y
        we = driver.findElement(By.id("z"));
        we.sendKeys("0"); // enter 0 for z
        we = driver.findElement(By.id("min"));
        we.click();
        we = driver.findElement(By.id("computeButton"));
    }

// execute the test <x = -1, y = -1, z = 0, submitButton = notclicklick>
    @Test public void t91() {

        WebElement we = driver.findElement(By.id("x"));
        we.sendKeys("-1"); // enter -1 for x
        we = driver.findElement(By.id("y"));
        we.sendKeys("-1"); // enter -1 for y
        we = driver.findElement(By.id("z"));
        we.sendKeys("0"); // enter 0 for z
        we = driver.findElement(By.id("max"));
        we.click();
        we = driver.findElement(By.id("computeButton"));
    }

// execute the test <x = -1, y = -1, z = 1, submitButton = clicklick>
    @Test public void t92() {

        WebElement we = driver.findElement(By.id("x"));
        we.sendKeys("-1"); // enter -1 for x
        we = driver.findElement(By.id("y"));
        we.sendKeys("-1"); // enter -1 for y
        we = driver.findElement(By.id("z"));
        we.sendKeys("1"); // enter 1 for z
        we = driver.findElement(By.id("min"));
        we.click();
        we = driver.findElement(By.id("computeButton"));
        we.click();

        WebElement result = driver.findElement(By.id("result"));
        String output = result.getText(); // read the output text
        assertEquals("min(-1, -1, 1) = -1", output);
    }

// execute the test <x = -1, y = -1, z = 1, submitButton = clicklick>
    @Test public void t93() {

        WebElement we = driver.findElement(By.id("x"));
        we.sendKeys("-1"); // enter -1 for x
        we = driver.findElement(By.id("y"));
        we.sendKeys("-1"); // enter -1 for y
        we = driver.findElement(By.id("z"));
        we.sendKeys("1"); // enter 1 for z
        we = driver.findElement(By.id("max"));
        we.click();
        we = driver.findElement(By.id("computeButton"));
        we.click();

        WebElement result = driver.findElement(By.id("result"));
        String output = result.getText(); // read the output text
        assertEquals("max(-1, -1, 1) = 1", output);
    }

// execute the test <x = -1, y = -1, z = 1, submitButton = notclicklick>
    @Test public void t94() {

        WebElement we = driver.findElement(By.id("x"));
        we.sendKeys("-1"); // enter -1 for x
        we = driver.findElement(By.id("y"));
        we.sendKeys("-1"); // enter -1 for y
        we = driver.findElement(By.id("z"));
        we.sendKeys("1"); // enter 1 for z
        we = driver.findElement(By.id("min"));
        we.click();
        we = driver.findElement(By.id("computeButton"));
    }

// execute the test <x = -1, y = -1, z = 1, submitButton = notclicklick>
    @Test public void t95() {

        WebElement we = driver.findElement(By.id("x"));
        we.sendKeys("-1"); // enter -1 for x
        we = driver.findElement(By.id("y"));
        we.sendKeys("-1"); // enter -1 for y
        we = driver.findElement(By.id("z"));
        we.sendKeys("1"); // enter 1 for z
        we = driver.findElement(By.id("max"));
        we.click();
        we = driver.findElement(By.id("computeButton"));
    }

// execute the test <x = -1, y = 0, z = four, submitButton = clicklick>
    @Test public void t96() {

        WebElement we = driver.findElement(By.id("x"));
        we.sendKeys("-1"); // enter -1 for x
        we = driver.findElement(By.id("y"));
        we.sendKeys("0"); // enter 0 for y
        we = driver.findElement(By.id("z"));
        we.sendKeys("four"); // enter four for z
        we = driver.findElement(By.id("min"));
        we.click();
        we = driver.findElement(By.id("computeButton"));
        we.click();

        WebElement result = driver.findElement(By.id("result"));
        String output = result.getText(); // read the output text
        assertEquals("Please enter integer values only!", output);
    }

// execute the test <x = -1, y = 0, z = four, submitButton = clicklick>
    @Test public void t97() {

        WebElement we = driver.findElement(By.id("x"));
        we.sendKeys("-1"); // enter -1 for x
        we = driver.findElement(By.id("y"));
        we.sendKeys("0"); // enter 0 for y
        we = driver.findElement(By.id("z"));
        we.sendKeys("four"); // enter four for z
        we = driver.findElement(By.id("max"));
        we.click();
        we = driver.findElement(By.id("computeButton"));
        we.click();

        WebElement result = driver.findElement(By.id("result"));
        String output = result.getText(); // read the output text
        assertEquals("Please enter integer values only!", output);
    }

// execute the test <x = -1, y = 0, z = four, submitButton = notclicklick>
    @Test public void t98() {

        WebElement we = driver.findElement(By.id("x"));
        we.sendKeys("-1"); // enter -1 for x
        we = driver.findElement(By.id("y"));
        we.sendKeys("0"); // enter 0 for y
        we = driver.findElement(By.id("z"));
        we.sendKeys("four"); // enter four for z
        we = driver.findElement(By.id("min"));
        we.click();
        we = driver.findElement(By.id("computeButton"));
    }

// execute the test <x = -1, y = 0, z = four, submitButton = notclicklick>
    @Test public void t99() {

        WebElement we = driver.findElement(By.id("x"));
        we.sendKeys("-1"); // enter -1 for x
        we = driver.findElement(By.id("y"));
        we.sendKeys("0"); // enter 0 for y
        we = driver.findElement(By.id("z"));
        we.sendKeys("four"); // enter four for z
        we = driver.findElement(By.id("max"));
        we.click();
        we = driver.findElement(By.id("computeButton"));
    }

// execute the test <x = -1, y = 0, z = -1, submitButton = clicklick>
    @Test public void t100() {

        WebElement we = driver.findElement(By.id("x"));
        we.sendKeys("-1"); // enter -1 for x
        we = driver.findElement(By.id("y"));
        we.sendKeys("0"); // enter 0 for y
        we = driver.findElement(By.id("z"));
        we.sendKeys("-1"); // enter -1 for z
        we = driver.findElement(By.id("min"));
        we.click();
        we = driver.findElement(By.id("computeButton"));
        we.click();

        WebElement result = driver.findElement(By.id("result"));
        String output = result.getText(); // read the output text
        assertEquals("min(-1, 0, -1) = -1", output);
    }

// execute the test <x = -1, y = 0, z = -1, submitButton = clicklick>
    @Test public void t101() {

        WebElement we = driver.findElement(By.id("x"));
        we.sendKeys("-1"); // enter -1 for x
        we = driver.findElement(By.id("y"));
        we.sendKeys("0"); // enter 0 for y
        we = driver.findElement(By.id("z"));
        we.sendKeys("-1"); // enter -1 for z
        we = driver.findElement(By.id("max"));
        we.click();
        we = driver.findElement(By.id("computeButton"));
        we.click();

        WebElement result = driver.findElement(By.id("result"));
        String output = result.getText(); // read the output text
        assertEquals("max(-1, 0, -1) = 0", output);
    }

// execute the test <x = -1, y = 0, z = -1, submitButton = notclicklick>
    @Test public void t102() {

        WebElement we = driver.findElement(By.id("x"));
        we.sendKeys("-1"); // enter -1 for x
        we = driver.findElement(By.id("y"));
        we.sendKeys("0"); // enter 0 for y
        we = driver.findElement(By.id("z"));
        we.sendKeys("-1"); // enter -1 for z
        we = driver.findElement(By.id("min"));
        we.click();
        we = driver.findElement(By.id("computeButton"));
    }

// execute the test <x = -1, y = 0, z = -1, submitButton = notclicklick>
    @Test public void t103() {

        WebElement we = driver.findElement(By.id("x"));
        we.sendKeys("-1"); // enter -1 for x
        we = driver.findElement(By.id("y"));
        we.sendKeys("0"); // enter 0 for y
        we = driver.findElement(By.id("z"));
        we.sendKeys("-1"); // enter -1 for z
        we = driver.findElement(By.id("max"));
        we.click();
        we = driver.findElement(By.id("computeButton"));
    }

// execute the test <x = -1, y = 0, z = 0, submitButton = clicklick>
    @Test public void t104() {

        WebElement we = driver.findElement(By.id("x"));
        we.sendKeys("-1"); // enter -1 for x
        we = driver.findElement(By.id("y"));
        we.sendKeys("0"); // enter 0 for y
        we = driver.findElement(By.id("z"));
        we.sendKeys("0"); // enter 0 for z
        we = driver.findElement(By.id("min"));
        we.click();
        we = driver.findElement(By.id("computeButton"));
        we.click();

        WebElement result = driver.findElement(By.id("result"));
        String output = result.getText(); // read the output text
        assertEquals("min(-1, 0, 0) = -1", output);
    }

// execute the test <x = -1, y = 0, z = 0, submitButton = clicklick>
    @Test public void t105() {

        WebElement we = driver.findElement(By.id("x"));
        we.sendKeys("-1"); // enter -1 for x
        we = driver.findElement(By.id("y"));
        we.sendKeys("0"); // enter 0 for y
        we = driver.findElement(By.id("z"));
        we.sendKeys("0"); // enter 0 for z
        we = driver.findElement(By.id("max"));
        we.click();
        we = driver.findElement(By.id("computeButton"));
        we.click();

        WebElement result = driver.findElement(By.id("result"));
        String output = result.getText(); // read the output text
        assertEquals("max(-1, 0, 0) = 0", output);
    }

// execute the test <x = -1, y = 0, z = 0, submitButton = notclicklick>
    @Test public void t106() {

        WebElement we = driver.findElement(By.id("x"));
        we.sendKeys("-1"); // enter -1 for x
        we = driver.findElement(By.id("y"));
        we.sendKeys("0"); // enter 0 for y
        we = driver.findElement(By.id("z"));
        we.sendKeys("0"); // enter 0 for z
        we = driver.findElement(By.id("min"));
        we.click();
        we = driver.findElement(By.id("computeButton"));
    }

// execute the test <x = -1, y = 0, z = 0, submitButton = notclicklick>
    @Test public void t107() {

        WebElement we = driver.findElement(By.id("x"));
        we.sendKeys("-1"); // enter -1 for x
        we = driver.findElement(By.id("y"));
        we.sendKeys("0"); // enter 0 for y
        we = driver.findElement(By.id("z"));
        we.sendKeys("0"); // enter 0 for z
        we = driver.findElement(By.id("max"));
        we.click();
        we = driver.findElement(By.id("computeButton"));
    }

// execute the test <x = -1, y = 0, z = 1, submitButton = clicklick>
    @Test public void t108() {

        WebElement we = driver.findElement(By.id("x"));
        we.sendKeys("-1"); // enter -1 for x
        we = driver.findElement(By.id("y"));
        we.sendKeys("0"); // enter 0 for y
        we = driver.findElement(By.id("z"));
        we.sendKeys("1"); // enter 1 for z
        we = driver.findElement(By.id("min"));
        we.click();
        we = driver.findElement(By.id("computeButton"));
        we.click();

        WebElement result = driver.findElement(By.id("result"));
        String output = result.getText(); // read the output text
        assertEquals("min(-1, 0, 1) = -1", output);
    }

// execute the test <x = -1, y = 0, z = 1, submitButton = clicklick>
    @Test public void t109() {

        WebElement we = driver.findElement(By.id("x"));
        we.sendKeys("-1"); // enter -1 for x
        we = driver.findElement(By.id("y"));
        we.sendKeys("0"); // enter 0 for y
        we = driver.findElement(By.id("z"));
        we.sendKeys("1"); // enter 1 for z
        we = driver.findElement(By.id("max"));
        we.click();
        we = driver.findElement(By.id("computeButton"));
        we.click();

        WebElement result = driver.findElement(By.id("result"));
        String output = result.getText(); // read the output text
        assertEquals("max(-1, 0, 1) = 1", output);
    }

// execute the test <x = -1, y = 0, z = 1, submitButton = notclicklick>
    @Test public void t110() {

        WebElement we = driver.findElement(By.id("x"));
        we.sendKeys("-1"); // enter -1 for x
        we = driver.findElement(By.id("y"));
        we.sendKeys("0"); // enter 0 for y
        we = driver.findElement(By.id("z"));
        we.sendKeys("1"); // enter 1 for z
        we = driver.findElement(By.id("min"));
        we.click();
        we = driver.findElement(By.id("computeButton"));
    }

// execute the test <x = -1, y = 0, z = 1, submitButton = notclicklick>
    @Test public void t111() {

        WebElement we = driver.findElement(By.id("x"));
        we.sendKeys("-1"); // enter -1 for x
        we = driver.findElement(By.id("y"));
        we.sendKeys("0"); // enter 0 for y
        we = driver.findElement(By.id("z"));
        we.sendKeys("1"); // enter 1 for z
        we = driver.findElement(By.id("max"));
        we.click();
        we = driver.findElement(By.id("computeButton"));
    }

// execute the test <x = -1, y = 1, z = four, submitButton = clicklick>
    @Test public void t112() {

        WebElement we = driver.findElement(By.id("x"));
        we.sendKeys("-1"); // enter -1 for x
        we = driver.findElement(By.id("y"));
        we.sendKeys("1"); // enter 1 for y
        we = driver.findElement(By.id("z"));
        we.sendKeys("four"); // enter four for z
        we = driver.findElement(By.id("min"));
        we.click();
        we = driver.findElement(By.id("computeButton"));
        we.click();

        WebElement result = driver.findElement(By.id("result"));
        String output = result.getText(); // read the output text
        assertEquals("Please enter integer values only!", output);
    }

// execute the test <x = -1, y = 1, z = four, submitButton = clicklick>
    @Test public void t113() {

        WebElement we = driver.findElement(By.id("x"));
        we.sendKeys("-1"); // enter -1 for x
        we = driver.findElement(By.id("y"));
        we.sendKeys("1"); // enter 1 for y
        we = driver.findElement(By.id("z"));
        we.sendKeys("four"); // enter four for z
        we = driver.findElement(By.id("max"));
        we.click();
        we = driver.findElement(By.id("computeButton"));
        we.click();

        WebElement result = driver.findElement(By.id("result"));
        String output = result.getText(); // read the output text
        assertEquals("Please enter integer values only!", output);
    }

// execute the test <x = -1, y = 1, z = four, submitButton = notclicklick>
    @Test public void t114() {

        WebElement we = driver.findElement(By.id("x"));
        we.sendKeys("-1"); // enter -1 for x
        we = driver.findElement(By.id("y"));
        we.sendKeys("1"); // enter 1 for y
        we = driver.findElement(By.id("z"));
        we.sendKeys("four"); // enter four for z
        we = driver.findElement(By.id("min"));
        we.click();
        we = driver.findElement(By.id("computeButton"));
    }

// execute the test <x = -1, y = 1, z = four, submitButton = notclicklick>
    @Test public void t115() {

        WebElement we = driver.findElement(By.id("x"));
        we.sendKeys("-1"); // enter -1 for x
        we = driver.findElement(By.id("y"));
        we.sendKeys("1"); // enter 1 for y
        we = driver.findElement(By.id("z"));
        we.sendKeys("four"); // enter four for z
        we = driver.findElement(By.id("max"));
        we.click();
        we = driver.findElement(By.id("computeButton"));
    }

// execute the test <x = -1, y = 1, z = -1, submitButton = clicklick>
    @Test public void t116() {

        WebElement we = driver.findElement(By.id("x"));
        we.sendKeys("-1"); // enter -1 for x
        we = driver.findElement(By.id("y"));
        we.sendKeys("1"); // enter 1 for y
        we = driver.findElement(By.id("z"));
        we.sendKeys("-1"); // enter -1 for z
        we = driver.findElement(By.id("min"));
        we.click();
        we = driver.findElement(By.id("computeButton"));
        we.click();

        WebElement result = driver.findElement(By.id("result"));
        String output = result.getText(); // read the output text
        assertEquals("min(-1, 1, -1) = -1", output);
    }

// execute the test <x = -1, y = 1, z = -1, submitButton = clicklick>
    @Test public void t117() {

        WebElement we = driver.findElement(By.id("x"));
        we.sendKeys("-1"); // enter -1 for x
        we = driver.findElement(By.id("y"));
        we.sendKeys("1"); // enter 1 for y
        we = driver.findElement(By.id("z"));
        we.sendKeys("-1"); // enter -1 for z
        we = driver.findElement(By.id("max"));
        we.click();
        we = driver.findElement(By.id("computeButton"));
        we.click();

        WebElement result = driver.findElement(By.id("result"));
        String output = result.getText(); // read the output text
        assertEquals("max(-1, 1, -1) = 1", output);
    }

// execute the test <x = -1, y = 1, z = -1, submitButton = notclicklick>
    @Test public void t118() {

        WebElement we = driver.findElement(By.id("x"));
        we.sendKeys("-1"); // enter -1 for x
        we = driver.findElement(By.id("y"));
        we.sendKeys("1"); // enter 1 for y
        we = driver.findElement(By.id("z"));
        we.sendKeys("-1"); // enter -1 for z
        we = driver.findElement(By.id("min"));
        we.click();
        we = driver.findElement(By.id("computeButton"));
    }

// execute the test <x = -1, y = 1, z = -1, submitButton = notclicklick>
    @Test public void t119() {

        WebElement we = driver.findElement(By.id("x"));
        we.sendKeys("-1"); // enter -1 for x
        we = driver.findElement(By.id("y"));
        we.sendKeys("1"); // enter 1 for y
        we = driver.findElement(By.id("z"));
        we.sendKeys("-1"); // enter -1 for z
        we = driver.findElement(By.id("max"));
        we.click();
        we = driver.findElement(By.id("computeButton"));
    }

// execute the test <x = -1, y = 1, z = 0, submitButton = clicklick>
    @Test public void t120() {

        WebElement we = driver.findElement(By.id("x"));
        we.sendKeys("-1"); // enter -1 for x
        we = driver.findElement(By.id("y"));
        we.sendKeys("1"); // enter 1 for y
        we = driver.findElement(By.id("z"));
        we.sendKeys("0"); // enter 0 for z
        we = driver.findElement(By.id("min"));
        we.click();
        we = driver.findElement(By.id("computeButton"));
        we.click();

        WebElement result = driver.findElement(By.id("result"));
        String output = result.getText(); // read the output text
        assertEquals("min(-1, 1, 0) = -1", output);
    }

// execute the test <x = -1, y = 1, z = 0, submitButton = clicklick>
    @Test public void t121() {

        WebElement we = driver.findElement(By.id("x"));
        we.sendKeys("-1"); // enter -1 for x
        we = driver.findElement(By.id("y"));
        we.sendKeys("1"); // enter 1 for y
        we = driver.findElement(By.id("z"));
        we.sendKeys("0"); // enter 0 for z
        we = driver.findElement(By.id("max"));
        we.click();
        we = driver.findElement(By.id("computeButton"));
        we.click();

        WebElement result = driver.findElement(By.id("result"));
        String output = result.getText(); // read the output text
        assertEquals("max(-1, 1, 0) = 1", output);
    }

// execute the test <x = -1, y = 1, z = 0, submitButton = notclicklick>
    @Test public void t122() {

        WebElement we = driver.findElement(By.id("x"));
        we.sendKeys("-1"); // enter -1 for x
        we = driver.findElement(By.id("y"));
        we.sendKeys("1"); // enter 1 for y
        we = driver.findElement(By.id("z"));
        we.sendKeys("0"); // enter 0 for z
        we = driver.findElement(By.id("min"));
        we.click();
        we = driver.findElement(By.id("computeButton"));
    }

// execute the test <x = -1, y = 1, z = 0, submitButton = notclicklick>
    @Test public void t123() {

        WebElement we = driver.findElement(By.id("x"));
        we.sendKeys("-1"); // enter -1 for x
        we = driver.findElement(By.id("y"));
        we.sendKeys("1"); // enter 1 for y
        we = driver.findElement(By.id("z"));
        we.sendKeys("0"); // enter 0 for z
        we = driver.findElement(By.id("max"));
        we.click();
        we = driver.findElement(By.id("computeButton"));
    }

// execute the test <x = -1, y = 1, z = 1, submitButton = clicklick>
    @Test public void t124() {

        WebElement we = driver.findElement(By.id("x"));
        we.sendKeys("-1"); // enter -1 for x
        we = driver.findElement(By.id("y"));
        we.sendKeys("1"); // enter 1 for y
        we = driver.findElement(By.id("z"));
        we.sendKeys("1"); // enter 1 for z
        we = driver.findElement(By.id("min"));
        we.click();
        we = driver.findElement(By.id("computeButton"));
        we.click();

        WebElement result = driver.findElement(By.id("result"));
        String output = result.getText(); // read the output text
        assertEquals("min(-1, 1, 1) = -1", output);
    }

// execute the test <x = -1, y = 1, z = 1, submitButton = clicklick>
    @Test public void t125() {

        WebElement we = driver.findElement(By.id("x"));
        we.sendKeys("-1"); // enter -1 for x
        we = driver.findElement(By.id("y"));
        we.sendKeys("1"); // enter 1 for y
        we = driver.findElement(By.id("z"));
        we.sendKeys("1"); // enter 1 for z
        we = driver.findElement(By.id("max"));
        we.click();
        we = driver.findElement(By.id("computeButton"));
        we.click();

        WebElement result = driver.findElement(By.id("result"));
        String output = result.getText(); // read the output text
        assertEquals("max(-1, 1, 1) = 1", output);
    }

// execute the test <x = -1, y = 1, z = 1, submitButton = notclicklick>
    @Test public void t126() {

        WebElement we = driver.findElement(By.id("x"));
        we.sendKeys("-1"); // enter -1 for x
        we = driver.findElement(By.id("y"));
        we.sendKeys("1"); // enter 1 for y
        we = driver.findElement(By.id("z"));
        we.sendKeys("1"); // enter 1 for z
        we = driver.findElement(By.id("min"));
        we.click();
        we = driver.findElement(By.id("computeButton"));
    }

// execute the test <x = -1, y = 1, z = 1, submitButton = notclicklick>
    @Test public void t127() {

        WebElement we = driver.findElement(By.id("x"));
        we.sendKeys("-1"); // enter -1 for x
        we = driver.findElement(By.id("y"));
        we.sendKeys("1"); // enter 1 for y
        we = driver.findElement(By.id("z"));
        we.sendKeys("1"); // enter 1 for z
        we = driver.findElement(By.id("max"));
        we.click();
        we = driver.findElement(By.id("computeButton"));
    }

// execute the test <x = 0, y = four, z = four, submitButton = clicklick>
    @Test public void t128() {

        WebElement we = driver.findElement(By.id("x"));
        we.sendKeys("0"); // enter 0 for x
        we = driver.findElement(By.id("y"));
        we.sendKeys("four"); // enter four for y
        we = driver.findElement(By.id("z"));
        we.sendKeys("four"); // enter four for z
        we = driver.findElement(By.id("min"));
        we.click();
        we = driver.findElement(By.id("computeButton"));
        we.click();

        WebElement result = driver.findElement(By.id("result"));
        String output = result.getText(); // read the output text
        assertEquals("Please enter integer values only!", output);
    }

// execute the test <x = 0, y = four, z = four, submitButton = clicklick>
    @Test public void t129() {

        WebElement we = driver.findElement(By.id("x"));
        we.sendKeys("0"); // enter 0 for x
        we = driver.findElement(By.id("y"));
        we.sendKeys("four"); // enter four for y
        we = driver.findElement(By.id("z"));
        we.sendKeys("four"); // enter four for z
        we = driver.findElement(By.id("max"));
        we.click();
        we = driver.findElement(By.id("computeButton"));
        we.click();

        WebElement result = driver.findElement(By.id("result"));
        String output = result.getText(); // read the output text
        assertEquals("Please enter integer values only!", output);
    }

// execute the test <x = 0, y = four, z = four, submitButton = notclicklick>
    @Test public void t130() {

        WebElement we = driver.findElement(By.id("x"));
        we.sendKeys("0"); // enter 0 for x
        we = driver.findElement(By.id("y"));
        we.sendKeys("four"); // enter four for y
        we = driver.findElement(By.id("z"));
        we.sendKeys("four"); // enter four for z
        we = driver.findElement(By.id("min"));
        we.click();
        we = driver.findElement(By.id("computeButton"));
    }

// execute the test <x = 0, y = four, z = four, submitButton = notclicklick>
    @Test public void t131() {

        WebElement we = driver.findElement(By.id("x"));
        we.sendKeys("0"); // enter 0 for x
        we = driver.findElement(By.id("y"));
        we.sendKeys("four"); // enter four for y
        we = driver.findElement(By.id("z"));
        we.sendKeys("four"); // enter four for z
        we = driver.findElement(By.id("max"));
        we.click();
        we = driver.findElement(By.id("computeButton"));
    }

// execute the test <x = 0, y = four, z = -1, submitButton = clicklick>
    @Test public void t132() {

        WebElement we = driver.findElement(By.id("x"));
        we.sendKeys("0"); // enter 0 for x
        we = driver.findElement(By.id("y"));
        we.sendKeys("four"); // enter four for y
        we = driver.findElement(By.id("z"));
        we.sendKeys("-1"); // enter -1 for z
        we = driver.findElement(By.id("min"));
        we.click();
        we = driver.findElement(By.id("computeButton"));
        we.click();

        WebElement result = driver.findElement(By.id("result"));
        String output = result.getText(); // read the output text
        assertEquals("Please enter integer values only!", output);
    }

// execute the test <x = 0, y = four, z = -1, submitButton = clicklick>
    @Test public void t133() {

        WebElement we = driver.findElement(By.id("x"));
        we.sendKeys("0"); // enter 0 for x
        we = driver.findElement(By.id("y"));
        we.sendKeys("four"); // enter four for y
        we = driver.findElement(By.id("z"));
        we.sendKeys("-1"); // enter -1 for z
        we = driver.findElement(By.id("max"));
        we.click();
        we = driver.findElement(By.id("computeButton"));
        we.click();

        WebElement result = driver.findElement(By.id("result"));
        String output = result.getText(); // read the output text
        assertEquals("Please enter integer values only!", output);
    }

// execute the test <x = 0, y = four, z = -1, submitButton = notclicklick>
    @Test public void t134() {

        WebElement we = driver.findElement(By.id("x"));
        we.sendKeys("0"); // enter 0 for x
        we = driver.findElement(By.id("y"));
        we.sendKeys("four"); // enter four for y
        we = driver.findElement(By.id("z"));
        we.sendKeys("-1"); // enter -1 for z
        we = driver.findElement(By.id("min"));
        we.click();
        we = driver.findElement(By.id("computeButton"));
    }

// execute the test <x = 0, y = four, z = -1, submitButton = notclicklick>
    @Test public void t135() {

        WebElement we = driver.findElement(By.id("x"));
        we.sendKeys("0"); // enter 0 for x
        we = driver.findElement(By.id("y"));
        we.sendKeys("four"); // enter four for y
        we = driver.findElement(By.id("z"));
        we.sendKeys("-1"); // enter -1 for z
        we = driver.findElement(By.id("max"));
        we.click();
        we = driver.findElement(By.id("computeButton"));
    }

// execute the test <x = 0, y = four, z = 0, submitButton = clicklick>
    @Test public void t136() {

        WebElement we = driver.findElement(By.id("x"));
        we.sendKeys("0"); // enter 0 for x
        we = driver.findElement(By.id("y"));
        we.sendKeys("four"); // enter four for y
        we = driver.findElement(By.id("z"));
        we.sendKeys("0"); // enter 0 for z
        we = driver.findElement(By.id("min"));
        we.click();
        we = driver.findElement(By.id("computeButton"));
        we.click();

        WebElement result = driver.findElement(By.id("result"));
        String output = result.getText(); // read the output text
        assertEquals("Please enter integer values only!", output);
    }

// execute the test <x = 0, y = four, z = 0, submitButton = clicklick>
    @Test public void t137() {

        WebElement we = driver.findElement(By.id("x"));
        we.sendKeys("0"); // enter 0 for x
        we = driver.findElement(By.id("y"));
        we.sendKeys("four"); // enter four for y
        we = driver.findElement(By.id("z"));
        we.sendKeys("0"); // enter 0 for z
        we = driver.findElement(By.id("max"));
        we.click();
        we = driver.findElement(By.id("computeButton"));
        we.click();

        WebElement result = driver.findElement(By.id("result"));
        String output = result.getText(); // read the output text
        assertEquals("Please enter integer values only!", output);
    }

// execute the test <x = 0, y = four, z = 0, submitButton = notclicklick>
    @Test public void t138() {

        WebElement we = driver.findElement(By.id("x"));
        we.sendKeys("0"); // enter 0 for x
        we = driver.findElement(By.id("y"));
        we.sendKeys("four"); // enter four for y
        we = driver.findElement(By.id("z"));
        we.sendKeys("0"); // enter 0 for z
        we = driver.findElement(By.id("min"));
        we.click();
        we = driver.findElement(By.id("computeButton"));
    }

// execute the test <x = 0, y = four, z = 0, submitButton = notclicklick>
    @Test public void t139() {

        WebElement we = driver.findElement(By.id("x"));
        we.sendKeys("0"); // enter 0 for x
        we = driver.findElement(By.id("y"));
        we.sendKeys("four"); // enter four for y
        we = driver.findElement(By.id("z"));
        we.sendKeys("0"); // enter 0 for z
        we = driver.findElement(By.id("max"));
        we.click();
        we = driver.findElement(By.id("computeButton"));
    }

// execute the test <x = 0, y = four, z = 1, submitButton = clicklick>
    @Test public void t140() {

        WebElement we = driver.findElement(By.id("x"));
        we.sendKeys("0"); // enter 0 for x
        we = driver.findElement(By.id("y"));
        we.sendKeys("four"); // enter four for y
        we = driver.findElement(By.id("z"));
        we.sendKeys("1"); // enter 1 for z
        we = driver.findElement(By.id("min"));
        we.click();
        we = driver.findElement(By.id("computeButton"));
        we.click();

        WebElement result = driver.findElement(By.id("result"));
        String output = result.getText(); // read the output text
        assertEquals("Please enter integer values only!", output);
    }

// execute the test <x = 0, y = four, z = 1, submitButton = clicklick>
    @Test public void t141() {

        WebElement we = driver.findElement(By.id("x"));
        we.sendKeys("0"); // enter 0 for x
        we = driver.findElement(By.id("y"));
        we.sendKeys("four"); // enter four for y
        we = driver.findElement(By.id("z"));
        we.sendKeys("1"); // enter 1 for z
        we = driver.findElement(By.id("max"));
        we.click();
        we = driver.findElement(By.id("computeButton"));
        we.click();

        WebElement result = driver.findElement(By.id("result"));
        String output = result.getText(); // read the output text
        assertEquals("Please enter integer values only!", output);
    }

// execute the test <x = 0, y = four, z = 1, submitButton = notclicklick>
    @Test public void t142() {

        WebElement we = driver.findElement(By.id("x"));
        we.sendKeys("0"); // enter 0 for x
        we = driver.findElement(By.id("y"));
        we.sendKeys("four"); // enter four for y
        we = driver.findElement(By.id("z"));
        we.sendKeys("1"); // enter 1 for z
        we = driver.findElement(By.id("min"));
        we.click();
        we = driver.findElement(By.id("computeButton"));
    }

// execute the test <x = 0, y = four, z = 1, submitButton = notclicklick>
    @Test public void t143() {

        WebElement we = driver.findElement(By.id("x"));
        we.sendKeys("0"); // enter 0 for x
        we = driver.findElement(By.id("y"));
        we.sendKeys("four"); // enter four for y
        we = driver.findElement(By.id("z"));
        we.sendKeys("1"); // enter 1 for z
        we = driver.findElement(By.id("max"));
        we.click();
        we = driver.findElement(By.id("computeButton"));
    }

// execute the test <x = 0, y = -1, z = four, submitButton = clicklick>
    @Test public void t144() {

        WebElement we = driver.findElement(By.id("x"));
        we.sendKeys("0"); // enter 0 for x
        we = driver.findElement(By.id("y"));
        we.sendKeys("-1"); // enter -1 for y
        we = driver.findElement(By.id("z"));
        we.sendKeys("four"); // enter four for z
        we = driver.findElement(By.id("min"));
        we.click();
        we = driver.findElement(By.id("computeButton"));
        we.click();

        WebElement result = driver.findElement(By.id("result"));
        String output = result.getText(); // read the output text
        assertEquals("Please enter integer values only!", output);
    }

// execute the test <x = 0, y = -1, z = four, submitButton = clicklick>
    @Test public void t145() {

        WebElement we = driver.findElement(By.id("x"));
        we.sendKeys("0"); // enter 0 for x
        we = driver.findElement(By.id("y"));
        we.sendKeys("-1"); // enter -1 for y
        we = driver.findElement(By.id("z"));
        we.sendKeys("four"); // enter four for z
        we = driver.findElement(By.id("max"));
        we.click();
        we = driver.findElement(By.id("computeButton"));
        we.click();

        WebElement result = driver.findElement(By.id("result"));
        String output = result.getText(); // read the output text
        assertEquals("Please enter integer values only!", output);
    }

// execute the test <x = 0, y = -1, z = four, submitButton = notclicklick>
    @Test public void t146() {

        WebElement we = driver.findElement(By.id("x"));
        we.sendKeys("0"); // enter 0 for x
        we = driver.findElement(By.id("y"));
        we.sendKeys("-1"); // enter -1 for y
        we = driver.findElement(By.id("z"));
        we.sendKeys("four"); // enter four for z
        we = driver.findElement(By.id("min"));
        we.click();
        we = driver.findElement(By.id("computeButton"));
    }

// execute the test <x = 0, y = -1, z = four, submitButton = notclicklick>
    @Test public void t147() {

        WebElement we = driver.findElement(By.id("x"));
        we.sendKeys("0"); // enter 0 for x
        we = driver.findElement(By.id("y"));
        we.sendKeys("-1"); // enter -1 for y
        we = driver.findElement(By.id("z"));
        we.sendKeys("four"); // enter four for z
        we = driver.findElement(By.id("max"));
        we.click();
        we = driver.findElement(By.id("computeButton"));
    }

// execute the test <x = 0, y = -1, z = -1, submitButton = clicklick>
    @Test public void t148() {

        WebElement we = driver.findElement(By.id("x"));
        we.sendKeys("0"); // enter 0 for x
        we = driver.findElement(By.id("y"));
        we.sendKeys("-1"); // enter -1 for y
        we = driver.findElement(By.id("z"));
        we.sendKeys("-1"); // enter -1 for z
        we = driver.findElement(By.id("min"));
        we.click();
        we = driver.findElement(By.id("computeButton"));
        we.click();

        WebElement result = driver.findElement(By.id("result"));
        String output = result.getText(); // read the output text
        assertEquals("min(0, -1, -1) = -1", output);
    }

// execute the test <x = 0, y = -1, z = -1, submitButton = clicklick>
    @Test public void t149() {

        WebElement we = driver.findElement(By.id("x"));
        we.sendKeys("0"); // enter 0 for x
        we = driver.findElement(By.id("y"));
        we.sendKeys("-1"); // enter -1 for y
        we = driver.findElement(By.id("z"));
        we.sendKeys("-1"); // enter -1 for z
        we = driver.findElement(By.id("max"));
        we.click();
        we = driver.findElement(By.id("computeButton"));
        we.click();

        WebElement result = driver.findElement(By.id("result"));
        String output = result.getText(); // read the output text
        assertEquals("max(0, -1, -1) = 0", output);
    }

// execute the test <x = 0, y = -1, z = -1, submitButton = notclicklick>
    @Test public void t150() {

        WebElement we = driver.findElement(By.id("x"));
        we.sendKeys("0"); // enter 0 for x
        we = driver.findElement(By.id("y"));
        we.sendKeys("-1"); // enter -1 for y
        we = driver.findElement(By.id("z"));
        we.sendKeys("-1"); // enter -1 for z
        we = driver.findElement(By.id("min"));
        we.click();
        we = driver.findElement(By.id("computeButton"));
    }

// execute the test <x = 0, y = -1, z = -1, submitButton = notclicklick>
    @Test public void t151() {

        WebElement we = driver.findElement(By.id("x"));
        we.sendKeys("0"); // enter 0 for x
        we = driver.findElement(By.id("y"));
        we.sendKeys("-1"); // enter -1 for y
        we = driver.findElement(By.id("z"));
        we.sendKeys("-1"); // enter -1 for z
        we = driver.findElement(By.id("max"));
        we.click();
        we = driver.findElement(By.id("computeButton"));
    }

// execute the test <x = 0, y = -1, z = 0, submitButton = clicklick>
    @Test public void t152() {

        WebElement we = driver.findElement(By.id("x"));
        we.sendKeys("0"); // enter 0 for x
        we = driver.findElement(By.id("y"));
        we.sendKeys("-1"); // enter -1 for y
        we = driver.findElement(By.id("z"));
        we.sendKeys("0"); // enter 0 for z
        we = driver.findElement(By.id("min"));
        we.click();
        we = driver.findElement(By.id("computeButton"));
        we.click();

        WebElement result = driver.findElement(By.id("result"));
        String output = result.getText(); // read the output text
        assertEquals("min(0, -1, 0) = -1", output);
    }

// execute the test <x = 0, y = -1, z = 0, submitButton = clicklick>
    @Test public void t153() {

        WebElement we = driver.findElement(By.id("x"));
        we.sendKeys("0"); // enter 0 for x
        we = driver.findElement(By.id("y"));
        we.sendKeys("-1"); // enter -1 for y
        we = driver.findElement(By.id("z"));
        we.sendKeys("0"); // enter 0 for z
        we = driver.findElement(By.id("max"));
        we.click();
        we = driver.findElement(By.id("computeButton"));
        we.click();

        WebElement result = driver.findElement(By.id("result"));
        String output = result.getText(); // read the output text
        assertEquals("max(0, -1, 0) = 0", output);
    }

// execute the test <x = 0, y = -1, z = 0, submitButton = notclicklick>
    @Test public void t154() {

        WebElement we = driver.findElement(By.id("x"));
        we.sendKeys("0"); // enter 0 for x
        we = driver.findElement(By.id("y"));
        we.sendKeys("-1"); // enter -1 for y
        we = driver.findElement(By.id("z"));
        we.sendKeys("0"); // enter 0 for z
        we = driver.findElement(By.id("min"));
        we.click();
        we = driver.findElement(By.id("computeButton"));
    }

// execute the test <x = 0, y = -1, z = 0, submitButton = notclicklick>
    @Test public void t155() {

        WebElement we = driver.findElement(By.id("x"));
        we.sendKeys("0"); // enter 0 for x
        we = driver.findElement(By.id("y"));
        we.sendKeys("-1"); // enter -1 for y
        we = driver.findElement(By.id("z"));
        we.sendKeys("0"); // enter 0 for z
        we = driver.findElement(By.id("max"));
        we.click();
        we = driver.findElement(By.id("computeButton"));
    }

// execute the test <x = 0, y = -1, z = 1, submitButton = clicklick>
    @Test public void t156() {

        WebElement we = driver.findElement(By.id("x"));
        we.sendKeys("0"); // enter 0 for x
        we = driver.findElement(By.id("y"));
        we.sendKeys("-1"); // enter -1 for y
        we = driver.findElement(By.id("z"));
        we.sendKeys("1"); // enter 1 for z
        we = driver.findElement(By.id("min"));
        we.click();
        we = driver.findElement(By.id("computeButton"));
        we.click();

        WebElement result = driver.findElement(By.id("result"));
        String output = result.getText(); // read the output text
        assertEquals("min(0, -1, 1) = -1", output);
    }

// execute the test <x = 0, y = -1, z = 1, submitButton = clicklick>
    @Test public void t157() {

        WebElement we = driver.findElement(By.id("x"));
        we.sendKeys("0"); // enter 0 for x
        we = driver.findElement(By.id("y"));
        we.sendKeys("-1"); // enter -1 for y
        we = driver.findElement(By.id("z"));
        we.sendKeys("1"); // enter 1 for z
        we = driver.findElement(By.id("max"));
        we.click();
        we = driver.findElement(By.id("computeButton"));
        we.click();

        WebElement result = driver.findElement(By.id("result"));
        String output = result.getText(); // read the output text
        assertEquals("max(0, -1, 1) = 1", output);
    }

// execute the test <x = 0, y = -1, z = 1, submitButton = notclicklick>
    @Test public void t158() {

        WebElement we = driver.findElement(By.id("x"));
        we.sendKeys("0"); // enter 0 for x
        we = driver.findElement(By.id("y"));
        we.sendKeys("-1"); // enter -1 for y
        we = driver.findElement(By.id("z"));
        we.sendKeys("1"); // enter 1 for z
        we = driver.findElement(By.id("min"));
        we.click();
        we = driver.findElement(By.id("computeButton"));
    }

// execute the test <x = 0, y = -1, z = 1, submitButton = notclicklick>
    @Test public void t159() {

        WebElement we = driver.findElement(By.id("x"));
        we.sendKeys("0"); // enter 0 for x
        we = driver.findElement(By.id("y"));
        we.sendKeys("-1"); // enter -1 for y
        we = driver.findElement(By.id("z"));
        we.sendKeys("1"); // enter 1 for z
        we = driver.findElement(By.id("max"));
        we.click();
        we = driver.findElement(By.id("computeButton"));
    }

// execute the test <x = 0, y = 0, z = four, submitButton = clicklick>
    @Test public void t160() {

        WebElement we = driver.findElement(By.id("x"));
        we.sendKeys("0"); // enter 0 for x
        we = driver.findElement(By.id("y"));
        we.sendKeys("0"); // enter 0 for y
        we = driver.findElement(By.id("z"));
        we.sendKeys("four"); // enter four for z
        we = driver.findElement(By.id("min"));
        we.click();
        we = driver.findElement(By.id("computeButton"));
        we.click();

        WebElement result = driver.findElement(By.id("result"));
        String output = result.getText(); // read the output text
        assertEquals("Please enter integer values only!", output);
    }

// execute the test <x = 0, y = 0, z = four, submitButton = clicklick>
    @Test public void t161() {

        WebElement we = driver.findElement(By.id("x"));
        we.sendKeys("0"); // enter 0 for x
        we = driver.findElement(By.id("y"));
        we.sendKeys("0"); // enter 0 for y
        we = driver.findElement(By.id("z"));
        we.sendKeys("four"); // enter four for z
        we = driver.findElement(By.id("max"));
        we.click();
        we = driver.findElement(By.id("computeButton"));
        we.click();

        WebElement result = driver.findElement(By.id("result"));
        String output = result.getText(); // read the output text
        assertEquals("Please enter integer values only!", output);
    }

// execute the test <x = 0, y = 0, z = four, submitButton = notclicklick>
    @Test public void t162() {

        WebElement we = driver.findElement(By.id("x"));
        we.sendKeys("0"); // enter 0 for x
        we = driver.findElement(By.id("y"));
        we.sendKeys("0"); // enter 0 for y
        we = driver.findElement(By.id("z"));
        we.sendKeys("four"); // enter four for z
        we = driver.findElement(By.id("min"));
        we.click();
        we = driver.findElement(By.id("computeButton"));
    }

// execute the test <x = 0, y = 0, z = four, submitButton = notclicklick>
    @Test public void t163() {

        WebElement we = driver.findElement(By.id("x"));
        we.sendKeys("0"); // enter 0 for x
        we = driver.findElement(By.id("y"));
        we.sendKeys("0"); // enter 0 for y
        we = driver.findElement(By.id("z"));
        we.sendKeys("four"); // enter four for z
        we = driver.findElement(By.id("max"));
        we.click();
        we = driver.findElement(By.id("computeButton"));
    }

// execute the test <x = 0, y = 0, z = -1, submitButton = clicklick>
    @Test public void t164() {

        WebElement we = driver.findElement(By.id("x"));
        we.sendKeys("0"); // enter 0 for x
        we = driver.findElement(By.id("y"));
        we.sendKeys("0"); // enter 0 for y
        we = driver.findElement(By.id("z"));
        we.sendKeys("-1"); // enter -1 for z
        we = driver.findElement(By.id("min"));
        we.click();
        we = driver.findElement(By.id("computeButton"));
        we.click();

        WebElement result = driver.findElement(By.id("result"));
        String output = result.getText(); // read the output text
        assertEquals("min(0, 0, -1) = -1", output);
    }

// execute the test <x = 0, y = 0, z = -1, submitButton = clicklick>
    @Test public void t165() {

        WebElement we = driver.findElement(By.id("x"));
        we.sendKeys("0"); // enter 0 for x
        we = driver.findElement(By.id("y"));
        we.sendKeys("0"); // enter 0 for y
        we = driver.findElement(By.id("z"));
        we.sendKeys("-1"); // enter -1 for z
        we = driver.findElement(By.id("max"));
        we.click();
        we = driver.findElement(By.id("computeButton"));
        we.click();

        WebElement result = driver.findElement(By.id("result"));
        String output = result.getText(); // read the output text
        assertEquals("max(0, 0, -1) = 0", output);
    }

// execute the test <x = 0, y = 0, z = -1, submitButton = notclicklick>
    @Test public void t166() {

        WebElement we = driver.findElement(By.id("x"));
        we.sendKeys("0"); // enter 0 for x
        we = driver.findElement(By.id("y"));
        we.sendKeys("0"); // enter 0 for y
        we = driver.findElement(By.id("z"));
        we.sendKeys("-1"); // enter -1 for z
        we = driver.findElement(By.id("min"));
        we.click();
        we = driver.findElement(By.id("computeButton"));
    }

// execute the test <x = 0, y = 0, z = -1, submitButton = notclicklick>
    @Test public void t167() {

        WebElement we = driver.findElement(By.id("x"));
        we.sendKeys("0"); // enter 0 for x
        we = driver.findElement(By.id("y"));
        we.sendKeys("0"); // enter 0 for y
        we = driver.findElement(By.id("z"));
        we.sendKeys("-1"); // enter -1 for z
        we = driver.findElement(By.id("max"));
        we.click();
        we = driver.findElement(By.id("computeButton"));
    }

// execute the test <x = 0, y = 0, z = 0, submitButton = clicklick>
    @Test public void t168() {

        WebElement we = driver.findElement(By.id("x"));
        we.sendKeys("0"); // enter 0 for x
        we = driver.findElement(By.id("y"));
        we.sendKeys("0"); // enter 0 for y
        we = driver.findElement(By.id("z"));
        we.sendKeys("0"); // enter 0 for z
        we = driver.findElement(By.id("min"));
        we.click();
        we = driver.findElement(By.id("computeButton"));
        we.click();

        WebElement result = driver.findElement(By.id("result"));
        String output = result.getText(); // read the output text
        assertEquals("min(0, 0, 0) = 0", output);
    }

// execute the test <x = 0, y = 0, z = 0, submitButton = clicklick>
    @Test public void t169() {

        WebElement we = driver.findElement(By.id("x"));
        we.sendKeys("0"); // enter 0 for x
        we = driver.findElement(By.id("y"));
        we.sendKeys("0"); // enter 0 for y
        we = driver.findElement(By.id("z"));
        we.sendKeys("0"); // enter 0 for z
        we = driver.findElement(By.id("max"));
        we.click();
        we = driver.findElement(By.id("computeButton"));
        we.click();

        WebElement result = driver.findElement(By.id("result"));
        String output = result.getText(); // read the output text
        assertEquals("max(0, 0, 0) = 0", output);
    }

// execute the test <x = 0, y = 0, z = 0, submitButton = notclicklick>
    @Test public void t170() {

        WebElement we = driver.findElement(By.id("x"));
        we.sendKeys("0"); // enter 0 for x
        we = driver.findElement(By.id("y"));
        we.sendKeys("0"); // enter 0 for y
        we = driver.findElement(By.id("z"));
        we.sendKeys("0"); // enter 0 for z
        we = driver.findElement(By.id("min"));
        we.click();
        we = driver.findElement(By.id("computeButton"));
    }

// execute the test <x = 0, y = 0, z = 0, submitButton = notclicklick>
    @Test public void t171() {

        WebElement we = driver.findElement(By.id("x"));
        we.sendKeys("0"); // enter 0 for x
        we = driver.findElement(By.id("y"));
        we.sendKeys("0"); // enter 0 for y
        we = driver.findElement(By.id("z"));
        we.sendKeys("0"); // enter 0 for z
        we = driver.findElement(By.id("max"));
        we.click();
        we = driver.findElement(By.id("computeButton"));
    }

// execute the test <x = 0, y = 0, z = 1, submitButton = clicklick>
    @Test public void t172() {

        WebElement we = driver.findElement(By.id("x"));
        we.sendKeys("0"); // enter 0 for x
        we = driver.findElement(By.id("y"));
        we.sendKeys("0"); // enter 0 for y
        we = driver.findElement(By.id("z"));
        we.sendKeys("1"); // enter 1 for z
        we = driver.findElement(By.id("min"));
        we.click();
        we = driver.findElement(By.id("computeButton"));
        we.click();

        WebElement result = driver.findElement(By.id("result"));
        String output = result.getText(); // read the output text
        assertEquals("min(0, 0, 1) = 0", output);
    }

// execute the test <x = 0, y = 0, z = 1, submitButton = clicklick>
    @Test public void t173() {

        WebElement we = driver.findElement(By.id("x"));
        we.sendKeys("0"); // enter 0 for x
        we = driver.findElement(By.id("y"));
        we.sendKeys("0"); // enter 0 for y
        we = driver.findElement(By.id("z"));
        we.sendKeys("1"); // enter 1 for z
        we = driver.findElement(By.id("max"));
        we.click();
        we = driver.findElement(By.id("computeButton"));
        we.click();

        WebElement result = driver.findElement(By.id("result"));
        String output = result.getText(); // read the output text
        assertEquals("max(0, 0, 1) = 1", output);
    }

// execute the test <x = 0, y = 0, z = 1, submitButton = notclicklick>
    @Test public void t174() {

        WebElement we = driver.findElement(By.id("x"));
        we.sendKeys("0"); // enter 0 for x
        we = driver.findElement(By.id("y"));
        we.sendKeys("0"); // enter 0 for y
        we = driver.findElement(By.id("z"));
        we.sendKeys("1"); // enter 1 for z
        we = driver.findElement(By.id("min"));
        we.click();
        we = driver.findElement(By.id("computeButton"));
    }

// execute the test <x = 0, y = 0, z = 1, submitButton = notclicklick>
    @Test public void t175() {

        WebElement we = driver.findElement(By.id("x"));
        we.sendKeys("0"); // enter 0 for x
        we = driver.findElement(By.id("y"));
        we.sendKeys("0"); // enter 0 for y
        we = driver.findElement(By.id("z"));
        we.sendKeys("1"); // enter 1 for z
        we = driver.findElement(By.id("max"));
        we.click();
        we = driver.findElement(By.id("computeButton"));
    }

// execute the test <x = 0, y = 1, z = four, submitButton = clicklick>
    @Test public void t176() {

        WebElement we = driver.findElement(By.id("x"));
        we.sendKeys("0"); // enter 0 for x
        we = driver.findElement(By.id("y"));
        we.sendKeys("1"); // enter 1 for y
        we = driver.findElement(By.id("z"));
        we.sendKeys("four"); // enter four for z
        we = driver.findElement(By.id("min"));
        we.click();
        we = driver.findElement(By.id("computeButton"));
        we.click();

        WebElement result = driver.findElement(By.id("result"));
        String output = result.getText(); // read the output text
        assertEquals("Please enter integer values only!", output);
    }

// execute the test <x = 0, y = 1, z = four, submitButton = clicklick>
    @Test public void t177() {

        WebElement we = driver.findElement(By.id("x"));
        we.sendKeys("0"); // enter 0 for x
        we = driver.findElement(By.id("y"));
        we.sendKeys("1"); // enter 1 for y
        we = driver.findElement(By.id("z"));
        we.sendKeys("four"); // enter four for z
        we = driver.findElement(By.id("max"));
        we.click();
        we = driver.findElement(By.id("computeButton"));
        we.click();

        WebElement result = driver.findElement(By.id("result"));
        String output = result.getText(); // read the output text
        assertEquals("Please enter integer values only!", output);
    }

// execute the test <x = 0, y = 1, z = four, submitButton = notclicklick>
    @Test public void t178() {

        WebElement we = driver.findElement(By.id("x"));
        we.sendKeys("0"); // enter 0 for x
        we = driver.findElement(By.id("y"));
        we.sendKeys("1"); // enter 1 for y
        we = driver.findElement(By.id("z"));
        we.sendKeys("four"); // enter four for z
        we = driver.findElement(By.id("min"));
        we.click();
        we = driver.findElement(By.id("computeButton"));
    }

// execute the test <x = 0, y = 1, z = four, submitButton = notclicklick>
    @Test public void t179() {

        WebElement we = driver.findElement(By.id("x"));
        we.sendKeys("0"); // enter 0 for x
        we = driver.findElement(By.id("y"));
        we.sendKeys("1"); // enter 1 for y
        we = driver.findElement(By.id("z"));
        we.sendKeys("four"); // enter four for z
        we = driver.findElement(By.id("max"));
        we.click();
        we = driver.findElement(By.id("computeButton"));
    }

// execute the test <x = 0, y = 1, z = -1, submitButton = clicklick>
    @Test public void t180() {

        WebElement we = driver.findElement(By.id("x"));
        we.sendKeys("0"); // enter 0 for x
        we = driver.findElement(By.id("y"));
        we.sendKeys("1"); // enter 1 for y
        we = driver.findElement(By.id("z"));
        we.sendKeys("-1"); // enter -1 for z
        we = driver.findElement(By.id("min"));
        we.click();
        we = driver.findElement(By.id("computeButton"));
        we.click();

        WebElement result = driver.findElement(By.id("result"));
        String output = result.getText(); // read the output text
        assertEquals("min(0, 1, -1) = -1", output);
    }

// execute the test <x = 0, y = 1, z = -1, submitButton = clicklick>
    @Test public void t181() {

        WebElement we = driver.findElement(By.id("x"));
        we.sendKeys("0"); // enter 0 for x
        we = driver.findElement(By.id("y"));
        we.sendKeys("1"); // enter 1 for y
        we = driver.findElement(By.id("z"));
        we.sendKeys("-1"); // enter -1 for z
        we = driver.findElement(By.id("max"));
        we.click();
        we = driver.findElement(By.id("computeButton"));
        we.click();

        WebElement result = driver.findElement(By.id("result"));
        String output = result.getText(); // read the output text
        assertEquals("max(0, 1, -1) = 1", output);
    }

// execute the test <x = 0, y = 1, z = -1, submitButton = notclicklick>
    @Test public void t182() {

        WebElement we = driver.findElement(By.id("x"));
        we.sendKeys("0"); // enter 0 for x
        we = driver.findElement(By.id("y"));
        we.sendKeys("1"); // enter 1 for y
        we = driver.findElement(By.id("z"));
        we.sendKeys("-1"); // enter -1 for z
        we = driver.findElement(By.id("min"));
        we.click();
        we = driver.findElement(By.id("computeButton"));
    }

// execute the test <x = 0, y = 1, z = -1, submitButton = notclicklick>
    @Test public void t183() {

        WebElement we = driver.findElement(By.id("x"));
        we.sendKeys("0"); // enter 0 for x
        we = driver.findElement(By.id("y"));
        we.sendKeys("1"); // enter 1 for y
        we = driver.findElement(By.id("z"));
        we.sendKeys("-1"); // enter -1 for z
        we = driver.findElement(By.id("max"));
        we.click();
        we = driver.findElement(By.id("computeButton"));
    }

// execute the test <x = 0, y = 1, z = 0, submitButton = clicklick>
    @Test public void t184() {

        WebElement we = driver.findElement(By.id("x"));
        we.sendKeys("0"); // enter 0 for x
        we = driver.findElement(By.id("y"));
        we.sendKeys("1"); // enter 1 for y
        we = driver.findElement(By.id("z"));
        we.sendKeys("0"); // enter 0 for z
        we = driver.findElement(By.id("min"));
        we.click();
        we = driver.findElement(By.id("computeButton"));
        we.click();

        WebElement result = driver.findElement(By.id("result"));
        String output = result.getText(); // read the output text
        assertEquals("min(0, 1, 0) = 0", output);
    }

// execute the test <x = 0, y = 1, z = 0, submitButton = clicklick>
    @Test public void t185() {

        WebElement we = driver.findElement(By.id("x"));
        we.sendKeys("0"); // enter 0 for x
        we = driver.findElement(By.id("y"));
        we.sendKeys("1"); // enter 1 for y
        we = driver.findElement(By.id("z"));
        we.sendKeys("0"); // enter 0 for z
        we = driver.findElement(By.id("max"));
        we.click();
        we = driver.findElement(By.id("computeButton"));
        we.click();

        WebElement result = driver.findElement(By.id("result"));
        String output = result.getText(); // read the output text
        assertEquals("max(0, 1, 0) = 1", output);
    }

// execute the test <x = 0, y = 1, z = 0, submitButton = notclicklick>
    @Test public void t186() {

        WebElement we = driver.findElement(By.id("x"));
        we.sendKeys("0"); // enter 0 for x
        we = driver.findElement(By.id("y"));
        we.sendKeys("1"); // enter 1 for y
        we = driver.findElement(By.id("z"));
        we.sendKeys("0"); // enter 0 for z
        we = driver.findElement(By.id("min"));
        we.click();
        we = driver.findElement(By.id("computeButton"));
    }

// execute the test <x = 0, y = 1, z = 0, submitButton = notclicklick>
    @Test public void t187() {

        WebElement we = driver.findElement(By.id("x"));
        we.sendKeys("0"); // enter 0 for x
        we = driver.findElement(By.id("y"));
        we.sendKeys("1"); // enter 1 for y
        we = driver.findElement(By.id("z"));
        we.sendKeys("0"); // enter 0 for z
        we = driver.findElement(By.id("max"));
        we.click();
        we = driver.findElement(By.id("computeButton"));
    }

// execute the test <x = 0, y = 1, z = 1, submitButton = clicklick>
    @Test public void t188() {

        WebElement we = driver.findElement(By.id("x"));
        we.sendKeys("0"); // enter 0 for x
        we = driver.findElement(By.id("y"));
        we.sendKeys("1"); // enter 1 for y
        we = driver.findElement(By.id("z"));
        we.sendKeys("1"); // enter 1 for z
        we = driver.findElement(By.id("min"));
        we.click();
        we = driver.findElement(By.id("computeButton"));
        we.click();

        WebElement result = driver.findElement(By.id("result"));
        String output = result.getText(); // read the output text
        assertEquals("min(0, 1, 1) = 0", output);
    }

// execute the test <x = 0, y = 1, z = 1, submitButton = clicklick>
    @Test public void t189() {

        WebElement we = driver.findElement(By.id("x"));
        we.sendKeys("0"); // enter 0 for x
        we = driver.findElement(By.id("y"));
        we.sendKeys("1"); // enter 1 for y
        we = driver.findElement(By.id("z"));
        we.sendKeys("1"); // enter 1 for z
        we = driver.findElement(By.id("max"));
        we.click();
        we = driver.findElement(By.id("computeButton"));
        we.click();

        WebElement result = driver.findElement(By.id("result"));
        String output = result.getText(); // read the output text
        assertEquals("max(0, 1, 1) = 1", output);
    }

// execute the test <x = 0, y = 1, z = 1, submitButton = notclicklick>
    @Test public void t190() {

        WebElement we = driver.findElement(By.id("x"));
        we.sendKeys("0"); // enter 0 for x
        we = driver.findElement(By.id("y"));
        we.sendKeys("1"); // enter 1 for y
        we = driver.findElement(By.id("z"));
        we.sendKeys("1"); // enter 1 for z
        we = driver.findElement(By.id("min"));
        we.click();
        we = driver.findElement(By.id("computeButton"));
    }

// execute the test <x = 0, y = 1, z = 1, submitButton = notclicklick>
    @Test public void t191() {

        WebElement we = driver.findElement(By.id("x"));
        we.sendKeys("0"); // enter 0 for x
        we = driver.findElement(By.id("y"));
        we.sendKeys("1"); // enter 1 for y
        we = driver.findElement(By.id("z"));
        we.sendKeys("1"); // enter 1 for z
        we = driver.findElement(By.id("max"));
        we.click();
        we = driver.findElement(By.id("computeButton"));
    }

// execute the test <x = 1, y = four, z = four, submitButton = clicklick>
    @Test public void t192() {

        WebElement we = driver.findElement(By.id("x"));
        we.sendKeys("1"); // enter 1 for x
        we = driver.findElement(By.id("y"));
        we.sendKeys("four"); // enter four for y
        we = driver.findElement(By.id("z"));
        we.sendKeys("four"); // enter four for z
        we = driver.findElement(By.id("min"));
        we.click();
        we = driver.findElement(By.id("computeButton"));
        we.click();

        WebElement result = driver.findElement(By.id("result"));
        String output = result.getText(); // read the output text
        assertEquals("Please enter integer values only!", output);
    }

// execute the test <x = 1, y = four, z = four, submitButton = clicklick>
    @Test public void t193() {

        WebElement we = driver.findElement(By.id("x"));
        we.sendKeys("1"); // enter 1 for x
        we = driver.findElement(By.id("y"));
        we.sendKeys("four"); // enter four for y
        we = driver.findElement(By.id("z"));
        we.sendKeys("four"); // enter four for z
        we = driver.findElement(By.id("max"));
        we.click();
        we = driver.findElement(By.id("computeButton"));
        we.click();

        WebElement result = driver.findElement(By.id("result"));
        String output = result.getText(); // read the output text
        assertEquals("Please enter integer values only!", output);
    }

// execute the test <x = 1, y = four, z = four, submitButton = notclicklick>
    @Test public void t194() {

        WebElement we = driver.findElement(By.id("x"));
        we.sendKeys("1"); // enter 1 for x
        we = driver.findElement(By.id("y"));
        we.sendKeys("four"); // enter four for y
        we = driver.findElement(By.id("z"));
        we.sendKeys("four"); // enter four for z
        we = driver.findElement(By.id("min"));
        we.click();
        we = driver.findElement(By.id("computeButton"));
    }

// execute the test <x = 1, y = four, z = four, submitButton = notclicklick>
    @Test public void t195() {

        WebElement we = driver.findElement(By.id("x"));
        we.sendKeys("1"); // enter 1 for x
        we = driver.findElement(By.id("y"));
        we.sendKeys("four"); // enter four for y
        we = driver.findElement(By.id("z"));
        we.sendKeys("four"); // enter four for z
        we = driver.findElement(By.id("max"));
        we.click();
        we = driver.findElement(By.id("computeButton"));
    }

// execute the test <x = 1, y = four, z = -1, submitButton = clicklick>
    @Test public void t196() {

        WebElement we = driver.findElement(By.id("x"));
        we.sendKeys("1"); // enter 1 for x
        we = driver.findElement(By.id("y"));
        we.sendKeys("four"); // enter four for y
        we = driver.findElement(By.id("z"));
        we.sendKeys("-1"); // enter -1 for z
        we = driver.findElement(By.id("min"));
        we.click();
        we = driver.findElement(By.id("computeButton"));
        we.click();

        WebElement result = driver.findElement(By.id("result"));
        String output = result.getText(); // read the output text
        assertEquals("Please enter integer values only!", output);
    }

// execute the test <x = 1, y = four, z = -1, submitButton = clicklick>
    @Test public void t197() {

        WebElement we = driver.findElement(By.id("x"));
        we.sendKeys("1"); // enter 1 for x
        we = driver.findElement(By.id("y"));
        we.sendKeys("four"); // enter four for y
        we = driver.findElement(By.id("z"));
        we.sendKeys("-1"); // enter -1 for z
        we = driver.findElement(By.id("max"));
        we.click();
        we = driver.findElement(By.id("computeButton"));
        we.click();

        WebElement result = driver.findElement(By.id("result"));
        String output = result.getText(); // read the output text
        assertEquals("Please enter integer values only!", output);
    }

// execute the test <x = 1, y = four, z = -1, submitButton = notclicklick>
    @Test public void t198() {

        WebElement we = driver.findElement(By.id("x"));
        we.sendKeys("1"); // enter 1 for x
        we = driver.findElement(By.id("y"));
        we.sendKeys("four"); // enter four for y
        we = driver.findElement(By.id("z"));
        we.sendKeys("-1"); // enter -1 for z
        we = driver.findElement(By.id("min"));
        we.click();
        we = driver.findElement(By.id("computeButton"));
    }

// execute the test <x = 1, y = four, z = -1, submitButton = notclicklick>
    @Test public void t199() {

        WebElement we = driver.findElement(By.id("x"));
        we.sendKeys("1"); // enter 1 for x
        we = driver.findElement(By.id("y"));
        we.sendKeys("four"); // enter four for y
        we = driver.findElement(By.id("z"));
        we.sendKeys("-1"); // enter -1 for z
        we = driver.findElement(By.id("max"));
        we.click();
        we = driver.findElement(By.id("computeButton"));
    }

// execute the test <x = 1, y = four, z = 0, submitButton = clicklick>
    @Test public void t200() {

        WebElement we = driver.findElement(By.id("x"));
        we.sendKeys("1"); // enter 1 for x
        we = driver.findElement(By.id("y"));
        we.sendKeys("four"); // enter four for y
        we = driver.findElement(By.id("z"));
        we.sendKeys("0"); // enter 0 for z
        we = driver.findElement(By.id("min"));
        we.click();
        we = driver.findElement(By.id("computeButton"));
        we.click();

        WebElement result = driver.findElement(By.id("result"));
        String output = result.getText(); // read the output text
        assertEquals("Please enter integer values only!", output);
    }

// execute the test <x = 1, y = four, z = 0, submitButton = clicklick>
    @Test public void t201() {

        WebElement we = driver.findElement(By.id("x"));
        we.sendKeys("1"); // enter 1 for x
        we = driver.findElement(By.id("y"));
        we.sendKeys("four"); // enter four for y
        we = driver.findElement(By.id("z"));
        we.sendKeys("0"); // enter 0 for z
        we = driver.findElement(By.id("max"));
        we.click();
        we = driver.findElement(By.id("computeButton"));
        we.click();

        WebElement result = driver.findElement(By.id("result"));
        String output = result.getText(); // read the output text
        assertEquals("Please enter integer values only!", output);
    }

// execute the test <x = 1, y = four, z = 0, submitButton = notclicklick>
    @Test public void t202() {

        WebElement we = driver.findElement(By.id("x"));
        we.sendKeys("1"); // enter 1 for x
        we = driver.findElement(By.id("y"));
        we.sendKeys("four"); // enter four for y
        we = driver.findElement(By.id("z"));
        we.sendKeys("0"); // enter 0 for z
        we = driver.findElement(By.id("min"));
        we.click();
        we = driver.findElement(By.id("computeButton"));
    }

// execute the test <x = 1, y = four, z = 0, submitButton = notclicklick>
    @Test public void t203() {

        WebElement we = driver.findElement(By.id("x"));
        we.sendKeys("1"); // enter 1 for x
        we = driver.findElement(By.id("y"));
        we.sendKeys("four"); // enter four for y
        we = driver.findElement(By.id("z"));
        we.sendKeys("0"); // enter 0 for z
        we = driver.findElement(By.id("max"));
        we.click();
        we = driver.findElement(By.id("computeButton"));
    }

// execute the test <x = 1, y = four, z = 1, submitButton = clicklick>
    @Test public void t204() {

        WebElement we = driver.findElement(By.id("x"));
        we.sendKeys("1"); // enter 1 for x
        we = driver.findElement(By.id("y"));
        we.sendKeys("four"); // enter four for y
        we = driver.findElement(By.id("z"));
        we.sendKeys("1"); // enter 1 for z
        we = driver.findElement(By.id("min"));
        we.click();
        we = driver.findElement(By.id("computeButton"));
        we.click();

        WebElement result = driver.findElement(By.id("result"));
        String output = result.getText(); // read the output text
        assertEquals("Please enter integer values only!", output);
    }

// execute the test <x = 1, y = four, z = 1, submitButton = clicklick>
    @Test public void t205() {

        WebElement we = driver.findElement(By.id("x"));
        we.sendKeys("1"); // enter 1 for x
        we = driver.findElement(By.id("y"));
        we.sendKeys("four"); // enter four for y
        we = driver.findElement(By.id("z"));
        we.sendKeys("1"); // enter 1 for z
        we = driver.findElement(By.id("max"));
        we.click();
        we = driver.findElement(By.id("computeButton"));
        we.click();

        WebElement result = driver.findElement(By.id("result"));
        String output = result.getText(); // read the output text
        assertEquals("Please enter integer values only!", output);
    }

// execute the test <x = 1, y = four, z = 1, submitButton = notclicklick>
    @Test public void t206() {

        WebElement we = driver.findElement(By.id("x"));
        we.sendKeys("1"); // enter 1 for x
        we = driver.findElement(By.id("y"));
        we.sendKeys("four"); // enter four for y
        we = driver.findElement(By.id("z"));
        we.sendKeys("1"); // enter 1 for z
        we = driver.findElement(By.id("min"));
        we.click();
        we = driver.findElement(By.id("computeButton"));
    }

// execute the test <x = 1, y = four, z = 1, submitButton = notclicklick>
    @Test public void t207() {

        WebElement we = driver.findElement(By.id("x"));
        we.sendKeys("1"); // enter 1 for x
        we = driver.findElement(By.id("y"));
        we.sendKeys("four"); // enter four for y
        we = driver.findElement(By.id("z"));
        we.sendKeys("1"); // enter 1 for z
        we = driver.findElement(By.id("max"));
        we.click();
        we = driver.findElement(By.id("computeButton"));
    }

// execute the test <x = 1, y = -1, z = four, submitButton = clicklick>
    @Test public void t208() {

        WebElement we = driver.findElement(By.id("x"));
        we.sendKeys("1"); // enter 1 for x
        we = driver.findElement(By.id("y"));
        we.sendKeys("-1"); // enter -1 for y
        we = driver.findElement(By.id("z"));
        we.sendKeys("four"); // enter four for z
        we = driver.findElement(By.id("min"));
        we.click();
        we = driver.findElement(By.id("computeButton"));
        we.click();

        WebElement result = driver.findElement(By.id("result"));
        String output = result.getText(); // read the output text
        assertEquals("Please enter integer values only!", output);
    }

// execute the test <x = 1, y = -1, z = four, submitButton = clicklick>
    @Test public void t209() {

        WebElement we = driver.findElement(By.id("x"));
        we.sendKeys("1"); // enter 1 for x
        we = driver.findElement(By.id("y"));
        we.sendKeys("-1"); // enter -1 for y
        we = driver.findElement(By.id("z"));
        we.sendKeys("four"); // enter four for z
        we = driver.findElement(By.id("max"));
        we.click();
        we = driver.findElement(By.id("computeButton"));
        we.click();

        WebElement result = driver.findElement(By.id("result"));
        String output = result.getText(); // read the output text
        assertEquals("Please enter integer values only!", output);
    }

// execute the test <x = 1, y = -1, z = four, submitButton = notclicklick>
    @Test public void t210() {

        WebElement we = driver.findElement(By.id("x"));
        we.sendKeys("1"); // enter 1 for x
        we = driver.findElement(By.id("y"));
        we.sendKeys("-1"); // enter -1 for y
        we = driver.findElement(By.id("z"));
        we.sendKeys("four"); // enter four for z
        we = driver.findElement(By.id("min"));
        we.click();
        we = driver.findElement(By.id("computeButton"));
    }

// execute the test <x = 1, y = -1, z = four, submitButton = notclicklick>
    @Test public void t211() {

        WebElement we = driver.findElement(By.id("x"));
        we.sendKeys("1"); // enter 1 for x
        we = driver.findElement(By.id("y"));
        we.sendKeys("-1"); // enter -1 for y
        we = driver.findElement(By.id("z"));
        we.sendKeys("four"); // enter four for z
        we = driver.findElement(By.id("max"));
        we.click();
        we = driver.findElement(By.id("computeButton"));
    }

// execute the test <x = 1, y = -1, z = -1, submitButton = clicklick>
    @Test public void t212() {

        WebElement we = driver.findElement(By.id("x"));
        we.sendKeys("1"); // enter 1 for x
        we = driver.findElement(By.id("y"));
        we.sendKeys("-1"); // enter -1 for y
        we = driver.findElement(By.id("z"));
        we.sendKeys("-1"); // enter -1 for z
        we = driver.findElement(By.id("min"));
        we.click();
        we = driver.findElement(By.id("computeButton"));
        we.click();

        WebElement result = driver.findElement(By.id("result"));
        String output = result.getText(); // read the output text
        assertEquals("min(1, -1, -1) = -1", output);
    }

// execute the test <x = 1, y = -1, z = -1, submitButton = clicklick>
    @Test public void t213() {

        WebElement we = driver.findElement(By.id("x"));
        we.sendKeys("1"); // enter 1 for x
        we = driver.findElement(By.id("y"));
        we.sendKeys("-1"); // enter -1 for y
        we = driver.findElement(By.id("z"));
        we.sendKeys("-1"); // enter -1 for z
        we = driver.findElement(By.id("max"));
        we.click();
        we = driver.findElement(By.id("computeButton"));
        we.click();

        WebElement result = driver.findElement(By.id("result"));
        String output = result.getText(); // read the output text
        assertEquals("max(1, -1, -1) = 1", output);
    }

// execute the test <x = 1, y = -1, z = -1, submitButton = notclicklick>
    @Test public void t214() {

        WebElement we = driver.findElement(By.id("x"));
        we.sendKeys("1"); // enter 1 for x
        we = driver.findElement(By.id("y"));
        we.sendKeys("-1"); // enter -1 for y
        we = driver.findElement(By.id("z"));
        we.sendKeys("-1"); // enter -1 for z
        we = driver.findElement(By.id("min"));
        we.click();
        we = driver.findElement(By.id("computeButton"));
    }

// execute the test <x = 1, y = -1, z = -1, submitButton = notclicklick>
    @Test public void t215() {

        WebElement we = driver.findElement(By.id("x"));
        we.sendKeys("1"); // enter 1 for x
        we = driver.findElement(By.id("y"));
        we.sendKeys("-1"); // enter -1 for y
        we = driver.findElement(By.id("z"));
        we.sendKeys("-1"); // enter -1 for z
        we = driver.findElement(By.id("max"));
        we.click();
        we = driver.findElement(By.id("computeButton"));
    }

// execute the test <x = 1, y = -1, z = 0, submitButton = clicklick>
    @Test public void t216() {

        WebElement we = driver.findElement(By.id("x"));
        we.sendKeys("1"); // enter 1 for x
        we = driver.findElement(By.id("y"));
        we.sendKeys("-1"); // enter -1 for y
        we = driver.findElement(By.id("z"));
        we.sendKeys("0"); // enter 0 for z
        we = driver.findElement(By.id("min"));
        we.click();
        we = driver.findElement(By.id("computeButton"));
        we.click();

        WebElement result = driver.findElement(By.id("result"));
        String output = result.getText(); // read the output text
        assertEquals("min(1, -1, 0) = -1", output);
    }

// execute the test <x = 1, y = -1, z = 0, submitButton = clicklick>
    @Test public void t217() {

        WebElement we = driver.findElement(By.id("x"));
        we.sendKeys("1"); // enter 1 for x
        we = driver.findElement(By.id("y"));
        we.sendKeys("-1"); // enter -1 for y
        we = driver.findElement(By.id("z"));
        we.sendKeys("0"); // enter 0 for z
        we = driver.findElement(By.id("max"));
        we.click();
        we = driver.findElement(By.id("computeButton"));
        we.click();

        WebElement result = driver.findElement(By.id("result"));
        String output = result.getText(); // read the output text
        assertEquals("max(1, -1, 0) = 1", output);
    }

// execute the test <x = 1, y = -1, z = 0, submitButton = notclicklick>
    @Test public void t218() {

        WebElement we = driver.findElement(By.id("x"));
        we.sendKeys("1"); // enter 1 for x
        we = driver.findElement(By.id("y"));
        we.sendKeys("-1"); // enter -1 for y
        we = driver.findElement(By.id("z"));
        we.sendKeys("0"); // enter 0 for z
        we = driver.findElement(By.id("min"));
        we.click();
        we = driver.findElement(By.id("computeButton"));
    }

// execute the test <x = 1, y = -1, z = 0, submitButton = notclicklick>
    @Test public void t219() {

        WebElement we = driver.findElement(By.id("x"));
        we.sendKeys("1"); // enter 1 for x
        we = driver.findElement(By.id("y"));
        we.sendKeys("-1"); // enter -1 for y
        we = driver.findElement(By.id("z"));
        we.sendKeys("0"); // enter 0 for z
        we = driver.findElement(By.id("max"));
        we.click();
        we = driver.findElement(By.id("computeButton"));
    }

// execute the test <x = 1, y = -1, z = 1, submitButton = clicklick>
    @Test public void t220() {

        WebElement we = driver.findElement(By.id("x"));
        we.sendKeys("1"); // enter 1 for x
        we = driver.findElement(By.id("y"));
        we.sendKeys("-1"); // enter -1 for y
        we = driver.findElement(By.id("z"));
        we.sendKeys("1"); // enter 1 for z
        we = driver.findElement(By.id("min"));
        we.click();
        we = driver.findElement(By.id("computeButton"));
        we.click();

        WebElement result = driver.findElement(By.id("result"));
        String output = result.getText(); // read the output text
        assertEquals("min(1, -1, 1) = -1", output);
    }

// execute the test <x = 1, y = -1, z = 1, submitButton = clicklick>
    @Test public void t221() {

        WebElement we = driver.findElement(By.id("x"));
        we.sendKeys("1"); // enter 1 for x
        we = driver.findElement(By.id("y"));
        we.sendKeys("-1"); // enter -1 for y
        we = driver.findElement(By.id("z"));
        we.sendKeys("1"); // enter 1 for z
        we = driver.findElement(By.id("max"));
        we.click();
        we = driver.findElement(By.id("computeButton"));
        we.click();

        WebElement result = driver.findElement(By.id("result"));
        String output = result.getText(); // read the output text
        assertEquals("max(1, -1, 1) = 1", output);
    }

// execute the test <x = 1, y = -1, z = 1, submitButton = notclicklick>
    @Test public void t222() {

        WebElement we = driver.findElement(By.id("x"));
        we.sendKeys("1"); // enter 1 for x
        we = driver.findElement(By.id("y"));
        we.sendKeys("-1"); // enter -1 for y
        we = driver.findElement(By.id("z"));
        we.sendKeys("1"); // enter 1 for z
        we = driver.findElement(By.id("min"));
        we.click();
        we = driver.findElement(By.id("computeButton"));
    }

// execute the test <x = 1, y = -1, z = 1, submitButton = notclicklick>
    @Test public void t223() {

        WebElement we = driver.findElement(By.id("x"));
        we.sendKeys("1"); // enter 1 for x
        we = driver.findElement(By.id("y"));
        we.sendKeys("-1"); // enter -1 for y
        we = driver.findElement(By.id("z"));
        we.sendKeys("1"); // enter 1 for z
        we = driver.findElement(By.id("max"));
        we.click();
        we = driver.findElement(By.id("computeButton"));
    }

// execute the test <x = 1, y = 0, z = four, submitButton = clicklick>
    @Test public void t224() {

        WebElement we = driver.findElement(By.id("x"));
        we.sendKeys("1"); // enter 1 for x
        we = driver.findElement(By.id("y"));
        we.sendKeys("0"); // enter 0 for y
        we = driver.findElement(By.id("z"));
        we.sendKeys("four"); // enter four for z
        we = driver.findElement(By.id("min"));
        we.click();
        we = driver.findElement(By.id("computeButton"));
        we.click();

        WebElement result = driver.findElement(By.id("result"));
        String output = result.getText(); // read the output text
        assertEquals("Please enter integer values only!", output);
    }

// execute the test <x = 1, y = 0, z = four, submitButton = clicklick>
    @Test public void t225() {

        WebElement we = driver.findElement(By.id("x"));
        we.sendKeys("1"); // enter 1 for x
        we = driver.findElement(By.id("y"));
        we.sendKeys("0"); // enter 0 for y
        we = driver.findElement(By.id("z"));
        we.sendKeys("four"); // enter four for z
        we = driver.findElement(By.id("max"));
        we.click();
        we = driver.findElement(By.id("computeButton"));
        we.click();

        WebElement result = driver.findElement(By.id("result"));
        String output = result.getText(); // read the output text
        assertEquals("Please enter integer values only!", output);
    }

// execute the test <x = 1, y = 0, z = four, submitButton = notclicklick>
    @Test public void t226() {

        WebElement we = driver.findElement(By.id("x"));
        we.sendKeys("1"); // enter 1 for x
        we = driver.findElement(By.id("y"));
        we.sendKeys("0"); // enter 0 for y
        we = driver.findElement(By.id("z"));
        we.sendKeys("four"); // enter four for z
        we = driver.findElement(By.id("min"));
        we.click();
        we = driver.findElement(By.id("computeButton"));
    }

// execute the test <x = 1, y = 0, z = four, submitButton = notclicklick>
    @Test public void t227() {

        WebElement we = driver.findElement(By.id("x"));
        we.sendKeys("1"); // enter 1 for x
        we = driver.findElement(By.id("y"));
        we.sendKeys("0"); // enter 0 for y
        we = driver.findElement(By.id("z"));
        we.sendKeys("four"); // enter four for z
        we = driver.findElement(By.id("max"));
        we.click();
        we = driver.findElement(By.id("computeButton"));
    }

// execute the test <x = 1, y = 0, z = -1, submitButton = clicklick>
    @Test public void t228() {

        WebElement we = driver.findElement(By.id("x"));
        we.sendKeys("1"); // enter 1 for x
        we = driver.findElement(By.id("y"));
        we.sendKeys("0"); // enter 0 for y
        we = driver.findElement(By.id("z"));
        we.sendKeys("-1"); // enter -1 for z
        we = driver.findElement(By.id("min"));
        we.click();
        we = driver.findElement(By.id("computeButton"));
        we.click();

        WebElement result = driver.findElement(By.id("result"));
        String output = result.getText(); // read the output text
        assertEquals("min(1, 0, -1) = -1", output);
    }

// execute the test <x = 1, y = 0, z = -1, submitButton = clicklick>
    @Test public void t229() {

        WebElement we = driver.findElement(By.id("x"));
        we.sendKeys("1"); // enter 1 for x
        we = driver.findElement(By.id("y"));
        we.sendKeys("0"); // enter 0 for y
        we = driver.findElement(By.id("z"));
        we.sendKeys("-1"); // enter -1 for z
        we = driver.findElement(By.id("max"));
        we.click();
        we = driver.findElement(By.id("computeButton"));
        we.click();

        WebElement result = driver.findElement(By.id("result"));
        String output = result.getText(); // read the output text
        assertEquals("max(1, 0, -1) = 1", output);
    }

// execute the test <x = 1, y = 0, z = -1, submitButton = notclicklick>
    @Test public void t230() {

        WebElement we = driver.findElement(By.id("x"));
        we.sendKeys("1"); // enter 1 for x
        we = driver.findElement(By.id("y"));
        we.sendKeys("0"); // enter 0 for y
        we = driver.findElement(By.id("z"));
        we.sendKeys("-1"); // enter -1 for z
        we = driver.findElement(By.id("min"));
        we.click();
        we = driver.findElement(By.id("computeButton"));
    }

// execute the test <x = 1, y = 0, z = -1, submitButton = notclicklick>
    @Test public void t231() {

        WebElement we = driver.findElement(By.id("x"));
        we.sendKeys("1"); // enter 1 for x
        we = driver.findElement(By.id("y"));
        we.sendKeys("0"); // enter 0 for y
        we = driver.findElement(By.id("z"));
        we.sendKeys("-1"); // enter -1 for z
        we = driver.findElement(By.id("max"));
        we.click();
        we = driver.findElement(By.id("computeButton"));
    }

// execute the test <x = 1, y = 0, z = 0, submitButton = clicklick>
    @Test public void t232() {

        WebElement we = driver.findElement(By.id("x"));
        we.sendKeys("1"); // enter 1 for x
        we = driver.findElement(By.id("y"));
        we.sendKeys("0"); // enter 0 for y
        we = driver.findElement(By.id("z"));
        we.sendKeys("0"); // enter 0 for z
        we = driver.findElement(By.id("min"));
        we.click();
        we = driver.findElement(By.id("computeButton"));
        we.click();

        WebElement result = driver.findElement(By.id("result"));
        String output = result.getText(); // read the output text
        assertEquals("min(1, 0, 0) = 0", output);
    }

// execute the test <x = 1, y = 0, z = 0, submitButton = clicklick>
    @Test public void t233() {

        WebElement we = driver.findElement(By.id("x"));
        we.sendKeys("1"); // enter 1 for x
        we = driver.findElement(By.id("y"));
        we.sendKeys("0"); // enter 0 for y
        we = driver.findElement(By.id("z"));
        we.sendKeys("0"); // enter 0 for z
        we = driver.findElement(By.id("max"));
        we.click();
        we = driver.findElement(By.id("computeButton"));
        we.click();

        WebElement result = driver.findElement(By.id("result"));
        String output = result.getText(); // read the output text
        assertEquals("max(1, 0, 0) = 1", output);
    }

// execute the test <x = 1, y = 0, z = 0, submitButton = notclicklick>
    @Test public void t234() {

        WebElement we = driver.findElement(By.id("x"));
        we.sendKeys("1"); // enter 1 for x
        we = driver.findElement(By.id("y"));
        we.sendKeys("0"); // enter 0 for y
        we = driver.findElement(By.id("z"));
        we.sendKeys("0"); // enter 0 for z
        we = driver.findElement(By.id("min"));
        we.click();
        we = driver.findElement(By.id("computeButton"));
    }

// execute the test <x = 1, y = 0, z = 0, submitButton = notclicklick>
    @Test public void t235() {

        WebElement we = driver.findElement(By.id("x"));
        we.sendKeys("1"); // enter 1 for x
        we = driver.findElement(By.id("y"));
        we.sendKeys("0"); // enter 0 for y
        we = driver.findElement(By.id("z"));
        we.sendKeys("0"); // enter 0 for z
        we = driver.findElement(By.id("max"));
        we.click();
        we = driver.findElement(By.id("computeButton"));
    }

// execute the test <x = 1, y = 0, z = 1, submitButton = clicklick>
    @Test public void t236() {

        WebElement we = driver.findElement(By.id("x"));
        we.sendKeys("1"); // enter 1 for x
        we = driver.findElement(By.id("y"));
        we.sendKeys("0"); // enter 0 for y
        we = driver.findElement(By.id("z"));
        we.sendKeys("1"); // enter 1 for z
        we = driver.findElement(By.id("min"));
        we.click();
        we = driver.findElement(By.id("computeButton"));
        we.click();

        WebElement result = driver.findElement(By.id("result"));
        String output = result.getText(); // read the output text
        assertEquals("min(1, 0, 1) = 0", output);
    }

// execute the test <x = 1, y = 0, z = 1, submitButton = clicklick>
    @Test public void t237() {

        WebElement we = driver.findElement(By.id("x"));
        we.sendKeys("1"); // enter 1 for x
        we = driver.findElement(By.id("y"));
        we.sendKeys("0"); // enter 0 for y
        we = driver.findElement(By.id("z"));
        we.sendKeys("1"); // enter 1 for z
        we = driver.findElement(By.id("max"));
        we.click();
        we = driver.findElement(By.id("computeButton"));
        we.click();

        WebElement result = driver.findElement(By.id("result"));
        String output = result.getText(); // read the output text
        assertEquals("max(1, 0, 1) = 1", output);
    }

// execute the test <x = 1, y = 0, z = 1, submitButton = notclicklick>
    @Test public void t238() {

        WebElement we = driver.findElement(By.id("x"));
        we.sendKeys("1"); // enter 1 for x
        we = driver.findElement(By.id("y"));
        we.sendKeys("0"); // enter 0 for y
        we = driver.findElement(By.id("z"));
        we.sendKeys("1"); // enter 1 for z
        we = driver.findElement(By.id("min"));
        we.click();
        we = driver.findElement(By.id("computeButton"));
    }

// execute the test <x = 1, y = 0, z = 1, submitButton = notclicklick>
    @Test public void t239() {

        WebElement we = driver.findElement(By.id("x"));
        we.sendKeys("1"); // enter 1 for x
        we = driver.findElement(By.id("y"));
        we.sendKeys("0"); // enter 0 for y
        we = driver.findElement(By.id("z"));
        we.sendKeys("1"); // enter 1 for z
        we = driver.findElement(By.id("max"));
        we.click();
        we = driver.findElement(By.id("computeButton"));
    }

// execute the test <x = 1, y = 1, z = four, submitButton = clicklick>
    @Test public void t240() {

        WebElement we = driver.findElement(By.id("x"));
        we.sendKeys("1"); // enter 1 for x
        we = driver.findElement(By.id("y"));
        we.sendKeys("1"); // enter 1 for y
        we = driver.findElement(By.id("z"));
        we.sendKeys("four"); // enter four for z
        we = driver.findElement(By.id("min"));
        we.click();
        we = driver.findElement(By.id("computeButton"));
        we.click();

        WebElement result = driver.findElement(By.id("result"));
        String output = result.getText(); // read the output text
        assertEquals("Please enter integer values only!", output);
    }

// execute the test <x = 1, y = 1, z = four, submitButton = clicklick>
    @Test public void t241() {

        WebElement we = driver.findElement(By.id("x"));
        we.sendKeys("1"); // enter 1 for x
        we = driver.findElement(By.id("y"));
        we.sendKeys("1"); // enter 1 for y
        we = driver.findElement(By.id("z"));
        we.sendKeys("four"); // enter four for z
        we = driver.findElement(By.id("max"));
        we.click();
        we = driver.findElement(By.id("computeButton"));
        we.click();

        WebElement result = driver.findElement(By.id("result"));
        String output = result.getText(); // read the output text
        assertEquals("Please enter integer values only!", output);
    }

// execute the test <x = 1, y = 1, z = four, submitButton = notclicklick>
    @Test public void t242() {

        WebElement we = driver.findElement(By.id("x"));
        we.sendKeys("1"); // enter 1 for x
        we = driver.findElement(By.id("y"));
        we.sendKeys("1"); // enter 1 for y
        we = driver.findElement(By.id("z"));
        we.sendKeys("four"); // enter four for z
        we = driver.findElement(By.id("min"));
        we.click();
        we = driver.findElement(By.id("computeButton"));
    }

// execute the test <x = 1, y = 1, z = four, submitButton = notclicklick>
    @Test public void t243() {

        WebElement we = driver.findElement(By.id("x"));
        we.sendKeys("1"); // enter 1 for x
        we = driver.findElement(By.id("y"));
        we.sendKeys("1"); // enter 1 for y
        we = driver.findElement(By.id("z"));
        we.sendKeys("four"); // enter four for z
        we = driver.findElement(By.id("max"));
        we.click();
        we = driver.findElement(By.id("computeButton"));
    }

// execute the test <x = 1, y = 1, z = -1, submitButton = clicklick>
    @Test public void t244() {

        WebElement we = driver.findElement(By.id("x"));
        we.sendKeys("1"); // enter 1 for x
        we = driver.findElement(By.id("y"));
        we.sendKeys("1"); // enter 1 for y
        we = driver.findElement(By.id("z"));
        we.sendKeys("-1"); // enter -1 for z
        we = driver.findElement(By.id("min"));
        we.click();
        we = driver.findElement(By.id("computeButton"));
        we.click();

        WebElement result = driver.findElement(By.id("result"));
        String output = result.getText(); // read the output text
        assertEquals("min(1, 1, -1) = -1", output);
    }

// execute the test <x = 1, y = 1, z = -1, submitButton = clicklick>
    @Test public void t245() {

        WebElement we = driver.findElement(By.id("x"));
        we.sendKeys("1"); // enter 1 for x
        we = driver.findElement(By.id("y"));
        we.sendKeys("1"); // enter 1 for y
        we = driver.findElement(By.id("z"));
        we.sendKeys("-1"); // enter -1 for z
        we = driver.findElement(By.id("max"));
        we.click();
        we = driver.findElement(By.id("computeButton"));
        we.click();

        WebElement result = driver.findElement(By.id("result"));
        String output = result.getText(); // read the output text
        assertEquals("max(1, 1, -1) = 1", output);
    }

// execute the test <x = 1, y = 1, z = -1, submitButton = notclicklick>
    @Test public void t246() {

        WebElement we = driver.findElement(By.id("x"));
        we.sendKeys("1"); // enter 1 for x
        we = driver.findElement(By.id("y"));
        we.sendKeys("1"); // enter 1 for y
        we = driver.findElement(By.id("z"));
        we.sendKeys("-1"); // enter -1 for z
        we = driver.findElement(By.id("min"));
        we.click();
        we = driver.findElement(By.id("computeButton"));
    }

// execute the test <x = 1, y = 1, z = -1, submitButton = notclicklick>
    @Test public void t247() {

        WebElement we = driver.findElement(By.id("x"));
        we.sendKeys("1"); // enter 1 for x
        we = driver.findElement(By.id("y"));
        we.sendKeys("1"); // enter 1 for y
        we = driver.findElement(By.id("z"));
        we.sendKeys("-1"); // enter -1 for z
        we = driver.findElement(By.id("max"));
        we.click();
        we = driver.findElement(By.id("computeButton"));
    }

// execute the test <x = 1, y = 1, z = 0, submitButton = clicklick>
    @Test public void t248() {

        WebElement we = driver.findElement(By.id("x"));
        we.sendKeys("1"); // enter 1 for x
        we = driver.findElement(By.id("y"));
        we.sendKeys("1"); // enter 1 for y
        we = driver.findElement(By.id("z"));
        we.sendKeys("0"); // enter 0 for z
        we = driver.findElement(By.id("min"));
        we.click();
        we = driver.findElement(By.id("computeButton"));
        we.click();

        WebElement result = driver.findElement(By.id("result"));
        String output = result.getText(); // read the output text
        assertEquals("min(1, 1, 0) = 0", output);
    }

// execute the test <x = 1, y = 1, z = 0, submitButton = clicklick>
    @Test public void t249() {

        WebElement we = driver.findElement(By.id("x"));
        we.sendKeys("1"); // enter 1 for x
        we = driver.findElement(By.id("y"));
        we.sendKeys("1"); // enter 1 for y
        we = driver.findElement(By.id("z"));
        we.sendKeys("0"); // enter 0 for z
        we = driver.findElement(By.id("max"));
        we.click();
        we = driver.findElement(By.id("computeButton"));
        we.click();

        WebElement result = driver.findElement(By.id("result"));
        String output = result.getText(); // read the output text
        assertEquals("max(1, 1, 0) = 1", output);
    }

// execute the test <x = 1, y = 1, z = 0, submitButton = notclicklick>
    @Test public void t250() {

        WebElement we = driver.findElement(By.id("x"));
        we.sendKeys("1"); // enter 1 for x
        we = driver.findElement(By.id("y"));
        we.sendKeys("1"); // enter 1 for y
        we = driver.findElement(By.id("z"));
        we.sendKeys("0"); // enter 0 for z
        we = driver.findElement(By.id("min"));
        we.click();
        we = driver.findElement(By.id("computeButton"));
    }

// execute the test <x = 1, y = 1, z = 0, submitButton = notclicklick>
    @Test public void t251() {

        WebElement we = driver.findElement(By.id("x"));
        we.sendKeys("1"); // enter 1 for x
        we = driver.findElement(By.id("y"));
        we.sendKeys("1"); // enter 1 for y
        we = driver.findElement(By.id("z"));
        we.sendKeys("0"); // enter 0 for z
        we = driver.findElement(By.id("max"));
        we.click();
        we = driver.findElement(By.id("computeButton"));
    }

// execute the test <x = 1, y = 1, z = 1, submitButton = clicklick>
    @Test public void t252() {

        WebElement we = driver.findElement(By.id("x"));
        we.sendKeys("1"); // enter 1 for x
        we = driver.findElement(By.id("y"));
        we.sendKeys("1"); // enter 1 for y
        we = driver.findElement(By.id("z"));
        we.sendKeys("1"); // enter 1 for z
        we = driver.findElement(By.id("min"));
        we.click();
        we = driver.findElement(By.id("computeButton"));
        we.click();

        WebElement result = driver.findElement(By.id("result"));
        String output = result.getText(); // read the output text
        assertEquals("min(1, 1, 1) = 1", output);
    }

// execute the test <x = 1, y = 1, z = 1, submitButton = clicklick>
    @Test public void t253() {

        WebElement we = driver.findElement(By.id("x"));
        we.sendKeys("1"); // enter 1 for x
        we = driver.findElement(By.id("y"));
        we.sendKeys("1"); // enter 1 for y
        we = driver.findElement(By.id("z"));
        we.sendKeys("1"); // enter 1 for z
        we = driver.findElement(By.id("max"));
        we.click();
        we = driver.findElement(By.id("computeButton"));
        we.click();

        WebElement result = driver.findElement(By.id("result"));
        String output = result.getText(); // read the output text
        assertEquals("max(1, 1, 1) = 1", output);
    }

// execute the test <x = 1, y = 1, z = 1, submitButton = notclicklick>
    @Test public void t254() {

        WebElement we = driver.findElement(By.id("x"));
        we.sendKeys("1"); // enter 1 for x
        we = driver.findElement(By.id("y"));
        we.sendKeys("1"); // enter 1 for y
        we = driver.findElement(By.id("z"));
        we.sendKeys("1"); // enter 1 for z
        we = driver.findElement(By.id("min"));
        we.click();
        we = driver.findElement(By.id("computeButton"));
    }

// execute the test <x = 1, y = 1, z = 1, submitButton = notclicklick>
    @Test public void t255() {

        WebElement we = driver.findElement(By.id("x"));
        we.sendKeys("1"); // enter 1 for x
        we = driver.findElement(By.id("y"));
        we.sendKeys("1"); // enter 1 for y
        we = driver.findElement(By.id("z"));
        we.sendKeys("1"); // enter 1 for z
        we = driver.findElement(By.id("max"));
        we.click();
        we = driver.findElement(By.id("computeButton"));
    }

}

