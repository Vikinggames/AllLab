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
        FileWorker.saveObjectsToTextFileLada("1.obj", lada);
        Subaru subaru1 = new Subaru(5, 4, 2100000,"unkillable cockroach");
        cars.add(car1);
        Subaru subaru2 = new Subaru(4, 8, 3000000,"\n" +
                "graceful as a fallow deer");
        FileWorker.saveObjectsToFile("1.ourbmp", cars);
        cars.add(car2);
        Subaru[] subaru = {subaru1, subaru2};
        FileWorker.saveObjectsToTextFileSubary("2.obj", subaru);
        Porschee porschee1 = new Porschee(15, 20, 300000,"eating like an elephant");
        cars.add(porschee1);
        Porschee porschee2 = new Porschee(4, 8, 230000,"fast as the wind");
        cars.add(car2);
        Porschee[] porschee = {porschee1, porschee2};
        FileWorker.saveObjectsToTextFilePorschee("3.txt",porschee );
        System.out.println("File was recorded");

    }
}