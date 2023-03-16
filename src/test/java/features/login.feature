
Feature: Login Feature

  @regression @smoke @sanity
  Scenario: User should be able to login with valid email and password
    Given user in TalentTEK Homepage
    And user enter valid email address
    And user enter valid password
    When user clicks on Log In button
    Then user should be able to successfully login
