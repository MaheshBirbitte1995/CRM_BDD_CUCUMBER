Feature: Login

Background: These are the common Steps
Given user is on portal "https://devportal.uncode.io/apption/login"
When User enter Username as "Saigaurav"
And User enter Password as "Uncode@123"


@login
Scenario: Login to Apption
Then Login is sucessful

@Contact
Scenario: Add New Contact
And User is able to Click on Contact module
And User is able to click on Add button
And User is able to Click on Contact owner
And User is able to Click on Account Name
And User is able to Click on First Name
And User is able to Click on Last Name
And User is able to Click on Phone
And User is able to Click on Mobile Number
And User is able to Click on Email
And User is able to Click on Fax
And User is able to Click on Secondary Email
And User is able to Click on Address
And User is able to Click on City
And User is able to Click on ZipCode
And User is able to Click on Country 
And User is able to Enter Description
And User is able to Click on Save button
Then New Contact is Created


 