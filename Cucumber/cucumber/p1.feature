Feature: working on amazon

  Scenario: opening amazon page
   Given open home page
   When enter <uname> and <Password>
   Then click button 
   And navigate to home page
   
   Examples:
   |uname  |Password|
   |virat  |kohli|