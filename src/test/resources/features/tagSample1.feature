@EndToEnd
Feature: Google Page test

Background: Open Google
Given User is in google page

Scenario: Search Java text
Given User search Java Text

@SmokeTest
Scenario: Search Selenium text
Given User search Selenium Text


@RegressionTest
Scenario: Search Cucumber text
Given User search Cucumber Text