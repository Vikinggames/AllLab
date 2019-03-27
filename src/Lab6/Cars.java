package Lab6;

import Lab8.WrongCapacityValueException;
import Lab8.WrongCostValueException;
import Lab8.WrondReduceOfFuelValueException;

import java.util.Objects;

public abstract class Cars {
    public int reduceFuel;
    private int сapacityEngine;
    private int cost;
    public Cars(int reduceFuel, int сapacityEngine,int cost)
           {
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
    }
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Cars cars = (Cars) o;
        return reduceFuel == cars.reduceFuel &&
                сapacityEngine == cars.сapacityEngine &&
                cost == cars.cost;
    }

    @Override
    public int hashCode() {
        return Objects.hash(reduceFuel, сapacityEngine, cost);
    }

    @Override
    public String toString() {
        return getClass().getSimpleName() + " " + "Reduce Fuel:"+reduceFuel+","+ "CaparacityEngine:"+ сapacityEngine +","+ "Cost:"+cost;
    }
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



