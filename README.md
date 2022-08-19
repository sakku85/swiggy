# swiggy
Phase  End Project


Swiggy Project
Steps Which I did to complete this project
1.	First I created a maven project named ‘ SwiggyProject ’.
2.	All cucumber related dependencies are added in pom.xml
3.	‘chromedriver.exe’ is added in resource folder.
4.	Created one feature file named ‘food_order.feature’ in Features folder where test scenario is described using Gherkin language.
5.	Created ‘in.swiggy.testscripts’ package 
6.	Created ‘in.swiggy.pages’ package
7.	Created one java class  named ‘ OrderFoodSteps’ to define the steps in food_order.feature file scenario 
8.	Created one TestRunner class where I given connection to feature file and glue code
9.	Used hooks ‘Before After’  which enables to setUp and teardown browser
10.	Created one Driver.Java class file where all objects of page classes are instantiated
11.	Created one Tools.Java class to create static WebDriver  object (driver) 
which is used by all classes by extending this class
12.	Created LandingPage.Java class to locate different webelements in landing page of the Swiggy Application
13.	Created RestaurentPage.java class to locate the webelements in next page where all  restaurents present  with the given location in landing page 
14.	Created AllFoodItemsPage.java class to locate the web elements in next page where all food items are present in selected restaurant
15.	Created CheckOutPage.java class to locate the webelements in checkout page of the application
16.	Created TestNg class to run different test scenarios in in.swiggy.testscripts package
17.	HTML reports are generated.
18.	After the project is successfully executed,it is pushed to gitHub.
19.	Here is my GitHub repository url
20.	https://github.com/sakku85/swiggy.git


Following Are Used To Complete the Project

•	Eclipse as IDE 
•	Java Development Kit Version 8
•	Selenium standalone server Version 3.141.59
•	TestNG
•	Cucumber


Following concepts are Implemented

•	Cucumber (feature file, glue code, Hooks, html reports)
•	Selenium
•	Page Object Model
•	Use a Maven project
•	GitHub(To push the code)
Git Hub Repository Url

1.	https://github.com/sakku85/swiggy.git
the code is in the master branch of this repository

