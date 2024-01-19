Feature: Login

  Background: These are the common Steps
    Given user is on portal "https://devportal.uncode.io/apption/login"
    When User enter Username as "Saigaurav"
    And User enter Password as "Uncode@123"

  @tag
  Scenario: TaskCreate
    And click on Task
    And click on Create Task
    And click on all Inputs
    And click on save
