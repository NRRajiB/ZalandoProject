#Author: your.email@your.domain.com
#Keywords Summary :
#Feature: List of scenarios.
#Scenario: Business rule through list of steps with arguments.
#Given: Some precondition step
#When: Some key actions
#Then: To observe outcomes or validation
#And,But: To enumerate more Given,When,Then steps
#Scenario Outline: List of steps for data-driven as an Examples and <placeholder>
#Examples: Container for s table
#Background: List of steps run before each of the scenarios
#""" (Doc Strings)
#| (Data Tables)
#@ (Tags/Labels):To group Scenarios
#<> (placeholder)
#""
## (Comments)
#Sample Feature Definition Template
@tag
Feature: Title of your feature
  I want to use this template for my feature file

  @tag1
  Scenario: Generate customer ID
    Given launch the browser and open the url and click add customer
    When the user navigates to home page and fill the text boxes and submit 
    Then the user get the customer ID
    
  @tag2
  Scenario Outline: Generate customer ID
     Given launch the browser and open the url and click add customer 
    When the user navigates to home page and fill the text boxes and submit "<firstname>", "<Lastname>", "<email>", "<address>", "<mobnumber>"
    Then the user get the customer ID

    Examples: 
      | firstname | Lastname | email             |  address      | mobnumber|
      | Raji      | NR       | Rajib@gmail.com   | ladiesHostel |8760156060|
      | Bharani   |  C       | bharani@gmail.com | AnnaNagar    |9095476781|
      | Sasi      |  G       | sasi@gmail.com    | murugankovilStreet|9865632594|
