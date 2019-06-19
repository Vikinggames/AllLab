package Lab10;
import javax.swing.border.Border;
import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class RealSystemFacade extends AbstractSystemFacade {
     private static Scanner getScanner(String fileName) throws FileNotFoundException {
        return new Scanner(
                new File(
                        "F:\\AllLabs\\src\\Lab10\\" + fileName
                )
        );
    }
    public  String getColor(int x1, int x,int x2,int y1,int y,int y2 ,String fileName)
            throws FileNotFoundException,BorderException {
            char result = 0;
                    Scanner scanner = getScanner(fileName);
                    String line = "";
                    for (int i = 0; i <= y; i++) {
                        line = scanner.nextLine();
                    }
                    result = line.charAt(x);
            return result == '0' ? "Цвет:"+"Black"+"\n" : "Цвет:"+"White"+"\n";
    }
}
