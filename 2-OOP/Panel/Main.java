package Panel;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JLabel;

import javax.swing.ImageIcon;
import java.awt.Color;

public class Main {

    public static void main(String[] args) {

        ImageIcon icon = new ImageIcon("2-OOP\\Panel\\rkw.jpg");

        JLabel label = new JLabel();
        label.setText("ZLRKW11");
        label.setIcon(icon);

        JPanel redPanel = new JPanel();
        redPanel.setBackground(Color.red);
        redPanel.setBounds(0,0,250,250);

        JPanel bluePanel = new JPanel();
        bluePanel.setBackground(Color.blue);
        bluePanel.setBounds(250,0,250,250);

        JPanel greenPanel = new JPanel();
        greenPanel.setBackground(Color.green);
        greenPanel.setBounds(0,250,500,250);

        JFrame frame = new JFrame();
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(750,750);
        frame.setLayout(null);
        frame.setVisible(true);


        greenPanel.add(label);


        frame.add(redPanel);
        frame.add(bluePanel);
        frame.add(greenPanel);

    }
}
