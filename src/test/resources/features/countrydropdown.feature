@regression
Feature: country-dropdown feature

  Scenario Outline: Verify the following country available in country dropdown list
    Given   I am on Start Page
    When    I click on start button
    Then    I can see following "<country>" into dropdown

    Examples:
      |country|
      |albania|
      |bhutan|
      |british-protected-person|
      |haiti|
      |kazakhstan|
      |mozambique|
      |norway|
      |portugal|
      |russia|
      |zambia|