import com.stefjen07.calculator.Calculator;
import com.stefjen07.commands.*;
import com.stefjen07.exceptions.ZeroDivideException;
import org.junit.Assert;
import org.junit.Test;

public class CalculatorTests {
    @Test
    public void testCalculator() throws ZeroDivideException {
        Calculator calculator = new Calculator();

        double delta = 0.0000001;

        calculator.executeCommand(new AddCommand(10));
        Assert.assertEquals(10, calculator.getResult(), delta);

        calculator.executeCommand(new UndoCommand());
        Assert.assertEquals(0, calculator.getResult(), delta);

        Assert.assertThrows(ZeroDivideException.class, () -> calculator.executeCommand(new DivideCommand(0)));

        calculator.executeCommand(new MultiplyCommand(10));
        Assert.assertEquals(0, calculator.getResult(), delta);

        calculator.executeCommand(new SubtractCommand(-5));
        Assert.assertEquals(5, calculator.getResult(), delta);

        calculator.executeCommand(new DivideCommand(2));
        Assert.assertEquals(2.5, calculator.getResult(), delta);

        calculator.executeCommand(new MultiplyCommand(-2));
        Assert.assertEquals(-5, calculator.getResult(), delta);

        calculator.executeCommand(new UndoCommand());
        Assert.assertEquals(2.5, calculator.getResult(), delta);
    }
}
