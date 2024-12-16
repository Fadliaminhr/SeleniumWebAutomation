
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Task1 {
    public static void main(String[] args) throws InterruptedException {
        // Setup seleniumwebdriver
        System.setProperty("webdriver.chrome.driver", "/Users/macbookpro/webAutomation/chromedriver");
        WebDriver driver = new ChromeDriver();

        // Setup link website
        driver.get("https://rahulshettyacademy.com/angularpractice/");

        // Input Form
        // Name
        driver.findElement(By.xpath("(//input[@name='name'])[1]")).sendKeys("Fadli Amin");
        Thread.sleep(2000);
        // Email
        driver.findElement(By.xpath("(//input[@name='email'])[1]")).sendKeys("Fadliaminhr@gmail.com");
        Thread.sleep(2000);
        // Password
        driver.findElement(By.id("exampleInputPassword1")).sendKeys("password");
        Thread.sleep(2000);
        // Checkbox
        driver.findElement(By.id("exampleCheck1")).click();
        Thread.sleep(2000);
        // Gender
        driver.findElement(By.xpath("//select[@id='exampleFormControlSelect1']/option[text()='Female']")).click();
        // Employment Status
        driver.findElement(By.id("inlineRadio1")).click();
        Thread.sleep(3000);
        // Date of Birth
        driver.findElement(By.xpath("//*[@name='bday']")).sendKeys("12-05-1999");
        Thread.sleep(3000);
        // Button submit
        driver.findElement(By.xpath("//*[@value='Submit']")).click();
        Thread.sleep(3000);
        // Assertion
        String rawText = driver.findElement(By.xpath("//*[@class='alert alert-success alert-dismissible']")).getText()
                .trim();

        String actualText = rawText.replace("×", "").trim();
        String expectedText = "Success! The Form has been submitted successfully!.";

        Assert.assertEquals("Teks pada alert sesuai!", expectedText, actualText);

        driver.close();
    }
}
