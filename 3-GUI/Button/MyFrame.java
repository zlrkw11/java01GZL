import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JButton;
import java.awt.*;
import javax.swing.ImageIcon;
import javax.swing.BorderFactory;

import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class MyFrame extends JFrame implements ActionListener{
    JButton button;
    JLabel label;

    boolean y=false;

    MyFrame(){

        //ImageIcon icon1 = new ImageIcon("3-GUI\\Button\\yes.png");
        ImageIcon icon2 = new ImageIcon("3-GUI\\Button\\cool.png");


        label = new JLabel();
        button = new JButton();

        button.setBounds(100, 100, 250, 100);
        label.setBounds(150,250,150,150);
        //button.addActionListener(e -> System.out.println("hi"));
        
        label.setVisible(this.y);
        
        button.setText("button");
        button.setFocusable(false);
        //button.setIcon(icon);
        label.setIcon(icon2);
        button.setHorizontalTextPosition(JButton.CENTER);
        button.setVerticalTextPosition(JButton.BOTTOM);
        button.setFont(new Font("Comic Sans", Font.BOLD,25));
        button.setForeground(Color.red);
        button.setBackground(Color.white);
        button.setBorder(BorderFactory.createEtchedBorder());
        
        button.addActionListener(this);

        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setLayout(null);
        this.setSize(500,500);
        this.setVisible(true);
        this.add(button);
        this.add(label);

        
    }
    
    
    @Override
    public void actionPerformed(ActionEvent e){
        if(e.getSource()==button){
            //System.out.println("hi");
            //button.setEnabled(false);
            label.setVisible(!y);
            this.y = !this.y;
        }
    } 
    

}
