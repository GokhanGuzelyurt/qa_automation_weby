Feature: Order Form

  Background:
    Given user open the website

  @OrderForm
  Scenario: User should be able to create New Order
    When user click New Order button
    Then user should be see "DRAFT" order status
    When user fill in the form
    And user type Order Notes,Notes to analyst,Client preferences
    And user click Save button
    Then user should be see Order on the Order table