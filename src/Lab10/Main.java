package Lab10;
import java.io.FileNotFoundException;
public class Main {
    public static void main(String[] args) throws FileNotFoundException {
        //Client client = new Client();
       //client.doTask(new ProxySystemFacade());
        //client.doTask(new RealSystemFacade());
        RealSystemFacade realSystemFacade =new RealSystemFacade();
        String color = realSystemFacade.getColor(-1, 0, 3,1,2,3,"1.ourbmp");
        System.out.println(color);
        color = realSystemFacade.getColor(1, 2, 3,0,1,3,"1.ourbmp");
        System.out.println(color);
    }
}