@Login
Feature:Login in functionality
	As a User 
	I need to login into the Vendigital application

Background:
	Given I am working in test environment "Wheatley"
	And I am testing the site "https://portal-c3po.apps.vendigital.network"
	
Scenario Outline: login into the Vendigital application
	Given user should have valid login credentials
	When the user logs in using the Username as "<username>" 
	And the Password as "<password>"
	And clicks on Sign in button
	Then login should be successful. 

Examples:
|username|password|
|prashanthb@planittesting.com|Nani201993@|
