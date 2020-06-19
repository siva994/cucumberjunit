Feature: Testing the functionality of application
@test1
  Scenario Outline: Login feature
    Given user launches the home page
      
#    Then user logins successfully
#      | user   |
#      | <user> |
#
#    And there is "<text>" displayed
#    And the integer 6.4 is displayed
#    And it is 3.4
#
#
#
#    And so and so is done
#      | tt1   |
#      | 28282 |

    Examples:
      |user | pswd |
      |siva | 1234 |
