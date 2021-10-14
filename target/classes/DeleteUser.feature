Feature: Deleting Created user

Scenario: Positive test validating Deleting Created user
Given Initialize the browser with chrome
And Navigate to "https://opensource-demo.orangehrmlive.com" Site
When User enters "admin" and "admin123" and logs in
Then Verify that user is succesfully logged in
Then User clicks on Admin
Then Delete user
Then Check if the user deleted successfully
And Close browser