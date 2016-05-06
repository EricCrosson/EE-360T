package pset6;

import static org.junit.Assert.*;
import java.util.Arrays;

import org.junit.Test;
import org.junit.BeforeClass;
import org.junit.AfterClass;
import org.junit.Before;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class MinWebTestGeneratorTest {

    // execute the test <x = 0, y = 0, z = 0, submitButton = click>
    @Test public void t0() {

        String[] tests = MinWebTestGenerator.getTestLists();
        assertEquals(128, tests.length);
    }
}
