
package EjerciciosEnClase;
public class binario {
    public static void main(String[] args) {
        int a=10;
        String d="";
        while (a>=2){
            d=(a%2)+d;
            a/=2;
        }
        d=a+d;
        System.out.println(d);
    }
    
}
