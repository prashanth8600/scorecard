@Issue_scorecards
Feature: Site admin can able to issue to the scorecards to the supplier 
	As a site admin 
	I need to have ability to issue the scorecards
	In order to provide an access to view the scorecards for supplier user


Background:
	Given I am working in test environment "wheatley"
	And I am testing the site "scorecards-wheatley.apps.vendigital.network"
	

Scenario Outline: Site admin should be able to issue the scorecard
	Given user is logged into the application successfully
	Given user should be on the my suppliers page
	When user click on the 'issue scorecard' icon for "<suppliername>" in the 'my supplier' section
	Then 'issue Scorecard for-' pop-up window will be displayed
	When user click on the 'date picker' field
	And user should able to view the 'calendar'
	And user click on the 'year' present in the calendar
	And verify the 'month_year' combination displayed in the 'Date' field
	And user click on 'submit' button
	Then the user should able to view the success message for 'issued scorecard'
	Then user click on the 'close' button the opened pop-up window will close

Examples:
|suppliername|
|A. Components Corporation|