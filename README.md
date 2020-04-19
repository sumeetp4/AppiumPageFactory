# AppiumPageFactory
This is sample example of Appium with TestNG and Page Factory

There is BaseClass which has DesiredCapabilities and driver initialization

BasePage contains PageFactory initialization

All other Pages extend BasePage and will have elements and methods

TestClass will extend the BaseClass

testng.xml contains the test class which needs to run

pom.xml contains the dependencies needed for execution
