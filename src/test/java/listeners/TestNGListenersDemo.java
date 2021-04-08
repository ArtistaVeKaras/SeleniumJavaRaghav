package listeners;

import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

//referencing the TestNG class
@Listeners(listeners.TestNGListeners.class)
public class TestNGListenersDemo {

    @Test
    public void test1(){
      System.out.print("I am inside test one");
    }
    @Test
    public void test2(){
        System.out.print("I am inside test two");
    }
    @Test
    public void test3(){
        System.out.print("I am inside test three");

    }
}
