package seleniumassignment.automation.stepdefs;

import seleniumassignment.automation.config.SharedContext;
import seleniumassignment.automation.pom.actions.AbstractPage;
import cucumber.api.java8.En;

//import static org.assertj.core.api.Assertions.assertThat;

public class SearchProductSteps implements En {
    private AbstractPage userActions;
    private SharedContext sharedContext;

    public SearchProductSteps(SharedContext sharedContext) {
        this.sharedContext = sharedContext;
        
      

        Given("^launch a browser and navigate website home page$", () -> {
            userActions.navigateToHomePage();
        });
              
        When("^user lists all the band names$", () -> {
         userActions.listAllBandNames();
      });
        
        When("^user lists all the band names$", () -> {
            userActions.listAllSongNames();
         });
        
        When("^user lists all the songs sung by$", (String text) -> {
            userActions.listAllSongsungby(text);
         });
        
    }
}
