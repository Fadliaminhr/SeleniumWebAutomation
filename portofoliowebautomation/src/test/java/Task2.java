import java.util.List;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Task2 {
    public static void main(String[] args) throws InterruptedException {
        // Setup seleniumwebdriver
        System.setProperty("webdriver.chrome.driver", "/Users/macbookpro/webAutomation/chromedriver");
        WebDriver driver = new ChromeDriver();

        // Setup link website
        driver.get("https://rahulshettyacademy.com/AutomationPractice/");

        // Radio Button
        String actualText = driver.findElement(By.xpath("//legend[normalize-space()='Radio Button Example']"))
                .getText();
        String expectedText = "Radio Button Example";

        Assert.assertEquals(expectedText, actualText);

        driver.findElement(By.xpath("//input[@value='radio1']")).click();
        Thread.sleep(1500);
        driver.findElement(By.xpath("//input[@value='radio2']")).click();
        Thread.sleep(1500);
        driver.findElement(By.xpath("//input[@value='radio3']")).click();
        Thread.sleep(1500);
        // Suggession Class Example

        driver.findElement(By.id("autocomplete")).click();
        Thread.sleep(1500);
        driver.findElement(By.id("autocomplete")).sendKeys("ind");
        Thread.sleep(1500);

        // Dropdown Example
        driver.findElement(By.xpath("(//select[@id='dropdown-class-example'])[1]")).click();

        var dropdown = driver.findElement(By.xpath("(//select[@id='dropdown-class-example'])[1]"));

        List<WebElement> options = dropdown.findElements(By.tagName("option"));

        for (WebElement option : options) {
            // String value = option.getDomAttribute("value");
            // System.out.println("Clicking option with value: " + value);

            option.click();

            Thread.sleep(1000);

        }

        // Checkbox Example
        driver.findElement(By.id("checkBoxOption1")).click();
        Thread.sleep(1000);
        driver.findElement(By.id("checkBoxOption2")).click();
        Thread.sleep(1000);
        driver.findElement(By.id("checkBoxOption3")).click();
        Thread.sleep(1000);
        driver.close();

    }
}
