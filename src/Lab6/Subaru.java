package Lab6;

import Lab8.WrongCapacityValueException;
import Lab8.WrongCostValueException;
import Lab8.WrondReduceOfFuelValueException;

public class Subaru extends  Cars {
    public Subaru(int reduseFuel, int capacityEngine,int cost)
            throws WrondReduceOfFuelValueException, WrongCapacityValueException, WrongCostValueException{
        super(reduseFuel, capacityEngine,cost);

    }
}
