package Label;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.ImageIcon;
public class Main {
    public static void main(String[] args) {

        ImageIcon image = new ImageIcon("2-OOP\\Label\\sd.jpg");

        JLabel label = new JLabel();
        label.setText("Bro, do you even code?");
        label.setIcon(image);

        JFrame frame = new JFrame();
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(500,500);
        frame.setVisible(true);
        frame.add(label);
        frame.setResizable(false);
    }
}
