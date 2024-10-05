this Framework is Build using the Following :

The programming language is Java and the testing framework is TestNG.
and I used Maven to manage all the project's dependencies, and GitHub for version control.
The Design Pattern used is (POM) Page Object Model,and the data is hard coded; however, hard coding the data is not recommended; instead,I should use Apache POI Dependencies and Excel Files, to read it from Excel.XLS File
Extent Reports for detailed reporting because it's a very important component of any framework, in the Report you will find that every Method is logged with its name to know that it's implemented.
Also take screenshots for failed test cases, and attach screenshots to automation reports also.
framework is very modular, and I have created page classes for all the common components, not just for particular pages.
If there is something common which occurs in different pages,then create a Page Object for that also so that different Test Classes can make use of it. To avoid all the redundancy.

It Was Very Challenging but I enjoyed doing it :D 


This is what the Script do : 

1-  Open https:www.amazon.eg and login 
2- Open “All” menu from the left side 
3- Click on “video games” then choose “all video games”
4- from the filter menu on the left side add filter “free shipping” & add the filter of condition “new”
5- on the right side open the sort menu then sort by price: high to low
6- add all products below that its cost below 15k EGP, if no product below 15k EGP move to next page
7- make sure that all products is already added to carts
8- add address and choose cash as a payment method


What I used (Different Locators, Scroll By and Scroll To Element, Different Waits, Assertions, Loops, Opening and Closing Tabs, Move Between Tabs, Handling Different Exceptions (Try, Catch) 
