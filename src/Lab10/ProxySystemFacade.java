package Lab10;

import java.io.FileNotFoundException;

public class ProxySystemFacade extends AbstractSystemFacade {
    RealSystemFacade realSystemFacade = new RealSystemFacade();

    public String getColor(int x1, int x, int x2, int y1, int y, int y2, String fileName)
            throws FileNotFoundException {
        String result = "Доступ закрыт :(" + "\n" + "x1(" + x1 + ")" + "!<" + "x(" + x + ")" + "!<" + "x2(" + x2 + ") "
                + "или "
                + "y1(" + y1 + ")" + "!<" + "y(" + y + ")" + "!<" + "y2(" + y2 + ")"
                + "\n" + "Проверте данные!" + "\n";
        if (x >= 4 | x2 >= 4 | x1 >= 4) {
            throw new BorderException("Доступ закрыт :(" + " -> " + "Значения выходят за пределы" + " -> "
                    + "Проверте данные!");
        }
        if (x < 0 | x1 < 0 | x2 < 0) {
            throw new LessThanZeroException("Доступ закрыт :(" + " -> " + "Значения меньше нуля" + " -> "
                    + "Проверте данные!");
        }
        if (x1 < x && x < x2) {
            if (y1 < y && y2 > y) {
                System.out.println("x:" + x + "\n" + "y:" + y);
                System.out.println("Доступ открыт :)");
                result = realSystemFacade.getColor(x1, x, x2, y1, y, y2, fileName);
            }
        }
        return result;
    }
}