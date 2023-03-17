@Regression @login
Feature: apcrm app login functionality and verification
  User Story:
  As a user, I should be able to login with correct credentials to different
  accounts. And activity stream page should be displayed.

  Accounts are: marketing, helpdesk, hr

  Background: For the scenarios in the feature file, user is expected to be on login page
    Given user is on the apcrm login page

  @marketing @employee
  Scenario: Login as marketing
    When user enters "marketing" username
    And user enters "marketing" password
    Then user should see the activity stream page

  @helpdesk @employee
  Scenario: Login as helpdesk
    When user enters "helpdesk" username
    And user enters "helpdesk" password
    Then user should see the activity stream page

  @hr @employee
  Scenario: Login as hr
    When user enters "hr" username
    And user enters "hr" password
    Then user should see the activity stream page

#this is a comment