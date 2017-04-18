public class Fractions {

    public static void main(String[] args) {
        fraction a = new fraction();
        fraction b = new fraction();
        oper c = new oper();
        a.leer(4, 5);
        b.leer(1, 2);
        c.suma(a, b);
        System.out.println("suma: " + c.toString());
        c.resta(a, b);
        System.out.println("resta: " + c.toString());
        c.multiplicacion(a, b);
        System.out.println("multiplicacion: " + c.toString());
        c.divicion(a,b);
        System.out.println("divicion: " + c.toString());
    }

    public static class oper {

        int num, den;

        public void suma(fraction a, fraction b) {
            int au = a.num * b.den;
            int au2 = a.den * b.num;
            num = au + au2;
            den = a.den * b.den;
        }

        public void resta(fraction a, fraction b) {
            int au = a.num * b.den;
            int au2 = a.den * b.num;
            num = au - au2;
            den = a.den * b.den;
        }

        public void multiplicacion(fraction a, fraction b) {
            num = a.num * b.num;
            den = a.den * b.den;
            
        }

        public void divicion(fraction a, fraction b) {
            num = a.num * b.den;
            den = a.den * b.num;
        }

        @Override
        public String toString() {
            return "fraction{" + num + "/" + den + '}';
        }

    }

    public static class fraction {

        private int den, num, aux, aux1;

        public fraction() {
            num = 1;
            den = 2;
        }

        public fraction(int a, int b) {
            num = a;
            den = b;
            aux = a;
            aux1 = b;
        }

        public void leer(int a, int b) {
            num = a;
            den = b;
            aux = a;
            aux1 = b;
        }
    }
}
//by mitch aguilar