package EjerciciosEnClase;

import javax.swing.JOptionPane;

public class divición {
    public static void main(String[] args) {
        int a=15,b=4,d = 0,e=0;
        while(true){
            a-=b;
            if((a)<0){
                e=a+b;
                break;
            }
            d++;
        }
        System.out.println(d+" R "+e);
        JOptionPane.showMessageDialog(null, "mjndjkfndkf");
    }
}
