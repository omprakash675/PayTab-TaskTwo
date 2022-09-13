Feature: Task Two
  @log
  Scenario: Logging into the URL
    Given Entering the url "https://opensource-demo.orangehrmlive.com/web/index.php/auth/login"
    And Entering the username "Admin" and password "admin123"
    Then logging into the profile
    
  @employeeDetails
  Scenario: Fetching employee details
    Given Getting all details 
    And Searching them by emp id "123" and validating them
    
  @creatingEmployeeDetails
  Scenario: Creating employee details
    Given Selecting and adding the requird details first name "Prasanth" last name "S" Middle name "Jai" and emp id
    And Saving the created detail
    Then Validating the detail
    
  @addJobDetail
  Scenario: Adding the Job Details
    Given Entering into the job details
    And Editing the job details
    Then Saving the details
    
  @deleteEmployeeDetails
  Scenario: Deleting employee details
    Given Getting details for deleting 
    And Searching them by emp id 123 and validating the delete