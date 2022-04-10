@reqresin
Feature: Reqresin

  @get-user
  Scenario: Success GET users
    When user send GET Users request to reqresin
    Then response status code should be 200
    And response structure should match json schema "users.json"

  @get-singleuser @positive
  Scenario: Success GET single user
    When user send GET single user request to reqresin
    Then response status code should be 200
    And response structure should match json schema "singleuser.json"


  @post-login @positif
  Scenario: Success POST login
    When user send POST login request to reqresin with body json "success-login.json"
    Then response status code should be 200
    And response structure should match json schema "login.json"

  @post-login @negatif
  Scenario: Failed POST login
    When user send POST login request to reqresin with body json "failed-login.json"
    Then response status code should be 400

  @put-update
  Scenario: Success PUT update
    When user send PUT Update request to reqresin
    Then response status code should be 200
    And response structure should match json schema "update-user.json"

  @post-register @positive
  Scenario: Post Register
    When user send POST Register request to reqresin
    Then response status code should be 200
    And response structure should match json schema "register.json"

  @post-register @negative
  Scenario: Failed POST register
    When user send POST register request to reqresin with body json "failed-register.json"
    Then response status code should be 400

  @get-singleusernotfound @negative
  Scenario: Failed GET single user
    When user send GET single user request to reqresin with body json "failed-singleuser.json"
    Then response status code should be 404

  @get-list
  Scenario: Success GET List
    When user send GET List request to reqresin
    Then response status code should be 200
    And response structure should match json schema "list.json"

  @get-single
  Scenario: Success GET Single
    When user send GET Single request to reqresin
    Then response status code should be 200
    And response structure should match json schema "single.json"

  @get-delayed
  Scenario: Success GET Delayed
    When user send GET Delayed request to reqresin
    Then response status code should be 404
    And response structure should match json schema "delayed.json"