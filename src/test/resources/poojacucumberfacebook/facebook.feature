Feature: facebook login credentials with multiple data

  Scenario Outline: valid and invalid credentials scenarios
    Given open chromedriver
    And user on the facebook page
    When user enters facebook valid and invalid credentials "<username>" and "<password>"
    And user on the login button
    Then navigate to facebook icon

    Examples: 
      | username                        | password     |
      | lalithamamillapalli13@gmail.com | 13august1998 |
      | poojitha                        | pooja123     |

      