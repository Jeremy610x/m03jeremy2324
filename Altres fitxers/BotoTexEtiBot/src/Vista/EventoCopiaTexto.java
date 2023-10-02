/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Vista;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;

/**
 *
 * @author geova
 */

    public class EventoCopiaTexto implements ActionListener {
    private JTextField textoField;
    private JLabel etiqueta;
    private JButton boton;

    public EventoCopiaTexto(JTextField textoField, JLabel etiqueta, JButton boton) {
        this.textoField = textoField;
        this.etiqueta = etiqueta;
        this.boton = boton;
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        String deberes = textoField.getText();
        etiqueta.setText(deberes);
        JOptionPane.showMessageDialog(null, etiqueta.getText());
    }
    }
    
 
   
    
    
    

