/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Vista;

import java.awt.BorderLayout;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
import Model.Calc;

/**
 *
 * @author geova
 */
public class BmiPanel extends JPanel implements ActionListener {

    private Calc Model;
    private JTextField tfNum1;
    private JTextField tfNum2;
    private JTextField tfResultat;
    private ActionListener listener;

    public BmiPanel() {
        listener = this;
        initComponents();
      
    }

    private void initComponents() {
        setLayout(new BorderLayout());
        //this.setLayout(...);

        JLabel lbHeader = new JLabel("Calculo");
        lbHeader.setHorizontalAlignment(JLabel.CENTER);
        this.add(lbHeader, BorderLayout.NORTH);
        JPanel form_principal = createBmiForm();
        this.add(form_principal, BorderLayout.CENTER);

    }

    private JPanel createBmiForm() {
        JPanel panel = new JPanel();
        panel.setLayout(new GridLayout(0, 2));

        panel.add(new JLabel("Numero 1"));
        tfNum1 = new JTextField(20);
        panel.add(tfNum1);

        panel.add(new JLabel("Numero 2"));
        tfNum2 = new JTextField(20);
        panel.add(tfNum2);

        panel.add(new JLabel("Resultat"));
        tfResultat = new JTextField(20);
        panel.add(tfResultat);

        JButton btSUM = new JButton("Sumar");
        btSUM.addActionListener(listener);
        btSUM.setActionCommand("Sumar");
        panel.add(btSUM);

        JButton btResta = new JButton("Restar");
        btResta.addActionListener(listener);
        btResta.setActionCommand("Restar");
        panel.add(btResta);

        JButton btMult = new JButton("Multiplicar");
        btMult.addActionListener(listener);
        btMult.setActionCommand("Multiplicar");
        panel.add(btMult);

        JButton btDiv = new JButton("Dividir");
        btDiv.addActionListener(listener);
        btDiv.setActionCommand("Dividir");
        panel.add(btDiv);

        return panel;
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        String action = e.getActionCommand();
        switch (action) {
            case "Sumar":
                doSumar();
                break;
            case "Restar":
                doRestar();
                break;
            case "Multiplicar":
                doMultiplicar();
                break;
            case "Dividir":
                doDividir();

                break;
        }
    }

    private void doSumar() {
        String sNum1 = tfNum1.getText();
        String sNum2 = tfNum2.getText();

        int num1 = Integer.parseInt(sNum1);
        int num2 = Integer.parseInt (sNum2);

        Model = new Calc(num1, num2);
        int result = Model.sumar();
        tfResultat.setText(String.valueOf(result));

    }
    
    private void doRestar() {
        String sNum1 = tfNum1.getText();
        String sNum2 = tfNum2.getText();

        int num1 = Integer.parseInt(sNum1);
        int num2 = Integer.parseInt(sNum2);

        Model = new Calc(num1, num2);
        int result = Model.restar();
        tfResultat.setText(String.valueOf(result));

    }
    
    private void doMultiplicar() {
        String sNum1 = tfNum1.getText();
        String sNum2 = tfNum2.getText();

        int num1 = Integer.parseInt(sNum1);
        int num2 = Integer.parseInt(sNum2);

        Model = new Calc(num1, num2);
        int result = Model.multi();
        tfResultat.setText(String.valueOf(result));

    }
    
    private void doDividir() {
        String sNum1 = tfNum1.getText();
        String sNum2 = tfNum2.getText();

        int num1 = Integer.parseInt(sNum1);
       int num2 = Integer.parseInt(sNum2);

        Model = new Calc(num1, num2);
        int result = (int) Model.divid();
        tfResultat.setText(String.valueOf(result));

    }

}
