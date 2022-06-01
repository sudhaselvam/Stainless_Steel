package stainless_steel_project;


import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class SearchResultPageTest extends BaseTest {
	WebDriver driver;
	SearchResultPage searchResultPage;
	
	
	@BeforeClass
	public void setUp() {
		driver = initialize();
		searchResultPage = new SearchResultPage(driver);
	}
	
	
	@Test
	public void testcase() {
		searchResultPage= new SearchResultPage(driver);
		System.out.println(searchResultPage.getTitle());
		
		Assert.assertEquals(searchResultPage.getTitle(), "Stainless Work Table - WebstaurantStore");
	}
 @Test
 public void totalPageNumbers() throws InterruptedException {
// Assert.assertEquals(searchResultPage.totalPageNumbers(), "9");
	 searchResultPage.verifyTables();
}
}
 
