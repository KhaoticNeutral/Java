import javax.swing.*;
import java.awt.*;

public class Main {
    public static void main(String[] args) {

        JFrame frame = new JFrame();
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(800, 600);
        frame.setLayout(new BorderLayout(10,10));
        frame.setVisible(true);

        JPanel panel1 = new JPanel();
        JPanel panel2 = new JPanel();
        JPanel panel3 = new JPanel();
        JPanel panel4 = new JPanel();
        JPanel panel5 = new JPanel();

        panel1.setBackground(Color.red);
        panel2.setBackground(Color.green);
        panel3.setBackground(Color.blue);
        panel4.setBackground(Color.yellow);
        panel5.setBackground(Color.magenta);

        panel1.setPreferredSize(new Dimension(100, 50));
        panel2.setPreferredSize(new Dimension(100, 50));
        panel3.setPreferredSize(new Dimension(100, 50));
        panel4.setPreferredSize(new Dimension(100, 50));
        panel5.setPreferredSize(new Dimension(100, 50));

        //sub pannels

        JPanel panel6 = new JPanel();
        JPanel panel7 = new JPanel();
        JPanel panel8 = new JPanel();
        JPanel panel9 = new JPanel();
        JPanel panel10 = new JPanel();

        panel6.setBackground(Color.black);
        panel7.setBackground(Color.darkGray);
        panel8.setBackground(Color.gray);
        panel9.setBackground(Color.lightGray);
        panel10.setBackground(Color.white);

        panel5.setLayout(new BorderLayout());

        panel6.setPreferredSize(new Dimension(50, 50));
        panel7.setPreferredSize(new Dimension(50, 50));
        panel8.setPreferredSize(new Dimension(50, 50));
        panel9.setPreferredSize(new Dimension(50, 50));
        panel10.setPreferredSize(new Dimension(50, 50));

        panel5.add(panel6, BorderLayout.NORTH);
        panel5.add(panel7, BorderLayout.SOUTH);
        panel5.add(panel8, BorderLayout.WEST);
        panel5.add(panel9, BorderLayout.EAST);
        panel5.add(panel10, BorderLayout.CENTER);

        //sub pannels

        panel1.setPreferredSize(new Dimension(100, 50));
        panel2.setPreferredSize(new Dimension(100, 50));
        panel3.setPreferredSize(new Dimension(100, 50));
        panel4.setPreferredSize(new Dimension(100, 50));
        panel5.setPreferredSize(new Dimension(100, 50));


        frame.add(panel1, BorderLayout.NORTH);
        frame.add(panel2, BorderLayout.WEST);
        frame.add(panel3, BorderLayout.SOUTH);
        frame.add(panel4, BorderLayout.EAST);
        frame.add(panel5, BorderLayout.CENTER);

    }
}

//Layout manager = defines the natural layout for components within a container

//theres 3 common managers

//Border Layout places components in five areas, north, south, west, east and centre
//all extra spaces is places in the centre area
//the center will proportion itself according to the size of the frame
//top and bottom or noth and south will adjust not vertically but horizontally
//and the left and right or east and west will adjust not horizontally but vertically
