@Regression @login
Feature: Top-page search bar functionality and verification
  User Story:
  As a user, I should be able to find people, documents and more by using top-page search bar;
  so that I can access the searched data

  Accounts are: marketing, helpdesk, hr

  Background: For the scenarios in the feature file, user is expected to be logged in
    Given user is on the activity stream page


  @marketing @helpdesk @hr
  Scenario: Search for people
    When user enters "Mario Luigi" into the top-page search bar
    Then user should see "Mario Luigi" in the search result


  @marketing @helpdesk @hr
  Scenario: Search for documents
    When user enters "Quote.docx" into the top-page search bar
    Then user should see "Quote.docx" in the search result



  @marketing @helpdesk @hr
  Scenario: Search for groups
    When user enters "Technology" into the top-page search bar
    Then user should see "Technology" workgroup in the search result

  #PR and advertising is not in the result because it is private ?????