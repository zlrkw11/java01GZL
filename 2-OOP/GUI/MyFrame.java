package GUI;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import java.awt.Color;

public class MyFrame extends JFrame {
        
    MyFrame(){ 
        // setting up 
        this.setTitle("zl11_KAEDE");
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setResizable(false);
        this.setSize(420, 420);
        this.setVisible(true); // make this visible
        
        ImageIcon image = new ImageIcon("2-OOP\\GUI\\rkw.jpg"); // create image icon
        this.setIconImage(image.getImage());
    
        this.getContentPane().setBackground(Color.red);}
   
}
