@login_supplier
Feature:login functionality
	As a suppliers user
	I need to have a ability to login into the application

Background:
	Given I am working in test environment "Wheatley"
	And I am testing the site "https://scorecards-wheatley.apps.vendigital.network"
	
Scenario Outline: login into the Vendigital application
	Given user should register with the scorecard application
	When the user logs in using the Username as "<username>" 
	And the Password as "<password>",
	Then login should be successful. 

Examples:
|username|password|
|deepti.saxena9494+supplier11|Nani8600*|
 
