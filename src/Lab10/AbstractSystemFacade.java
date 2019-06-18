package Lab10;
import java.io.FileNotFoundException;
public abstract class AbstractSystemFacade {
    public abstract  String getColor(int x1, int x,int x2,int y1,int y,int y2 ,String fileName)
            throws FileNotFoundException;

}