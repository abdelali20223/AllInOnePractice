Feature:
  @post
  Scenario: post new product
    Given user store the post data
    When user post the data
    Then user verify the title is "abc"