package Lab6;

import Lab8.WrongCapacityValueException;
import Lab8.WrongCostValueException;
import Lab8.WrondReduceOfFuelValueException;
import java.io.Serializable;
import java.util.Objects;

public abstract class Cars implements Serializable {
    private int reduceFuel;
    private int сapacityEngine;
    private int cost;
    private String publicInformation;
    @Override
    public boolean equals(Object obj) {
        return obj.toString().equals(toString());
    }
    public Cars(int reduceFuel, int сapacityEngine,int cost,String publicInformation)
            throws WrondReduceOfFuelValueException, WrongCapacityValueException,WrongCostValueException {
        if (cost <= 0) {
            throw new WrongCostValueException("Проблема в тому, що вартість автомобіля <= 0, і не можно " +
                    "знайти такий автомобіль");
        }
        if (сapacityEngine <= 0) {
            throw new WrongCapacityValueException("Проблема в тому, що об'єм двигуна <= 0, і не можно " +
                    "знайти такий двигун");
        }
        if (reduceFuel <= 0) {
            throw new WrondReduceOfFuelValueException("Проблема в тому, що витрата палива <= 0, і не можно " +
                    "знайти такий автомобіль");
        }
        this.reduceFuel = reduceFuel;
        this. cost = cost;
        this.сapacityEngine=сapacityEngine;
        this.publicInformation = publicInformation;
    }
    @Override
    public String toString() {
        return getClass().getSimpleName()+"(" + " " + "Reduce Fuel:"+reduceFuel+","+ "CaparacityEngine:"+ сapacityEngine +","+ "Cost:"+cost+","+"PublicInformation:"+" "+publicInformation+")";    }
    public int getReduseFuel() {
        return reduceFuel;
    }
    public int getCost() {
        return cost;
    }
    public int getCapacity() {
        return сapacityEngine;
    }
}



