package org.example;

import org.junit.jupiter.api.*;

import static org.junit.jupiter.api.Assertions.*;

/**
 * Unit test for simple App.
 */
public class AppTest {

    private Calculator calculator;

    @BeforeAll
    static void setUpForAllTests(){
        System.out.println("Setting up ALL");
    }
    @AfterAll
    static void tearDownForAllTests(){
        System.out.println("Closing up ALL");
    }
    @BeforeEach void setUp(){
        calculator = new Calculator();
        System.out.println("Setting up calculator object for new test");
    }
    @AfterEach void tearDown(){
        System.out.println("This is execution of post condition after each test");
    }

    @Test
    public void checkTwoValuesEquals(){
        //Calculator calculator = new Calculator();
        assertEquals( 4 , calculator.calculateSumOfTwoNumbers(2, 2));
    }

    @Test
    public void checkTwoValuesNotEquals(){
        assertNotEquals( 3 , 4);
    }

    @Test
    public void shouldAnswerWithTrue()
    {
        assertTrue( 3 == 3 );
    }

    @Test
    public void shouldAnswerWithFalse()
    {
        assertFalse( 4 < 2 );
    }


}
