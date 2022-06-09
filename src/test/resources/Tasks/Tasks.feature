Feature: Tasks

  Background:
    Given user open the website
    When user click menu tab

   @Task
  Scenario: User should filter tasks according to task type
    And user click Tasks from menu
    Then user should see the list according to the selected task type
      |Search|
      |QA    |

