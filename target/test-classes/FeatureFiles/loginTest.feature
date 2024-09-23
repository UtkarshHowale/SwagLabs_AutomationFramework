Feature: 
  
  Verify user able to login

  Scenario Outline: 
    
    Verify login functionality with entering correct username and password

    Given Navigate to the url "<url>"
    And Enter the username "<username>"
    And Enter the password "<password>"
    And Click on to the login button
    Then Verify the homepage title

    Examples: 
      | url                        | username      | password     |
      | https://www.saucedemo.com/ | standard_user | secret_sauce |
