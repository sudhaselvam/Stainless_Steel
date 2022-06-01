package stainless_steel_project;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.Assert;

public class SearchResultPage {
	
	WebDriver driver;
	By products= By.xpath("//a[@data-testid='itemDescription']");
	By clickNextPage = By.xpath("//li[@class='rc-pagination-next']");
	By totalPageNumber = By.xpath("//a[@aria-label='Page 9']");
	By addToCart=By.xpath("//button[text()='Add To Cart']");
	By AddProduct= By.name("addToCartButton");
	By viewCart = By.xpath("//span[text()='Cart']");
	By tablePages = By.xpath("//li[contains(@class,'rc-pagination')]");

	public SearchResultPage(WebDriver driver) {
		
		this.driver = driver;
	}
	
   public  String getTitle() {
		return driver.getTitle();
	}
   
   public String totalPageNumbers() {
		 String pages=driver.findElement(totalPageNumber).getText();
		return pages;
	 }
   
   public void clickNextPages() {
	   driver.findElement(clickNextPage).click();
   }
   public void verifyTables() throws InterruptedException {
		List<WebElement> tables = driver.findElements(products);
		List<WebElement> tablePages = driver.findElements(By.xpath("//li[contains(@class,'rc-pagination')]"));
		System.out.println(tablePages.size());
		String s = driver.findElement(products).getText();
		boolean table = s.contains("Table");

		int lastItem = tables.size() - 1;
		try {
			for (WebElement tp : tablePages) {
				System.out.println(tables.size());
				for (WebElement t : tables) {
					Assert.assertTrue(table);
				}
				driver.findElement(clickNextPage).click();

			}
		} catch (NoSuchElementException e) {

		}

		if (tables.get(lastItem) != null) {
			driver.findElement(AddProduct).click();
			driver.findElement(addToCart).click();
		}
		Thread.sleep(3000);

		driver.findElement(viewCart).click();
		Thread.sleep(6000);

	}
	
	
	

}
