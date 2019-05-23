package Lab9;
import Lab6.Lada;
import Lab6.Porschee;
import Lab6.Subaru;
import Lab7.MySet;

import java.io.IOException;

public class Main {
    public static void main(String[] args) throws IOException {
        MySet cars = new MySet();
        Lada car1 = new Lada(5, 4, 3000000,"slow as a turtle");
        cars.add(car1);
        Lada car2 = new Lada(4, 8, 2300000,"PI2");
        cars.add(car2);
        Lada[] lada = {car1, car2};
        FileWorker.saveObjectsToTextFileCar("1.txt", lada);
        Subaru subaru1 = new Subaru(5, 4, 2100000,"unkillable cockroach");
        cars.add(car1);
        Subaru subaru2 = new Subaru(4, 8, 3000000,"graceful as a fallow deer");
        cars.add(car2);
        Subaru[] subaru = {subaru1, subaru2};
        FileWorker.saveObjectsToTextFileCar("2.txt", subaru);
        Porschee porschee1 = new Porschee(15, 20, 300000,"eating like an elephant");
        cars.add(porschee1);
        Porschee porschee2 = new Porschee(4, 8, 230000,"fast as the wind");
        cars.add(car2);
        Porschee[] porschee = {porschee1, porschee2};
        FileWorker.saveObjectsToTextFileCar("3.txt",porschee );
        FileWorker.saveCollectionToFile("4.txt",cars );
        System.out.println("File was recorded");

    }
}