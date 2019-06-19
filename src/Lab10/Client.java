package Lab10;
import java.io.FileNotFoundException;
public class Client {
    void doTask(AbstractSystemFacade abstractSystemFacade)
            throws FileNotFoundException {
        String color = abstractSystemFacade.getColor(1, 2, 3,1,2,3,"1.ourbmp");
        System.out.println(color);
        color = abstractSystemFacade.getColor(1, 2, 3,0,1,3,"1.ourbmp");
        System.out.println(color);
        color = abstractSystemFacade.getColor(1, 3, 3,0,1,3,"1.ourbmp");
        System.out.println(color);}
}