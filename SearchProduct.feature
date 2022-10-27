# Defining application feature below which I want to test
Feature: Search products
        As a user,
        I want to search a product from home page

# Providing background steps which I want to perform before every scenario.
  Background:
      Given launch a browser and navigate website home page
      
  Scenario: To list out all the band names
  
     When user lists all the band names 
     
  
  Scenario: To list out all the Song names
  
     When user lists all the song names 
     
Scenario: To list out the songs sung by any specific band
 
 	When user lists all the songs sung by "Squint-281 " 