package Motor;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.PrintWriter;

public class Core {

    DbController a = new DbController();

    public Core() {

    }

    public boolean inser(String name, String pass) {
        if (DbController.insert()) {
            File archivo = null;
            FileReader fr = null;
            BufferedReader br = null;

            try {
                // Apertura del fichero y creacion de BufferedReader para poder
                // hacer una lectura comoda (disponer del metodo readLine()).
                String a="";
                archivo = new File("SRC//DB//data.txt");
                fr = new FileReader(archivo);
                br = new BufferedReader(fr);

                // Lectura del fichero
                String linea;
                while ((linea = br.readLine()) != null) {
                    a+=linea+"\n";
                }
                System.out.println("............"+a+"..........");
            } catch (Exception e) {
                e.printStackTrace();
            } finally {
                // En el finally cerramos el fichero, para asegurarnos
                // que se cierra tanto si todo va bien como si salta 
                // una excepcion.
                try {
                    if (null != fr) {
                        fr.close();
                    }
                } catch (Exception e2) {
                    e2.printStackTrace();
                }
            }

            FileWriter fiche = null;
            PrintWriter pw = null;
            try {
                fiche = new FileWriter("SRC//DB//data.txt");//ojo si queremos odemos seguir agregando abajo con el true
                pw = new PrintWriter(fiche);
                for (int i = 0; i < 10; i++) {
                    pw.print("liena" + i + "\n");
                }
            } catch (Exception e) {
            } finally {
                try {
                    if (null != fiche) {
                        fiche.close();
                    }
                } catch (Exception e2) {
                }
            }
            return true;
        } else {
            return false;
        }
    }
}
