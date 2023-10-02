/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package sumarestamultydiv;

import Vista.BmiFrame;
import javax.swing.SwingUtilities;

/**
 *
 * @author geova
 */
public class Sumarestamultydiv {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        SwingUtilities.invokeLater(new Runnable() {
            @Override
            public void run() { //opció recomanda llibreria java.swing
                BmiFrame app = new BmiFrame();
                app.setVisible(true);
            }
        });
    }

}
