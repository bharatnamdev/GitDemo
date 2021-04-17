Feature: Search and place orders for vegetables


Scenario: Search for items and validate results
Given User is on Greencart landing page
When User search for "Cucumber" vegetable
Then "Cucumber" results are displayed

