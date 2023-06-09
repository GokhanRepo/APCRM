@wip @APCRM-439
Feature: Top-page search bar functionality and verification
  User Story:
  As a user, I should be able to find people, documents and more by using top-page search bar;
  so that I can access the searched data

  Acceptance Criteria:
  1. User can see conversations
  2. User can find items related to written keyword
  3. User can find groups

  # Accounts are: marketing, helpdesk, hr

  Background: For the scenarios in the feature file, user is expected to be logged in
    Given user is on the activity stream page

#AC1

  @APCRM-436
  Scenario: User can see conversations
    When user enters "hr1@cybertekschool.com" into the top-page search bar
    And user clicks on "hr1@cybertekschool.com" in the conversations section
    Then user should see conversation about "hr1@cybertekschool.com" in the result page

#AC2

  @APCRM-437
  Scenario: User can find items related to written keyword
    When user enters "Quote.docx" into the top-page search bar
    And user clicks on "Quote.docx" in the other section
    Then user should see "Quote.docx" in the result page

#AC3

  @APCRM-438
  Scenario: User can find groups
    When user enters "Technology" into the top-page search bar
    And user clicks on "Technology" in the groups section
    Then user should see "Technology" workgroup in the result page

