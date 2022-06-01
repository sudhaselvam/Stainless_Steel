package stainless_steel_project;

import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class SearchPageTest extends BaseTest {
	WebDriver driver;
	SearchPage searchPage;
	
	@BeforeClass
	public void setUp() {
		driver = initialize();
		searchPage = new SearchPage(driver);
	}

	@Test(priority = 0)
	public void testPageTitle() {
		System.out.println(searchPage.getPageTitle());
		Assert.assertEquals(searchPage.getPageTitle(), "WebstaurantStore: Restaurant Supplies & Foodservice Equipment");
		searchPage.enterSearch();
		searchPage.clickSearch();
		
	}
	
	

}
