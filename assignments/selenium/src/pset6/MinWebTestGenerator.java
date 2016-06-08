package pset6;

import java.util.Scanner;

public class MinWebTestGenerator {

    private static Integer nonce = 0;

    public static void main(String[] a) {
        String suite = new MinWebTestGenerator().createTestSuite();
        System.out.println(suite);
    }

    String createTestSuite() {
        StringBuilder sb = new StringBuilder();
        sb.append(packageDecl());
        sb.append("\n");
        sb.append(imports());
        sb.append("\n");
        sb.append(testsuite());
        return sb.toString();
    }

    String packageDecl() {
        return "package pset6;\n";
    }

    String imports() {
        return "import static org.junit.Assert.*;\n\n"
            + "import org.junit.Test;\n"
            + "import org.junit.Before;\n"
            + "import org.junit.BeforeClass;\n"
            + "import org.junit.AfterClass;\n\n"
            + "import org.openqa.selenium.By;\n"
            + "import org.openqa.selenium.WebDriver;\n"
            + "import org.openqa.selenium.WebElement;\n"
            + "import org.openqa.selenium.firefox.FirefoxDriver;\n";
    }

    String testsuite() {
        StringBuilder sb = new StringBuilder();
        sb.append("public class MinWebTestSuite {\n");

        sb.append(junithooks());
        sb.append("\n");

        // your code goes here
        for (String test : getTestLists()) {
            sb.append(generateTest(test));
        }

        sb.append("}\n");
        return sb.toString();
    }



    /* implement any helper methods that you need in this class */

    public static String generateTest(String test) {

        String x = test.split(",")[0];
        String y = test.split(",")[1];
        String z = test.split(",")[2];
        String mouse = test.split(",")[3];

        boolean isx = isInteger(x);
        boolean isy = isInteger(y);
        boolean isz = isInteger(z);
        String min = null;
        if (isx && isy && isz) {
            Integer mini = Math.min(Integer.parseInt(x), Integer.parseInt(y));
            mini = Math.min(mini, Integer.parseInt(z));
            min = "min("+x+", "+y+", "+z+") = " + mini.toString();
        } else {
            min = "Please enter integer values only!";
        }

        String ret = "" +
        "// execute the test <x = "+x+", y = "+y+", z = "+z+", submitButton = "+mouse+"lick>\n" +
            "@Test public void t"+nonce+"() {\n" +
            "\n" +
            "WebElement we = driver.findElement(By.id(\"x\"));\n" +
            "we.sendKeys(\""+x+"\"); // enter "+x+" for x\n" +
            "we = driver.findElement(By.id(\"y\"));\n" +
            "we.sendKeys(\""+y+"\"); // enter "+y+" for y\n" +
            "we = driver.findElement(By.id(\"z\"));\n" +
            "we.sendKeys(\""+z+"\"); // enter "+z+" for z\n" +
            "we = driver.findElement(By.id(\"computeButton\"));\n";
        if (mouse.equals("click")) {
           ret += "" +
               "we.click();\n\n" +
               "WebElement result = driver.findElement(By.id(\"result\"));\n" +
               "String output = result.getText(); // read the output text\n" +
               "assertEquals(\""+min+"\", output);\n";
        }
        ret += "}\n\n";

        ++nonce;
        return ret;
    }

    /** Return valid java code defining the junit setup/teardown hooks. */
    public static String junithooks() {

        return "" +
        "private static WebDriver driver = null;\n\n" +
        "@BeforeClass\n" +
            "public static void setUpClass() {\n" +
            "\n" +
            "driver = new FirefoxDriver();  /* Launch the browser */\n" +
            "/* Edit to the location of min.html on your local filesystem */\n" +
            "driver.get(\"file:///home/eric/workspace/ee360t/assignments/src/pset6/min.html\");\n" +
        "}\n\n" +
        "@AfterClass\n" +
        "public static void tearDownClass() {\n" +
            "\n" +
            "driver.quit();  /* Close the browser */\n" +
        "}\n\n" +
        "@Before\n" +
        "public void setUp() {\n" +
            "\n" +
            "driver.navigate().refresh();  /* Refresh the page under test (PUT) */\n" +
        "}\n\n";
    }

    /** Returns the list of test cases providing full combinatorial coverage for
     *  the conditions outlined in the pset6 problem statement pdf. */
    public static String[] getTestLists() {

        int numFields = 3;
        String[] partitions = {"four,", "-1,", "0,", "1,"};
        String[] halfList = getAllLists(partitions, numFields);
        /* duplicate list for click and no click tests */
        String[] fullList = new String[2*halfList.length];
        for(int i = 0; i < halfList.length; ++i) {
            String test = halfList[i];
            fullList[2 * i] = String.format("%sclick", test);
            fullList[2 * i + 1] = String.format("%snotclick", test);
        }
        return fullList;
    }

    public static String[] getAllLists(String[] elements, int lengthOfList) {

        String[] allLists = new String[(int)Math.pow(elements.length,
                                                     lengthOfList)];

        /* Base case: a list of one is just the original element */
        if(lengthOfList == 1) {
            return elements;
        }
        else {
            /* get all lists of length 3, length 2, all the way up to 1 */
            String[] allSublists = getAllLists(elements, lengthOfList - 1);

            int arrayIndex = 0;  /* append the sublists to each element */

            for(int i = 0; i < elements.length; ++i) {
                for(int j = 0; j < allSublists.length; ++j) {
                    /* add the newly appended combination to the list */
                    allLists[arrayIndex++] = elements[i] + allSublists[j];
                }
            }

            return allLists;
        }
    }

    public static boolean isInteger(String s) {
        Scanner sc = new Scanner(s.trim());
        final int radix = 10;
        if(!sc.hasNextInt(radix)) return false;
        // we know it starts with a valid int, now make sure
        // there's nothing left!
        sc.nextInt(radix);
        return !sc.hasNext();
    }
}
