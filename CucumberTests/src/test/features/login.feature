Feature: Login Action

  @Smoke
  Scenario Outline: Successful Login with Valid Credentials
    Given User is on Home Page
    When User Navigate to LogIn Page
    And User enters username "<UserName>" and password "<Password>"
    Then Message displayed Login Successfully

    Examples:
    |UserName|Password|
    |        |        |

  @Test
  Scenario: Successful LogOut
    When User LogOut from the Application
    Then Message displayed LogOut Successfully
