package BMO;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class cheqingaccount {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:/selenium/Eclipse Workspace/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		
		driver.get("https://www.bmo.com/main/personal/bank-accounts/savings/");
		
		WebElement bankac=driver.findElement(By.xpath("//*[@id='personal-site']/nav/ul/li[1]/a"));
		
		bankac.click();
		
WebElement practical=driver.findElement(By.xpath("//a[@href='practical-plan']"));
		
		practical.click();
		
		driver.close();
		
		
	}

}
