# Giza System Task - API and GUI Automation Project
  This project automates API tests for the Pet Store API (https://petstore.swagger.io/) 
  GUI tests for a sample web application.
  It uses the following tools and frameworks:
 
 ##### API Testing:
 Java, Maven, TestNG, Rest-Assured.
 ##### GUI Testing:
 Selenium WebDriver, Java, Maven, TestNG.
 
 ### Prerequisites
 Before running the project, ensure the following tools and dependencies are installed:
 
 Java JDK (version 8 or higher)
 
 Eclipse/Intellij IDE (or any other Java IDE)
 
 Maven (for dependency management)
 
 TestNG (for test execution)
 
 ##### Project Setup
 1. Clone the Repository
 Clone this repository to your local machine:
 
          git clone https://github.com/amlosman/GizaSystemTask.git
    
 2. Install Dependencies Maven will automatically download the required dependencies. If not, run the following command in the project root directory:
 
          mvn clean install
 #### Running the Tests
 1. Running API Tests
 To run the API tests, use the following commands:
 
 Run all API tests:
 
           mvn test -Dtest=APITests
 
 2. Running GUI Tests
 To run the GUI tests, use the following commands:
 
 Run all GUI tests:
 
          mvn test -Dtest=LineManagerTests
          
  3. Genetate Report from terminal 
 
          mvn allure:serve      
 
