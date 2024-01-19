import javax.swing.JFrame;
import javax.swing.JButton;
import java.awt.*;

import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class MyFrame extends JFrame implements ActionListener{
    JButton button;
    MyFrame(){

        button = new JButton();
        button.setBounds(200, 100, 100, 50);

        //button.addActionListener(e -> System.out.println("hi"));
        button.addActionListener(this);

        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setLayout(null);
        this.setSize(500,500);
        this.setVisible(true);
        this.add(button);

        
    }
    @Override
    public void actionPerformed(ActionEvent e){
        if(e.getSource()==button){
            System.out.println("hi");
        }
    } 
}
