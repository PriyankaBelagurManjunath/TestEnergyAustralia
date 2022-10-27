# TestEnergyAustralia
TestEnergyAustralia_UI
# Automate with Selenium & Cucumber (BDD)

## Dependencies

- [Junit](https://mvnrepository.com/artifact/junit/junit/4.12)
- [Cucumber](https://github.com/cucumber/cucumber)
- [Selenium](https://github.com/SeleniumHQ/selenium)

## Folder Structure

├── README.md
├── HomePage.java-- Added to launch the browser
├──SearchResults.java -- Page file created to impliment the methods which are added in the stepdef and here UI elements like xpath is also mentioned
├──SearchProductSteps.java -- Step defnition file is created to add the steps for the each and every scenarios which are mentioned in the feature file
├── properties file -- URL is mentioned in the properties file. we can mention login credentilas in the properties file if any.
├── SearchProduct.feature -- feature file which is created in the Gherkin language and to validate the below mentioned scenrios:
                              i) Validated whether the launched URL contains festivals word in it or not
                              ii) listed out all the Band Names which are present in the given URL
                              iii) listed out all the Song names
                              iv) listed out all the songs sung by specific Band



There should be runner calss and should contain the below Cucumber options:
1) glue: specify the stepdef path
2) tags: specify the tag names which we need to run. Can specify mutilple tag names in one go
3) features: specify the feature file path

There are some restrictions in installing Cucumber plugin.


