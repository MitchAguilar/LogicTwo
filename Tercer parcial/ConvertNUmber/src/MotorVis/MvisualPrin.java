package MotorVis;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;

public class MvisualPrin implements ActionListener {

    JFrame a;
    JButton b, c, d, f;
    JLabel e;

    public void C() {
        //button zone
        b = new JButton("Decimal");
        b.setBounds(40, 100, 110, 20);
        b.setForeground(Color.BLACK);
        b.addActionListener(this);

        c = new JButton("Binario");
        c.setBounds(220, 100, 110, 20);
        c.setForeground(Color.BLACK);
        c.addActionListener(this);

        d = new JButton("Octales");
        d.setBounds(40, 170, 110, 20);
        d.setForeground(Color.BLACK);
        d.addActionListener(this);

        f = new JButton("Hexadec");
        f.setBounds(220, 170, 110, 20);
        f.setForeground(Color.BLACK);
        f.addActionListener(this);
        //label zone
        e = new JLabel("Elija su opción de conversión");
        e.setBounds(60, 20, 300, 30);
        Font f = new Font("Courier", Font.BOLD, 15);
        e.setFont(f);
        e.setForeground(Color.BLACK);
    }

    public void V() {
        a = new JFrame("Main");
        a.setSize(400, 250);

        a.add(b);
        a.add(c);
        a.add(d);
        a.add(e);
        a.add(f);

        a.setLayout(null);
        a.setVisible(true);
        a.setResizable(false);
        a.setLocationRelativeTo(null);
        a.setDefaultCloseOperation(a.EXIT_ON_CLOSE);
    }

    public MvisualPrin() {
        C();
        V();
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource().equals(b)) {
            D z = new D();
        }
        if (e.getSource().equals(c)) {
            B z2 = new B();
        }
        if (e.getSource().equals(d)) {
            O z3 = new O();
        }
        if (e.getSource().equals(f)) {
            H z4 = new H();
        }
    }
}
