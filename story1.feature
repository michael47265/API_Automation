Feature: user enters two integers in google
  In order to test addition and subtraction
  I create two scenarios, one for add and one for sub

Scenario: First sum
Given I go to google
When I enter two integers "2" and "3" and hit enter
Then the sum of "5" appears

Scenario: Second sum
Given I go to google
When I enter two integers "3" and "3" and hit enter
Then the sum of "5" appears