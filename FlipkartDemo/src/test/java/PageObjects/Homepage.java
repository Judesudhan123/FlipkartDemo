package PageObjects;

import java.time.Duration;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Homepage {
	
	public static WebDriver driver;
	public static WebDriverWait wait;
	
	
	@FindBy(xpath="//span[text()=\"Fashion\"]")
			private WebElement menubar;
	
	@FindBy(xpath="//a[text()=\"Men's Top Wear\"]")
	private WebElement TopWear;
	
	
	@FindBy(xpath="//div[text()=\"4★ & above\"]")
	private WebElement Starrating;
	
	@FindBy(xpath="//div[text()=\"Brand\"]")
	private WebElement Brand;
	
	@FindBy(xpath="//div[text()=\"Allen Solly\"]")
	private WebElement Allensolly;
	
	@FindBy(xpath="//button[@class=\"_2KpZ6l _2U9uOA _3v1-ww\"]")
	private WebElement Cart;
	
	@FindBy(xpath="//button[@class=\"_2KpZ6l _2ObVJD _3AWRsL\"]")
	private WebElement Order;
	
	public Homepage(WebDriver driver) {
		this.driver = driver;
		this.wait = new WebDriverWait(driver, Duration.ofSeconds(60));
		PageFactory.initElements(driver, this);
	}
	
	public void navigatetoFlipkartPage() {
		
		driver.get("https://www.flipkart.com/");
		driver.manage().window().maximize();
	}
	
	
    public void FashionandmenTopwear() {
    	
    	Actions a= new Actions(driver);
    	
    	a.moveToElement(menubar).perform();
    	
    	WebElement menTopwearFilter = wait.until(ExpectedConditions.elementToBeClickable(TopWear));
    	menTopwearFilter.click();
    	
    	
    }
    	public void filterByPriceRange() {
    		
    		WebElement star = wait.until(ExpectedConditions.elementToBeClickable(Starrating));
        	star.click();
    		
    	}
    	
        public void AllensollyBrand() throws InterruptedException {
        	
        	Thread.sleep(1000);
    		
    		WebElement AllBrand = wait.until(ExpectedConditions.elementToBeClickable(Brand));
        	AllBrand.click();
        	
        	WebElement Allen = wait.until(ExpectedConditions.elementToBeClickable(Allensolly));
        	Allen.click();
        	
    	
        }
        
        public void countOftheProduct() throws InterruptedException {
    		Thread.sleep(3000);
    		
    		List<WebElement> elements = driver
    				.findElements(By.xpath("//a[@class=\"IRpwTa\"]"));
    		
    		System.out.println("Counts of the Result   " + " : " + elements.size());

    		for (int i = 0; i < elements.size(); i++) {

    			if (i == 1) {
    				elements.get(i).click();
    			}

    		}

    	}
        
        public void clickAddtocart() throws InterruptedException {
    		String a = driver.getWindowHandle();
    		Set<String> b = driver.getWindowHandles();

    		for (String c : b) {
    			if (!c.equals(a)) {
    				driver.switchTo().window(c);
    			}
    		}
			
    		WebElement addtoCartBtn = wait.until(ExpectedConditions.elementToBeClickable(Cart));
    		addtoCartBtn.click();
    		
    	
        }
        
        public void buyProduct() {
        	
        	WebElement Buy = wait.until(ExpectedConditions.elementToBeClickable(Order));
        	Buy.click();
}
}
