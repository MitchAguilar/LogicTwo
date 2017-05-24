package strings;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Scanner;
import java.util.Set;

public class Strings {

    public static void main(String[] args) {
        Scanner a = new Scanner(System.in);
        System.out.println("Digite su cadena:");
        String b = a.nextLine();
        System.out.println("Cantidad de palabras: " + b.length());
        System.out.println("Cantidad de vocales: " + CantidadVocales(b));
        System.out.println("Cantidad de consonantes: " + (b.length() - CantidadVocales(b)));
        //        System.out.println("Hello World!");
        System.out.println("Contador de letras: ");
        contarLetras(b);
        String iv = Invertida(b);
        System.out.println("Cedena invertida: " + iv);
        System.out.println("Palabra Palindrome: " + (b.equalsIgnoreCase(iv)));
    }

    public static int CantidadVocales(String b) {
        int c = 0;
        for (int i = 0; i < b.length(); i++) {
            if (b.charAt(i) == 'a' || b.charAt(i) == 'e' || b.charAt(i) == 'i' || b.charAt(i) == 'o' || b.charAt(i) == 'u') {
                c++;
            }
        }
        return c;
    }
    public static String Invertida(String b) {
        StringBuilder Ca = new StringBuilder(b);//no lo conocía
        return Ca.reverse().toString();
    }

    private static void contarLetras(String b) {
        CounLetras contabilizador = new CounLetras();//objeto contabilizador, para llevar el "contador de las letras"
        contabilizador.contabiliza(b);
        Map<String, Long> ocurrencias = contabilizador.getOcurrencias();//la interfáz map

        Set<String> keys = ocurrencias.keySet();//identifica de forma úncia, como en la base de datos... sin claves iguales, podemos dejar una clave vasia pero nunca repetida
        Iterator<String> iterator = keys.iterator();//los iteradores son
        String key = null;
        //es como almacenar información en una tabla como de 2 columnas, la key o clave identifica el valor
        while (iterator.hasNext()) {
            key = iterator.next();
            System.out.println("\tkey: [" + key + "] valor: [" + ocurrencias.get(key)+"]");//ojo get obtiene valor con la clave
        }
    }

    public static class CounLetras {

        private Map<String, Long> ocurrencias; //Map porque son... recive la clave y el valor, la clave es lo que se nos ocurra

        public CounLetras() {
            ocurrencias = new HashMap<String, Long>();//el hash map que se deriva de la categoría map
        }

        public void contabiliza(String linea) {
            for (int i = 0; i < linea.length(); i++) {
                if (null == ocurrencias.get("" + linea.charAt(i))) {
                    ocurrencias.put("" + linea.charAt(i), 1L);//recive la clave y el valor...
                } else {
                    Long valor = ocurrencias.get("" + linea.charAt(i));
                    valor++;
                    ocurrencias.put("" + linea.charAt(i), valor);//ojo con el valor
                }
            }
        }

        public Map<String, Long> getOcurrencias() {
            return ocurrencias;
        }
    }
}
//muy eficiente en busquedas...pero depende
