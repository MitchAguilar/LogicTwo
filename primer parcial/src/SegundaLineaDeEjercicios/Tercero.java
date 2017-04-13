package SegundaLineaDeEjercicios;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import javax.swing.ButtonGroup;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JRadioButton;
import javax.swing.JTextField;
import javax.swing.event.ChangeEvent;
import javax.swing.event.ChangeListener;

/*
    La secretaria de salud requiere un diagrama de flujo que le represente el algoritmo
    que permita determinar qué tipo de vacuna (A, B o C) debe aplicar a una persona,
    considerando que si es mayor de 70 años, sin importar el sexo, se le aplica la tipo C;
    si tiene entre 16 y 69 años, y es mujer, se le aplica la B, y si es hombre, la A; si es
    menor de 16 años, se le aplica la tipo A, sin importar el sexo.
 */
public class Tercero implements ActionListener,ChangeListener{
    
    JFrame a;
    JLabel b, c, d;
    JRadioButton e, f;
    JTextField g;
    ButtonGroup h;
    JButton i;
    boolean j;
    
    public void C() {
        //content labels
        b = new JLabel("Digite sus valores.");
        b.setBounds(150, 20, 100, 20);
        
        c = new JLabel("Edad: ");
        c.setBounds(20, 60, 50, 20);
        
        d = new JLabel("Sexo: ");
        d.setBounds(20, 100, 50, 20);

        //content text
        g = new JTextField();
        g.setBounds(100, 60, 250, 30);
        g.addKeyListener(new KeyAdapter() {//block letras
            public void keyTyped(KeyEvent e) {
                s(e);
            }
        });

        //content radio
        e = new JRadioButton("Masculino");
        e.setBounds(100, 100, 100, 30);
        e.addChangeListener(this);
        
        f = new JRadioButton("Femenino");
        f.setBounds(250, 100, 100, 30);
        f.addChangeListener(this);

        //group but
        h = new ButtonGroup();
        h.add(e);
        h.add(f);
        
        //content butt
        i=new JButton("Calcular");
        i.setBounds(150, 150, 100, 30);
        i.addActionListener(this);
    }
    
    public void F() {
        a = new JFrame("Vacunación");
        a.setSize(400, 250);
        
        a.add(c);
        a.add(d);
        a.add(g);
        a.add(e);
        a.add(f);
        a.add(i);
        a.add(b);
        
        a.setLayout(null);
        a.setLocationRelativeTo(null);
        a.setVisible(true);
        a.setResizable(false);
        a.setDefaultCloseOperation(a.EXIT_ON_CLOSE);
    }
    
    public Tercero() {
        C();
        F();
    }
    
    public static void main(String[] arg) {
        Tercero a = new Tercero();
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if(e.getSource().equals(i)){
            double k=Double.parseDouble(g.getText());
            if(g.getText()==null){
                JOptionPane.showMessageDialog(null, "A mi no me engañas, ingresa algun valor! ");
                return;
            }
            if(k>70){
                JOptionPane.showMessageDialog(null, "Se debe aplicar vacuna \n----C----");
            }else if((k>=16 && k<=69)&& j==false){
                JOptionPane.showMessageDialog(null, "Se debe aplicar vacuna \n----B----");
            }else if((k>=16 && k<=69)&& j==true){
                JOptionPane.showMessageDialog(null, "Se debe aplicar vacuna \n----A----");
            }else if(k<16){
                JOptionPane.showMessageDialog(null, "Se debe aplicar vacuna \n----A----");
            }
        }
    }

    @Override
    public void stateChanged(ChangeEvent z) {
        if(e.isSelected()){
            j=true;
        }
        if(f.isSelected()){
            j=false;
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
}
