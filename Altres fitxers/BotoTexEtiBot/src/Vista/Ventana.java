/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Vista;

import java.awt.Container;
import java.awt.FlowLayout;
import java.awt.HeadlessException;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

/**
 *
 * @author geova
 */
public class Ventana extends JFrame {
    JTextField text;
    JLabel etiq;
    JButton botto;

    public Ventana()  {
        
        super("Boton");
        this.setSize(300, 150);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLayout(new FlowLayout());
        
        
        Container cp = getContentPane();
        cp.setLayout(new FlowLayout());
        
        
        // Cuadro de texto
        text = new JTextField("TEXTO DEURES M03");
        cp.add(text);

        // Etiq
        etiq = new JLabel();
        cp.add(etiq);

        // Boto
        botto = new JButton("Copiar texto");
        cp.add(botto);
        
        botto.addActionListener(new EventoCopiaTexto(text, etiq, botto));
        
        
    }
    
    
    
}
