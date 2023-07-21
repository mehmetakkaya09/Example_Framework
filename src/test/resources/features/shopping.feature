Feature: Shopping
  User Story :

  User should be able to purchase an item

  Scenario Outline: positive test scenario for purchase

    When user writes "rings" in the search box
    And user clicks search button
    And user selects "<ringName>"
    And user is on the "<title>"
    And user selects material as "<material>"
    And user selects ring size as "<size>"
    And user clicks add button
    Then verify that "<ringName>" item is on the cart

    Examples:
      | ringName                         | title                           | material          | size |
      | Ruby Ring - Ruby Engagement Ring | Ruby Ring  Ruby Engagement Ring | PT950 Platinum    | 3 US |
      | 3.0 CT Pear Cut Engagement Ring  | 3.0 CT Pear Cut Engagement Ring | 18K W + Lab Grown | 4 US |