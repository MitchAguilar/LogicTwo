package SegundaLineaDeEjercicios;

import java.awt.Color;
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
    La asociación de vinicultores tiene como política fijar un precio inicial al kilo de uva,
    la cual se clasifica en tipos A y B, y además en tamaños 1 y 2. Cuando se realiza la
    venta del producto, ésta es de un solo tipo y tamaño, se requiere determinar cuánto
    recibirá un productor por la uva que entrega en un embarque, considerando lo
    siguiente: si es de tipo A, se le cargan 20¢ al precio inicial cuando es de tamaño 1; y
    30¢ si es de tamaño 2. Si es de tipo B, se rebajan 30¢ cuando es de tamaño 1, y 50¢
    cuando es de tamaño. Realice un algoritmo para determinar la ganancia obtenida.
 */
public class Cuarto implements ActionListener,ChangeListener {
    
    JFrame a;
    JLabel b, c, d, e;
    JTextField f;
    JRadioButton g, h, i, j;
    ButtonGroup k, l;
    JButton m;
    int n,o;

    public int getN() {
        return n;
    }

    public void setN(int n) {
        this.n = n;
    }

    public int getO() {
        return o;
    }

    public void setO(int o) {
        this.o = o;
    }
    
    
    public void C() {
        //content labels
        b = new JLabel("Digite Sus Valores");
        b.setBounds(185, 20, 130, 20);
        
        c = new JLabel("Presio General:");
        c.setBounds(40, 100, 130, 20);
        
        d = new JLabel("Tipo Fruta:");
        d.setBounds(40, 180, 130, 20);
        
        e = new JLabel("Tamaño Fruta:");
        e.setBounds(40, 260, 130, 20);

        //content textf
        f = new JTextField();
        f.setBounds(200, 100, 250, 30);
        f.addKeyListener(new KeyAdapter() {//block letras
            public void keyTyped(KeyEvent e) {
                s(e);
            }
        });
        //content radiobu
        g = new JRadioButton("Tipo A");
        g.setBounds(200, 180, 100, 30);
        g.addChangeListener(this);
        
        h = new JRadioButton("Tipo B");
        h.setBounds(300, 180, 100, 30);
        h.addChangeListener(this);
        
        i = new JRadioButton("Tamaño 1");
        i.setBounds(200, 260, 100, 30);
        i.addChangeListener(this);
        
        j = new JRadioButton("Tamaño 2");
        j.setBounds(300, 260, 100, 30);
        j.addChangeListener(this);
        //groups
        k = new ButtonGroup();
        k.add(g);
        k.add(h);
        
        l = new ButtonGroup();
        l.add(i);
        l.add(j);
        //content button
        m = new JButton("Calcular");
        m.setBackground(Color.LIGHT_GRAY);
        m.setBounds(185, 350, 100, 30);
        m.addActionListener(this);
        
    }
    
    public void F() {
        a = new JFrame("Precio de fruta");
        a.setSize(500, 450);
        
        a.add(b);
        a.add(c);
        a.add(d);
        a.add(e);
        a.add(f);
        a.add(g);
        a.add(h);
        a.add(i);
        a.add(j);
        a.add(m);
        
        a.setLayout(null);
        a.setLocationRelativeTo(null);
        a.setVisible(true);
        a.setResizable(false);
        a.setDefaultCloseOperation(a.EXIT_ON_CLOSE);
    }
    
    public Cuarto() {
        C();
        F();
    }
    
    public static void main(String[] args) {
        Cuarto a = new Cuarto();
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
    
    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource().equals(m)) {
            double f2= Double.parseDouble(f.getText());
            if(getN()==1&&getO()==1){
                JOptionPane.showMessageDialog(null, "Ganacia total es de: "+(f2+20));
            }
            if(getN()==1&&getO()==2){
                JOptionPane.showMessageDialog(null, "Ganacia total es de: "+(f2+30));
            }
            if(getN()==2&&getO()==1){
                JOptionPane.showMessageDialog(null, "Ganacia total es de: "+(f2-30));
            }
            if(getN()==2&&getO()==2){
                JOptionPane.showMessageDialog(null, "Ganacia total es de: "+(f2-50));
            }
        }
    }

    @Override
    public void stateChanged(ChangeEvent e) {
        if(g.isSelected()){
            setN(1);
        }
        if(h.isSelected()){
            setN(2);
        }
        if(i.isSelected()){
            setO(1);
        }
        if(j.isSelected()){
            setO(2);
        }
    }
}
