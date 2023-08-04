Feature: Login

  Background: These are the common Steps
    Given user is on portal "https://devportal.uncode.io/apption/login"
    When User enter Username as "Saigaurav"
    And User enter Password as "Uncode@123"

  @login
  Scenario: Login to Apption
    Then Login is sucessful

  @lead
  Scenario: Creating new lead Module
    And Click on Lead module
    And click on add button
    And Enter All input
    And Click on save
    Then Lead created successfully


@Contact
Scenario: Add New Contact

And User is able to Click on Contact module
And User is able to click on Add button
And User is Enter all  required inputs
And User is able to Click on Save button
Then New Contact is Created

@EditContact
Scenario: Edit Existing Contact
And User click on More option and edit button
And Click Make change in Name 
And Click on Update button 
Then Contact is edited Successfully


