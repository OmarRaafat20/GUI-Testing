this FrameWork is Build using the Following :


The programming language is Java and the testing framework is TestNG.

and I used Maven to manage all the project's dependencies, and GitHub for version control.

The Design Pattern used is (POM) Page Object Model,
and the data is hard coded; however, hard coding the data is not recommended; instead,
I should use Apache POI Dependencies and Excel Files, to read it from Excel.XLS File

Extent Reports for detailed reporting because it's a very important component of any framework,
 in the Report you will find that every Method is logged with its name to know that it's implemented.

Also take screenshots for failed test cases, and attach screenshots to automation reports also.

framework is very modular, and I have created page classes for all the common components,
not just for particular pages.

If there is something common which occurs in different pages,
then create a Page Object for that also so that different Test Classes can make use of it. To avoid all the redundancy

-------------------------------------------------


each Page Has its Own Classes and interfaces in the Page events I defined the Methods that I will Call in the Test Class its under the test.java Folder ,

and in the Page Objects I defined all the locators for each Page , and i created a Constant Interface That has all the Locators

for WebElement and Web elements in order to call it directly in the Classes.

I called all the Methods in on Test Class : SignUpTest

-------------------------------------------------
RUN Steps :
Go To testng.xml file and right Click on it and click on Run
--------------------------------------------------------------------------------------------------

APIS

In this example, we have three test cases:

1	testLoginEndpoint(): This test case sends a POST request to the login endpoint with the provided body,
    and checks that the response has a status code of 200 and a non-null token in the body.

2	testWhoAmIEndpoint(): This test case first logs in to the system by calling the loginAndGetToken() method,
    and then sends a GET request to the whoami endpoint with the token in the header.
    It checks that the response has a status code of 200 and the email in the body matches the email used to log in.

3	testUnauthorizedAccessToWhoAmIEndpoint(): This test case sends a GET request to the whoa-mi endpoint without logging in first.
    It checks that the response has a status code of 401, indicating unauthorized access.
    Note that the loginAndGetToken() method is used to log in to the system and extract the token from
    the response, which is then used in the testWhoAmIEndpoint() test case.
    This approach ensures that we don't have to repeat the login code in every test case that requires authentication.

