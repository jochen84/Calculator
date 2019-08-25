package SE.EC.JohanHansson;

import static org.junit.Assert.assertTrue;
import static org.junit.Assert.assertEquals;
import org.junit.Test;

/**
 * Unit test for simple App.
 */
public class AppTest 
{
    /**
     * Rigorous Test :-)
     */
    @Test
    public void shouldAnswerWithTrue()
    {
        assertTrue( true );
    }

    @Test
    public void addition_should_answer_with_five() {
        double a = 2;
        double b = 3;
        double expected = 5;

        double actual = Calculator.getAddition(a, b);

        assertEquals(expected, actual, 0);
    }

    @Test
    public void subtraction_should_answer_with_six() {
        double a = 8;
        double b = 2;
        double expected = 6;

        double actual = Calculator.getSubtraction(a, b);

        assertEquals(expected, actual, 0);
    }

    @Test
    public void multiplication_should_answer_with_eight() {
        double a = 4;
        double b = 2;
        double expected = 8;

        double actual = Calculator.getMultiplication(a, b);

        assertEquals(expected, actual, 0);
    }

    @Test
    public void divition_should_answer_with_nine() {
        double a = 18;
        double b = 2;
        double expected = 9;

        double actual = Calculator.getDivision(a, b);

        assertEquals(expected, actual, 0);
    }




}
