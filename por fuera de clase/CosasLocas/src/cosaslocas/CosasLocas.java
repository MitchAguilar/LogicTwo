package cosaslocas;

import java.util.Scanner;

public class CosasLocas {

    public static void main(String[] args) {
        Scanner a = new Scanner(System.in);
        String db = "";
        while (true) {
            String[] nombres = a.nextLine().split(" ");
            String[] apellidos = a.nextLine().split(" ");
            String acu = "";

            String nom = nombres[0];
            String app = apellidos[0];
            if (db.contains(acu) == true) {
                for (int i = 0; i < 2; i++) {
                    acu += nom.charAt(i) + "";
                }
            } else {
                for (int i = 0; i < 3; i++) {
                    acu = nom.charAt(i) + "";
                }
                break;
            }
            acu += "." + app + "@udla.edu.co" + "\n";
            db += acu;
            System.out.print("." + app + "@udla.edu.co" + "\n");
            System.out.println(acu);
        }
    }

}
