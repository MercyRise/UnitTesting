import org.junit.Ignore;
import org.junit.Test;

import static org.junit.Assert.*;

public class UnitTest1Test {

    @Test
    public void test(){
        UnitTest1 test = new UnitTest1();

        int result = test.addNumber(5, 2);

        assertEquals(7, result);
    }

    @Test
    public void testString(){
        UnitTest1 test2 = new UnitTest1();
        String result2 = test2.addString("Baron", "Mukenyi");

        assertEquals("Baron", result2);
    }

    @Test
    public void testName(){
        UnitTest1 test3 = new UnitTest1();
        test3.name = "Baron";
        UnitTest1 test2 = test3;

        assertSame(test2, test3);
    }

    @Ignore("Please ignore test...")
    @Test(timeout = 1000)
    public void testMultiplication(){
        UnitTest1 test4 = new UnitTest1();
        long result = test4.multiplyNum(5, 7);

        assertTrue(true);
    }
}