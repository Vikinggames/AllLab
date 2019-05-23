package Lab7;

import Lab6.Car;
import Lab8.WrondReduceOfFuelValueException;
import Lab8.WrongCapacityValueException;
import Lab8.WrongCostValueException;

import java.io.Serializable;
import java.util.Arrays;
import java.util.Collection;
import java.util.Iterator;
import java.util.Set;

public class MySet implements Set<Car>, Serializable {

    private static final int INITIAL_CAPACITY = 15;
    private Car[] elements = new Car[INITIAL_CAPACITY];
    private int size = 0;

    public MySet() {

    }

    public MySet(Car taxiStation) {
        add(taxiStation);

    }

    public MySet(Collection<Car> collection) {
        addAll(collection);
    }


    @Override
    public int size() {

        return size;
    }

    @Override
    public boolean isEmpty() {

        return size == 0;
    }

    @Override
    public boolean contains(Object o) {
        Iterator<Car> iterator = iterator();
        while (iterator.hasNext()) {
            if (o.equals(iterator.next())) {
                return true;
            }

        }
        return false;
    }

    @Override
    public Iterator<Car> iterator() {
        return new Iterator<Car>() {
            private int index = 0;

            @Override
            public boolean hasNext() {
                return index < size;
            }

            @Override
            public String toString() {
                return "$classname{" + "index=" + index + '}';
            }

            @Override
            public Car next() {
                return elements[index++];
            }
        };
    }

    @Override
    public Object[] toArray() {
        return Arrays.copyOf(elements, size);
    }

    @Override
    public <T> T[] toArray(T[] a) {
        return null;
    }

    @Override
    public boolean add(Car car) {
        if (car.getCost()<= 0) {
            throw new WrongCostValueException("Проблема в тому, що вартість автомобіля <= 0, і не можно " +
                    "знайти такий автомобіль");
        }
        if (car.getCapacity() <= 0) {
            throw new WrongCapacityValueException("Проблема в тому, що об'єм двигуна <= 0, і не можно " +
                    "знайти такий двигун");
        }
        if (car.getReduseFuel() <= 0) {
            throw new WrondReduceOfFuelValueException("Проблема в тому, що витрата палива <= 0, і не можно " +
                    "знайти такий автомобіль");
        }
        if (size() == INITIAL_CAPACITY) {
            Car[] element = new Car[(int) Math.round(INITIAL_CAPACITY * 1.3)];
            System.arraycopy(elements, 0, element, 0, size());
            element[size++] = car;
            elements = element;
        }
        if (size() < INITIAL_CAPACITY) {
            elements[size++] = car;
        }
        return true;
    }

    @Override
    public boolean remove(Object o) {
        for (int i = 0; i < elements.length; i++) {
            if (o.equals(elements[i])) {
                for(int j=i;j<elements.length-1;j++){
                    elements[j] = elements[j+1];
                }

                size--;

            }

        }
        return true;
    }

    @Override
    public boolean containsAll (Collection < ? > c){
        if (c.equals(elements)) {
            return true;
        }
        return false;
    }

    @Override
    public boolean addAll(Collection<? extends Car> c) {
        Iterator<? extends Car> iterator = c.iterator();
        while (iterator.hasNext()) {
            add(iterator.next());
        }
        return true;
    }
    @Override
    public boolean retainAll(Collection<?> c) {
        return false;
    }

    @Override
    public boolean removeAll(Collection<?> c) {
        return false;
    }

    @Override
    public void clear() {

    }
}
