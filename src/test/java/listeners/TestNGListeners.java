package listeners;

import org.testng.ISuiteListener;
import org.testng.ITestNGListener;
import org.testng.ITestResult;

public class TestNGListeners implements ITestNGListener, ISuiteListener {
   /*/
   https://javadoc.jitpack.io/com/github/cbeust/testng/master/javadoc/org/testng/ITestListener.html
   https://testng.org/doc/documentation-main.html#logging-listeners
        Listeners are interfaces in TestNG library
    How to use TestNG listeners
    Step 1
    Create a new package and new Class
    Step 2
    Implement ITestListener interface
    public class TestNGListener implements ITestListener
    Step 3
    Add unimplemented methods of ITestListener interface
    Step 4
    Create a Demo class and provide annotation
    @Listeners(packageName.ClassName)
    Step 5
    Run and validate
    How to use at Suite Level (multiple classes)
    Step 1
    Create testng.xml file
    Step 2
    Define listeners in testng.xml file
    Step 3
    Run and validate
    Adding more listeners from TestNG
    You can implement more listener interfaces in your existing class and add implemented methods
        */
   //adding unimplemented methods of the interfaces
   public void onTestStart(ITestResult result){
       System.out.print("**********************Test Started *********************"+result.getName());
   }
   public void onTestFailure(ITestResult result){
      System.out.print("**********************Test Failed *********************"+result.getName());
   }
   public void onTestSkipped(ITestResult result){
      System.out.print("**********************Test Test Skipped *********************"+result.getName());
   }
   public void onTestFailedButWithSuccessPercentage(ITestNGListener result) {
   }
   public void onFinish(ITestResult context) {
      System.out.print("**********************Tests Completed *********************"+context.getName());
   }
}
