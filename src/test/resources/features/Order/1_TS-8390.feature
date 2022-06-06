Feature: Order-User should be able to filter with find options

	@TEST_TS-8390
	Scenario: Order-User should be able to filter with find options
		When user click find tab
		And user select finds option
		Then system sorting the list according to the selected search option
