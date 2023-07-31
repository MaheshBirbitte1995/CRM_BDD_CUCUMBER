Feature: Login

Background: These are the common Steps
Given user is on portal "https://devportal.uncode.io/apption/login"
When User enter Username as "Saigaurav"
And User enter Password as "Uncode@123"


@login
Scenario: Login to Apption
Then Login is sucessful

 