@Site_Admin_Remove_suppliers
Feature: Site admin has the ability to remove supplier from the sites
	As a site admin 
	I need to have the ability to remove supplier from the site

Background:
	Given I am working in test environment "Wheatley"
	And I am testing the site "https://portal-wheatley.apps.vendigital.network"
	
Scenario: Removing suppliers from the site
	Given user is logged into the application successfully
	Given supplier should add under the my suppliers section
	And user click on the 'All suppliers' tab in the 'supplier' index page
	And user click on the 'Remove supplier from my suppliers' icon under the options the pop-up window will open
	And user click on the 'Ok' button it will display the 'Success' message was successfully removed from your suppliers successfully'
	Then user click on the 'Ok' button the pop-up window will close