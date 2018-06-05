@Viewscorecard
Feature:View scorecard functionality
	As a site admin
	I need to have a ability to view the scorecards

Background:
	Given I am working in test environment "Wheatley"
	And I am testing the site "https://scorecards-wheatley.apps.vendigital.network"
	
Scenario:View the scorecards
	Given user is logged into the application successfully
	Given user should be on the my suppliers page
	And user click on the 'view scorecard' button the 'view scorecard' page will display
	And user scroll down to the 'Total Score Data' section
	And user click on the 'filter' icon the pop-up will open
	And user drap and drop the 'site name' from active site to available site and vice-versa
	And user click on the 'remove all' button the sites will disappear under the 'Active sites'
	And user click on the 'select all' button the sites will disappear under the 'Available sites'
	Then user click on the 'filter' button the pop-up window will close
	
	