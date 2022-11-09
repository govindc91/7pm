package pack1;

import java.util.concurrent.TimeUnit;
import org.junit.Test;
import org.openqa.selenium.chrome.ChromeDriver;

public class c1 {
	
	@Test
	public void t1() throws InterruptedException
	{
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Lenovo\\Downloads\\chromedriver_win32\\chromedriver.exe");
		ChromeDriver ob= new ChromeDriver();
		ob.get("http://www.google.com");
		ob.manage().timeouts().implicitlyWait(4, TimeUnit.SECONDS);
		System.out.println(ob.getTitle());//4
		ob.findElementByLinkText("Images"); //4
		Thread.sleep(3000);
		ob.quit();//4
	}

}
