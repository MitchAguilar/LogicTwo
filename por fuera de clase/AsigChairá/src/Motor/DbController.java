package Motor;

import java.io.File;

public class DbController {
    public static boolean insert(){
        File a= new File("src/DB//data.txt");
        return a.exists();
    }
   
}
