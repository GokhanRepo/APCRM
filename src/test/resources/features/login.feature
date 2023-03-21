@Regression @login
Feature: apcrm app login functionality and verification
  User Story:
  As a user, I should be able to login with correct credentials to different
  accounts. And activity stream page should be displayed.

  Accounts are: marketing, helpdesk, hr

  Background: For the scenarios in the feature file, user is expected to be on login page
    Given user is on the apcrm login page

  @marketing
  Scenario Outline: Login as marketing
    When user enters "<username>" username
    And user enters "<password>" password
    Then user should see the activity stream page

    Examples:
      | username                       | password |
      | marketing10@cybertekschool.com | UserUser |
      | marketing99@cybertekschool.com | UserUser |


  @helpdesk
  Scenario Outline: Login as helpdesk
    When user enters "<username>" username
    And user enters "<password>" password
    Then user should see the activity stream page

    Examples:
      | username                      | password |
      | helpdesk10@cybertekschool.com | UserUser |
      | helpdesk99@cybertekschool.com | UserUser |


  @hr
  Scenario Outline: Login as hr
    When user enters "<username>" username
    And user enters "<password>" password
    Then user should see the activity stream page

    Examples:
      | username                | password |
      | hr10@cybertekschool.com | UserUser |
      | hr99@cybertekschool.com | UserUser |



#this is a comment
