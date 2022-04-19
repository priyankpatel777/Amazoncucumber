Feature: Validate Login Page for Amazon Application


Scenario Outline: Validating Login Page for Valid users
Given User invoking the browser
And Navigate to the Amazon Home Page
When User accept cookies and click on Signin Option
Then Amazon Login Page is displayed 
When User enter <username> and <password> into the fields
And Click on Sign in button
Then Amazon Account home page is displayed for valid user
When User click on All option 
And Click signOut option 
Then User Sucessfully Signout
Examples:

|username				 |password   |
|priyankpatel48@yahoo.com|shankerji48|
|shekhapatel@ymail.com   |shankerji48|
