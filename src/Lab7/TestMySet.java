package Lab7;

import Lab6.Cars;
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
        mySet.add(new Lada(-15,35,5000));
    }
    @Test(expected =WrongCapacityValueException.class)
    public void testWrongCapacityValueException()throws WrongCapacityValueException{
        mySet.add(new Lada(15,-35,5000));
    }
    @Test(expected =WrongCostValueException.class)
    public void testWrongCostValueException() throws WrongCostValueException{
        mySet.add(new Porschee(10,10,0));}
    @Test
    public void testAdd()
            {
        mySet.add(new Subaru(2, 10,5800));
        assertEquals(1, mySet.size());
    }

    @Test
    public void testContains() {
        Cars cars;
        cars = new Porschee(3, 20,5000);
        mySet.add(cars);
        cars = new Lada(5, 20,5000);
        mySet.add(cars);
        assertTrue(mySet.contains(cars));
    }
}