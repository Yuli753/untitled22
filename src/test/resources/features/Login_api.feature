Feature: Login API - Placeholder Test

  Scenario: Successful GET request
    When I send a GET request to "https://jsonplaceholder.typicode.com/posts/1"
    Then the response status code should be 200