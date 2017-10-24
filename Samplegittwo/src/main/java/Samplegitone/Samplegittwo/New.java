package Samplegitone.Samplegittwo;

public class New {

static WebDriver driver;
	
	@BeforeClass
	public static void openbrowser()
	{
		driver = new FirefoxDriver();
		driver.get("https://www.facebook.com/");
	}
	
	@Test(priority = 1)
	public static void username()
	{
		WebElement uname = driver.findElement(By.xpath(".//*[@id='email']"));
		uname.sendKeys("hyt");
	}

	@Test(priority = 2)
	public static void password()
	{
		WebElement pass = driver.findElement(By.xpath(".//*[@id='pass']"));
		pass.sendKeys("hjiog");
	}
	@Test(priority = 3)
	public static void login()
	{
		WebElement log = driver.findElement(By.xpath(".//*[@id='loginbutton']"));
		log.click();
	}

}

}
