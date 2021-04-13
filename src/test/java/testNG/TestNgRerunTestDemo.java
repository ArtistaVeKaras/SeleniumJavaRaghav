package testNG;

import org.testng.Assert;
import org.testng.annotations.Test;

public class TestNgRerunTestDemo {

//This should run with a xml file instead of running this class!!
    @Test(priority = 1)
    public void test1(){
        System.out.println("I am inside test one");
    }

    @Test(priority = 2)
    public void test2(){
        System.out.println("I am inside test two");
        int i = 1/0;
    }

    @Test(priority = 3)
    public void test3(){
        System.out.println("I am inside test three");
        Assert.assertTrue(0>1);
    }

}
