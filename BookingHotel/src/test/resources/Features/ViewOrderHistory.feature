@orderhistory @Development @Arisa
Feature: See Order History
  The User want to see Order History

  @positivecase
  Scenario Outline: See Order History
    Given The User Logged "<username>"  as email, "<pass>" as password
    When The User choose Order History and Details
    Then The User verified order history

    Examples: 
      | username              | pass        |
      | QA-Admin1@getnada.com | P@ssw0rd123 |
