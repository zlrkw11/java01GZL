import javax.swing.JFrame;
import javax.swing.JButton;

public class MyFrame extends JFrame{
    
    MyFrame(){

        JButton button = new JButton();
        button.setBounds(200, 100, 100, 50);


        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setLayout(null);
        this.setSize(500,500);
        this.setVisible(true);
        this.add(button);
    }
}
