package Lab9;

import Lab7.MySet;

import java.util.Arrays;

public class Main2 {
    public static void main(String[] args) {
        MySet mySet = FileWorker.loadCollectionFromFile("1.txt");
        System.out.println(mySet.size());
        System.out.println(mySet.toArray()[0]);
        System.out.println(mySet.toArray()[1]);
        System.out.println(Arrays.toString(FileWorker.loadObjectsFromFile("2.obj")));
    }
}