package MavenTest.GmailTest;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class LoginToGmail
{
	public static WebDriver driver;
	public void Setup() throws InterruptedException
	{
		System.setProperty("webdriver.chrome.driver","D:\\D-Drive\\Softwares\\chromedriver.exe");
		driver=new ChromeDriver();
		
		driver.get("https://accounts.google.com/");
		driver.manage().window().maximize();
		login();	
	}
	public void login() throws InterruptedException
	{
		driver.findElement(By.id("identifierId")).sendKeys("kasaragadda.ravindrababu@gmail.com");
		driver.findElement(By.id("identifierNext")).click();
		Thread.sleep(2000);
		driver.findElement(By.name("password")).sendKeys("Ravindradfjkh");
		driver.findElement(By.id("passwordNext")).click();
		driver.findElement(By.linkText("SIGN-ON")).click();
		System.out.println("I have chnaged my gmail in GIT storage");
	}
	public static void main(String[] args) throws InterruptedException
	{
		LoginToGmail l = new LoginToGmail();
		l.Setup();
		
	}
}
