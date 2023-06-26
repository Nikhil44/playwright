package training;

import com.microsoft.playwright.Browser;
import com.microsoft.playwright.BrowserType;
import com.microsoft.playwright.Page;
import com.microsoft.playwright.Playwright;

public class FirstCode {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//1. Launch the browser
		//->Create Playwright instance, Playwright is a interface, Create()-> methods help to create object.
		Playwright playwright=Playwright.create();
		//Create browser with the help of playwright.
		Browser browser = playwright.chromium().launch(new BrowserType.LaunchOptions().setHeadless(false).setChannel("chrome").setSlowMo(3000));
		//"chrome", "msedge", "chrome-beta", "msedge-beta", "msedge-dev"
		Page page = browser.newPage();
		//2.Pass the URl
		page.navigate("https://parabank.parasoft.com/");
		String  currentUrl= page.url();
		System.out.println("Current url is: "+currentUrl);
		String title=page.title();
		System.out.println("The title of page is: "+title);
		System.out.println("navigated to parabank");
		
		//3. Identify the web element
		
		//4. Perform operations on the web element
		//5. Close browser
		
		page.close();
		browser.close();
		playwright.close();
	}

}
