package boletin24;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.Graphics;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;
import javax.swing.JPanel;

public class Evento extends JFrame implements ActionListener{
    JFrame marco = new JFrame("Boletin 24");
    JPanel panel1  = new JPanel();
    JPanel panel2  = new JPanel();
    JButton bDebuxa = new JButton("Dibuxa");
    JButton bLimpia = new JButton("Limpia");
    JTextField jtNumeros = new JTextField("0");
    
    public Evento(){
        marco.setSize(300,250);
        jtNumeros.setBounds(75,40,150, 30);
        panel1.setLayout(null);
        panel2.setLayout(new FlowLayout());
        
        panel1.add(jtNumeros);
        panel2.add(bDebuxa);
        panel2.add(bLimpia);
        marco.add(panel1);
        marco.add(panel2,BorderLayout.SOUTH);
        
        bDebuxa.addActionListener(this);
        bLimpia.addActionListener(this);

        marco.setLocationRelativeTo(marco);
        marco.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        marco.setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        Object boton = e.getSource();
        if (boton==bDebuxa){
            Graphics g =panel1.getGraphics();
            int numCirculos = Integer.parseInt(jtNumeros.getText()); 
            for (int i=1; i<=numCirculos;i++) {  
                int xs = (int) (Math.random()*40)+100;
                int ys = (int) (Math.random()*50)+100;
                g.setColor (Color.RED);
                g.drawOval (xs, ys, 30, 30);
            } 
        }else{
            Graphics g =panel1.getGraphics();
            g.clearRect(60, 70, 200, 200);
        }
    }
}