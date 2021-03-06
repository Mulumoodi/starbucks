


package starbucks ;


import static org.junit.Assert.*;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

/**
 * The test class KeyPadPressTest.
 *
 * @author  (your name)
 * @version (a version number or a date)
 */
public class KeyPadPressTest
{
    KeyPad kp ;

    /**
     * Default constructor for test class KeyPadPressTest
     */
    public KeyPadPressTest()
    {
    }

    /**
     * Sets up the test fixture.
     *
     * Called before every test case method.
     */
    @Before
    public void setUp()
    {
        kp = new KeyPad() ;
    }


    @Test
    public void testOne()
    {
        // Press 1

        // Assertion (Replace with appropriate test)
        kp.touch(1,5);
        assertEquals("1", kp.lastKey());
        //assertTrue( false );
    }

   @Test
    public void testTwo()
    {
        // Press 2

        // Assertion (Replace with appropriate test)
        kp.touch(2,5);
        assertEquals("2", kp.lastKey());
        //assertTrue( false );
    }

   @Test
    public void testThree()
    {
        // Press 3

        // Assertion (Replace with appropriate test)
        kp.touch(3,5);
        assertEquals("3", kp.lastKey());
        //assertTrue( false );
    }

   @Test
    public void testFour()
    {
        // Press 4

        // Assertion (Replace with appropriate test)
        kp.touch(1,6);
        assertEquals("4", kp.lastKey());
        //assertTrue( false );
    }

   @Test
    public void testFive()
    {
        // Press 5

        // Assertion (Replace with appropriate test)
        //assertTrue( false );
        kp.touch(2,6);
        assertEquals("5", kp.lastKey());
    }

   @Test
    public void testSix()
    {
        // Press 6

        // Assertion (Replace with appropriate test)
        //assertTrue( false );
        kp.touch(3,6);
        assertEquals("6", kp.lastKey());
    }

   @Test
    public void testSeven()
    {
        // Press 7

        // Assertion (Replace with appropriate test)
        //assertTrue( false );
        kp.touch(1,7);
        assertEquals("7", kp.lastKey());
    }

   @Test
    public void testEight()
    {
        // Press 8

        // Assertion (Replace with appropriate test)
        //assertTrue( false );
        kp.touch(2,7);
        assertEquals("8", kp.lastKey());
    }

   @Test
    public void testNine()
    {
        // Press 9

        // Assertion (Replace with appropriate test)
        //assertTrue( false );
        kp.touch(3,7);
        assertEquals("9", kp.lastKey());
    }

   @Test
    public void testZero()
    {
        // Press 0

        // Assertion (Replace with appropriate test)
        kp.touch(2,8);
        assertEquals("0", kp.lastKey());
        //assertTrue( false );
    }

   @Test
    public void testBackspace()
    {
        // Press Backspace

        // Assertion (Replace with appropriate test)
        //assertTrue( false );
        kp.touch(3,7);
        kp.touch(3,8);
        assertEquals("X", kp.lastKey());
    }

   @Test
    public void testNoKey()
    {
        // Press Empty Key

        // Assertion (Replace with appropriate test)
        kp.touch(2,8);
        assertEquals("0", kp.lastKey());
    }



    /**
     * Tears down the test fixture.
     *
     * Called after every test case method.
     */
    @After
    public void tearDown()
    {
    }
}
