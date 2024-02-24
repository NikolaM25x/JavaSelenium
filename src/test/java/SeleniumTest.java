import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class SeleniumTest {
    public static void main  (String [] args) throws InterruptedException {
       // Goes first to google, than x where it gets and prints out page title, page source, window handle and page url.  
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("http://www.google.com");
        String title = driver.getTitle();
        System.out.println("Page title is :" + title );
        driver.navigate().to("https://www.x.com");
        String title2 = driver.getTitle();
        String Handle = driver.getWindowHandle();
        java.lang.String source = driver.getPageSource();
        System.out.println("Page title is :" + title2 );
        System.out.println(source);
        System.out.println("Handle is" + Handle);

        //driver.navigate().back();
        //driver.navigate().refresh();
        String urlnow = driver.getCurrentUrl();
        System.out.println("The url is :" + urlnow) ;
        Thread.sleep(3000) ;
        driver.quit();
    }
}
