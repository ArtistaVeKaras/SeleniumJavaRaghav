package testNG;

import org.testng.annotations.Test;

/*
/Investigate why is only printing one test!!

@Test(priority=1)
What if two test methods have same priority
- Will run as per alphabetical order
- If No priority then alphabetical order

What if a class has both prioritised and non-prioritised methods
- First non-prioritised methods will be executed in alphabetical order
 */
public class TestNGPirority {

    @Test(priority = 1)
    public void test1(){
        System.out.println("Printing test one");
    }
    @Test(priority = 2)
    public void test2(){
        System.out.println("Printing test two");
    }
    @Test(priority = 3)
    public void test3(){
        System.out.println("Printing test three");
    }
}
