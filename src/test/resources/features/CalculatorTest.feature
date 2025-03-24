@all
Feature: Calculator operations

  @wip
  Scenario: Should add two positive numbers
    Given my calculator is running
    When I add 1 and 2
    Then the result should be equal to 3

  @wip2
  Scenario: Should subtract two positive numbers
    Given my calculator is running
    When I subtract 3 and 1
    Then the result should be equal to 2
