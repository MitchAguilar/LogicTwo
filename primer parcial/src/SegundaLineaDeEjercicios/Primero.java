package SegundaLineaDeEjercicios;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;

public class Primero implements ActionListener {

    /*
        Realice un algoritmo para determinar el sueldo semanal de un trabajador con base
        en las horas trabajadas y el pago por hora, considerando que después de las 40 horas
        cada hora se considera como excedente y se paga el doble.
     */
    JFrame a;
    JButton b;
    JLabel c, d, e, h;
    JTextField f, g, i;

    public void C() {
        //conten button
        b = new JButton("Calcular");
        b.setBounds(150, 280, 100, 30);
        b.addActionListener(this);
        //conten label
        c = new JLabel("Digite sus datos");
        c.setBounds(150, 20, 100, 30);

        d = new JLabel("Horas T: ");
        d.setBounds(20, 80, 80, 30);

        e = new JLabel("Dias T: ");
        e.setBounds(20, 140, 80, 30);

        h = new JLabel("Presio: ");
        h.setBounds(20, 200, 80, 30);

        //conten textfiel
        f = new JTextField();
        f.setBounds(110, 80, 200, 30);
        f.addKeyListener(new KeyAdapter() {//block letras
            public void keyTyped(KeyEvent e) {
                s(e);
            }
        });

        g = new JTextField();
        g.setBounds(110, 140, 200, 30);
        g.addKeyListener(new KeyAdapter() {//block letras
            public void keyTyped(KeyEvent e) {
                s2(e);
            }
        });
        i = new JTextField();
        i.setBounds(110, 200, 200, 30);
        i.addKeyListener(new KeyAdapter() {//block letras
            public void keyTyped(KeyEvent e) {
                s3(e);
            }
        });
    }

    public void F() {
        a = new JFrame("ÉSTE ES EL TITULO");
        a.setSize(400, 400);

        a.add(b);
        a.add(c);
        a.add(d);
        a.add(e);
        a.add(f);
        a.add(g);
        a.add(h);
        a.add(i);

        a.setLocationRelativeTo(null);
        a.setResizable(false);
        a.setLayout(null);
        a.setVisible(true);
        a.setDefaultCloseOperation(a.EXIT_ON_CLOSE);
    }

    public Primero() {
        C();
        F();
    }

    public static void main(String[] arg) {
        Primero a = new Primero();
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource().equals(b)) {
            if (f.getText().equals("") || g.getText().equals("") || i.getText().equals("")) {
                JOptionPane.showMessageDialog(null, "No intente romper el programa, y llene los tres campos\n !!!SON REQUERIDOS¡¡¡");
                return;
            }
            double a = Double.parseDouble(f.getText());
            double b = Double.parseDouble(g.getText());
            double c = Double.parseDouble(i.getText());
            if (a < 6 && b < 41) {
                b *= c;
                JOptionPane.showMessageDialog(null, "La paga de la semana es: \n" + b + "$");
            } else if (b > 40) {
                double d = (b - 40);
                b *= c;
                c *= c;
                d += d;
                JOptionPane.showMessageDialog(null, "La paga de la semana es doble: \n" + b + d + "$");
            } else {
                JOptionPane.showMessageDialog(null, "Digite valores correctos pendejo\n hahaha");
            }
        }
    }

    private void s(KeyEvent e) {
        char c = e.getKeyChar();
        if (((c < '0') || (c > '9')) && (c != KeyEvent.VK_BACK_SPACE)//bloquea todas las teclas menos los numeros y el punto
                && (c != '.')) {
            e.consume();
        }
        if (c == '.' && f.getText().contains(".")) {//se trae las textfiel para uw solo tenga un punto
            e.consume();
        }
    }

    private void s2(KeyEvent e) {
        char c = e.getKeyChar();
        if (((c < '0') || (c > '9')) && (c != KeyEvent.VK_BACK_SPACE)//bloquea todas las teclas menos los numeros y el punto
                && (c != '.')) {
            e.consume();
        }
        if (c == '.' && g.getText().contains(".")) {//se trae las textfiel para uw solo tenga un punto
            e.consume();
        }
    }

    private void s3(KeyEvent e) {
        char c = e.getKeyChar();
        if (((c < '0') || (c > '9')) && (c != KeyEvent.VK_BACK_SPACE)//bloquea todas las teclas menos los numeros y el punto
                && (c != '.')) {
            e.consume();
        }
        if (c == '.' && i.getText().contains(".")) {//se trae las textfiel para uw solo tenga un punto
            e.consume();
        }
    }
}
