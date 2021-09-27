@InvalidRegister @Development
Feature: Invalid Register Account
  User register Invalid Account

  @NegativeCase
  Scenario Outline: User Register Account Application Booking Hotel Dominique Parks but Invalid Data Input
    Given User Open the Homepage
    When User create account "<email>" as Email Address on Login Authentication
    And User input invalid data such as "<firstname>" as firstname, "<lastname>" as lastname, "<password>" as password
    Then User failed to Register and see error notification

    Examples: 
      | email | firstname | lastname | password    |
      | valid |           | Testing  | P@ssw0rd123 |
      | valid | Tester    |          | P@aaw0rd123 |
      | valid |     12345 | Testing  | P@ssw0rd123 |
      | valid | Tester    | Testing  |        1234 |
      | valid | Tester    | Testing  |             |
      | valid | @ris@     | Testing  | P@ssw0rd123 |
      | valid | Tester    | T35t1n9  | P@ssw0rd123 |
