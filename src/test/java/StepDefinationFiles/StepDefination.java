package StepDefinationFiles;
import io.cucumber.junit.Cucumber;// manually imported
import org.junit.runner.RunWith;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

@RunWith(Cucumber.class)
public class StepDefination {
	public WebDriver driver;

    @Given("^initialize the browser with chrome$")
    public void initialize_the_browser_with_chrome() throws Throwable {
    	System.setProperty("webdriver.chrome.driver", "C:\\Chrome Webdriver\\chromedriver.exe");
		 driver =new ChromeDriver();
    }
     
    @And("^navigate to \"([^\"]*)\" site$")
    public void navigate_to_something_site(String strArg1) throws Throwable {
        driver.get(strArg1);
    }

    @When("^user enters (.+) and (.+) and logs in$")
    public void user_enters_and_and_logs_in(String username, String password) throws Throwable {
        driver.findElement(By.xpath("//*[@id='username']")).sendKeys(username);
        driver.findElement(By.xpath("//*[@id='password']")).sendKeys(password);
        driver.findElement(By.xpath("//input[@id='Login']")).click();
    }

    @Then("^verify that user is successfully signed in$")
    public void verify_that_user_is_successfully_signed_in() throws Throwable {
        System.out.println("you are logged in Successfully");
    }

    


	    }

	
	
	


