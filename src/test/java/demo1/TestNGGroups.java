package demo1;

import org.testng.annotations.Test;

//when the groups is define at the class level all tests will be included
@Test(groups = { "AllTestGroups" })
public class TestNGGroups {

/*
    What is Grouping
    Why to create Groups
    How to create test Groups
    How to run tests from groups
    How to include / exclude groups
    How to create MetaGroups
    How to use regular expression
    How to define groups at class level

    What is Grouping
    Grouping is a feature in TestNG where we can assign tests
    or classes to one or more group.
    During execution, we can define what groups to include or exclude
    This makes test management and execution very easy and efficient
 */
    @Test(groups = { "sanity" })
    public void test1() {
        System.out.println("This is test one");
    }

    @Test(groups = { "sanity", "regression" })
    public void test2() {
        System.out.println("This is test two");
    }

    @Test(groups = { "smoke", "sanity" })
    public void test3() {
        System.out.println("This is test three");
    }

    public void test4() {
        System.out.println("This is test four");
    }
}


//~ Formatted by Jindent --- http://www.jindent.com
