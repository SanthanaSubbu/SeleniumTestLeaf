Feature:Create Account in Salesforce
Scenario: To Verify Add Account in Salesforce
Given Launch the browser 
And I launch the URL "https://login.salesforce.com/"
When I enter the credentials "vidyar@testleaf.com" and "Sales@123"
When I click on Login Button
And I click on Toggle Menu Button
And I click on View All option
And I click on Sales option from App Launcher
And I click on Accounts Tab
And I click on New Button
When I enter the account name
And select ownership as Public
And I click on Save
Then I verify the Accouint Name

