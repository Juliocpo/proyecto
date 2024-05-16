package com.mycompany.e;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.SwingConstants;
public class App {

    public static void main(String[] args) {
       JFrame frame= new JFrame();
        frame.setSize(300,300);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setResizable(false);
        frame.setVisible(true);
        
        JButton boton = new JButton("423064647");
        boton.setBounds(50, 110, 200, 40);
        boton.addActionListener((ActionEvent e) -> {
            JFrame segundaVentana = new JFrame();
            segundaVentana.setSize(800, 200);
            segundaVentana.setLocationRelativeTo(null);
            segundaVentana.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
            segundaVentana.setResizable(false);
            JLabel label = new JLabel("Julio Cesar Paz Orduñez/423064647/ 22/12/2003 /10a. Cerrada Av. de las torres 10 cp:09970");
            label.setHorizontalAlignment(SwingConstants.CENTER);
            
            segundaVentana.add(label);
            segundaVentana.setVisible(true);
       });

        frame.add(boton);
        frame.setLayout(null); // Usamos un layout nulo para poder posicionar los componentes manualmente
        frame.setVisible(true);
        
        
       

      
       
        
        
    }

   

    
}
