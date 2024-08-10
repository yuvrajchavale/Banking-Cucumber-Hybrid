@Scenario
Feature: Validate Primus Banking Login
@TestSteps
Scenario Outline: As admin i want to Login with Different Username & Password
Given launch browser with this url "http://primusbank.qedgetech.com/"
When wait for username with "name" and "txtuId" and "Admin"
When enter the username with "name" and "txtuId" and "Admin"
When enter the password with "name" and "txtPword" and "Admin"
When click on login button with "name" and "login"
Then wait for logout button with "xpath" and "//a[@href='http://primusbank.qedgetech.com']"
When click on logout button with "xpath" and "//a[@href='http://primusbank.qedgetech.com']"
Then close browser 

Examples:
|username|password|
|Admin|Admin|
|Admin|admin|
|222|Admin|