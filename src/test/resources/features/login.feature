@APCRM-440 @Regression @smoke @login
Feature: apcrm app login functionality and verification

  User Story: As a user, I should be able to login with correct credentials to different accounts. And activity stream page should be displayed.

  Accounts are: marketing, helpdesk, hr

  Background: For the scenarios in the feature file, user is expected to be on login page
    Given user is on the apcrm login page


  @APCRM-441 @hr
  Scenario Outline: Login as hr
    When user enters "<username>" username
    And user enters "<password>" password
    And user clicks on login button
    Then user should see the activity stream page

    Examples:
      | username                | password |
      | hr1@cybertekschool.com  | UserUser |
      | hr10@cybertekschool.com | UserUser |


  @APCRM-442 @helpdesk
  Scenario Outline: Login as helpdesk
    When user enters "<username>" username
    And user enters "<password>" password
    And user clicks on login button
    Then user should see the activity stream page

    Examples:
      | username                      | password |
      | helpdesk10@cybertekschool.com | UserUser |
      | helpdesk99@cybertekschool.com | UserUser |

  @APCRM-443 @marketing
  Scenario Outline: Login as marketing
    When user enters "<username>" username
    And user enters "<password>" password
    And user clicks on login button
    Then user should see the activity stream page

    Examples:
      | username                       | password |
      | marketing10@cybertekschool.com | UserUser |
      | marketing99@cybertekschool.com | UserUser |

  @APCRM-444 @hr @helpdesk @marketing
  Scenario Outline: Login fails with invalid credentials
    When user enters "<username>" username
    And user enters "<password>" password
    And user clicks on login button
    Then user should see "Incorrect login or password" message

    Examples:
      | username                       | password |
      | marketing@cybertekschool.com   | UserUser |
      | marketing99@cybertekschool.com | AbcZxy   |

#  @APCRM-449 @hr @helpdesk @marketing
#  Scenario: Users should not be able to try to login after 5 tries with invalid credentials.
#    When user enters "abc@xyz.com" username
#    And user enters "AbcZxy" password
#    And user clicks on login button
#    Then user should see "Incorrect login or password" message
#    When user enters "abc@xyz.com" username
#    And user enters "AbcZxy" password
#    And user clicks on login button
#    Then user should see "Incorrect login or password" message
#    When user enters "abc@xyz.com" username
#    And user enters "AbcZxy" password
#    And user clicks on login button
#    Then user should see "Incorrect login or password" message
#    When user enters "abc@xyz.com" username
#    And user enters "AbcZxy" password
#    And user clicks on login button
#    Then user should see "Incorrect login or password" message
#    When user enters "abc@xyz.com" username
#    And user enters "AbcZxy" password
#    And user clicks on login button
#    Then user should see "Incorrect login or password" message
##    But user should see "Please try again after one minute" message after 5 tries

































#this is a comment
