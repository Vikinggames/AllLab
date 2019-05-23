package Lab7;

import Lab6.Car;
import Lab6.Lada;
import Lab6.Subaru;
import Lab6.Porschee;
import Lab8.WrongCapacityValueException;
import Lab8.WrondReduceOfFuelValueException;
import Lab8.WrongCostValueException;
import org.junit.Test;
import org.junit.Assert;
import org.junit.Before;

public class TestMySet extends Assert {
    MySet mySet;
    @Before
    public void before() {
        mySet = new MySet();
    }

    @Test
    public void testMySet() {
        assertEquals(0, mySet.size());
    }

    @Test(expected =WrondReduceOfFuelValueException.class)
    public void testWrondReduceOfFuelValueException()throws WrondReduceOfFuelValueException{
        mySet.add(new Lada(-15,35,5000,"Barsic"));
    }
    @Test(expected =WrongCapacityValueException.class)
    public void testWrongCapacityValueException()throws WrongCapacityValueException{
        mySet.add(new Lada(15,-35,5000,"Barsic"));
    }
    @Test(expected =WrongCostValueException.class)
    public void testWrongCostValueException() throws WrongCostValueException{
        mySet.add(new Porschee(10,10,0,"Barsic"));}
    @Test
    public void testAdd()
            {
        mySet.add(new Subaru(2, 10,5800,"Barsic"));
        assertEquals(1, mySet.size());
    }

    @Test
    public void testContains() {
        Car car;
        car = new Porschee(3, 20,5000,"Barsic");
        mySet.add(car);
        car = new Lada(5, 20,5000,"Barsic");
        mySet.add(car);
        assertTrue(mySet.contains(car));
    }
}