package MotorVis;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;

public class B implements ActionListener {

    JFrame a;
    JLabel e, b, c, d, f;
    JTextField g;
    JButton h;
    String bina = "";

    public void C() {
        //button zone
        b = new JLabel("Binario: ");
        b.setBounds(40, 120, 200, 20);

        c = new JLabel("Decimal: ");
        c.setBounds(220, 120, 200, 20);

        d = new JLabel("Octales: ");
        d.setBounds(40, 170, 200, 20);

        f = new JLabel("Hexadec: ");
        f.setBounds(220, 170, 200, 20);
        //label zone
        e = new JLabel("Digite un binario");
        e.setBounds(60, 20, 300, 30);
        Font f = new Font("Courier", Font.BOLD, 15);
        e.setFont(f);
        e.setForeground(Color.BLACK);

        //number zone        
        g = new JTextField();
        g.setBounds(20, 70, 200, 25);

        h = new JButton("Calcular");
        h.setForeground(Color.BLACK);
        h.addActionListener(this);
        h.setBounds(230, 70, 100, 25);
    }

    public void V() {
        a = new JFrame("Binario");
        a.setSize(400, 250);

        a.add(b);
        a.add(c);
        a.add(d);
        a.add(e);
        a.add(f);
        a.add(g);
        a.add(h);
        a.setLayout(null);
        a.setVisible(true);
        a.setResizable(false);
        a.setLocationRelativeTo(null);
        a.setDefaultCloseOperation(a.HIDE_ON_CLOSE);
    }
    public B() {
        C();
        V();
    }

    public boolean con() {
        String a = "0123456789";
        boolean b = true;
        for (int i = 0; i < g.getText().length(); i++) {
            int cm = 0;
            for (int j = 0; j < a.length(); j++) {
                if (g.getText().charAt(i) != a.charAt(j)) {
                    cm++;
                }
            }
            if (cm == a.length()) {
                b = false;
                break;
            }
        }
        return b;
    }

    public static void C(long a) {
        if (a < 1) {
            return;
        } else {
            C(a / 2);
            System.out.print(a % 2);
        }
    }//binario de un numero

    public int Dec(long a) {
        int dec = 0;
        int Arr[] = new int[100];
        for (int i = 0; i < Arr.length; i++) {
            Arr[i] = (int) Math.pow(2, i);
        }
        String b = a + "";
        System.out.println(b);
        int le = b.length() - 1;
        for (int i = 0; i < b.length(); i++) {
            if (b.charAt(i) != '0') {
                dec += Arr[le];
            }
            le--;
        }
        return dec;
    }

    public void bin(int a) {//num binario
        if (a < 1) {
            return;
        } else {
            bin(a / 2);
            bina += (a % 2) + "";
        }
    }
    
    public long oct(int a) {
        int pow = 1;
        int[] reg = new int[100];
        int i = 0;
        String num = "";
        int cou = 0;
        while (pow < a) {
            reg[i] = pow;
            pow = (int) Math.pow(8, i);
            i++;
            cou++;
        }
        int base = 0;
        for (int j = cou - 1; j > 0; j--) {
            base = (a / reg[j]);
            a = Math.abs((base * reg[j] - a));
            num += "" + base;
        }

        return Long.parseLong(num);
    }

    public String hex(int a) {
        int pow = 1;
        int[] reg = new int[100];
        int i = 0;
        String num = "";
        int cou = 0;
        while (pow < a) {
            reg[i] = pow;
            pow = (int) Math.pow(16, i);
            i++;
            cou++;
        }
        int base = 0;
        String he = "0123456789ABCDEF";
        for (int j = cou - 1; j > 0; j--) {
            base = (a / reg[j]);
            a = Math.abs(((base * reg[j]) - a));
            num += he.charAt(base);
        }
        return num;
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource().equals(h)) {
            if (con() == false) {
                JOptionPane.showMessageDialog(null, "Ingrese Solo numeros, no puedes engañarnos");
            } else {
                int d = Dec(Long.parseLong(g.getText()));
                b.setText("Binario: " + g.getText());
                c.setText("Decimal: " + d);
                this.d.setText("Octal: " + oct(d));
                f.setText("Hexadec: " + hex(d));
            }
        }
    }

}
