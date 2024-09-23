Feature: Swag Labs Shopping Cart

  Scenario: User logs into Swag Labs, adds a product to the cart, and verifies it's added
    Given the user is on the Swag Labs login page
    When the user logs in with valid credentials
    Then the user should be redirected to the homepage
    When the user adds a product to the cart
    Then the product should be successfully added to the cart
