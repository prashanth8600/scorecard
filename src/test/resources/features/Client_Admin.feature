@Client_Admin
Feature: Client admin has the ability to add site admin to the sites 
	As a client admin 
	I need to have the ability to add site admin to the sites.
	
Scenario Outline: Adding site admin to the sites
	Given user is logged into the application successfully
	When user clicks on the 'Client Admin' option under the Administrations link from the left hand side navigation panel
	And user clicks on the "<Site>" under client Administration list 
	And user clicks on the '(+) Add User' icon on the Manage site Administrations screen
	And user clicks on the '(+) Add Site Admin'icon for "<User>"  from the displayed Add A New Site Admin list
	And user clicks on the 'Ok' button from the confirmation pop-up window
	Then a popup with 'Sucess' message as 'Added New Site Admin' with OK button should be displayed
	And user clicks on 'Ok' button	
	Then selected user should be displayed on the Manage site administrators list.

Examples:
|User|Site|
|Chris|Aero Components|



	


	 