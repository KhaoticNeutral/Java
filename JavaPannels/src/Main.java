import javax.swing.*;
import java.awt.*;

public class Main {
    public static void main(String[] args) {

        ImageIcon icon1 = new ImageIcon("blueIcon.png");
        ImageIcon icon2 = new ImageIcon("orangeIcon.png");
        ImageIcon icon3 = new ImageIcon("brownIcon.png");

        JLabel label1 = new JLabel();
        label1.setText("Clouds");
        label1.setIcon(icon1);
        label1.setVerticalAlignment(JLabel.BOTTOM);
        label1.setHorizontalAlignment(JLabel.CENTER);

        JLabel label2 = new JLabel();
        label2.setIcon(icon2);
        label2.setBounds(0,0,75,75);//with set bounds it'll set the icon within the co-ordinates of that panel and not the frame

        JLabel label3 = new JLabel();
        label3.setIcon(icon3);

        JPanel panel1 = new JPanel();
        panel1.setBackground(new Color(0x2596be));
        panel1.setBounds(0,0,500,1000);


        JPanel panel2 = new JPanel();
        panel2.setBackground(new Color(0xe25327));
        panel2.setBounds(250,0,500,1000);
        panel1.setLayout(null); //if you didn't want to use the layout manager


        JPanel panel3 = new JPanel();
        panel3.setBackground(new Color(0x4f2b11));
        panel3.setBounds(0,250,500,1000); //you can get really stupid with the measurements

        JFrame frame = new JFrame();
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setLayout(null);
        frame.setSize(800, 600);
        frame.setVisible(true);
        panel1.add(label1);
        panel2.add(label2);
        panel3.add(label3);
        frame.add(panel1);
        frame.add(panel2);
        frame.add(panel3);

    }
}
// Jpanels is a GUI component that functions as a container to holf other components