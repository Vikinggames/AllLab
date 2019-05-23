package Lab7;
import Lab6.Car;
import Lab6.Subaru;
import Lab6.Porschee;
import Lab6.Lada;
import Lab8.WrondReduceOfFuelValueException;

import java.util.Iterator;

public class Main {
    public static void main(String[] args) throws WrondReduceOfFuelValueException {
        MySet myCar = new MySet();
        myCar.add(new Porschee(12, 3, 5000,"Barsic"));
        myCar.add(new Lada(10, 4, 6000,"Barsic"));
        myCar.add(new Subaru(11, 3, 5000,"Barsic"));
        myCar.add(new Porschee(12, 3, 5000,"Barsic"));
        myCar.add(new Lada(10, 4, 6000,"Barsic"));
        myCar.add(new Subaru(11, 3, 5000,"Barsic"));
        myCar.add(new Porschee(12, 3, 5000,"Barsic"));
        myCar.add(new Lada(10, 4, 6000,"Barsic"));
        myCar.add(new Subaru(11, 3,5000,"Barsic"));
        myCar.add(new Porschee(12, 3, 5000,"Barsic"));
        myCar.add(new Lada(10, 4, 6000,"Barsic"));
        myCar.add(new Subaru(11, 3, 5000,"Barsic"));
        myCar.add(new Porschee(12, 3, 5000,"Barsic"));
        myCar.add(new Lada(10, 4, 6000,"Barsic"));
        myCar.add(new Subaru(11, 3, 5000,"Barsic"));
        myCar.add(new Porschee(12, 3, 5000,"Barsic"));

        Iterator<Car> iterator = myCar.iterator();
        System.out.println(myCar.isEmpty());
        System.out.println(myCar.size());
        System.out.println(myCar.contains(new Subaru(11, 3, 5000,"Barsic")));
        myCar.remove(new Porschee(12, 3, 5000,"Barsic"));
        System.out.println(myCar.remove((new Porschee(12, 3, 5000,"Barsic"))));


        int x = 0;
        for (Car car : myCar) {
            System.out.println(iterator.next());
            x++;
        }

        System.out.println(x);
        System.out.println(myCar.containsAll(myCar));
    }
}

