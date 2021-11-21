package cleancodeandrefactoring.thuchanh;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertThrows;

public class Calculator {

    public static final char ADDITION = '+';
    public static final char SUBTRACTION = '-';
    public static final char MULTIPLICATION = '*';
    public static final char DIVISION = '/';

    public static int calculate(int firstOperand, int secondOperand, char operator) {
        switch (operator) {
            case ADDITION:
                return firstOperand + secondOperand;
            case SUBTRACTION:
                return firstOperand - secondOperand;
            case MULTIPLICATION:
                return firstOperand * secondOperand;
            case DIVISION:
                if (secondOperand != 0)
                    return firstOperand / secondOperand;
                else
                    throw new RuntimeException("Can not divide by 0");
            default:
                throw new RuntimeException("Unsupported operation");
        }
    }
}
class TestCalculator {
    public static final char ADDITION = '+';
    public static final char SUBTRACTION = '-';
    public static final char MULTIPLICATION = '*';
    public static final char DIVISION = '/';


    @Test
    @DisplayName("Testing addition")
    void testCalculateAdd() {
        int firstOperand = 1;
        int secondOperand = 1;

        int expected = 2;

        int result = Calculator.calculate(firstOperand, secondOperand, ADDITION);
        Assertions.assertEquals(expected, result);
    }

    @Test
    @DisplayName("Testing subtraction")
    void testCalculateSub() {
        int firstOperand = 2;
        int secondOperand = 1;
        int expected = 1;

        int result = Calculator.calculate(firstOperand, secondOperand, SUBTRACTION);
        Assertions.assertEquals(expected, result);
    }

    @Test
    @DisplayName("Testing multiplication")
    void testCalculateMul() {
        int firstOperand = 2;
        int secondOperand = 2;
        int expected = 4;

        int result = Calculator.calculate(firstOperand, secondOperand, MULTIPLICATION);
        Assertions.assertEquals(expected, result);
    }

    @Test
    @DisplayName("Testing division")
    void testCalculateDiv() {
        int firstOperand = 6;
        int secondOperand = 3;
        int expected = 2;

        int result = Calculator.calculate(firstOperand, secondOperand, DIVISION);
        Assertions.assertEquals(expected, result);
    }

    @Test
    @DisplayName("Testing division by zero")
    void testCalculateDivByZero() {
        int firstOperand = 2;
        int secondOperand = 0;

        assertThrows(RuntimeException.class,
                ()-> {
                    Calculator.calculate(firstOperand, secondOperand, DIVISION);});
    }

    @Test
    @DisplayName("Testing wrong operator")
    void testCalculateWrongOperator() {
        int firstOperand = 2;
        int secondOperand = 0;
        char operator = '=';

        assertThrows(RuntimeException.class,
                ()-> {
                    Calculator.calculate(firstOperand, secondOperand, operator);});
    }
}