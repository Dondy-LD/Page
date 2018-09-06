package base.com;

import org.openqa.selenium.TimeoutException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.pagefactory.AjaxElementLocatorFactory;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.WebDriverWait;

public class BasePage {
	WebDriver driver;
	private final int TIMEOUT = 3;
	//构造方法一
	public BasePage(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(new AjaxElementLocatorFactory(driver, TIMEOUT) , this);
	}
	//构造方法二
	public BasePage(WebDriver driver, final String  title) {
		this.driver=driver;
		WebDriverWait wait=new WebDriverWait(driver, TIMEOUT);
		try{
	           boolean flag = wait.until(new ExpectedCondition<Boolean>(){
	               @Override
	               public Boolean apply(WebDriver arg0) {
	                   // TODO Auto-generated method stub
	                   String acttitle = arg0.getTitle();
	                   return acttitle.equals(title);                    
	               }});
	       }catch(TimeoutException te) {
	           throw new IllegalStateException("当前不是预期页面，当前页面title是：" + driver.getTitle());
	       }
	  PageFactory.initElements(new AjaxElementLocatorFactory(driver, TIMEOUT) , this);
	}
}
