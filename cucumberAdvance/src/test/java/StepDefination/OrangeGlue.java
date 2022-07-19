package StepDefination;

import java.time.Duration;

import org.junit.validator.PublicClassValidator;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

import io.cucumber.java.After;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.github.bonigarcia.wdm.WebDriverManager;

public class OrangeGlue {
	WebDriver driver = null;

public class scenario1 
	
	
	{
//Scenario1 : Check User Role column is present and search users
		  @When("user clicks on Admin link")
		    public void user_clicks_on_Admin_link() {
		        System.out.println("user clicks on Admin link");    
		        driver.findElement(By.id("menu_admin_viewAdminModule")).click();
		      	    }

		   

		    @Then("user is redirected to user Management")
		    public void user_is_redirected_to_user_Management()

		    {
		        System.out.println("user is redirected to user Management");    		        
		    }  
		    
		    @And("Goto user Managment > users")
		    public void Goto_user_Managment_users() 
		    {
		        System.out.println("Goto user Managment > users");
		        driver.findElement(By.xpath("//*[@id=\"menu_admin_UserManagement\"]")).click();
			    driver.findElement(By.xpath("//*[@id=\"menu_admin_viewSystemUsers\"]")).click();
		   }

		   
		    @And("Verify User Role column is present")
		    public void Verify_User_Role_column_is_present() {
		        System.out.println("Inside Step:hit enters");
		        driver.getPageSource().contains("Careers - Capgemini India");
		       
		        WebElement p=driver.findElement(By.xpath("//*[@id=\"resultTable\"]/thead/tr/th[3]/a"));

		        //getText() to obtain text
		        String s= p.getText();
		        System.out.println("Text content is : " + s);

		        
		    } 
		    @And("Search for ([^\\\"]*)$")
		    public void Search_for_user() {
		        System.out.println("Search for"+user);
		        driver.findElement(By.name("q")).sendKeys(Keys.ENTER);

		    }
		    @And("logout and close browser")
		    public void logout_and_close_browser() {
		        System.out.println("Inside Step:hit enters");
		        driver.findElement(By.id("welcome")).click();
		        driver.findElement(By.xpath("//*[@id=\"welcome-menu\"]/ul/li[3]/a")).click();

		        driver.quit();
		    }
	
		    
public class scenario2{
//Scenario 2: Check Employee Name column is present
		    @When("user clicks on level")
		    public void user_clicks_on_level() {
		        System.out.println("Inside Step:user clicks on level");    
		        driver.findElement(By.id("menu_leave_viewLeaveModule")).click();
		    
		    }
		    @And("user clicks on My level")
		    public void user_clicks_on_My_level() {
		        System.out.println("Inside Step:user clicks on My level");
		        driver.findElement(By.id("menu_leave_viewMyLeaveList")).click();

		    }
		    @Then("Verify Employee Name column is present")
		    public void Verify_Employee_Name_column_is_present() {
		        System.out.println("Inside Step:user is navigated to search results");
		        
		        WebElement k=driver.findElement(By.xpath("//*[@id=\"resultTable\"]/thead/tr/th[2]/span"));

		        //getText() to obtain text
		        
		        String z = k.getText();
		        if(z=="Employee Name")
		        System.out.println(" Employee Name column is present");
		        else
		        	System.out.println("Employee Name column is not present");
		      
		    }
		    //Same in both scenarios
		    
		    @And("logout and close browser")
		    public void logout_and_close_browser() {
		        System.out.println("Inside Step:hit enters");
		        driver.findElement(By.id("welcome")).click();
		        driver.findElement(By.xpath("//*[@id=\"welcome-menu\"]/ul/li[3]/a")).click();

		        driver.quit();
		    }
		
	}

}}
