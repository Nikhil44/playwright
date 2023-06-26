package training;

import com.microsoft.playwright.Browser;
import com.microsoft.playwright.BrowserType;
import com.microsoft.playwright.Page;
import com.microsoft.playwright.Playwright;
import com.microsoft.playwright.options.AriaRole;

public class BestBuyAccount {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Playwright playwright = Playwright.create();
		Browser browser = playwright.chromium().launch(new BrowserType.LaunchOptions().setChannel("chrome").setHeadless(false));
		Page page = browser.newPage();
		page.navigate("https://www.bestbuy.com/?intl=nosplash");
		//page.getByText("Account").click();
		page.getByRole(AriaRole.BUTTON, new Page.GetByRoleOptions().setName("Account")).click();
		//listening to the alert
		page.onDialog(dialog -> {dialog.accept();});

		page.getByText("Create Account").click();
		
		playwright.close();
	}

}
