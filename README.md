# QantasUITest
This repository is for testing the NSW https://www.service.nsw.gov.au/ for some basic scenarios.

The Tech Stack used is as below
Java
Selenium
Cucumber
JavaDoc

Features To Test

Apply for a Number Plate in your preferred RTA

What is Page Object Model (POM)?
Page Object Model is a design pattern which has become popular in test automation for enhancing test maintenance and reducing code duplication. A page object is an object-oriented class that serves as an interface to a page. The tests then use the methods of this page object class whenever they need to interact with the UI of that page, the benefit is that if the UI changes for the page, the tests themselves don’t need to be changed, only the code within the page object needs to change. Subsequently all changes to support that new UI are located in one place.

How to execute the Test
Clone the repo on to the local machine
Setup MavenPath and Java Path
Go into the repo folder and execute the command
mvn clean install
Execute the RunCukesTest file
The browser instance should come up and execute the tests
