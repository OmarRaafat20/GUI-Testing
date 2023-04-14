this FrameWork is Build using the Following :


The programming language is Java and the testing framework is TestNG.
and I used Maven to manage all the project's dependencies, and GitHub for version control.

The Design Pattern used is (POM) Page Object Model, and the data is hard coded; however, hard coding the data is not recommended; instead, I should use Apache POI Dependencies and Excel Files, to read it from Excel.XLS File

Extent Reports for detailed reporting because it's a very important component of any framework, in the Report you will find that every Method is logged with its name to know that it's implemented.

Also take screenshots for failed test cases, and attach screenshots to automation reports also.

framework is very modular, and I have created page classes for all the common components, not just for particular pages.

If there is something common which occurs in different pages, then create a Page Object for that also so that different Test Classes can make use of it. To avoid all the redundancy



RUN Steps :

Go To testng.
