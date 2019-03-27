package Lab7;

import Lab6.Cars;
import Lab8.WrondReduceOfFuelValueException;
import Lab8.WrongCapacityValueException;
import Lab8.WrongCostValueException;

import java.util.Collection;
import java.util.Iterator;
import java.util.Set;

public class MySet implements Set<Cars> {

    private static final int INITIAL_CAPACITY = 15;
    private Cars[] elements = new Cars[INITIAL_CAPACITY];
    private int size = 0;

    public MySet() {

    }

    public MySet(Cars taxiStation) {
        add(taxiStation);

    }

    public MySet(Collection<Cars> collection) {
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
        Iterator<Cars> iterator = iterator();
        while (iterator.hasNext()) {
            if (o.equals(iterator.next())) {
                return true;
            }

        }
        return false;
    }

    @Override
    public Iterator<Cars> iterator() {
        return new Iterator<Cars>() {
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
            public Cars next() {
                return elements[index++];
            }
        };
    }

    @Override
    public Object[] toArray() {
        return new Object[0];
    }

    @Override
    public <T> T[] toArray(T[] a) {
        return null;
    }

    @Override
    public boolean add(Cars car) {
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
            Cars[] element = new Cars[(int) Math.round(INITIAL_CAPACITY * 1.3)];
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
    public boolean addAll(Collection<? extends Cars> c) {
        Iterator<? extends Cars> iterator = c.iterator();
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
