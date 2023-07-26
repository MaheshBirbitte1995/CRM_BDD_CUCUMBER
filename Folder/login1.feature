Feature: Login
Scenario: Login to Apption
Given user is on portal "https://devportal.uncode.io/apption/login"
When User enter Username as "Saigaurav"
And User enter Password as "Uncode@123"
Then Login is sucessful

 