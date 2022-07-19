package stepsForGSearch;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.github.bonigarcia.wdm.WebDriverManager;

public class Steps18July {
	WebDriver driver=null;
	
	@Before("@Capgemini")
	public void capgemini() 
	{
        WebDriverManager.chromedriver().setup();
        driver=new ChromeDriver();
   }
	@After("@Accenture")
	public void Accenture() 
	{
        WebDriverManager.firefoxdriver().setup();
        driver=new FirefoxDriver();
   }
	@Given("user is on google search page") 
	public void user_is_on_google_search_page() 
	{
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(40));
        driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(40));
       // driver.manage().window().maximize();
        driver.navigate().to("https://www.google.co.in");
   }


    @When("user searches for ([^\\\"]*)$")
    public void user_searches_for_searchText(String searchText) {
        System.out.println("Inside Step:user searches for"+ searchText);    
        driver.findElement(By.name("q")).sendKeys(searchText);
        driver.findElement(By.name("q")).sendKeys(Keys.ENTER);
    
    }

    @Then("user is navigated to search result")
    public void user_is_navigated_to_search_result() {
        System.out.println("Inside Step:user is navigated to search results");
    }
    @Then("close Browser")
    public void close_Browser() {
        System.out.println("close Browser");
        driver.quit();
    }
}




