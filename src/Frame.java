import javax.swing.*;
import java.awt.*;

public class Frame extends JFrame {
    public Frame(){
        initComponents();
        this.getContentPane().setBackground(new Color(241,241,242));
    }

    private void initComponents() {
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setTitle("ETS2 Multitools");
        setSize(750,750);
        setResizable(false);
        setLocationRelativeTo(null);
    }
}
