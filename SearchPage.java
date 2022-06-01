package stainless_steel_project;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class SearchPage {

	private WebDriver driver;

	public SearchPage(WebDriver driver) {
		this.driver = driver;

	}

	By search = By.xpath("//input[@name='searchval']");
	By button = By.xpath("//button[@value='Search']");

	public String getPageTitle() {
		return driver.getTitle();
	}

	public void enterSearch() {
		driver.findElement(search).sendKeys("stainless work table");
		//driver.findElement(button).click();
		

	}
	
	public SearchResultPage clickSearch() {
		WebElement buttonClick = driver.findElement(button);
		buttonClick.click();
		return new SearchResultPage(driver);
		
		
		
	}

}
