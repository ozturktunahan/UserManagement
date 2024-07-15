Feature: User Management

  Scenario Outline: Process multiple users
    Given a user with ID "<id>" and name "<name>"
    When the user is processed
    Then the user should be successfully processed
    And the user's name should be "<name>"

    Examples:
      | id | name             |
      | 1  | Tuna Han Ozturk  |
      | 2  | Zeynep Ozarslan  |
      | 3  | Gamze Ozcelik    |
      | 4  | Erman Kaygusuzer |

  Scenario Outline: Process user with missing ID
    Given a user with ID "" and name "<name>"
    When the user is processed
    Then the user should not be successfully processed
    Examples:
      | id | name             |
      |    | Tuna             |

  Scenario Outline: Process user with missing name
    Given a user with ID "<id>" and name ""
    When the user is processed
    Then the user should not be successfully processed
    Examples:
      | id | name             |
      | 5  |                  |
