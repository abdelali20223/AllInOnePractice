Feature: get all products

  Scenario: user able to get all products
    Given user send the request
    When user get the response
    Then verify status code is 200