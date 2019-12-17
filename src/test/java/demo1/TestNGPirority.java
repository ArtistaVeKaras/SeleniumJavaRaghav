package demo1;

import org.testng.annotations.Test;

/*
/Investigate why is only printing one test!!
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
