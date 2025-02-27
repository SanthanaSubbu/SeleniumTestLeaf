Feature:Create Account in Salesforce
Scenario: To Verify Add Account in Salesforce

When I enter the username as "vidyar@testleaf.com"
When I enter the password as 'Sales@123'
When I click on Login Button
When I click on Toggle Menu Button
And I click on View All option
And I click on Sales option from App Launcher
And I click on Accounts Tab
And I click on New Button
When I enter the account name as 'SFPOMAccount1'
And select ownership as Public
And I click on Save
Then I verify the Accouint Name