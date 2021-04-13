package testNG;

import org.testng.annotations.Ignore;
import org.testng.annotations.Test;

//This will ignore all test at the class level. No test should run!!
@Ignore
public class TestNGIgnoreDemo {

    @Test
    public void test1(){
        System.out.print("This is the Test one ");
    }

    @Test
    public void test2(){
        System.out.print("This is the Test two ");
    }
}
