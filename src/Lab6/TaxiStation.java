package Lab6;
import java.util.Arrays;
import java.util.Comparator;

public class TaxiStation {
    private int count;
    private Cars[] cars;
    private int sum;

    @Override
    public boolean equals(Object obj) {
        return obj.toString().equals(toString());
    }

    public TaxiStation(int size) {
        cars = new Cars[size];

    }

    public void SortedFuelReduce() {

        Arrays.sort(cars, Comparator.comparing(Cars::getReduseFuel));

    }

    @Override
    public String toString() {

        return Arrays.toString(cars).replace("[","").replace("]","");
    }

    public void findProposition(int firstIndex,int lastIndex) {

        for (int i = 0; i < cars.length; i++) {
            if (cars[i].getReduseFuel() <= lastIndex && cars[i].reduceFuel >= firstIndex) {
                System.out.println(cars[i]);
            }
        }

    }

    public void add(Cars car) {
        if (count<cars.length) {
            cars[count++] = car;
        }

    }
    public void SumCost() {
        for (int i = 0; i < cars.length; i++) {
            sum+=cars[i].getCost();
        }
        System.out.println("Цена всех автомобилей:"+sum);
    }
}