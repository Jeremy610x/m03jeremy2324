/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Vista;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JFrame;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;

/**
 *
 * @author geova
 */
public class BmiFrame extends JFrame implements ActionListener {
    private ActionListener listener;

    public BmiFrame()  {
        
        listener =this;
        initComponents();
    }

    private void initComponents() {

        this.setTitle("Titulo ");
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        
        //menu
        setUpMenu();
        //panell
        displayBmiPanell();
        //tamany
        setSize(500,500);
        //set Window Location
        setLocationRelativeTo(null);


    }

    private void setUpMenu() {
        JMenuBar menuBar = new JMenuBar();
        JMenu menu;
        JMenuItem menuItem;

        menu = new JMenu ("Texto 1 ");
        
        
         menuItem = new JMenuItem("Pokemon");
        menuItem.setActionCommand("Pokemon");
        menuItem.addActionListener(listener);
        menu.add(menuItem);
        

    }

    @Override
    public void actionPerformed(ActionEvent e) {

                



    }

    private void displayBmiPanell() {






    }
    
}
