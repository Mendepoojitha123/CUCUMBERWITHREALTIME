Feature: demoguru login Functionality

  Scenario Outline: demoguru login Functionality with multiple data
    Given open browser
    And user on the login page
    When user enter "<username>" and "<password>"
    And user click on login button
    Then user on the demoguru page

    Examples: 
      | username | password |
      | mercury  | mercury  |
      | mercury  | mercury  |
