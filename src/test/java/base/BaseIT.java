package base;

import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class BaseIT {

    private WebDriver driver;
    private String BaseURL = "https://www.swiftgo.co.uk/";


    public void setUp() {
        System.setProperty("webdriver.chrome.driver", "resources/chromedriver.exe");
        driver = new ChromeDriver();
        driver.get("BaseURL");

        //Maximize the window
        driver.manage().window().maximize();

        //Fullscreen mode
        driver.manage().window().fullscreen();

        //Specific width (show Chrome iPhoneX emulator)
        Dimension size = new Dimension(375, 812);
        driver.manage().window().setSize(size);

        System.out.println(driver.getTitle());
        driver.quit();

    }

    public static void main(String[] args) {
        BaseIT test = new BaseIT();
        test.setUp();
    }
}