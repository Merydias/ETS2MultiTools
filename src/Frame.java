import javax.swing.*;
import java.awt.*;

public class Frame extends JFrame {
    public Frame(){
        initComponents();
        this.getContentPane().setBackground(new Color(241,241,242));
    }

    private void initComponents() {

        JTabbedPane tabBar = new JTabbedPane();
        JPanel panel1 = new AccueilPanel();
        JPanel panel2 = new EntreprisePanel();
        JPanel panel3 = new RoadPanel();
        JPanel panel4 = new GasStationPanel();

        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setTitle("ETS2 Multitools");
        setSize(750,750);
        setResizable(false);
        setLocationRelativeTo(null);

        tabBar.setBounds(0,0,750,750);
        tabBar.addTab("Accueil", panel1);
        tabBar.addTab("Entreprise", panel2);
        tabBar.addTab("Feuille de route", panel3);
        tabBar.addTab("Station Service", panel4);

        add(tabBar);

    }
}
