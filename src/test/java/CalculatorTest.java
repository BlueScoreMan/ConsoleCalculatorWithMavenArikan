import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

public class CalculatorTest {

    private Calculator calculator;

    @Before
    public void setup() {
        calculator = new Calculator();
    }

    @Test
    public void subtractionPositiveAndNegativeNumber() {
        assertEquals(calculator.subtraction(-10, 25), -35);
    }

    @Test
    public void subtractionPositiveNumberAndNumber0() {
        assertEquals(10, calculator.subtraction(10, 0));
    }

    @Test
    public void subtractionResultPositive() {
        assertTrue(calculator.subtraction(2, 1) > 0);
    }

    @Test
    public void subtractionResultNegative() {
        assertTrue(calculator.subtraction(2, 3) < 0);
    }

    @Test
    public void subtractionResultIs0() {
        assertEquals(0, calculator.subtraction(1, 1));
    }

    @Test
    public void subtractionResultisMaxValue() {
        assertEquals(calculator.subtraction(Integer.MAX_VALUE, 0), Integer.MAX_VALUE);
    }

    @Test
    public void divideTwoPositivNumbers() {
        assertEquals(2, calculator.division(10, 5));
    }

    @Test
    public void dividePositiveAndNegativeNumber() {
        assertEquals(calculator.division(-10, 5), -2);
    }

    @Test
    public void divideNumber0AndPositiveNumber() {
        assertEquals(0, calculator.division(0, 10));
    }

    @Test
    public void divideMinAndMaxValues() {
        assertEquals(calculator.division(Integer.MIN_VALUE, Integer.MAX_VALUE), -1);
    }

    @Test
    public void divideResultPositive() {
        assertTrue(calculator.division(2, 1) > 0);
    }

    @Test
    public void divideResultNegative() {
        assertTrue(calculator.division(-2, 1) < 0);
    }

    @Test
    public void divideResultIs0() {
        assertEquals(0, calculator.division(0, 10));
    }

    @Test
    public void divideResultisMaxValue() {
        assertEquals(calculator.division(Integer.MAX_VALUE, 1), Integer.MAX_VALUE);
    }

    @Test
    public void multiplicationTwoPositivNumbers() {
        assertEquals(250, calculator.multiplication(10, 25));
    }

    @Test
    public void multiplicationPositiveAndNegativeNumber() {
        assertEquals(calculator.multiplication(-10, 25), -250);
    }

    @Test
    public void multiplicationPositiveNumberAndNumber0() {
        assertEquals(0, calculator.multiplication(10, 0));
    }

    @Test
    public void additionTwoPositiveIsOk() {
        assertEquals(35, calculator.addition(10, 25));
    }

    @Test
    public void subtractionTwoPositiveIsOk() {
        assertEquals(15, calculator.subtraction(25, 10));
    }

    @Test(expected = ArithmeticException.class)
    public void dividingThrough0ThrowsArithmeticException() {
        assertEquals(0, calculator.division(10, 0));
    }

    @Test
    public void subtractionTwoPositiveNumbers() {
        assertEquals(calculator.subtraction(10, 25), -15);
    }

    @Test
    public void additionTwoPositiveNumbers() {
        assertEquals(35, calculator.addition(10, 25));
    }

    @Test
    public void additionPositiveAndNegativeNumber() {
        assertEquals(15, calculator.addition(-10, 25));
    }

    @Test
    public void additionPositiveNumberAndNumber0() {
        assertEquals(10, calculator.addition(10, 0));
    }

    @Test
    public void additionMaxAndMinValues() {
        assertEquals(calculator.addition(Integer.MAX_VALUE, Integer.MIN_VALUE), -1);
    }

    @Test
    public void additionResultPositive() {
        assertTrue(calculator.addition(1, 1) > 0);
    }

    @Test
    public void additionResultNegative() {
        assertTrue(calculator.addition(-1, -1) < 0);
    }

    @Test
    public void additionResultIs0() {
        assertEquals(0, calculator.addition(-1, 1));
    }

    @Test
    public void additionResultisMaxValue() {
        assertEquals(calculator.addition(Integer.MAX_VALUE, 0), Integer.MAX_VALUE);
    }
}