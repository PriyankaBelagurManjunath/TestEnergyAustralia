package seleniumassignment.automation.pom.pages;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.TimeoutException;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import seleniumassignment.automation.pom.actions.AbstractPage;
import seleniumassignment.automation.pom.uielements.SearchResultPageElements;


public class SearchResults extends AbstractPage implements SearchResultPageElements {

    public SearchResults(WebDriver driver) {
        super(driver);
    }

    
 public void listAllBandNames() 
{
	//list all the band names
	List<WebElement> BandNames = getDriver().findElements(By.xpath("//li"));
	System.out.println("Total Number of Bands" + BandNames.size());
	if(BandNames.get(0).isDisplayed())
	{
		for(int i=1; i< BandNames.size(); i++)
		{
			//display all the band names
			String Bands=BandNames.get(i).getText();
			System.out.println(Bands);
		}
	}
}

public void listAllSongNames() 
{
	//list all the band names
	List<WebElement> SongNames = getDriver().findElements(By.xpath("//ul/li"));
	System.out.println("Total Number of Bands" + SongNames.size());
	if(SongNames.get(0).isDisplayed())
	{
		for(int i=1; i< SongNames.size(); i++)
		{
			//display all the band names
			String Bands=SongNames.get(i).getText();
			System.out.println(Bands);
		}
	}
}

public void listAllSongsungby(String phrase) {
   
    List<WebElement> SongNames = getDriver().findElements(By.xpath("//li[text()='"+phrase+"'] //li"));
    System.out.println("Total Number of Bands" + SongNames.size());
	if(SongNames.get(0).isDisplayed())
	{
		for(int i=1; i< SongNames.size(); i++)
		{
			//display all the band names
			String Bands=SongNames.get(i).getText();
			System.out.println(Bands);
		}
	
}
    
}
}

