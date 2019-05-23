package Lab9;

import Lab6.Lada;
import Lab6.Porschee;
import Lab6.Subaru;
import Lab7.MySet;
import Lab6.Car;
import java.io.*;
import java.util.ArrayList;

public class FileWorker {

    public static void saveCollectionToFile(String fileName, MySet mySet) {
        File file = new File(fileName);
        try {
            OutputStream outputStream = new FileOutputStream(file);

            ObjectOutputStream objectOutputStream = new ObjectOutputStream(outputStream);
            objectOutputStream.writeObject(mySet);
            objectOutputStream.close();
            System.out.println(": )");
        } catch (FileNotFoundException e) {
            System.out.println("Sorry. File was not found.");
        } catch (IOException e) {
            System.out.println("Sorry. Problems with writing in the file.");
        }
    }

    public static MySet loadCollectionFromFile(String fileName) {
        File file = new File(fileName);
        try {
            InputStream inputStream = new FileInputStream(file);
            ObjectInputStream objectInputStream = new ObjectInputStream(inputStream);
            return (MySet) objectInputStream.readObject();
        } catch (IOException | ClassNotFoundException e) {
            e.printStackTrace();
        }
        return null;
    }

    public static void saveObjectsToFile(String fileName, MySet музичнаКомпозиціяs) {
        File file = new File(fileName);
        try {
            OutputStream outputStream = new FileOutputStream(file);
            ObjectOutputStream objectOutputStream = new ObjectOutputStream(outputStream);
            for (Car car : музичнаКомпозиціяs) {
                objectOutputStream.writeObject(car);
            }
            objectOutputStream.close();
            System.out.println(":2)");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static Car[] loadObjectsFromFile(String fileName) {
        File file = new File(fileName);
        ArrayList<Car> cars =
                new ArrayList<>();
        try {
            InputStream inputStream = new FileInputStream(file);
            ObjectInputStream objectInputStream = new ObjectInputStream(inputStream);
            Car car = (Car) objectInputStream.readObject();
            while (true) {
                cars.add(car);
                car = (Car) objectInputStream.readObject();


            }

        } catch (IOException | ClassNotFoundException e) {
        }
        return cars.toArray(new Car[0]);
    }

    public static void saveSymbolToTextFile
            (String fileName, char symbol) throws IOException {
        OutputStream outputStream = new FileOutputStream(fileName);
        outputStream.write(symbol);
    }

    public static void saveStringToTextFile
            (String fileName, String string) throws IOException {
        FileWriter fileWriter = new FileWriter(fileName);
        fileWriter.write(string);
        fileWriter.close();
    }

    public static void saveObjectsToTextFilePorschee(String fileName,Porschee[] porschees) throws IOException {
        FileWriter fileWriter = new FileWriter(fileName);
        for (Porschee porschee1 : porschees) {
            fileWriter.write(porschee1.toString() + "\n");
        }
        fileWriter.close();
    }
    public static void saveObjectsToTextFileLada(String fileName, Lada[] lada) throws IOException {
        FileWriter fileWriter = new FileWriter(fileName);
        for (Lada lada1 : lada) {
            fileWriter.write(lada1.toString() + "\n");
        }
        fileWriter.close();
    }
    public static void saveObjectsToTextFileSubary(String fileName, Subaru[] subaru) throws IOException {
        FileWriter fileWriter = new FileWriter(fileName);
        for (Subaru subaru1 : subaru) {
            fileWriter.write(subaru1.toString() + "\n");
        }
        fileWriter.close();
    }
    public static void saveObjectsToTextFileCar(String fileName, Car[] cars) throws IOException {
        //        FileWriter fileWriter = new FileWriter(fileName);
        OutputStream fileOutputStream = new FileOutputStream(fileName);
        ObjectOutputStream objectOutputStream = new ObjectOutputStream(fileOutputStream);
        for (Car car : cars) {
            objectOutputStream.writeObject(car);
        }
        objectOutputStream.close();
    }
}