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
            if (x1 < x && x <x2 ) {
                if(y1<y && y2>y){
                    System.out.println("x:"+x+"\n"+"y:"+y);
                    System.out.println("Доступ открыт :)");
                    Scanner scanner = getScanner(fileName);
                    String line = "";
                    for (int i = 0; i <= y; i++) {
                        line = scanner.nextLine();
                    }
                    result = line.charAt(x);
                }
            }
            else{
                System.out.println("Доступ закрыт :(");
                throw new BorderException("x1("+x1+")"+"!<"+"x("+x+")"+"!<"+"x2("+x2+") "+"или "
                                          +"y1("+y1+")"+"!<"+"y("+y+")"+"!<"+"y2("+y2+")"
                                          +"\n"+"Проверте данные!");
            }
            return result == '0' ? "Цвет:"+"Black"+"\n" : "Цвет:"+"White"+"\n";
    }
}