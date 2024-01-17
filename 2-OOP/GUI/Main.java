package GUI;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import java.awt.Color;

public class Main {
    public static void main(String[] args) {
        JFrame frame = new JFrame();
        
        // setting up 
        frame.setTitle("zl11_KAEDE");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setResizable(false);
        frame.setSize(420, 420);
        frame.setVisible(true); // make frame visible
    
        ImageIcon image = new ImageIcon("2-OOP\\GUI\\rkw.jpg"); // create image icon
        frame.setIconImage(image.getImage());

        frame.getContentPane().setBackground(Color.red);
    
    }
}

