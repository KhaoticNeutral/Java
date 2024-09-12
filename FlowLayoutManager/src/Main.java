import javax.swing.*;
import java.awt.*;

public class Main {
    public static void main(String[] args) {

        JFrame frame = new JFrame();
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(500,500);
        frame.setLayout(new FlowLayout(FlowLayout.CENTER,10,10)); //the default is centre, leading is left, trailing is right
        //the first number is veritical spacing the second is horizontal spacing

        JPanel panel = new JPanel();
        panel.setPreferredSize(new Dimension(100,250));
        panel.setBackground(Color.gray);
        panel.setLayout(new FlowLayout()); //the panel is now acting as the "frame"


        panel.add(new JButton("1"));
        panel.add(new JButton("2"));
        panel.add(new JButton("3"));
        panel.add(new JButton("4"));
        panel.add(new JButton("5"));
        panel.add(new JButton("6"));
        panel.add(new JButton("7"));
        panel.add(new JButton("8"));
        panel.add(new JButton("9"));

        frame.add(panel);
        frame.setVisible(true);
    }
}

//Layout manager defines the natural layout for components within a container
//this is one of the three layout managers
//Flow layout places components ina row, sized at their preffered size
//if the horizontal space in the container is too small the flow layout will move it to the next row