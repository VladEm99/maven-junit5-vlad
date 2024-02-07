package org.example;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class CalculatorTest {

    @Test
    public void testAdditionTwoPositiveIntegersReturnsCorrectResult(){
        Calculator calculator = new Calculator();
        assertEquals( 4 , calculator.calculateSumOfTwoNumbers(2, 2));
    }
    @Test
    public void testAdditionTwoNegativeIntegersReturnsCorrectResult(){
        Calculator calculator = new Calculator();
        assertEquals( -4 , calculator.calculateSumOfTwoNumbers(-2, -2));
    }
    @Test
    public void testAdditionZeroAndPositiveIntegerReturnsCorrectResult(){
        Calculator calculator = new Calculator();
        assertEquals( 2 , calculator.calculateSumOfTwoNumbers(0, 2));
    }
    @Test
    public void testAdditionZeroAndNegativeIntegerReturnsCorrectResult(){
        Calculator calculator = new Calculator();
        assertEquals( -2 , calculator.calculateSumOfTwoNumbers(0, -2));
    }
    @Test
    public void testSubtractionTwoPositiveIntegersReturnsCorrectResult(){
        Calculator calculator = new Calculator();
        assertEquals( 0 , calculator.calculateSubtractionOfTwoNumbers(2, 2));
    }
    @Test
    public void testSubtractionTwoNegativeIntegersReturnsCorrectResult(){
        Calculator calculator = new Calculator();
        assertEquals( 0 , calculator.calculateSubtractionOfTwoNumbers(-2, -2));
    }
    @Test
    public void testSubtractionZeroAndPositiveIntegerReturnsCorrectResult(){
        Calculator calculator = new Calculator();
        assertEquals( -2 , calculator.calculateSubtractionOfTwoNumbers(0, 2));
    }
    @Test
    public void testSubtractionZeroAndNegativeIntegerReturnsCorrectResult(){
        Calculator calculator = new Calculator();
        assertEquals( 2 , calculator.calculateSubtractionOfTwoNumbers(0, -2));
    }
    @Test
    public void testComparisonTwoPositiveIntegersReturnsCorrectResult(){
        Calculator calculator = new Calculator();
        assertEquals( true , calculator.checkIfFirstIntegerIsGreater(7, 2));
    }
    @Test
    public void testComparisonTwoNegativeIntegersReturnsCorrectResult(){
        Calculator calculator = new Calculator();
        assertEquals( true , calculator.checkIfFirstIntegerIsGreater(-2, -5));
    }
    @Test
    public void testComparisonZeroAndPositiveIntegerReturnsCorrectResult(){
        Calculator calculator = new Calculator();
        assertEquals( false , calculator.checkIfFirstIntegerIsGreater(0, 2));
    }
    @Test
    public void testComparisonZeroAndNegativeIntegerReturnsCorrectResult(){
        Calculator calculator = new Calculator();
        assertEquals( true , calculator.checkIfFirstIntegerIsGreater(0, -2));
    }
    @Test
    public void testComparisonTwoEqualIntegersReturnsCorrectResult(){
        Calculator calculator = new Calculator();
        assertEquals( true , calculator.checkIfFirstIntegerIsGreater(0, -2));
    }
}
