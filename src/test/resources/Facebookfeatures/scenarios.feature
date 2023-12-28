#Author
#Date
#Descriptions
Feature: Facebook login credintilas demo

  Scenario Outline: valid and invalid creitials scenarios
    Given open edgedriver
    And uesr on facebook homepage
    When user enters facebook valid and inavlid "<username>" and "<password>"
    And user click on facebook login button
    Then finally user navigate to stories page in facebook

    Examples: 
      | username                        | password     |
      | lalithamamillapalli13@gmail.com | 13august1998 |
      | userpooja                       | userpooja123 |
