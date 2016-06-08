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

/**  When MinWebTestSuite is run on the minandmax.html webpage:
 * [junit] Testsuite: pset6.MinWebTestSuite
 * [junit] Tests run: 128, Failures: 27, Errors: 0, Time elapsed: 27.441 sec
 *
 * These failures do not indicate a problem with minandmax.html, they represent
 * an inability of these tests to conform to the page under test (PUT).
 */

public class MinWebTestSuite {
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


// execute the test <x = four, y = four, z = four, submitButton = clicklick>
    @Test public void t0() {

        WebElement we = driver.findElement(By.id("x"));
        we.sendKeys("four"); // enter four for x
        we = driver.findElement(By.id("y"));
        we.sendKeys("four"); // enter four for y
        we = driver.findElement(By.id("z"));
        we.sendKeys("four"); // enter four for z
        we = driver.findElement(By.id("computeButton"));
        we.click();

        WebElement result = driver.findElement(By.id("result"));
        String output = result.getText(); // read the output text
        assertEquals("Please enter integer values only!", output);
    }

// execute the test <x = four, y = four, z = four, submitButton = notclicklick>
    @Test public void t1() {

        WebElement we = driver.findElement(By.id("x"));
        we.sendKeys("four"); // enter four for x
        we = driver.findElement(By.id("y"));
        we.sendKeys("four"); // enter four for y
        we = driver.findElement(By.id("z"));
        we.sendKeys("four"); // enter four for z
        we = driver.findElement(By.id("computeButton"));
    }

// execute the test <x = four, y = four, z = -1, submitButton = clicklick>
    @Test public void t2() {

        WebElement we = driver.findElement(By.id("x"));
        we.sendKeys("four"); // enter four for x
        we = driver.findElement(By.id("y"));
        we.sendKeys("four"); // enter four for y
        we = driver.findElement(By.id("z"));
        we.sendKeys("-1"); // enter -1 for z
        we = driver.findElement(By.id("computeButton"));
        we.click();

        WebElement result = driver.findElement(By.id("result"));
        String output = result.getText(); // read the output text
        assertEquals("Please enter integer values only!", output);
    }

// execute the test <x = four, y = four, z = -1, submitButton = notclicklick>
    @Test public void t3() {

        WebElement we = driver.findElement(By.id("x"));
        we.sendKeys("four"); // enter four for x
        we = driver.findElement(By.id("y"));
        we.sendKeys("four"); // enter four for y
        we = driver.findElement(By.id("z"));
        we.sendKeys("-1"); // enter -1 for z
        we = driver.findElement(By.id("computeButton"));
    }

// execute the test <x = four, y = four, z = 0, submitButton = clicklick>
    @Test public void t4() {

        WebElement we = driver.findElement(By.id("x"));
        we.sendKeys("four"); // enter four for x
        we = driver.findElement(By.id("y"));
        we.sendKeys("four"); // enter four for y
        we = driver.findElement(By.id("z"));
        we.sendKeys("0"); // enter 0 for z
        we = driver.findElement(By.id("computeButton"));
        we.click();

        WebElement result = driver.findElement(By.id("result"));
        String output = result.getText(); // read the output text
        assertEquals("Please enter integer values only!", output);
    }

// execute the test <x = four, y = four, z = 0, submitButton = notclicklick>
    @Test public void t5() {

        WebElement we = driver.findElement(By.id("x"));
        we.sendKeys("four"); // enter four for x
        we = driver.findElement(By.id("y"));
        we.sendKeys("four"); // enter four for y
        we = driver.findElement(By.id("z"));
        we.sendKeys("0"); // enter 0 for z
        we = driver.findElement(By.id("computeButton"));
    }

// execute the test <x = four, y = four, z = 1, submitButton = clicklick>
    @Test public void t6() {

        WebElement we = driver.findElement(By.id("x"));
        we.sendKeys("four"); // enter four for x
        we = driver.findElement(By.id("y"));
        we.sendKeys("four"); // enter four for y
        we = driver.findElement(By.id("z"));
        we.sendKeys("1"); // enter 1 for z
        we = driver.findElement(By.id("computeButton"));
        we.click();

        WebElement result = driver.findElement(By.id("result"));
        String output = result.getText(); // read the output text
        assertEquals("Please enter integer values only!", output);
    }

// execute the test <x = four, y = four, z = 1, submitButton = notclicklick>
    @Test public void t7() {

        WebElement we = driver.findElement(By.id("x"));
        we.sendKeys("four"); // enter four for x
        we = driver.findElement(By.id("y"));
        we.sendKeys("four"); // enter four for y
        we = driver.findElement(By.id("z"));
        we.sendKeys("1"); // enter 1 for z
        we = driver.findElement(By.id("computeButton"));
    }

// execute the test <x = four, y = -1, z = four, submitButton = clicklick>
    @Test public void t8() {

        WebElement we = driver.findElement(By.id("x"));
        we.sendKeys("four"); // enter four for x
        we = driver.findElement(By.id("y"));
        we.sendKeys("-1"); // enter -1 for y
        we = driver.findElement(By.id("z"));
        we.sendKeys("four"); // enter four for z
        we = driver.findElement(By.id("computeButton"));
        we.click();

        WebElement result = driver.findElement(By.id("result"));
        String output = result.getText(); // read the output text
        assertEquals("Please enter integer values only!", output);
    }

// execute the test <x = four, y = -1, z = four, submitButton = notclicklick>
    @Test public void t9() {

        WebElement we = driver.findElement(By.id("x"));
        we.sendKeys("four"); // enter four for x
        we = driver.findElement(By.id("y"));
        we.sendKeys("-1"); // enter -1 for y
        we = driver.findElement(By.id("z"));
        we.sendKeys("four"); // enter four for z
        we = driver.findElement(By.id("computeButton"));
    }

// execute the test <x = four, y = -1, z = -1, submitButton = clicklick>
    @Test public void t10() {

        WebElement we = driver.findElement(By.id("x"));
        we.sendKeys("four"); // enter four for x
        we = driver.findElement(By.id("y"));
        we.sendKeys("-1"); // enter -1 for y
        we = driver.findElement(By.id("z"));
        we.sendKeys("-1"); // enter -1 for z
        we = driver.findElement(By.id("computeButton"));
        we.click();

        WebElement result = driver.findElement(By.id("result"));
        String output = result.getText(); // read the output text
        assertEquals("Please enter integer values only!", output);
    }

// execute the test <x = four, y = -1, z = -1, submitButton = notclicklick>
    @Test public void t11() {

        WebElement we = driver.findElement(By.id("x"));
        we.sendKeys("four"); // enter four for x
        we = driver.findElement(By.id("y"));
        we.sendKeys("-1"); // enter -1 for y
        we = driver.findElement(By.id("z"));
        we.sendKeys("-1"); // enter -1 for z
        we = driver.findElement(By.id("computeButton"));
    }

// execute the test <x = four, y = -1, z = 0, submitButton = clicklick>
    @Test public void t12() {

        WebElement we = driver.findElement(By.id("x"));
        we.sendKeys("four"); // enter four for x
        we = driver.findElement(By.id("y"));
        we.sendKeys("-1"); // enter -1 for y
        we = driver.findElement(By.id("z"));
        we.sendKeys("0"); // enter 0 for z
        we = driver.findElement(By.id("computeButton"));
        we.click();

        WebElement result = driver.findElement(By.id("result"));
        String output = result.getText(); // read the output text
        assertEquals("Please enter integer values only!", output);
    }

// execute the test <x = four, y = -1, z = 0, submitButton = notclicklick>
    @Test public void t13() {

        WebElement we = driver.findElement(By.id("x"));
        we.sendKeys("four"); // enter four for x
        we = driver.findElement(By.id("y"));
        we.sendKeys("-1"); // enter -1 for y
        we = driver.findElement(By.id("z"));
        we.sendKeys("0"); // enter 0 for z
        we = driver.findElement(By.id("computeButton"));
    }

// execute the test <x = four, y = -1, z = 1, submitButton = clicklick>
    @Test public void t14() {

        WebElement we = driver.findElement(By.id("x"));
        we.sendKeys("four"); // enter four for x
        we = driver.findElement(By.id("y"));
        we.sendKeys("-1"); // enter -1 for y
        we = driver.findElement(By.id("z"));
        we.sendKeys("1"); // enter 1 for z
        we = driver.findElement(By.id("computeButton"));
        we.click();

        WebElement result = driver.findElement(By.id("result"));
        String output = result.getText(); // read the output text
        assertEquals("Please enter integer values only!", output);
    }

// execute the test <x = four, y = -1, z = 1, submitButton = notclicklick>
    @Test public void t15() {

        WebElement we = driver.findElement(By.id("x"));
        we.sendKeys("four"); // enter four for x
        we = driver.findElement(By.id("y"));
        we.sendKeys("-1"); // enter -1 for y
        we = driver.findElement(By.id("z"));
        we.sendKeys("1"); // enter 1 for z
        we = driver.findElement(By.id("computeButton"));
    }

// execute the test <x = four, y = 0, z = four, submitButton = clicklick>
    @Test public void t16() {

        WebElement we = driver.findElement(By.id("x"));
        we.sendKeys("four"); // enter four for x
        we = driver.findElement(By.id("y"));
        we.sendKeys("0"); // enter 0 for y
        we = driver.findElement(By.id("z"));
        we.sendKeys("four"); // enter four for z
        we = driver.findElement(By.id("computeButton"));
        we.click();

        WebElement result = driver.findElement(By.id("result"));
        String output = result.getText(); // read the output text
        assertEquals("Please enter integer values only!", output);
    }

// execute the test <x = four, y = 0, z = four, submitButton = notclicklick>
    @Test public void t17() {

        WebElement we = driver.findElement(By.id("x"));
        we.sendKeys("four"); // enter four for x
        we = driver.findElement(By.id("y"));
        we.sendKeys("0"); // enter 0 for y
        we = driver.findElement(By.id("z"));
        we.sendKeys("four"); // enter four for z
        we = driver.findElement(By.id("computeButton"));
    }

// execute the test <x = four, y = 0, z = -1, submitButton = clicklick>
    @Test public void t18() {

        WebElement we = driver.findElement(By.id("x"));
        we.sendKeys("four"); // enter four for x
        we = driver.findElement(By.id("y"));
        we.sendKeys("0"); // enter 0 for y
        we = driver.findElement(By.id("z"));
        we.sendKeys("-1"); // enter -1 for z
        we = driver.findElement(By.id("computeButton"));
        we.click();

        WebElement result = driver.findElement(By.id("result"));
        String output = result.getText(); // read the output text
        assertEquals("Please enter integer values only!", output);
    }

// execute the test <x = four, y = 0, z = -1, submitButton = notclicklick>
    @Test public void t19() {

        WebElement we = driver.findElement(By.id("x"));
        we.sendKeys("four"); // enter four for x
        we = driver.findElement(By.id("y"));
        we.sendKeys("0"); // enter 0 for y
        we = driver.findElement(By.id("z"));
        we.sendKeys("-1"); // enter -1 for z
        we = driver.findElement(By.id("computeButton"));
    }

// execute the test <x = four, y = 0, z = 0, submitButton = clicklick>
    @Test public void t20() {

        WebElement we = driver.findElement(By.id("x"));
        we.sendKeys("four"); // enter four for x
        we = driver.findElement(By.id("y"));
        we.sendKeys("0"); // enter 0 for y
        we = driver.findElement(By.id("z"));
        we.sendKeys("0"); // enter 0 for z
        we = driver.findElement(By.id("computeButton"));
        we.click();

        WebElement result = driver.findElement(By.id("result"));
        String output = result.getText(); // read the output text
        assertEquals("Please enter integer values only!", output);
    }

// execute the test <x = four, y = 0, z = 0, submitButton = notclicklick>
    @Test public void t21() {

        WebElement we = driver.findElement(By.id("x"));
        we.sendKeys("four"); // enter four for x
        we = driver.findElement(By.id("y"));
        we.sendKeys("0"); // enter 0 for y
        we = driver.findElement(By.id("z"));
        we.sendKeys("0"); // enter 0 for z
        we = driver.findElement(By.id("computeButton"));
    }

// execute the test <x = four, y = 0, z = 1, submitButton = clicklick>
    @Test public void t22() {

        WebElement we = driver.findElement(By.id("x"));
        we.sendKeys("four"); // enter four for x
        we = driver.findElement(By.id("y"));
        we.sendKeys("0"); // enter 0 for y
        we = driver.findElement(By.id("z"));
        we.sendKeys("1"); // enter 1 for z
        we = driver.findElement(By.id("computeButton"));
        we.click();

        WebElement result = driver.findElement(By.id("result"));
        String output = result.getText(); // read the output text
        assertEquals("Please enter integer values only!", output);
    }

// execute the test <x = four, y = 0, z = 1, submitButton = notclicklick>
    @Test public void t23() {

        WebElement we = driver.findElement(By.id("x"));
        we.sendKeys("four"); // enter four for x
        we = driver.findElement(By.id("y"));
        we.sendKeys("0"); // enter 0 for y
        we = driver.findElement(By.id("z"));
        we.sendKeys("1"); // enter 1 for z
        we = driver.findElement(By.id("computeButton"));
    }

// execute the test <x = four, y = 1, z = four, submitButton = clicklick>
    @Test public void t24() {

        WebElement we = driver.findElement(By.id("x"));
        we.sendKeys("four"); // enter four for x
        we = driver.findElement(By.id("y"));
        we.sendKeys("1"); // enter 1 for y
        we = driver.findElement(By.id("z"));
        we.sendKeys("four"); // enter four for z
        we = driver.findElement(By.id("computeButton"));
        we.click();

        WebElement result = driver.findElement(By.id("result"));
        String output = result.getText(); // read the output text
        assertEquals("Please enter integer values only!", output);
    }

// execute the test <x = four, y = 1, z = four, submitButton = notclicklick>
    @Test public void t25() {

        WebElement we = driver.findElement(By.id("x"));
        we.sendKeys("four"); // enter four for x
        we = driver.findElement(By.id("y"));
        we.sendKeys("1"); // enter 1 for y
        we = driver.findElement(By.id("z"));
        we.sendKeys("four"); // enter four for z
        we = driver.findElement(By.id("computeButton"));
    }

// execute the test <x = four, y = 1, z = -1, submitButton = clicklick>
    @Test public void t26() {

        WebElement we = driver.findElement(By.id("x"));
        we.sendKeys("four"); // enter four for x
        we = driver.findElement(By.id("y"));
        we.sendKeys("1"); // enter 1 for y
        we = driver.findElement(By.id("z"));
        we.sendKeys("-1"); // enter -1 for z
        we = driver.findElement(By.id("computeButton"));
        we.click();

        WebElement result = driver.findElement(By.id("result"));
        String output = result.getText(); // read the output text
        assertEquals("Please enter integer values only!", output);
    }

// execute the test <x = four, y = 1, z = -1, submitButton = notclicklick>
    @Test public void t27() {

        WebElement we = driver.findElement(By.id("x"));
        we.sendKeys("four"); // enter four for x
        we = driver.findElement(By.id("y"));
        we.sendKeys("1"); // enter 1 for y
        we = driver.findElement(By.id("z"));
        we.sendKeys("-1"); // enter -1 for z
        we = driver.findElement(By.id("computeButton"));
    }

// execute the test <x = four, y = 1, z = 0, submitButton = clicklick>
    @Test public void t28() {

        WebElement we = driver.findElement(By.id("x"));
        we.sendKeys("four"); // enter four for x
        we = driver.findElement(By.id("y"));
        we.sendKeys("1"); // enter 1 for y
        we = driver.findElement(By.id("z"));
        we.sendKeys("0"); // enter 0 for z
        we = driver.findElement(By.id("computeButton"));
        we.click();

        WebElement result = driver.findElement(By.id("result"));
        String output = result.getText(); // read the output text
        assertEquals("Please enter integer values only!", output);
    }

// execute the test <x = four, y = 1, z = 0, submitButton = notclicklick>
    @Test public void t29() {

        WebElement we = driver.findElement(By.id("x"));
        we.sendKeys("four"); // enter four for x
        we = driver.findElement(By.id("y"));
        we.sendKeys("1"); // enter 1 for y
        we = driver.findElement(By.id("z"));
        we.sendKeys("0"); // enter 0 for z
        we = driver.findElement(By.id("computeButton"));
    }

// execute the test <x = four, y = 1, z = 1, submitButton = clicklick>
    @Test public void t30() {

        WebElement we = driver.findElement(By.id("x"));
        we.sendKeys("four"); // enter four for x
        we = driver.findElement(By.id("y"));
        we.sendKeys("1"); // enter 1 for y
        we = driver.findElement(By.id("z"));
        we.sendKeys("1"); // enter 1 for z
        we = driver.findElement(By.id("computeButton"));
        we.click();

        WebElement result = driver.findElement(By.id("result"));
        String output = result.getText(); // read the output text
        assertEquals("Please enter integer values only!", output);
    }

// execute the test <x = four, y = 1, z = 1, submitButton = notclicklick>
    @Test public void t31() {

        WebElement we = driver.findElement(By.id("x"));
        we.sendKeys("four"); // enter four for x
        we = driver.findElement(By.id("y"));
        we.sendKeys("1"); // enter 1 for y
        we = driver.findElement(By.id("z"));
        we.sendKeys("1"); // enter 1 for z
        we = driver.findElement(By.id("computeButton"));
    }

// execute the test <x = -1, y = four, z = four, submitButton = clicklick>
    @Test public void t32() {

        WebElement we = driver.findElement(By.id("x"));
        we.sendKeys("-1"); // enter -1 for x
        we = driver.findElement(By.id("y"));
        we.sendKeys("four"); // enter four for y
        we = driver.findElement(By.id("z"));
        we.sendKeys("four"); // enter four for z
        we = driver.findElement(By.id("computeButton"));
        we.click();

        WebElement result = driver.findElement(By.id("result"));
        String output = result.getText(); // read the output text
        assertEquals("Please enter integer values only!", output);
    }

// execute the test <x = -1, y = four, z = four, submitButton = notclicklick>
    @Test public void t33() {

        WebElement we = driver.findElement(By.id("x"));
        we.sendKeys("-1"); // enter -1 for x
        we = driver.findElement(By.id("y"));
        we.sendKeys("four"); // enter four for y
        we = driver.findElement(By.id("z"));
        we.sendKeys("four"); // enter four for z
        we = driver.findElement(By.id("computeButton"));
    }

// execute the test <x = -1, y = four, z = -1, submitButton = clicklick>
    @Test public void t34() {

        WebElement we = driver.findElement(By.id("x"));
        we.sendKeys("-1"); // enter -1 for x
        we = driver.findElement(By.id("y"));
        we.sendKeys("four"); // enter four for y
        we = driver.findElement(By.id("z"));
        we.sendKeys("-1"); // enter -1 for z
        we = driver.findElement(By.id("computeButton"));
        we.click();

        WebElement result = driver.findElement(By.id("result"));
        String output = result.getText(); // read the output text
        assertEquals("Please enter integer values only!", output);
    }

// execute the test <x = -1, y = four, z = -1, submitButton = notclicklick>
    @Test public void t35() {

        WebElement we = driver.findElement(By.id("x"));
        we.sendKeys("-1"); // enter -1 for x
        we = driver.findElement(By.id("y"));
        we.sendKeys("four"); // enter four for y
        we = driver.findElement(By.id("z"));
        we.sendKeys("-1"); // enter -1 for z
        we = driver.findElement(By.id("computeButton"));
    }

// execute the test <x = -1, y = four, z = 0, submitButton = clicklick>
    @Test public void t36() {

        WebElement we = driver.findElement(By.id("x"));
        we.sendKeys("-1"); // enter -1 for x
        we = driver.findElement(By.id("y"));
        we.sendKeys("four"); // enter four for y
        we = driver.findElement(By.id("z"));
        we.sendKeys("0"); // enter 0 for z
        we = driver.findElement(By.id("computeButton"));
        we.click();

        WebElement result = driver.findElement(By.id("result"));
        String output = result.getText(); // read the output text
        assertEquals("Please enter integer values only!", output);
    }

// execute the test <x = -1, y = four, z = 0, submitButton = notclicklick>
    @Test public void t37() {

        WebElement we = driver.findElement(By.id("x"));
        we.sendKeys("-1"); // enter -1 for x
        we = driver.findElement(By.id("y"));
        we.sendKeys("four"); // enter four for y
        we = driver.findElement(By.id("z"));
        we.sendKeys("0"); // enter 0 for z
        we = driver.findElement(By.id("computeButton"));
    }

// execute the test <x = -1, y = four, z = 1, submitButton = clicklick>
    @Test public void t38() {

        WebElement we = driver.findElement(By.id("x"));
        we.sendKeys("-1"); // enter -1 for x
        we = driver.findElement(By.id("y"));
        we.sendKeys("four"); // enter four for y
        we = driver.findElement(By.id("z"));
        we.sendKeys("1"); // enter 1 for z
        we = driver.findElement(By.id("computeButton"));
        we.click();

        WebElement result = driver.findElement(By.id("result"));
        String output = result.getText(); // read the output text
        assertEquals("Please enter integer values only!", output);
    }

// execute the test <x = -1, y = four, z = 1, submitButton = notclicklick>
    @Test public void t39() {

        WebElement we = driver.findElement(By.id("x"));
        we.sendKeys("-1"); // enter -1 for x
        we = driver.findElement(By.id("y"));
        we.sendKeys("four"); // enter four for y
        we = driver.findElement(By.id("z"));
        we.sendKeys("1"); // enter 1 for z
        we = driver.findElement(By.id("computeButton"));
    }

// execute the test <x = -1, y = -1, z = four, submitButton = clicklick>
    @Test public void t40() {

        WebElement we = driver.findElement(By.id("x"));
        we.sendKeys("-1"); // enter -1 for x
        we = driver.findElement(By.id("y"));
        we.sendKeys("-1"); // enter -1 for y
        we = driver.findElement(By.id("z"));
        we.sendKeys("four"); // enter four for z
        we = driver.findElement(By.id("computeButton"));
        we.click();

        WebElement result = driver.findElement(By.id("result"));
        String output = result.getText(); // read the output text
        assertEquals("Please enter integer values only!", output);
    }

// execute the test <x = -1, y = -1, z = four, submitButton = notclicklick>
    @Test public void t41() {

        WebElement we = driver.findElement(By.id("x"));
        we.sendKeys("-1"); // enter -1 for x
        we = driver.findElement(By.id("y"));
        we.sendKeys("-1"); // enter -1 for y
        we = driver.findElement(By.id("z"));
        we.sendKeys("four"); // enter four for z
        we = driver.findElement(By.id("computeButton"));
    }

// execute the test <x = -1, y = -1, z = -1, submitButton = clicklick>
    @Test public void t42() {

        WebElement we = driver.findElement(By.id("x"));
        we.sendKeys("-1"); // enter -1 for x
        we = driver.findElement(By.id("y"));
        we.sendKeys("-1"); // enter -1 for y
        we = driver.findElement(By.id("z"));
        we.sendKeys("-1"); // enter -1 for z
        we = driver.findElement(By.id("computeButton"));
        we.click();

        WebElement result = driver.findElement(By.id("result"));
        String output = result.getText(); // read the output text
        assertEquals("min(-1, -1, -1) = -1", output);
    }

// execute the test <x = -1, y = -1, z = -1, submitButton = notclicklick>
    @Test public void t43() {

        WebElement we = driver.findElement(By.id("x"));
        we.sendKeys("-1"); // enter -1 for x
        we = driver.findElement(By.id("y"));
        we.sendKeys("-1"); // enter -1 for y
        we = driver.findElement(By.id("z"));
        we.sendKeys("-1"); // enter -1 for z
        we = driver.findElement(By.id("computeButton"));
    }

// execute the test <x = -1, y = -1, z = 0, submitButton = clicklick>
    @Test public void t44() {

        WebElement we = driver.findElement(By.id("x"));
        we.sendKeys("-1"); // enter -1 for x
        we = driver.findElement(By.id("y"));
        we.sendKeys("-1"); // enter -1 for y
        we = driver.findElement(By.id("z"));
        we.sendKeys("0"); // enter 0 for z
        we = driver.findElement(By.id("computeButton"));
        we.click();

        WebElement result = driver.findElement(By.id("result"));
        String output = result.getText(); // read the output text
        assertEquals("min(-1, -1, 0) = -1", output);
    }

// execute the test <x = -1, y = -1, z = 0, submitButton = notclicklick>
    @Test public void t45() {

        WebElement we = driver.findElement(By.id("x"));
        we.sendKeys("-1"); // enter -1 for x
        we = driver.findElement(By.id("y"));
        we.sendKeys("-1"); // enter -1 for y
        we = driver.findElement(By.id("z"));
        we.sendKeys("0"); // enter 0 for z
        we = driver.findElement(By.id("computeButton"));
    }

// execute the test <x = -1, y = -1, z = 1, submitButton = clicklick>
    @Test public void t46() {

        WebElement we = driver.findElement(By.id("x"));
        we.sendKeys("-1"); // enter -1 for x
        we = driver.findElement(By.id("y"));
        we.sendKeys("-1"); // enter -1 for y
        we = driver.findElement(By.id("z"));
        we.sendKeys("1"); // enter 1 for z
        we = driver.findElement(By.id("computeButton"));
        we.click();

        WebElement result = driver.findElement(By.id("result"));
        String output = result.getText(); // read the output text
        assertEquals("min(-1, -1, 1) = -1", output);
    }

// execute the test <x = -1, y = -1, z = 1, submitButton = notclicklick>
    @Test public void t47() {

        WebElement we = driver.findElement(By.id("x"));
        we.sendKeys("-1"); // enter -1 for x
        we = driver.findElement(By.id("y"));
        we.sendKeys("-1"); // enter -1 for y
        we = driver.findElement(By.id("z"));
        we.sendKeys("1"); // enter 1 for z
        we = driver.findElement(By.id("computeButton"));
    }

// execute the test <x = -1, y = 0, z = four, submitButton = clicklick>
    @Test public void t48() {

        WebElement we = driver.findElement(By.id("x"));
        we.sendKeys("-1"); // enter -1 for x
        we = driver.findElement(By.id("y"));
        we.sendKeys("0"); // enter 0 for y
        we = driver.findElement(By.id("z"));
        we.sendKeys("four"); // enter four for z
        we = driver.findElement(By.id("computeButton"));
        we.click();

        WebElement result = driver.findElement(By.id("result"));
        String output = result.getText(); // read the output text
        assertEquals("Please enter integer values only!", output);
    }

// execute the test <x = -1, y = 0, z = four, submitButton = notclicklick>
    @Test public void t49() {

        WebElement we = driver.findElement(By.id("x"));
        we.sendKeys("-1"); // enter -1 for x
        we = driver.findElement(By.id("y"));
        we.sendKeys("0"); // enter 0 for y
        we = driver.findElement(By.id("z"));
        we.sendKeys("four"); // enter four for z
        we = driver.findElement(By.id("computeButton"));
    }

// execute the test <x = -1, y = 0, z = -1, submitButton = clicklick>
    @Test public void t50() {

        WebElement we = driver.findElement(By.id("x"));
        we.sendKeys("-1"); // enter -1 for x
        we = driver.findElement(By.id("y"));
        we.sendKeys("0"); // enter 0 for y
        we = driver.findElement(By.id("z"));
        we.sendKeys("-1"); // enter -1 for z
        we = driver.findElement(By.id("computeButton"));
        we.click();

        WebElement result = driver.findElement(By.id("result"));
        String output = result.getText(); // read the output text
        assertEquals("min(-1, 0, -1) = -1", output);
    }

// execute the test <x = -1, y = 0, z = -1, submitButton = notclicklick>
    @Test public void t51() {

        WebElement we = driver.findElement(By.id("x"));
        we.sendKeys("-1"); // enter -1 for x
        we = driver.findElement(By.id("y"));
        we.sendKeys("0"); // enter 0 for y
        we = driver.findElement(By.id("z"));
        we.sendKeys("-1"); // enter -1 for z
        we = driver.findElement(By.id("computeButton"));
    }

// execute the test <x = -1, y = 0, z = 0, submitButton = clicklick>
    @Test public void t52() {

        WebElement we = driver.findElement(By.id("x"));
        we.sendKeys("-1"); // enter -1 for x
        we = driver.findElement(By.id("y"));
        we.sendKeys("0"); // enter 0 for y
        we = driver.findElement(By.id("z"));
        we.sendKeys("0"); // enter 0 for z
        we = driver.findElement(By.id("computeButton"));
        we.click();

        WebElement result = driver.findElement(By.id("result"));
        String output = result.getText(); // read the output text
        assertEquals("min(-1, 0, 0) = -1", output);
    }

// execute the test <x = -1, y = 0, z = 0, submitButton = notclicklick>
    @Test public void t53() {

        WebElement we = driver.findElement(By.id("x"));
        we.sendKeys("-1"); // enter -1 for x
        we = driver.findElement(By.id("y"));
        we.sendKeys("0"); // enter 0 for y
        we = driver.findElement(By.id("z"));
        we.sendKeys("0"); // enter 0 for z
        we = driver.findElement(By.id("computeButton"));
    }

// execute the test <x = -1, y = 0, z = 1, submitButton = clicklick>
    @Test public void t54() {

        WebElement we = driver.findElement(By.id("x"));
        we.sendKeys("-1"); // enter -1 for x
        we = driver.findElement(By.id("y"));
        we.sendKeys("0"); // enter 0 for y
        we = driver.findElement(By.id("z"));
        we.sendKeys("1"); // enter 1 for z
        we = driver.findElement(By.id("computeButton"));
        we.click();

        WebElement result = driver.findElement(By.id("result"));
        String output = result.getText(); // read the output text
        assertEquals("min(-1, 0, 1) = -1", output);
    }

// execute the test <x = -1, y = 0, z = 1, submitButton = notclicklick>
    @Test public void t55() {

        WebElement we = driver.findElement(By.id("x"));
        we.sendKeys("-1"); // enter -1 for x
        we = driver.findElement(By.id("y"));
        we.sendKeys("0"); // enter 0 for y
        we = driver.findElement(By.id("z"));
        we.sendKeys("1"); // enter 1 for z
        we = driver.findElement(By.id("computeButton"));
    }

// execute the test <x = -1, y = 1, z = four, submitButton = clicklick>
    @Test public void t56() {

        WebElement we = driver.findElement(By.id("x"));
        we.sendKeys("-1"); // enter -1 for x
        we = driver.findElement(By.id("y"));
        we.sendKeys("1"); // enter 1 for y
        we = driver.findElement(By.id("z"));
        we.sendKeys("four"); // enter four for z
        we = driver.findElement(By.id("computeButton"));
        we.click();

        WebElement result = driver.findElement(By.id("result"));
        String output = result.getText(); // read the output text
        assertEquals("Please enter integer values only!", output);
    }

// execute the test <x = -1, y = 1, z = four, submitButton = notclicklick>
    @Test public void t57() {

        WebElement we = driver.findElement(By.id("x"));
        we.sendKeys("-1"); // enter -1 for x
        we = driver.findElement(By.id("y"));
        we.sendKeys("1"); // enter 1 for y
        we = driver.findElement(By.id("z"));
        we.sendKeys("four"); // enter four for z
        we = driver.findElement(By.id("computeButton"));
    }

// execute the test <x = -1, y = 1, z = -1, submitButton = clicklick>
    @Test public void t58() {

        WebElement we = driver.findElement(By.id("x"));
        we.sendKeys("-1"); // enter -1 for x
        we = driver.findElement(By.id("y"));
        we.sendKeys("1"); // enter 1 for y
        we = driver.findElement(By.id("z"));
        we.sendKeys("-1"); // enter -1 for z
        we = driver.findElement(By.id("computeButton"));
        we.click();

        WebElement result = driver.findElement(By.id("result"));
        String output = result.getText(); // read the output text
        assertEquals("min(-1, 1, -1) = -1", output);
    }

// execute the test <x = -1, y = 1, z = -1, submitButton = notclicklick>
    @Test public void t59() {

        WebElement we = driver.findElement(By.id("x"));
        we.sendKeys("-1"); // enter -1 for x
        we = driver.findElement(By.id("y"));
        we.sendKeys("1"); // enter 1 for y
        we = driver.findElement(By.id("z"));
        we.sendKeys("-1"); // enter -1 for z
        we = driver.findElement(By.id("computeButton"));
    }

// execute the test <x = -1, y = 1, z = 0, submitButton = clicklick>
    @Test public void t60() {

        WebElement we = driver.findElement(By.id("x"));
        we.sendKeys("-1"); // enter -1 for x
        we = driver.findElement(By.id("y"));
        we.sendKeys("1"); // enter 1 for y
        we = driver.findElement(By.id("z"));
        we.sendKeys("0"); // enter 0 for z
        we = driver.findElement(By.id("computeButton"));
        we.click();

        WebElement result = driver.findElement(By.id("result"));
        String output = result.getText(); // read the output text
        assertEquals("min(-1, 1, 0) = -1", output);
    }

// execute the test <x = -1, y = 1, z = 0, submitButton = notclicklick>
    @Test public void t61() {

        WebElement we = driver.findElement(By.id("x"));
        we.sendKeys("-1"); // enter -1 for x
        we = driver.findElement(By.id("y"));
        we.sendKeys("1"); // enter 1 for y
        we = driver.findElement(By.id("z"));
        we.sendKeys("0"); // enter 0 for z
        we = driver.findElement(By.id("computeButton"));
    }

// execute the test <x = -1, y = 1, z = 1, submitButton = clicklick>
    @Test public void t62() {

        WebElement we = driver.findElement(By.id("x"));
        we.sendKeys("-1"); // enter -1 for x
        we = driver.findElement(By.id("y"));
        we.sendKeys("1"); // enter 1 for y
        we = driver.findElement(By.id("z"));
        we.sendKeys("1"); // enter 1 for z
        we = driver.findElement(By.id("computeButton"));
        we.click();

        WebElement result = driver.findElement(By.id("result"));
        String output = result.getText(); // read the output text
        assertEquals("min(-1, 1, 1) = -1", output);
    }

// execute the test <x = -1, y = 1, z = 1, submitButton = notclicklick>
    @Test public void t63() {

        WebElement we = driver.findElement(By.id("x"));
        we.sendKeys("-1"); // enter -1 for x
        we = driver.findElement(By.id("y"));
        we.sendKeys("1"); // enter 1 for y
        we = driver.findElement(By.id("z"));
        we.sendKeys("1"); // enter 1 for z
        we = driver.findElement(By.id("computeButton"));
    }

// execute the test <x = 0, y = four, z = four, submitButton = clicklick>
    @Test public void t64() {

        WebElement we = driver.findElement(By.id("x"));
        we.sendKeys("0"); // enter 0 for x
        we = driver.findElement(By.id("y"));
        we.sendKeys("four"); // enter four for y
        we = driver.findElement(By.id("z"));
        we.sendKeys("four"); // enter four for z
        we = driver.findElement(By.id("computeButton"));
        we.click();

        WebElement result = driver.findElement(By.id("result"));
        String output = result.getText(); // read the output text
        assertEquals("Please enter integer values only!", output);
    }

// execute the test <x = 0, y = four, z = four, submitButton = notclicklick>
    @Test public void t65() {

        WebElement we = driver.findElement(By.id("x"));
        we.sendKeys("0"); // enter 0 for x
        we = driver.findElement(By.id("y"));
        we.sendKeys("four"); // enter four for y
        we = driver.findElement(By.id("z"));
        we.sendKeys("four"); // enter four for z
        we = driver.findElement(By.id("computeButton"));
    }

// execute the test <x = 0, y = four, z = -1, submitButton = clicklick>
    @Test public void t66() {

        WebElement we = driver.findElement(By.id("x"));
        we.sendKeys("0"); // enter 0 for x
        we = driver.findElement(By.id("y"));
        we.sendKeys("four"); // enter four for y
        we = driver.findElement(By.id("z"));
        we.sendKeys("-1"); // enter -1 for z
        we = driver.findElement(By.id("computeButton"));
        we.click();

        WebElement result = driver.findElement(By.id("result"));
        String output = result.getText(); // read the output text
        assertEquals("Please enter integer values only!", output);
    }

// execute the test <x = 0, y = four, z = -1, submitButton = notclicklick>
    @Test public void t67() {

        WebElement we = driver.findElement(By.id("x"));
        we.sendKeys("0"); // enter 0 for x
        we = driver.findElement(By.id("y"));
        we.sendKeys("four"); // enter four for y
        we = driver.findElement(By.id("z"));
        we.sendKeys("-1"); // enter -1 for z
        we = driver.findElement(By.id("computeButton"));
    }

// execute the test <x = 0, y = four, z = 0, submitButton = clicklick>
    @Test public void t68() {

        WebElement we = driver.findElement(By.id("x"));
        we.sendKeys("0"); // enter 0 for x
        we = driver.findElement(By.id("y"));
        we.sendKeys("four"); // enter four for y
        we = driver.findElement(By.id("z"));
        we.sendKeys("0"); // enter 0 for z
        we = driver.findElement(By.id("computeButton"));
        we.click();

        WebElement result = driver.findElement(By.id("result"));
        String output = result.getText(); // read the output text
        assertEquals("Please enter integer values only!", output);
    }

// execute the test <x = 0, y = four, z = 0, submitButton = notclicklick>
    @Test public void t69() {

        WebElement we = driver.findElement(By.id("x"));
        we.sendKeys("0"); // enter 0 for x
        we = driver.findElement(By.id("y"));
        we.sendKeys("four"); // enter four for y
        we = driver.findElement(By.id("z"));
        we.sendKeys("0"); // enter 0 for z
        we = driver.findElement(By.id("computeButton"));
    }

// execute the test <x = 0, y = four, z = 1, submitButton = clicklick>
    @Test public void t70() {

        WebElement we = driver.findElement(By.id("x"));
        we.sendKeys("0"); // enter 0 for x
        we = driver.findElement(By.id("y"));
        we.sendKeys("four"); // enter four for y
        we = driver.findElement(By.id("z"));
        we.sendKeys("1"); // enter 1 for z
        we = driver.findElement(By.id("computeButton"));
        we.click();

        WebElement result = driver.findElement(By.id("result"));
        String output = result.getText(); // read the output text
        assertEquals("Please enter integer values only!", output);
    }

// execute the test <x = 0, y = four, z = 1, submitButton = notclicklick>
    @Test public void t71() {

        WebElement we = driver.findElement(By.id("x"));
        we.sendKeys("0"); // enter 0 for x
        we = driver.findElement(By.id("y"));
        we.sendKeys("four"); // enter four for y
        we = driver.findElement(By.id("z"));
        we.sendKeys("1"); // enter 1 for z
        we = driver.findElement(By.id("computeButton"));
    }

// execute the test <x = 0, y = -1, z = four, submitButton = clicklick>
    @Test public void t72() {

        WebElement we = driver.findElement(By.id("x"));
        we.sendKeys("0"); // enter 0 for x
        we = driver.findElement(By.id("y"));
        we.sendKeys("-1"); // enter -1 for y
        we = driver.findElement(By.id("z"));
        we.sendKeys("four"); // enter four for z
        we = driver.findElement(By.id("computeButton"));
        we.click();

        WebElement result = driver.findElement(By.id("result"));
        String output = result.getText(); // read the output text
        assertEquals("Please enter integer values only!", output);
    }

// execute the test <x = 0, y = -1, z = four, submitButton = notclicklick>
    @Test public void t73() {

        WebElement we = driver.findElement(By.id("x"));
        we.sendKeys("0"); // enter 0 for x
        we = driver.findElement(By.id("y"));
        we.sendKeys("-1"); // enter -1 for y
        we = driver.findElement(By.id("z"));
        we.sendKeys("four"); // enter four for z
        we = driver.findElement(By.id("computeButton"));
    }

// execute the test <x = 0, y = -1, z = -1, submitButton = clicklick>
    @Test public void t74() {

        WebElement we = driver.findElement(By.id("x"));
        we.sendKeys("0"); // enter 0 for x
        we = driver.findElement(By.id("y"));
        we.sendKeys("-1"); // enter -1 for y
        we = driver.findElement(By.id("z"));
        we.sendKeys("-1"); // enter -1 for z
        we = driver.findElement(By.id("computeButton"));
        we.click();

        WebElement result = driver.findElement(By.id("result"));
        String output = result.getText(); // read the output text
        assertEquals("min(0, -1, -1) = -1", output);
    }

// execute the test <x = 0, y = -1, z = -1, submitButton = notclicklick>
    @Test public void t75() {

        WebElement we = driver.findElement(By.id("x"));
        we.sendKeys("0"); // enter 0 for x
        we = driver.findElement(By.id("y"));
        we.sendKeys("-1"); // enter -1 for y
        we = driver.findElement(By.id("z"));
        we.sendKeys("-1"); // enter -1 for z
        we = driver.findElement(By.id("computeButton"));
    }

// execute the test <x = 0, y = -1, z = 0, submitButton = clicklick>
    @Test public void t76() {

        WebElement we = driver.findElement(By.id("x"));
        we.sendKeys("0"); // enter 0 for x
        we = driver.findElement(By.id("y"));
        we.sendKeys("-1"); // enter -1 for y
        we = driver.findElement(By.id("z"));
        we.sendKeys("0"); // enter 0 for z
        we = driver.findElement(By.id("computeButton"));
        we.click();

        WebElement result = driver.findElement(By.id("result"));
        String output = result.getText(); // read the output text
        assertEquals("min(0, -1, 0) = -1", output);
    }

// execute the test <x = 0, y = -1, z = 0, submitButton = notclicklick>
    @Test public void t77() {

        WebElement we = driver.findElement(By.id("x"));
        we.sendKeys("0"); // enter 0 for x
        we = driver.findElement(By.id("y"));
        we.sendKeys("-1"); // enter -1 for y
        we = driver.findElement(By.id("z"));
        we.sendKeys("0"); // enter 0 for z
        we = driver.findElement(By.id("computeButton"));
    }

// execute the test <x = 0, y = -1, z = 1, submitButton = clicklick>
    @Test public void t78() {

        WebElement we = driver.findElement(By.id("x"));
        we.sendKeys("0"); // enter 0 for x
        we = driver.findElement(By.id("y"));
        we.sendKeys("-1"); // enter -1 for y
        we = driver.findElement(By.id("z"));
        we.sendKeys("1"); // enter 1 for z
        we = driver.findElement(By.id("computeButton"));
        we.click();

        WebElement result = driver.findElement(By.id("result"));
        String output = result.getText(); // read the output text
        assertEquals("min(0, -1, 1) = -1", output);
    }

// execute the test <x = 0, y = -1, z = 1, submitButton = notclicklick>
    @Test public void t79() {

        WebElement we = driver.findElement(By.id("x"));
        we.sendKeys("0"); // enter 0 for x
        we = driver.findElement(By.id("y"));
        we.sendKeys("-1"); // enter -1 for y
        we = driver.findElement(By.id("z"));
        we.sendKeys("1"); // enter 1 for z
        we = driver.findElement(By.id("computeButton"));
    }

// execute the test <x = 0, y = 0, z = four, submitButton = clicklick>
    @Test public void t80() {

        WebElement we = driver.findElement(By.id("x"));
        we.sendKeys("0"); // enter 0 for x
        we = driver.findElement(By.id("y"));
        we.sendKeys("0"); // enter 0 for y
        we = driver.findElement(By.id("z"));
        we.sendKeys("four"); // enter four for z
        we = driver.findElement(By.id("computeButton"));
        we.click();

        WebElement result = driver.findElement(By.id("result"));
        String output = result.getText(); // read the output text
        assertEquals("Please enter integer values only!", output);
    }

// execute the test <x = 0, y = 0, z = four, submitButton = notclicklick>
    @Test public void t81() {

        WebElement we = driver.findElement(By.id("x"));
        we.sendKeys("0"); // enter 0 for x
        we = driver.findElement(By.id("y"));
        we.sendKeys("0"); // enter 0 for y
        we = driver.findElement(By.id("z"));
        we.sendKeys("four"); // enter four for z
        we = driver.findElement(By.id("computeButton"));
    }

// execute the test <x = 0, y = 0, z = -1, submitButton = clicklick>
    @Test public void t82() {

        WebElement we = driver.findElement(By.id("x"));
        we.sendKeys("0"); // enter 0 for x
        we = driver.findElement(By.id("y"));
        we.sendKeys("0"); // enter 0 for y
        we = driver.findElement(By.id("z"));
        we.sendKeys("-1"); // enter -1 for z
        we = driver.findElement(By.id("computeButton"));
        we.click();

        WebElement result = driver.findElement(By.id("result"));
        String output = result.getText(); // read the output text
        assertEquals("min(0, 0, -1) = -1", output);
    }

// execute the test <x = 0, y = 0, z = -1, submitButton = notclicklick>
    @Test public void t83() {

        WebElement we = driver.findElement(By.id("x"));
        we.sendKeys("0"); // enter 0 for x
        we = driver.findElement(By.id("y"));
        we.sendKeys("0"); // enter 0 for y
        we = driver.findElement(By.id("z"));
        we.sendKeys("-1"); // enter -1 for z
        we = driver.findElement(By.id("computeButton"));
    }

// execute the test <x = 0, y = 0, z = 0, submitButton = clicklick>
    @Test public void t84() {

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

// execute the test <x = 0, y = 0, z = 0, submitButton = notclicklick>
    @Test public void t85() {

        WebElement we = driver.findElement(By.id("x"));
        we.sendKeys("0"); // enter 0 for x
        we = driver.findElement(By.id("y"));
        we.sendKeys("0"); // enter 0 for y
        we = driver.findElement(By.id("z"));
        we.sendKeys("0"); // enter 0 for z
        we = driver.findElement(By.id("computeButton"));
    }

// execute the test <x = 0, y = 0, z = 1, submitButton = clicklick>
    @Test public void t86() {

        WebElement we = driver.findElement(By.id("x"));
        we.sendKeys("0"); // enter 0 for x
        we = driver.findElement(By.id("y"));
        we.sendKeys("0"); // enter 0 for y
        we = driver.findElement(By.id("z"));
        we.sendKeys("1"); // enter 1 for z
        we = driver.findElement(By.id("computeButton"));
        we.click();

        WebElement result = driver.findElement(By.id("result"));
        String output = result.getText(); // read the output text
        assertEquals("min(0, 0, 1) = 0", output);
    }

// execute the test <x = 0, y = 0, z = 1, submitButton = notclicklick>
    @Test public void t87() {

        WebElement we = driver.findElement(By.id("x"));
        we.sendKeys("0"); // enter 0 for x
        we = driver.findElement(By.id("y"));
        we.sendKeys("0"); // enter 0 for y
        we = driver.findElement(By.id("z"));
        we.sendKeys("1"); // enter 1 for z
        we = driver.findElement(By.id("computeButton"));
    }

// execute the test <x = 0, y = 1, z = four, submitButton = clicklick>
    @Test public void t88() {

        WebElement we = driver.findElement(By.id("x"));
        we.sendKeys("0"); // enter 0 for x
        we = driver.findElement(By.id("y"));
        we.sendKeys("1"); // enter 1 for y
        we = driver.findElement(By.id("z"));
        we.sendKeys("four"); // enter four for z
        we = driver.findElement(By.id("computeButton"));
        we.click();

        WebElement result = driver.findElement(By.id("result"));
        String output = result.getText(); // read the output text
        assertEquals("Please enter integer values only!", output);
    }

// execute the test <x = 0, y = 1, z = four, submitButton = notclicklick>
    @Test public void t89() {

        WebElement we = driver.findElement(By.id("x"));
        we.sendKeys("0"); // enter 0 for x
        we = driver.findElement(By.id("y"));
        we.sendKeys("1"); // enter 1 for y
        we = driver.findElement(By.id("z"));
        we.sendKeys("four"); // enter four for z
        we = driver.findElement(By.id("computeButton"));
    }

// execute the test <x = 0, y = 1, z = -1, submitButton = clicklick>
    @Test public void t90() {

        WebElement we = driver.findElement(By.id("x"));
        we.sendKeys("0"); // enter 0 for x
        we = driver.findElement(By.id("y"));
        we.sendKeys("1"); // enter 1 for y
        we = driver.findElement(By.id("z"));
        we.sendKeys("-1"); // enter -1 for z
        we = driver.findElement(By.id("computeButton"));
        we.click();

        WebElement result = driver.findElement(By.id("result"));
        String output = result.getText(); // read the output text
        assertEquals("min(0, 1, -1) = -1", output);
    }

// execute the test <x = 0, y = 1, z = -1, submitButton = notclicklick>
    @Test public void t91() {

        WebElement we = driver.findElement(By.id("x"));
        we.sendKeys("0"); // enter 0 for x
        we = driver.findElement(By.id("y"));
        we.sendKeys("1"); // enter 1 for y
        we = driver.findElement(By.id("z"));
        we.sendKeys("-1"); // enter -1 for z
        we = driver.findElement(By.id("computeButton"));
    }

// execute the test <x = 0, y = 1, z = 0, submitButton = clicklick>
    @Test public void t92() {

        WebElement we = driver.findElement(By.id("x"));
        we.sendKeys("0"); // enter 0 for x
        we = driver.findElement(By.id("y"));
        we.sendKeys("1"); // enter 1 for y
        we = driver.findElement(By.id("z"));
        we.sendKeys("0"); // enter 0 for z
        we = driver.findElement(By.id("computeButton"));
        we.click();

        WebElement result = driver.findElement(By.id("result"));
        String output = result.getText(); // read the output text
        assertEquals("min(0, 1, 0) = 0", output);
    }

// execute the test <x = 0, y = 1, z = 0, submitButton = notclicklick>
    @Test public void t93() {

        WebElement we = driver.findElement(By.id("x"));
        we.sendKeys("0"); // enter 0 for x
        we = driver.findElement(By.id("y"));
        we.sendKeys("1"); // enter 1 for y
        we = driver.findElement(By.id("z"));
        we.sendKeys("0"); // enter 0 for z
        we = driver.findElement(By.id("computeButton"));
    }

// execute the test <x = 0, y = 1, z = 1, submitButton = clicklick>
    @Test public void t94() {

        WebElement we = driver.findElement(By.id("x"));
        we.sendKeys("0"); // enter 0 for x
        we = driver.findElement(By.id("y"));
        we.sendKeys("1"); // enter 1 for y
        we = driver.findElement(By.id("z"));
        we.sendKeys("1"); // enter 1 for z
        we = driver.findElement(By.id("computeButton"));
        we.click();

        WebElement result = driver.findElement(By.id("result"));
        String output = result.getText(); // read the output text
        assertEquals("min(0, 1, 1) = 0", output);
    }

// execute the test <x = 0, y = 1, z = 1, submitButton = notclicklick>
    @Test public void t95() {

        WebElement we = driver.findElement(By.id("x"));
        we.sendKeys("0"); // enter 0 for x
        we = driver.findElement(By.id("y"));
        we.sendKeys("1"); // enter 1 for y
        we = driver.findElement(By.id("z"));
        we.sendKeys("1"); // enter 1 for z
        we = driver.findElement(By.id("computeButton"));
    }

// execute the test <x = 1, y = four, z = four, submitButton = clicklick>
    @Test public void t96() {

        WebElement we = driver.findElement(By.id("x"));
        we.sendKeys("1"); // enter 1 for x
        we = driver.findElement(By.id("y"));
        we.sendKeys("four"); // enter four for y
        we = driver.findElement(By.id("z"));
        we.sendKeys("four"); // enter four for z
        we = driver.findElement(By.id("computeButton"));
        we.click();

        WebElement result = driver.findElement(By.id("result"));
        String output = result.getText(); // read the output text
        assertEquals("Please enter integer values only!", output);
    }

// execute the test <x = 1, y = four, z = four, submitButton = notclicklick>
    @Test public void t97() {

        WebElement we = driver.findElement(By.id("x"));
        we.sendKeys("1"); // enter 1 for x
        we = driver.findElement(By.id("y"));
        we.sendKeys("four"); // enter four for y
        we = driver.findElement(By.id("z"));
        we.sendKeys("four"); // enter four for z
        we = driver.findElement(By.id("computeButton"));
    }

// execute the test <x = 1, y = four, z = -1, submitButton = clicklick>
    @Test public void t98() {

        WebElement we = driver.findElement(By.id("x"));
        we.sendKeys("1"); // enter 1 for x
        we = driver.findElement(By.id("y"));
        we.sendKeys("four"); // enter four for y
        we = driver.findElement(By.id("z"));
        we.sendKeys("-1"); // enter -1 for z
        we = driver.findElement(By.id("computeButton"));
        we.click();

        WebElement result = driver.findElement(By.id("result"));
        String output = result.getText(); // read the output text
        assertEquals("Please enter integer values only!", output);
    }

// execute the test <x = 1, y = four, z = -1, submitButton = notclicklick>
    @Test public void t99() {

        WebElement we = driver.findElement(By.id("x"));
        we.sendKeys("1"); // enter 1 for x
        we = driver.findElement(By.id("y"));
        we.sendKeys("four"); // enter four for y
        we = driver.findElement(By.id("z"));
        we.sendKeys("-1"); // enter -1 for z
        we = driver.findElement(By.id("computeButton"));
    }

// execute the test <x = 1, y = four, z = 0, submitButton = clicklick>
    @Test public void t100() {

        WebElement we = driver.findElement(By.id("x"));
        we.sendKeys("1"); // enter 1 for x
        we = driver.findElement(By.id("y"));
        we.sendKeys("four"); // enter four for y
        we = driver.findElement(By.id("z"));
        we.sendKeys("0"); // enter 0 for z
        we = driver.findElement(By.id("computeButton"));
        we.click();

        WebElement result = driver.findElement(By.id("result"));
        String output = result.getText(); // read the output text
        assertEquals("Please enter integer values only!", output);
    }

// execute the test <x = 1, y = four, z = 0, submitButton = notclicklick>
    @Test public void t101() {

        WebElement we = driver.findElement(By.id("x"));
        we.sendKeys("1"); // enter 1 for x
        we = driver.findElement(By.id("y"));
        we.sendKeys("four"); // enter four for y
        we = driver.findElement(By.id("z"));
        we.sendKeys("0"); // enter 0 for z
        we = driver.findElement(By.id("computeButton"));
    }

// execute the test <x = 1, y = four, z = 1, submitButton = clicklick>
    @Test public void t102() {

        WebElement we = driver.findElement(By.id("x"));
        we.sendKeys("1"); // enter 1 for x
        we = driver.findElement(By.id("y"));
        we.sendKeys("four"); // enter four for y
        we = driver.findElement(By.id("z"));
        we.sendKeys("1"); // enter 1 for z
        we = driver.findElement(By.id("computeButton"));
        we.click();

        WebElement result = driver.findElement(By.id("result"));
        String output = result.getText(); // read the output text
        assertEquals("Please enter integer values only!", output);
    }

// execute the test <x = 1, y = four, z = 1, submitButton = notclicklick>
    @Test public void t103() {

        WebElement we = driver.findElement(By.id("x"));
        we.sendKeys("1"); // enter 1 for x
        we = driver.findElement(By.id("y"));
        we.sendKeys("four"); // enter four for y
        we = driver.findElement(By.id("z"));
        we.sendKeys("1"); // enter 1 for z
        we = driver.findElement(By.id("computeButton"));
    }

// execute the test <x = 1, y = -1, z = four, submitButton = clicklick>
    @Test public void t104() {

        WebElement we = driver.findElement(By.id("x"));
        we.sendKeys("1"); // enter 1 for x
        we = driver.findElement(By.id("y"));
        we.sendKeys("-1"); // enter -1 for y
        we = driver.findElement(By.id("z"));
        we.sendKeys("four"); // enter four for z
        we = driver.findElement(By.id("computeButton"));
        we.click();

        WebElement result = driver.findElement(By.id("result"));
        String output = result.getText(); // read the output text
        assertEquals("Please enter integer values only!", output);
    }

// execute the test <x = 1, y = -1, z = four, submitButton = notclicklick>
    @Test public void t105() {

        WebElement we = driver.findElement(By.id("x"));
        we.sendKeys("1"); // enter 1 for x
        we = driver.findElement(By.id("y"));
        we.sendKeys("-1"); // enter -1 for y
        we = driver.findElement(By.id("z"));
        we.sendKeys("four"); // enter four for z
        we = driver.findElement(By.id("computeButton"));
    }

// execute the test <x = 1, y = -1, z = -1, submitButton = clicklick>
    @Test public void t106() {

        WebElement we = driver.findElement(By.id("x"));
        we.sendKeys("1"); // enter 1 for x
        we = driver.findElement(By.id("y"));
        we.sendKeys("-1"); // enter -1 for y
        we = driver.findElement(By.id("z"));
        we.sendKeys("-1"); // enter -1 for z
        we = driver.findElement(By.id("computeButton"));
        we.click();

        WebElement result = driver.findElement(By.id("result"));
        String output = result.getText(); // read the output text
        assertEquals("min(1, -1, -1) = -1", output);
    }

// execute the test <x = 1, y = -1, z = -1, submitButton = notclicklick>
    @Test public void t107() {

        WebElement we = driver.findElement(By.id("x"));
        we.sendKeys("1"); // enter 1 for x
        we = driver.findElement(By.id("y"));
        we.sendKeys("-1"); // enter -1 for y
        we = driver.findElement(By.id("z"));
        we.sendKeys("-1"); // enter -1 for z
        we = driver.findElement(By.id("computeButton"));
    }

// execute the test <x = 1, y = -1, z = 0, submitButton = clicklick>
    @Test public void t108() {

        WebElement we = driver.findElement(By.id("x"));
        we.sendKeys("1"); // enter 1 for x
        we = driver.findElement(By.id("y"));
        we.sendKeys("-1"); // enter -1 for y
        we = driver.findElement(By.id("z"));
        we.sendKeys("0"); // enter 0 for z
        we = driver.findElement(By.id("computeButton"));
        we.click();

        WebElement result = driver.findElement(By.id("result"));
        String output = result.getText(); // read the output text
        assertEquals("min(1, -1, 0) = -1", output);
    }

// execute the test <x = 1, y = -1, z = 0, submitButton = notclicklick>
    @Test public void t109() {

        WebElement we = driver.findElement(By.id("x"));
        we.sendKeys("1"); // enter 1 for x
        we = driver.findElement(By.id("y"));
        we.sendKeys("-1"); // enter -1 for y
        we = driver.findElement(By.id("z"));
        we.sendKeys("0"); // enter 0 for z
        we = driver.findElement(By.id("computeButton"));
    }

// execute the test <x = 1, y = -1, z = 1, submitButton = clicklick>
    @Test public void t110() {

        WebElement we = driver.findElement(By.id("x"));
        we.sendKeys("1"); // enter 1 for x
        we = driver.findElement(By.id("y"));
        we.sendKeys("-1"); // enter -1 for y
        we = driver.findElement(By.id("z"));
        we.sendKeys("1"); // enter 1 for z
        we = driver.findElement(By.id("computeButton"));
        we.click();

        WebElement result = driver.findElement(By.id("result"));
        String output = result.getText(); // read the output text
        assertEquals("min(1, -1, 1) = -1", output);
    }

// execute the test <x = 1, y = -1, z = 1, submitButton = notclicklick>
    @Test public void t111() {

        WebElement we = driver.findElement(By.id("x"));
        we.sendKeys("1"); // enter 1 for x
        we = driver.findElement(By.id("y"));
        we.sendKeys("-1"); // enter -1 for y
        we = driver.findElement(By.id("z"));
        we.sendKeys("1"); // enter 1 for z
        we = driver.findElement(By.id("computeButton"));
    }

// execute the test <x = 1, y = 0, z = four, submitButton = clicklick>
    @Test public void t112() {

        WebElement we = driver.findElement(By.id("x"));
        we.sendKeys("1"); // enter 1 for x
        we = driver.findElement(By.id("y"));
        we.sendKeys("0"); // enter 0 for y
        we = driver.findElement(By.id("z"));
        we.sendKeys("four"); // enter four for z
        we = driver.findElement(By.id("computeButton"));
        we.click();

        WebElement result = driver.findElement(By.id("result"));
        String output = result.getText(); // read the output text
        assertEquals("Please enter integer values only!", output);
    }

// execute the test <x = 1, y = 0, z = four, submitButton = notclicklick>
    @Test public void t113() {

        WebElement we = driver.findElement(By.id("x"));
        we.sendKeys("1"); // enter 1 for x
        we = driver.findElement(By.id("y"));
        we.sendKeys("0"); // enter 0 for y
        we = driver.findElement(By.id("z"));
        we.sendKeys("four"); // enter four for z
        we = driver.findElement(By.id("computeButton"));
    }

// execute the test <x = 1, y = 0, z = -1, submitButton = clicklick>
    @Test public void t114() {

        WebElement we = driver.findElement(By.id("x"));
        we.sendKeys("1"); // enter 1 for x
        we = driver.findElement(By.id("y"));
        we.sendKeys("0"); // enter 0 for y
        we = driver.findElement(By.id("z"));
        we.sendKeys("-1"); // enter -1 for z
        we = driver.findElement(By.id("computeButton"));
        we.click();

        WebElement result = driver.findElement(By.id("result"));
        String output = result.getText(); // read the output text
        assertEquals("min(1, 0, -1) = -1", output);
    }

// execute the test <x = 1, y = 0, z = -1, submitButton = notclicklick>
    @Test public void t115() {

        WebElement we = driver.findElement(By.id("x"));
        we.sendKeys("1"); // enter 1 for x
        we = driver.findElement(By.id("y"));
        we.sendKeys("0"); // enter 0 for y
        we = driver.findElement(By.id("z"));
        we.sendKeys("-1"); // enter -1 for z
        we = driver.findElement(By.id("computeButton"));
    }

// execute the test <x = 1, y = 0, z = 0, submitButton = clicklick>
    @Test public void t116() {

        WebElement we = driver.findElement(By.id("x"));
        we.sendKeys("1"); // enter 1 for x
        we = driver.findElement(By.id("y"));
        we.sendKeys("0"); // enter 0 for y
        we = driver.findElement(By.id("z"));
        we.sendKeys("0"); // enter 0 for z
        we = driver.findElement(By.id("computeButton"));
        we.click();

        WebElement result = driver.findElement(By.id("result"));
        String output = result.getText(); // read the output text
        assertEquals("min(1, 0, 0) = 0", output);
    }

// execute the test <x = 1, y = 0, z = 0, submitButton = notclicklick>
    @Test public void t117() {

        WebElement we = driver.findElement(By.id("x"));
        we.sendKeys("1"); // enter 1 for x
        we = driver.findElement(By.id("y"));
        we.sendKeys("0"); // enter 0 for y
        we = driver.findElement(By.id("z"));
        we.sendKeys("0"); // enter 0 for z
        we = driver.findElement(By.id("computeButton"));
    }

// execute the test <x = 1, y = 0, z = 1, submitButton = clicklick>
    @Test public void t118() {

        WebElement we = driver.findElement(By.id("x"));
        we.sendKeys("1"); // enter 1 for x
        we = driver.findElement(By.id("y"));
        we.sendKeys("0"); // enter 0 for y
        we = driver.findElement(By.id("z"));
        we.sendKeys("1"); // enter 1 for z
        we = driver.findElement(By.id("computeButton"));
        we.click();

        WebElement result = driver.findElement(By.id("result"));
        String output = result.getText(); // read the output text
        assertEquals("min(1, 0, 1) = 0", output);
    }

// execute the test <x = 1, y = 0, z = 1, submitButton = notclicklick>
    @Test public void t119() {

        WebElement we = driver.findElement(By.id("x"));
        we.sendKeys("1"); // enter 1 for x
        we = driver.findElement(By.id("y"));
        we.sendKeys("0"); // enter 0 for y
        we = driver.findElement(By.id("z"));
        we.sendKeys("1"); // enter 1 for z
        we = driver.findElement(By.id("computeButton"));
    }

// execute the test <x = 1, y = 1, z = four, submitButton = clicklick>
    @Test public void t120() {

        WebElement we = driver.findElement(By.id("x"));
        we.sendKeys("1"); // enter 1 for x
        we = driver.findElement(By.id("y"));
        we.sendKeys("1"); // enter 1 for y
        we = driver.findElement(By.id("z"));
        we.sendKeys("four"); // enter four for z
        we = driver.findElement(By.id("computeButton"));
        we.click();

        WebElement result = driver.findElement(By.id("result"));
        String output = result.getText(); // read the output text
        assertEquals("Please enter integer values only!", output);
    }

// execute the test <x = 1, y = 1, z = four, submitButton = notclicklick>
    @Test public void t121() {

        WebElement we = driver.findElement(By.id("x"));
        we.sendKeys("1"); // enter 1 for x
        we = driver.findElement(By.id("y"));
        we.sendKeys("1"); // enter 1 for y
        we = driver.findElement(By.id("z"));
        we.sendKeys("four"); // enter four for z
        we = driver.findElement(By.id("computeButton"));
    }

// execute the test <x = 1, y = 1, z = -1, submitButton = clicklick>
    @Test public void t122() {

        WebElement we = driver.findElement(By.id("x"));
        we.sendKeys("1"); // enter 1 for x
        we = driver.findElement(By.id("y"));
        we.sendKeys("1"); // enter 1 for y
        we = driver.findElement(By.id("z"));
        we.sendKeys("-1"); // enter -1 for z
        we = driver.findElement(By.id("computeButton"));
        we.click();

        WebElement result = driver.findElement(By.id("result"));
        String output = result.getText(); // read the output text
        assertEquals("min(1, 1, -1) = -1", output);
    }

// execute the test <x = 1, y = 1, z = -1, submitButton = notclicklick>
    @Test public void t123() {

        WebElement we = driver.findElement(By.id("x"));
        we.sendKeys("1"); // enter 1 for x
        we = driver.findElement(By.id("y"));
        we.sendKeys("1"); // enter 1 for y
        we = driver.findElement(By.id("z"));
        we.sendKeys("-1"); // enter -1 for z
        we = driver.findElement(By.id("computeButton"));
    }

// execute the test <x = 1, y = 1, z = 0, submitButton = clicklick>
    @Test public void t124() {

        WebElement we = driver.findElement(By.id("x"));
        we.sendKeys("1"); // enter 1 for x
        we = driver.findElement(By.id("y"));
        we.sendKeys("1"); // enter 1 for y
        we = driver.findElement(By.id("z"));
        we.sendKeys("0"); // enter 0 for z
        we = driver.findElement(By.id("computeButton"));
        we.click();

        WebElement result = driver.findElement(By.id("result"));
        String output = result.getText(); // read the output text
        assertEquals("min(1, 1, 0) = 0", output);
    }

// execute the test <x = 1, y = 1, z = 0, submitButton = notclicklick>
    @Test public void t125() {

        WebElement we = driver.findElement(By.id("x"));
        we.sendKeys("1"); // enter 1 for x
        we = driver.findElement(By.id("y"));
        we.sendKeys("1"); // enter 1 for y
        we = driver.findElement(By.id("z"));
        we.sendKeys("0"); // enter 0 for z
        we = driver.findElement(By.id("computeButton"));
    }

// execute the test <x = 1, y = 1, z = 1, submitButton = clicklick>
    @Test public void t126() {

        WebElement we = driver.findElement(By.id("x"));
        we.sendKeys("1"); // enter 1 for x
        we = driver.findElement(By.id("y"));
        we.sendKeys("1"); // enter 1 for y
        we = driver.findElement(By.id("z"));
        we.sendKeys("1"); // enter 1 for z
        we = driver.findElement(By.id("computeButton"));
        we.click();

        WebElement result = driver.findElement(By.id("result"));
        String output = result.getText(); // read the output text
        assertEquals("min(1, 1, 1) = 1", output);
    }

// execute the test <x = 1, y = 1, z = 1, submitButton = notclicklick>
    @Test public void t127() {

        WebElement we = driver.findElement(By.id("x"));
        we.sendKeys("1"); // enter 1 for x
        we = driver.findElement(By.id("y"));
        we.sendKeys("1"); // enter 1 for y
        we = driver.findElement(By.id("z"));
        we.sendKeys("1"); // enter 1 for z
        we = driver.findElement(By.id("computeButton"));
    }

}

