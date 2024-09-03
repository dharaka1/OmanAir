@tag
Feature: Oman Air

  @tag1
  Scenario: Oman Air Process
     Given User launch "<Browsers>"
    When Launch The Url 
    When Enter From Address
    When Enter To Address
    When Choose the date
    Then choose no of passangers
    
    

    Examples: 
     | Browsers    |No Adults| No of childrens|
     | Chrome      |   8     |  1             |
     |  edge       |   8     |  1             |
     | FireFox     |   8     |  1             |