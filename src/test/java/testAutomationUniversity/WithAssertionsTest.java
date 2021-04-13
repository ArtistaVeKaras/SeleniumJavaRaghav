package testAutomationUniversity;

import org.testng.annotations.Test;

import static org.testng.AssertJUnit.assertEquals;

public class WithAssertionsTest {


    @Test
    public static void firstAssertion(){
        assertEquals(2,2);
    }

    @Test
    public static void secondAssertion(){
        assertEquals(45,45);
    }
}
