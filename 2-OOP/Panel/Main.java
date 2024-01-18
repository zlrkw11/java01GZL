package Panel;
import javax.swing.JFrame;
import javax.swing.JPanel;
import java.awt.Color;
public class Main {

    public static void main(String[] args) {

        JPanel redPanel = new JPanel();
        redPanel.setBackground(Color.red);
        redPanel.setBounds(0,0,250,250)

        JFrame frame = new JFrame();
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(750,750);
        frame.setLayout(null);
        frame.setVisible(true);

        JFrame.add(redPanel);


    }
}
