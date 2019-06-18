package Lab10;
import java.io.FileNotFoundException;
import java.util.HashMap;

public class ProxySystemFacade extends AbstractSystemFacade {
    RealSystemFacade realSystemFacade = new RealSystemFacade();
    HashMap<String, String> cache = new HashMap<>();

    public String getColor(int x, int y,int x1,int x2,int y1,int y2 ,String fileName)
            throws FileNotFoundException {
        String result = cache.get(fileName + x + y);
        if (result == null) {
            result = realSystemFacade.getColor(x, y,x1,x2, y1, y2 ,fileName);
            cache.put(fileName + x + y, result);
        }
        return result;
    }
}