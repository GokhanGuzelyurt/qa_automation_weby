Feature: Order Form

  Background:
    Given user open the website

  Scenario: User should be able to create New Order
    When user click New Order button
    Then user should be see "DRAFT" order status
    When user fill in the form
    And user type Order Notes,Notes to analyst,Client preferences
    And user click Save button
    Then user should be see Order on the Order table

@asd
  Scenario: When user click Cancel button, information message appears on the screen
    When user click edit button
    And user click Cancel button
    Then user see "You have unsaved changes" messages

  Scenario: When user click Duplicate button, same form should be open
    When use click Duplicate button
    Then user see same order form
