package listeners;

import org.junit.Assert;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;


//referencing the TestNG class
@Listeners(TestNGListeners.class)
public class TestNGListenersDemo1 {

    @Test
    public void test4(){
      System.out.print("I am inside test one");
    }
    @Test
    public void test5() {
        System.out.print("I am inside test two");
        Assert.assertFalse(false);
    }
    @Test
    public void test6(){
        System.out.print("I am inside test three");

    }
}
