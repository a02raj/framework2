package assignment;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.github.bonigarcia.wdm.WebDriverManager;

public class OrangeBackground {
	WebDriver driver=null;
	@Given("user is on login page")
	public void user_is_on_login_page() 
	{
        System.out.println("Inside:user is on login page"); 
        WebDriverManager.firefoxdriver().setup();
        driver=new FirefoxDriver();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(40));
        driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(40));
       // driver.manage().window().maximize();
        driver.navigate().to("https://opensource-demo.orangehrmlive.com/index.php/dashboard");
   }
	@And ("login using userid >Admin and Password >admin123")
	public void login_using_userid_Admin_and_Password_admin123()
	{
		driver.findElement(By.id("txtUsername")).sendKeys("Admin");
		driver.findElement(By.id("txtPassword")).sendKeys("admin123");
		driver.findElement(By.id("btnLogin")).click();

        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(40));
        driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(40));
	}
	
    @Then("user is navigated to the homepage")
    public void user_is_navigated_to_search_result() {
        System.out.println("Inside Step:user is navigated to the homepage");    
    }
  
    //Scenario 1=========================================================================
    @When("user clicks on Admin link")
    public void user_clicks_on_Admin_link() {
        System.out.println("user clicks on Admin link");    
        driver.findElement(By.xpath("/html/body/div[1]/div[2]/ul/li[1]/a")).click();
    }

    @Then("user is redirected to user Management")
    public void user_is_redirected_to_user_Management()

    {
        System.out.println("user is redirected to user Management");  
        driver.findElement(By.xpath("//*[@id=\"menu_admin_UserManagement\"]")).click();

    }  
    
    @And("Goto user Managment > users")
    public void Goto_user_Managment_users() 
    {
        System.out.println("Goto user Managment > users");
        driver.findElement(By.xpath("//*[@id=\"menu_admin_viewSystemUsers\"]")).click();
   }

   
    @And("Verify User Role column is present")
    public void Verify_User_Role_column_is_present() {
        System.out.println("Inside Step:Verify User Role column is present");
        driver.getPageSource().contains("User Role");
       
        WebElement p=driver.findElement(By.xpath("/html/body/div[1]/div[3]/div[2]/div/div/form/div[4]/table/thead/tr/th[3]/a"));

        //getText() to obtain text
        String s= p.getText();
        System.out.println("Text content is : " + s);

        
    } 
    @And("Search for ([^\\\"]*)$")
    public void Search_for_user(String user) {
        System.out.println("Search for"+ user);
        boolean z= driver.getPageSource().contains(user);
        if(z=true)
        System.out.println(user +"is present");
        else
        	System.out.println(user+ "is not present");

    }
    @Then("logout and close browser")
    public void logout_and_close_browser() {
        System.out.println("Inside Step:hit enters");
        driver.findElement(By.xpath("//*[@id=\"welcome\"]")).click();
        driver.findElement(By.xpath("//*[@id=\"welcome-menu\"]/ul/li[3]/a")).click();

        driver.quit();
    }
 
   //======================================= Scenario 2===============================
		 
		    


		    @When("user clicks on level")
		    public void user_clicks_on_level() {
		        System.out.println("Inside Step:user clicks on level");    
		        driver.findElement(By.xpath("/html/body/div[1]/div[2]/ul/li[3]/a/b")).click();
		    
		    }
		    @And("user clicks on My level")
		    public void user_clicks_on_My_level() {
		        System.out.println("Inside Step:user clicks on My level");
		        driver.findElement(By.xpath("//*[@id=\"menu_leave_viewMyLeaveList\"]")).click();

		    }
		    @Then("Verify Employee Name column is present")
		    public void Verify_Employee_Name_column_is_present() {
		        System.out.println("Inside Step:Verify Employee Name column is present");
		        
		        WebElement k=driver.findElement(By.xpath("//*[@id=\"resultTable\"]/thead/tr/th[2]/span"));

		        //getText() to obtain text
		        
		        String z = k.getText();
		        if(z=="Employee Name")
		        System.out.println(" Employee Name column is present");
		        else
		        	System.out.println("Employee Name column is not present");
		      
		    }
		   
		    
		    @Then("logout and close browser1")
		    public void logout_and_close_browser1() {
		        System.out.println("Inside Step:logout and close browser1");
		        driver.findElement(By.xpath("//*[@id=\"welcome\"]")).click();
		        driver.findElement(By.xpath("//*[@id=\"welcome-menu\"]/ul/li[3]/a")).click();
		
		        driver.quit();
		    }
		
	}


   
