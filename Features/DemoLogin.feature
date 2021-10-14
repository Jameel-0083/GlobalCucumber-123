Feature: Login into Application

Scenario: Positive test validating login
Given Initialize the browser with chrome
And Navigate to "https://opensource-demo.orangehrmlive.com" Site
When User enters "admin" and "admin123" and logs in
Then Verify that user is succesfully logged in
And Close browser