package MotorVis;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;

public class O implements ActionListener {

    JFrame a;
    JLabel e, b, c, d, f;
    JTextField g;
    JButton h;
    String bina = "";

    public void C() {
        //button zone
        b = new JLabel("Octal: ");
        b.setBounds(40, 120, 200, 20);

        c = new JLabel("Binario: ");
        c.setBounds(220, 120, 200, 20);

        d = new JLabel("Decimal: ");
        d.setBounds(40, 170, 200, 20);

        f = new JLabel("Hexadec: ");
        f.setBounds(220, 170, 200, 20);
        //label zone
        e = new JLabel("Digite un octal");
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
        a = new JFrame("Octal");
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

    public O() {
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

    public int OCT(int a) {
        String b = "" + a;
        int base = 0;
        int len = b.length() - 1;
        for (int i = 0; i < b.length(); i++) {
            int n = Integer.parseInt("" + b.charAt(i));
            base += n * Math.pow(8, len);
            len--;
        }
        return base;
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource().equals(h)) {
            if (con() == false) {
                JOptionPane.showMessageDialog(null, "Ingrese Solo numeros, no puedes engañarnos");
            } else {
                int num = OCT(Integer.parseInt(g.getText()));
                b.setText("Octal: " + g.getText());
                bin(num);
                c.setText("Binario: " + bina);
                d.setText("Decimal: " + num);
                f.setText("Hexadec: " + hex(num));
            }
        }
    }
}
