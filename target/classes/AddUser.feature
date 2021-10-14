Feature: Creating/adding a new user

Scenario: Positive test validating Creating/adding a new user
Given Initialize the browser with chrome
And Navigate to "https://opensource-demo.orangehrmlive.com" Site
When User enters "admin" and "admin123" and logs in
Then Verify that user is succesfully logged in
Then User clicks on Admin
Then User clicks on Add User
Then Add User details Successfully
Then Verify that a user is added successfully
And Close browser