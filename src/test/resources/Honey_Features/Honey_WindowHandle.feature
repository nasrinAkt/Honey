Feature: This is a feature for multiple window handling

@tag3
Scenario: Verify user cannot submit application
Given open <"URL"> salesforce
Then click on start free trial
Then window handle enter firstname lastname jobtitle email company employee phone country click on box go to parent window
