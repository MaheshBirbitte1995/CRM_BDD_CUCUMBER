Feature: Login

  Background: These are the common Steps
    Given user is on portal "https://devportal.uncode.io/apption/login"
    When User enter Username as "Saigaurav"
    And User enter Password as "Uncode@123"

  @AccountsCreate
  Scenario: Creating new accounts module
    And click on Accounts module
    And Click on add button
    And enter All input
    And Click on save
    Then Accounts created successfully

  @AccountsView
  Scenario: view new accounts module
    And Click on  Accounts Module
    And click on view dots icon
    And click on view icon.

  @AccountsEdit
  Scenario: Edit new accounts module
    And click on edit  view dots icon
    And click on   Edit icon
    And click on Change Account owner
    And click on Save icon

  @AccountsDelete
  Scenario: Deleting new accounts module
    And click on delete dots icon
    And click on  delete icon.
