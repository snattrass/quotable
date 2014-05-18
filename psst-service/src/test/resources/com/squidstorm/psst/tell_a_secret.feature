Feature: Tell a Secret

#  Scenario: Tell a Secret
#    Given I am a registered user
#    When I tell a secret
#    Then I should receive a response

  Scenario: List secrets
    Given the system knows about the following secrets:
      | owner               | recipient           | secret          |
      | foobar@example.com  | jsmith@example.com  | the sky is blue |
      | foobar@example.com  | jsmith@example.com  | grass is green  |
      | foobar@example.com  | jsmith@example.com  | I work for Mi5  |
    When the client requests GET /secrets
    Then the response should be JSON
      """
      [
        {"owner": "foobar@example.com", "recipient": "jsmith@example.com". "secret:", "the sky is blue"},
        {"owner": "foobar@example.com", "recipient": "jsmith@example.com". "secret:", "grass is green"},
        {"owner": "foobar@example.com", "recipient": "jsmith@example.com". "secret:", "I work for Mi5"}
      ]
      """
