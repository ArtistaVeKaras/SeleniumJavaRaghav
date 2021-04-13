package testNG;

import org.testng.annotations.Test;

public class TestNGDependenciesDemo {

    @Test(dependsOnMethods = {"test2"} , priority = 2)
    public void test1(){
        System.out.print("I ma inside test 1");
    }

    @Test(dependsOnMethods = {"test3"} , priority = 3)
    public void test2(){
        System.out.print("I ma inside test 2");
    }

    @Test (priority = 1)
    public void test3(){
        System.out.print("I ma inside test 3");
    }

    //this will print all the groups that are depend on the Sanity1 
    @Test(dependsOnGroups = {"Sanity1"})
    public void testGroups(){
        System.out.print("This test depends on group tests!!");
    }

    @Test(groups = "Sanity1")
    public void sanityGroup(){
        System.out.print("this will print the Group Sanity");
    }
}
