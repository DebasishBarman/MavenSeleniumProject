package ui;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class DemoAutomation {

    public static void main(String[] args) {

        WebDriverManager.firefoxdriver().setup();
//       System.setProperty("webdriver.gecko.driver","C:\\browserDriver\\geckodriver.exe");
        FirefoxDriver firefoxDriver=new FirefoxDriver();
        firefoxDriver.get("https://www.google.com");

    }
}
