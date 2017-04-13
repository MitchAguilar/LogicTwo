package MotorVis;

import java.awt.Color;
import java.awt.Font;
import javax.swing.JFrame;
import javax.swing.JLabel;

public class O {
JFrame a;
    JLabel e,b,c,d,f;
    public void C(){
        //button zone
        b= new JLabel("Decimal");
        b.setBounds(40, 100, 110, 20);
        
        c= new JLabel("Binario");
        c.setBounds(220, 100, 110, 20);
        
        d=new JLabel("Octales");
        d.setBounds(40, 170, 110, 20);
        
        f= new JLabel("Hexadec");
        f.setBounds(220, 170, 110, 20);
        //label zone
        e= new JLabel("Elija su opción de conversión");
        e.setBounds(60, 20, 300, 30);
        Font f = new Font("Courier", Font.BOLD, 15);
        e.setFont(f);
        e.setForeground(Color.BLACK);
    }
    
    public void V(){
        a= new JFrame("Octal");
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
        a.setDefaultCloseOperation(a.HIDE_ON_CLOSE);
    }
    
    public O(){
        C();
        V();
    }    
}
