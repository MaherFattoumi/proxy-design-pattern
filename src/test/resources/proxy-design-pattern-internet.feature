Feature: Proxy Internet

  Scenario: Connect to allowed website
    Given an internet proxy
    When connecting to "example.com"
    Then connection to "example.com" is successful

  Scenario: Connect to blocked website
    Given an internet proxy
    When connecting to "facebook.com"
    Then connection to "facebook.com" is blocked
