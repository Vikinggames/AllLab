package Lab8;

import Lab7.MySet;
import Lab6.Porschee;

public class Main {
    public static void main(String[] args) throws WrondReduceOfFuelValueException {
        try {
            new MySet().add(new Porschee(-3, 5,5000));
        }
        catch (WrongCostValueException e) {
            System.out.println(e.getMessage());
        }
        catch (WrongCapacityValueException e) {
            System.out.println(e.getMessage());
        }
        catch (WrondReduceOfFuelValueException e) {
            System.out.println(e.getMessage());
        }
    }
}