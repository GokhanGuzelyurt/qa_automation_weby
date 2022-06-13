Feature: Tasks

  Background:
    Given user open the website

  @wip
  Scenario: User should filter tasks according to task type
    When user click menu tabs
    And user click Tasks from menus
    Then user should see the list according to the selected task types
      |Search|
      |QA    |