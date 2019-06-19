package Lab10;

import java.io.FileNotFoundException;

public class Main {
    public static void main(String[] args) throws FileNotFoundException {
        Client client = new Client();
        client.doTask(new RealSystemFacade());
        client.doTask(new ProxySystemFacade());
        RealSystemFacade realSystemFacade = new RealSystemFacade();
        String color = realSystemFacade.getColor(-1, 0, 3, 1, 2, 3, "1.ourbmp");
        System.out.println(color);
        ProxySystemFacade proxySystemFacade = new ProxySystemFacade();
        String color2 = proxySystemFacade.getColor(-1, 0, 3, 1, 2, 3, "1.ourbmp");
        System.out.println(color2);


    }
}