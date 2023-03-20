@Regression @login
Feature: apcrm app login functionality and verification
  User Story:
  As a user, I should be able to login with correct credentials to different
  accounts. And activity stream page should be displayed.

  Accounts are: marketing, helpdesk, hr

  Background: For the scenarios in the feature file, user is expected to be on login page
    Given user is on the apcrm login page

  @marketing @employee
  Scenario Outline: Login as marketing
    When user enters "<username>" username
    And user enters "<password>" password
    Then user should see the activity stream page

    Examples:
      | username                       | password |
      | marketing10@cybertekschool.com | UserUser |
      | marketing99@cybertekschool.com | UserUser |


  @helpdesk @employee
  Scenario Outline: Login as helpdesk
    When user enters "<username>" username
    And user enters "<password>" password
    Then user should see the activity stream page

    Examples:
      | username                      | password |
      | helpdesk10@cybertekschool.com | UserUser |
      | helpdesk99@cybertekschool.com | UserUser |


  @hr @employee
  Scenario Outline: Login as hr
    When user enters "<username>" username
    And user enters "<password>" password
    Then user should see the activity stream page

    Examples:
      | username                | password |
      | hr10@cybertekschool.com | UserUser |
      | hr99@cybertekschool.com | UserUser |



#this is a comment

#
#  @marketing @employee
#  Scenario: Login as marketing
#    When user enters "marketing" username
#    And user enters "marketing" password
#    Then user should see the activity stream page
#
#  @helpdesk @employee
#  Scenario: Login as helpdesk
#    When user enters "helpdesk" username
#    And user enters "helpdesk" password
#    Then user should see the activity stream page
#
#  @hr @employee
#  Scenario: Login as hr
#    When user enters "hr" username
#    And user enters "hr" password
#    Then user should see the activity stream page