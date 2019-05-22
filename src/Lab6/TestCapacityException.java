package Lab6;

        import Lab8.WrongCapacityValueException;
        import Lab8.WrongCostValueException;
        import Lab8.WrondReduceOfFuelValueException;
        import org.junit.Test;

public class TestCapacityException {
    @Test (expected = WrongCapacityValueException.class)
    public void testCapacityException() throws WrongCapacityValueException {
        Cars cars= new Porschee(6, -5,6000,"Barsic");
    }

    @Test(expected = WrongCostValueException.class)
    public void testCostException() throws  WrongCostValueException{
        Cars cars= new Porschee(6, 5,-6000,"Barsik");
    }
}