@Functional
Feature: Free CRM Application

@SmokeTest
Scenario: Valid Login
Given User is on login page

@RegressionTest
Scenario: Invalid login
Given User is on login page
When User enters invalid cred

@SmokeTest @RegressionTest
Scenario: Create a task
Given User is on Task page

Scenario: Create a deal
Given User is on Deal page

@SmokeTest
Scenario: Create a contact
Given User is on contact page

@RegressionTest
Scenario: Create a companies
Given User is on company page

@SmokeTest@RegressionTest
Scenario: User logout
Given User click logout





