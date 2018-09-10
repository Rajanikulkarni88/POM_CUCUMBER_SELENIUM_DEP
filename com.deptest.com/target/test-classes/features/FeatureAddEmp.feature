#Author: Rajani.kulkarni05@gmail.com
#Keywords Summary :
#Feature: Add Employee.
#Scenario: As a Business add Employee.

Feature: Add Employee for Test automation
 
@login
Scenario: Automating Add Employee Test
	Given I want to open website deputyfood
  When I want to enter valid credential
  Then I click on Login button
  Then I click on Schedule tab add employee
  Then I enter firstname lastname email mobile
  Then I login to email click on generated link
  Then I verify the logged in user TestFirst
  
  
  
  
  
  
   

