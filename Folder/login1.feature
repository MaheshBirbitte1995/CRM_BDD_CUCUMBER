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

  @Accounts
  Scenario: Creating new accounts module
    And click on Accounts module
    And Click on add button
    And enter All input
    And Click on save
    Then Accounts created successfully