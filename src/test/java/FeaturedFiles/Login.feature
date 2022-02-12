Feature: ApplicationLogin
Scenario Outline: Home page login
Given initialize the browser with chrome
And navigate to "https://login.salesforce.com/?locale=in" site
When user enters <username> and <password> and logs in
Then verify that user is successfully signed in

Examples:

|username|    |password|
|test@1.com|  |secure12345|
|test@2.com|  |secure1234|