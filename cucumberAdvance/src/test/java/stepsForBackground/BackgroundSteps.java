package stepsForBackground;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import io.cucumber.java.en.Given;
import io.github.bonigarcia.wdm.WebDriverManager;

public class BackgroundSteps {
	WebDriver driver=null;
	@Given("user is on login page")
	 public void user_is_on_login_page() {
        System.out.println("Inside:user is on login page"); 
        WebDriverManager.firefoxdriver().setup();
        driver=new FirefoxDriver();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(40));
        driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(40));
       // driver.manage().window().maximize();
   }
}
