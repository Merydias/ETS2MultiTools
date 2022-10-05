import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;

public class RoadPanel extends JPanel{

    public RoadPanel() {
        initComponents();
    }

    private void initComponents() {

        Panel1 = new JPanel();
        Panel2 = new JPanel();
        Panel3 = new JPanel();
        lblRoadPanel = new JLabel("Frais de route");
        lblPeage = new JLabel("Péage :");
        lblFerry = new JLabel("Ferry :");
        lblRcTotal = new JLabel("Total :");
        lblRcResult = new JLabel("");
        lblExtraPanel = new JLabel("Frais Annexe");
        lblCafe = new JLabel("Café :");
        lblRepas = new JLabel("Repas :");
        lblNuit = new JLabel("Nuit :");
        lblEcTotal = new JLabel("Total :");
        lblEcResult = new JLabel("");
        lblInfoPanel = new JLabel("Information");
        txtPeage = new JTextField();
        txtFerry = new JTextField();
        txtCafe = new JTextField();
        txtRepas = new JTextField();
        txtNuit = new JTextField();
        btnTotal1 = new JButton();
        btnTotal2 = new JButton();

        setBackground(Color.green);
        setLayout(null);

        add(Panel1);
        Panel1.setBackground(Color.red);
        Panel1.setBounds(0, 0, 250, 250);
        Panel1.add(lblRoadPanel);
        Panel1.add(lblPeage);
        txtPeage.setColumns(5);
        txtPeage.setToolTipText("[PRIX]");
        Panel1.add(txtPeage);
        Panel1.add(lblFerry);
        txtFerry.setColumns(5);
        txtFerry.setToolTipText("[PRIX]");
        Panel1.add(txtFerry);
        Panel1.add(lblRcTotal);
        Panel1.add(lblRcResult);
        btnTotal1.setText("Total");
        btnTotal1.addActionListener(this::btnTotal1ActionPerformed);
        Panel1.add(btnTotal1);

        add(Panel2);
        Panel2.setBackground(Color.yellow);
        Panel2.setBounds(250,0,250,250);
        Panel2.add(lblExtraPanel);
        Panel2.add(lblCafe);
        txtCafe.setColumns(5);
        txtCafe.setToolTipText("[PRIX]");
        Panel2.add(txtCafe);
        Panel2.add(lblRepas);
        txtRepas.setColumns(5);
        txtRepas.setToolTipText("[PRIX]");
        Panel2.add(txtRepas);
        Panel2.add(lblNuit);
        txtNuit.setColumns(5);
        txtNuit.setToolTipText("[PRIX]");
        Panel2.add(txtNuit);
        Panel2.add(lblEcTotal);
        Panel2.add(lblEcResult);
        Panel2.add(btnTotal2);
        btnTotal2.setText("Total");
        btnTotal2.addActionListener(this::btnTotal2ActionPerformed);
        Panel2.add(btnTotal2);

        add(Panel3);
        Panel3.setBackground(Color.magenta);
        Panel3.setBounds(500,0,250,250);
        add(lblInfoPanel);

    }

    public void btnTotal1ActionPerformed(ActionEvent e) {

        if(txtPeage.getText().isBlank()) {
            txtPeage.setText("0");
            num1 = 0;
        } else {
            num1 = Double.parseDouble(txtPeage.getText());
        }
        if(txtFerry.getText().isBlank()) {
            txtFerry.setText("0");
            num2 = 0;
        } else {
            num2 = Double.parseDouble(txtFerry.getText());
        }
        result1 = num1 + num2;

        lblRcResult.setText(result1 + "");

    }

    public void btnTotal2ActionPerformed(ActionEvent e) {

        if(txtCafe.getText().isBlank()) {
            txtCafe.setText("0");
            num3 = 0;
        } else {
            num3 = Double.parseDouble(txtCafe.getText());
        }

        if(txtRepas.getText().isBlank()) {
            txtRepas.setText("0");
            num4 = 0;
        } else {
            num4 = Double.parseDouble(txtRepas.getText());
        }

        if(txtNuit.getText().isBlank()) {
            txtNuit.setText("0");
            num5 = 0;
        } else {
            num5 = Double.parseDouble(txtNuit.getText());
        }

        result2 = num3 + num4 + num5;

        lblEcResult.setText(result2 + "");

    }


    JPanel Panel1, Panel2, Panel3;
    JLabel lblRoadPanel, lblPeage, lblFerry, lblRcTotal, lblRcResult, lblExtraPanel, lblCafe, lblRepas, lblNuit, lblEcTotal, lblEcResult, lblInfoPanel;
    JTextField txtPeage, txtFerry, txtCafe, txtRepas, txtNuit;
    JButton btnTotal1,btnTotal2;
    double num1, num2, num3, num4, num5, result1, result2;

}

