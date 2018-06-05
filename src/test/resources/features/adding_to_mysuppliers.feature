@Site_Admin_Add_suppliers
Feature: Site admin has the ability to add supplier to the sites
	As a site admin 
	I need to have the ability to add suppliers to the sites

Background:
	Given I am working in test environment "Wheatley"
	And I am testing the site "https://portal-wheatley.apps.vendigital.network"
	
Scenario Outline:Adding suppliers to the site
	Given user is logged into the application successfully
	When user select the 'Scorecard' from the application list
	And user click on the 'All suppliers' tab in the 'supplier' index page
	And user click on the 'Add supplier to my suppliers' icon under the options the 'Contact information' pop-up window will open
	And user enters the "<Supplieremail>" address in the email
	And user click on the 'Add email' button the supplier email address will added below under the 'Supplier email' column
	And user click on the 'Add to my supplier' button the email address is sucessfully added
	And user click on the 'Ok' button it will display the 'Sucess' message as supplier is added to your suppliers
	And user click on the 'Ok' button the opend pop-up window will close
	Then the user click on the 'Close/(X)' button the 'Contact information pop-up window will close

Examples:
|Supplieremail|
|deepti.saxena9494+supplier100@gmail.com|