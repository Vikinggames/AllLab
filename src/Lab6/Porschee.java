package Lab6;


import Lab8.WrongCapacityValueException;
import Lab8.WrongCostValueException;
import Lab8.WrondReduceOfFuelValueException;

import java.io.Serializable;

public class Porschee extends Cars implements Serializable {
    public Porschee(int reduseFuel, int capacityEngine, int cost,String publicInformation)
            throws WrondReduceOfFuelValueException, WrongCapacityValueException, WrongCostValueException {
        super(reduseFuel, capacityEngine,cost,publicInformation);
   }
}