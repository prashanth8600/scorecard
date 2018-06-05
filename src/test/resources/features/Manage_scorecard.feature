@Managescorecard
Feature:Manage scorecard functionality
	As a site admin
	I need to have a ability to manage the scorecards

Background:
	Given I am working in test environment "Wheatley"
	And I am testing the site "https://scorecards-wheatley.apps.vendigital.network"
	
Scenario:Manage the scorecards
	Given user is logged into the application successfully
	Given user should be on the my suppliers page
	When user click on the 'manage scorecard' icon for 'suppliername' in the 'my supplier' section
	And the 'mange scorecard for-' pop-up window will be displayed
	And user clicks on the '(X) delete scoracard' button under the options the pop-up window will open
	And user click on the 'OK' button in the 'confirmation' pop-up window
	And user click on the 'OK' button in the 'Success' pop-up window
	Then user click on the '(X) close' button the pop-up window will close

 