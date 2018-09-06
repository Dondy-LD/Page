package base.com;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Sleeper;

public class TestFactory {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","D:\\Users\\Dondy\\eclipse-workspace\\Page\\src\\main\\resources\\chromedriver.exe");
        WebDriver dr = new ChromeDriver();
        dr.get("http://test.yun9.com:8080");
        dr.manage().window().maximize();
        dr.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
        String logintitle = "登录 - 小微服";
        LoginPage lp = new LoginPage(dr, logintitle);
        HomePage hp = lp.login();
        hp.SelectInst();
        System.out.println(dr.getTitle());
        XWFPage xwf = new XWFPage(dr);
        xwf.taxSelect();
        xwf.MonthSelect();
        System.out.println(dr.getTitle());
	}
}