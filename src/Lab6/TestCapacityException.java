package Lab6;

        import Lab8.WrongCapacityValueException;
        import Lab8.WrongCostValueException;
        import org.junit.Test;

public class TestCapacityException {
    @Test (expected = WrongCapacityValueException.class)
    public void testCapacityException() throws WrongCapacityValueException {
        Car car = new Porschee(6, -5,6000,"Barsic");
    }

    @Test(expected = WrongCostValueException.class)
    public void testCostException() throws  WrongCostValueException{
        Car car = new Porschee(6, 5,-6000,"Barsik");
    }
}