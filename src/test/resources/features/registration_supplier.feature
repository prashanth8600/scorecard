@Registration_supplier
Feature:Registration functionality
	As a suppliers user
	I need to have a ability to register with the application
	
Scenario Outline:Registering with the scorecard application
	Given user need to open the gmail account
	When user enter the email in the "<Emailid>"
	And user click on the Next button
	When user enters the data in the "<Enteryourpassword>" password field
	And user click on the Next button
	Given user has to received the invitation mail
	And user enters the data in the "<email>" field
	And user enters the data in the "<password>" field
	And user enters the data in the "<password confirmation>" field
	And user enters the data in the "<first name>" field
	And user enters the data in the "<last name>" field
	And user enters the data in the "<company name>" field
	And user enters the data in the "<phone number>" field
	And user click on the 'terms and conditions' checkbox
	Then user click on the 'submit' button the registration should be sucessfull

Examples:
|Emailid|Enteryourpassword|email|password|password confirmation|first name|last name|company name |phone number|
|deepti.saxena9494|Prakarsh1234|deepti.saxena9494+supplier100@gmail.com|Nani8600*|Nani8600*|cucumber|framework|planit|9999999999|