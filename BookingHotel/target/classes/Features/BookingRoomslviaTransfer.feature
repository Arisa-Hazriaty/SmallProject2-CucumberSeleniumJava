@Bookingroomhotel @Development
Feature: Booking Hotel
  User want to checkout Hotel

  #@positiveCase
  #Scenario Outline: Booking Hotel via Transfer as payment method
    #Given The User Login "<email>"  as email, "<password>" as password
    #And The User go to HomePage
    #When The User set "<hotellocation>", select The Hotel Prime, set CheckIn and Checkout
    #And The User search hotel
    #And The User choose how many room input
    #Then The User continue process payment
    #And The User validate Rooms & Summary
    #And The User Confirmation Order via Transfer as payment method
    #Then The User see Order, Total as Order Confirmation
#
    #Examples: 
      #| email                 | password    | hotellocation |
      #| QA-Admin1@getnada.com | P@ssw0rd123 | Aceh          |

  @positiveCase
  Scenario Outline: Booking Hotel via Transfer as payment method
    Given The User Login "<email>"  as email, "<password>" as password
    And The User go to HomePage
    When The User set "<hotellocation>", select The Hotel Prime, set "<checkin>" as date Check In and "<checkout>" as date Check Out
    And The User search hotel
    And The User choose how many room input
    Then The User continue process payment
    And The User validate Rooms & Summary
    And The User Confirmation Order via Transfer as payment method
    Then The User see Order, Total as Order Confirmation

    Examples: 
      | email                 | password    | hotellocation | checkin    | checkout   |
      | QA-Admin1@getnada.com | P@ssw0rd123 | Aceh          | 06-11-2021 | 07-11-2021 |
