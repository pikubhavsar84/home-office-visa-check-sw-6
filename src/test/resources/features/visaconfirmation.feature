@regression
Feature: Visa requirements for non UK resident
  As a user i want to explore visa requirements of different nationality


  Scenario Outline: an Australian Coming To UK For Tourism
    Given I am on Start Page
    When I accept additional cookies
    And I click on start button
    And I select Nationality "<nationality>"
    And I click next step button
    And I select reason for visit "<reasonForVisit>"
    And I click next step button
    Then I should see "<resultMessage>"


    Examples:
      | nationality | reasonForVisit | resultMessage                              |
      | Australia   | Tourism        | You will not need a visa to come to the UK |


  Scenario Outline: a Chilean Coming To The UK For Work And Plans On Staying For Longer Than Six Months
    Given I am on Start Page
    When I accept additional cookies
    And I click on start button
    And I select Nationality "<nationality>"
    And I click next step button
    And I select reason for visit "<reasonForVisit>"
    And I click next step button
    And I Select intent to stay for "more than 6 months"
    And I click next step button
    When I select job type "<jobType>"
    And I click next step button
    Then I should see "<resultMessage>"

    Examples:
      | nationality | reasonForVisit                   | jobType                      | resultMessage                              |
      | Chile       | Work, academic visit or business | Health and care professional | You need a visa to work in health and care |


  Scenario Outline: a Columbian National Coming To The UK To Join A Partner For A Long Stay They Do Have An Article 10Or20 Card
    Given I am on Start Page
    When I accept additional cookies
    And I click on start button
    And I select Nationality "<nationality>"
    And I click next step button
    And I select reason for visit "<reasonForVisit>"
    And I click next step button
    When I select state My partner of family member have uk immigration status 'yes'
    And I click on Continue
    Then I should see "<resultMessage>"

    Examples:
      | nationality | reasonForVisit                         | resultMessage                                               |
      | Colombia    | Join partner or family for a long stay | You’ll need a visa to join your family or partner in the UK |
