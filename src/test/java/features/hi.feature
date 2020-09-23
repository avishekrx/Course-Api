Feature: Validate the Hi response

Scenario: Validate the Hi
  Given The Client makes call to hi api using GET method
  When The client calls the api
  Then The client receives success status code of 200
  
