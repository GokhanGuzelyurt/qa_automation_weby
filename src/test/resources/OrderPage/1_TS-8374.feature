Feature: Order Page- User should filter orders according to order type

	@TEST_TS-8374
	Scenario: Order Page- User should filter orders according to order type
		Given user open the website
		Then user see the order page
		When user click order type dropdown
		Then user should see the list according to the selected order type
           |Draft|
		   |Ready for processing|
		   |Cancelled|
		   |Fulfilled|

