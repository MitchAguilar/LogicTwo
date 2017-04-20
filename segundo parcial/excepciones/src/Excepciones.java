
import java.util.Scanner;

public class Excepciones {
    
    public static void main(String[] args) throws exzero {
        //excepciones para 
        Scanner sc = new Scanner(System.in);
        while (true) {
            int a = 0, b = 0, c = 0;
            try {
                System.out.println("Digite su valor a para la ecuación");
                a = sc.nextInt();
                System.out.println("Digite su valor b para la ecuación");
                b = sc.nextInt();
                System.out.println("Digite su valor c para la ecuación");
                c = sc.nextInt();
                if (a == 0 || b == 0 || c == 0) {
                    throw new exzero("Los valores no pueden ser cero");
                }
                double res1=(-b+(Math.sqrt((Math.pow(b, 2))-((4*a)*c))))/(2*a);
                double res2=(-b-(Math.sqrt((Math.pow(b, 2))-((4*a)*c))))/(2*a);
                System.out.println("res 1 "+res1);
                System.out.println("res 2 "+res2);
                break;
            } catch (java.util.InputMismatchException e) {
                System.err.println("No se permiten caracteres o numeros demasiado grandes");
            } catch (ArithmeticException e) {
                System.out.println("Divición entre cero");
            }catch(Exception e){ 
                System.err.println(e.getMessage());
            }finally {
                sc = new Scanner(System.in);
            }
        }
    }
    
    public static class exzero extends Exception {
        
        public exzero() {
            super();
        }
        
        public exzero(String msg) {
            super(msg);
        }
    }
}
