package base.com;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;

public class XWFPage extends BasePage {

	/*@FindBy(xpath="//*[@id=\"root\"]/div/div/div/div[1]/div/ul/li[2]/div/span/svg")
	@CacheLookup
	private WebElement selector;*/
	
	@FindBy(xpath="//*[@id=\"tax-center$Menu\"]/li[1]/a")
	@CacheLookup
	private WebElement taxVat;
	
	@FindBy(xpath="//*[@id=\"root\"]/div/div/div/div[2]/div[2]/div/div[1]/div/div[1]/div/div[1]/div/div/div/div")
	@CacheLookup
	private WebElement mselect;
	
	@FindBy(xpath="/html/body/div[2]/div/div/div/ul/li[3]")
	@CacheLookup
	private WebElement mselect6;
	
	public XWFPage(WebDriver driver) {
		super(driver);
	}
	public XWFPage(WebDriver driver, String title) {
		super(driver, title);
		// TODO Auto-generated constructor stub
	}
	/*public void taxSelect(String taxCategory) {
		selector.click();
		switch (taxCategory) {
		case "增值税":
			taxVat.click();
			break;

		default:
			break;
		}*/
	public void taxSelect() {
		taxVat.click();
	
	}
	
	public void MonthSelect() {
		mselect.click();
		try {
			Thread.sleep(5000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		String htmls = mselect.getAttribute("innerHTML");
		System.out.println(htmls);
		mselect6.click();
	}
}
