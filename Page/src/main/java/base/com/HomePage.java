package base.com;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;

public class HomePage  extends BasePage{
	 
	@FindBy(xpath = "//*[@id=\"root\"]/div/div[2]/div/div/div/div/div/div/div[1]/div/div/h4/a")
	@CacheLookup
	private WebElement Inst;
	public HomePage(WebDriver driver) {
		super(driver);
	// TODO Auto-generated constructor stub
	}
	public HomePage(WebDriver driver,String title)
	{
		super(driver,title);
	}
	public void SelectInst() {
		Inst.click();
	}
}
