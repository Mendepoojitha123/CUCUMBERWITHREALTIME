Feature: orangehrm project with pom model

  Scenario Outline: orangehrm with page code and validation code
    Given open edgedriver bowser
    And given orangehrm url
    When enter valid orangehrm credintilas like "<username>" and "<password>"
    And clickon submit button
    Then user navigate to dashbaord page under click on Assign leaves

    Examples: 
      | username | password |
      | Admin    | admin123 |
      | Admin    | admin123 |
