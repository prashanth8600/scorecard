@Logout
Feature:Logout functionality
	As a User 
	I need to logout from the Vendigital application

Background:
	Given I am working in test environment "Wheatley"
	And I am testing the site "https://portal-c3po.apps.vendigital.network"
	
Scenario:logout from the Vendigital application
	Given user should be logged into the application
	When the user clicks on the 'profile' icon
	Then the drop-down list with logout option is displayed
	And user clicks on the 'logout' option
	Then the user should be sucessfully logout from the application 

 