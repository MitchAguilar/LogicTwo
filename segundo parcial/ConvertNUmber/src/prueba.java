
public class prueba {
    public static void main(String[] arg){
        int oc=6214;
        A(oc);
    }
    public static void A(int a){
        if(a<1){
            return;
        }else{
            A(a/8);
            System.out.print(a%8);
        }
    }
}
