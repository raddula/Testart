Feature: starting a browser and performing basic actions

  Scenario: Create profile
    Given I visit the site
    When I navigate to create profile page
#    Then I should be able to see create profile page
    When I create profile
    Then I should be able to create profile successfully
