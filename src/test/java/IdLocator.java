import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
public class IdLocator {
    public static void main(String[] args) throws InterruptedException {

        // Test case 001 : Login with valid creditentials

        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver() ;

        driver.get("https://the-internet.herokuapp.com/login");
        driver.findElement(By.id("username")).sendKeys("tomsmith");
        driver.findElement(By.id("password")).sendKeys("SuperSecretPassword!");
        driver.findElement(By.className("radius")).click();

        Thread.sleep(2000);
        driver.quit();
    }
}
