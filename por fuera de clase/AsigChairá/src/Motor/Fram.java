package Motor;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.ButtonGroup;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JRadioButton;
import javax.swing.JTextField;

public class Fram implements ActionListener {

    JFrame a;
    JLabel b, c, d, e, f, g, h, i, j, k;
    JTextField l, m, n, o;
    ButtonGroup p;
    JRadioButton q, r;
    JButton t, u, v, x, y;

    public void Ccom() {
        //content label prin
        b = new JLabel("Sistema de asignación de correos CHAIRÁ");
        Font font = new Font("Courier", Font.BOLD, 25);
        b.setBackground(Color.BLACK);
        b.setBounds(125, 20, 550, 30);
        b.setFont(font);

        c = new JLabel("Primer Nombre:");
        Font font2 = new Font("Courier", Font.BOLD, 18);
        c.setForeground(Color.black);
        c.setBounds(60, 100, 150, 30);
        c.setFont(font2);

        d = new JLabel("Segundo Nombre:");
        Font font3 = new Font("Courier", Font.BOLD, 18);
        d.setForeground(Color.black);
        d.setBounds(450, 100, 200, 30);
        d.setFont(font3);

        e = new JLabel("Primer Apellido:");
        Font font4 = new Font("Courier", Font.BOLD, 18);
        e.setForeground(Color.black);
        e.setBounds(60, 200, 200, 30);
        e.setFont(font4);

        f = new JLabel("Segundo Apellido:");
        Font font5 = new Font("Courier", Font.BOLD, 18);
        f.setForeground(Color.black);
        f.setBounds(450, 200, 200, 30);
        f.setFont(font5);

        //content textfi
        l = new JTextField();
        l.setBounds(60, 150, 300, 30);

        m = new JTextField();
        m.setBounds(450, 150, 300, 30);

        n = new JTextField();
        n.setBounds(60, 250, 300, 30);

        o = new JTextField();
        o.setBounds(450, 250, 300, 30);

        //seccions
        g = new JLabel("Generador de password: ");
        Font font6 = new Font("Courier", Font.BOLD, 18);
        g.setForeground(Color.lightGray);
        g.setBounds(60, 350, 250, 30);
        g.setFont(font6);

        q = new JRadioButton("Solo letras.");
        Font font7 = new Font("Courier", Font.BOLD, 15);
        q.setBounds(300, 350, 110, 30);
        q.setFont(font7);
        q.setForeground(Color.BLACK);

        r = new JRadioButton("Completa.");
        Font font8 = new Font("Courier", Font.BOLD, 15);
        r.setBounds(450, 350, 100, 30);
        r.setFont(font8);
        r.setForeground(Color.BLACK);

        p = new ButtonGroup();
        p.add(q);
        p.add(r);

        //zone butto
        t = new JButton("Crear");
        t.setBackground(Color.LIGHT_GRAY);
        t.setForeground(Color.BLACK);
        t.setBounds(355, 430, 90, 30);

        u = new JButton("Ver Inscritos");
        u.setBackground(Color.LIGHT_GRAY);
        u.setForeground(Color.BLACK);
        u.setBounds(60, 500, 150, 30);

        v = new JButton("Ver Completo");
        v.setBackground(Color.LIGHT_GRAY);
        v.setForeground(Color.BLACK);
        v.setBounds(600, 500, 150, 30);
    }

    public void Cfra() {
        a = new JFrame("Asignament Chairá");
        a.setSize(800, 600);

        a.add(b);
        a.add(c);
        a.add(d);
        a.add(e);
        a.add(f);

        a.add(l);
        a.add(m);
        a.add(n);
        a.add(o);

        a.add(q);
        a.add(r);

        a.add(t);
        a.add(u);
        a.add(v);

        a.add(g);
        a.setLayout(null);
        a.setResizable(false);
        a.setVisible(true);
        a.setLocationRelativeTo(null);
        a.setDefaultCloseOperation(a.EXIT_ON_CLOSE);
    }
    public void paint(){
        Imagen im= new Imagen();
        a.add(im);
        a.repaint();
    }
    public Fram() {
        Ccom();
        Cfra();
        paint();
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        Core co = new Core();
        if (e.getSource() == t) {

        }
        if (e.getSource() == u) {

        }
        if (e.getSource() == v) {

        }
    }

    public class Imagen extends javax.swing.JPanel {

        public Imagen() {
            this.setSize(a.getWidth(), a.getHeight()); //se selecciona el tamaño del panel
        }

        //Se crea un método cuyo parámetro debe ser un objeto Graphics
        public void paint(Graphics grafico) {
            Dimension height = getSize();
            //Se selecciona la imagen que tenemos en el paquete de la //ruta del programa
            ImageIcon Img = new ImageIcon(getClass().getResource("/media/1.jpg"));

            //se dibuja la imagen que tenemos en el paquete Images //dentro de un panel
            grafico.drawImage(Img.getImage(), 0, 0, a.getWidth(), a.getHeight(), null);

            setOpaque(false);
            super.paintComponent(grafico);
        }
    }

}
