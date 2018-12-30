import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;

import java.util.Scanner;

public class BrowserTest {


    public static void main(String[] args) {

        System.out.println("Enter browser name");
        Scanner s = new Scanner(System.in);
        String browser = s.next();
        if (browser.equalsIgnoreCase("chrome")) {

            System.setProperty("webdriver.chrome.driver", "src\\main\\java\\BrowserDriver\\chromedriver.exe");
            WebDriver driver = new ChromeDriver();

            driver.get("https://demo.nopcommerce.com/");
            driver.manage().window().fullscreen();
        }
        else if (browser.equalsIgnoreCase("firefox")){
            System.setProperty("webdriver.gecko.driver","src\\main\\java\\BrowserDriver\\geckodriver.exe");
            WebDriver driver=new FirefoxDriver();

            driver.get("https://demo.nopcommerce.com/");
            driver.manage().window().fullscreen();
        }
        else if (browser.equalsIgnoreCase("InternetExplorer")||browser.equalsIgnoreCase("ie")){
System.setProperty("webdriver.ie.driver","src\\main\\java\\BrowserDriver\\IEDriverServer.exe");
WebDriver driver= new InternetExplorerDriver();
driver.get("https://demo.nopcommerce.com/");
driver.manage().window().fullscreen();
        }

        else{
            System.out.println("Please install the browser and the web driver first in order to access the application");
        }
    }


    }


