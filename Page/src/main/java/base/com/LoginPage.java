package base.com;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;

public class LoginPage extends BasePage {
    
	@FindBy(id="username")
	@CacheLookup
	private WebElement inputusername;
	
	@FindBy(id="password")
	@CacheLookup
	private WebElement inputpassword;
	
	@FindBy(xpath="//*[@id=\"root\"]/div/div[2]/form/div[2]/div/div/span/button")
	@CacheLookup
	private WebElement mybutton;
	
	public LoginPage(WebDriver driver) {
	// TODO Auto-generated constructor stub
		super(driver);
	}
	
	
	public LoginPage(WebDriver driver, String title) {
		super(driver, title);
	// TODO Auto-generated constructor stub
	}
	
	//不设定homepage类型不行，因为返回的是这个对象 必须是这个类型
	public HomePage login(){
		username("18583393973");
		password("123456");
		mybutton();
		return new HomePage(driver,"选择机构 - 小微服");
	}
	public void  username(String username)
	{
		inputusername.clear();
		inputusername.sendKeys(username);
	}
	public void password(String password)
	{
		inputpassword.clear();
		inputpassword.sendKeys(password);
	}
	public void mybutton()
	{
		mybutton.click();
	}
}