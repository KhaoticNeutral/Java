import javax.swing.*;
import java.awt.*;

public class Main {
    public static void main(String[] args) {
        // Create a new JFrame (the main window of the application).
        JFrame frame = new JFrame();
        // Set the default close operation to exit the application when the window is closed.
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        // Set the size of the JFrame to 800x600 pixels.
        frame.setSize(800, 600);
        // Set the layout of the frame to BorderLayout with 10 pixels of horizontal and vertical gaps between components.
        frame.setLayout(new BorderLayout(10, 10));
        // Make the frame visible.
        frame.setVisible(true);

        // Create five JPanel instances with default (FlowLayout) layout.
        JPanel panel1 = new JPanel();
        JPanel panel2 = new JPanel();
        JPanel panel3 = new JPanel();
        JPanel panel4 = new JPanel();
        JPanel panel5 = new JPanel();

        // Set background colors for each panel.
        panel1.setBackground(Color.red);      // Red color for panel1
        panel2.setBackground(Color.green);    // Green color for panel2
        panel3.setBackground(Color.blue);     // Blue color for panel3
        panel4.setBackground(Color.yellow);   // Yellow color for panel4
        panel5.setBackground(Color.magenta);  // Magenta color for panel5

        // Set the preferred size for each panel. 
        // This suggests to the layout manager how big the panels should be.
        panel1.setPreferredSize(new Dimension(100, 50)); // Panel height of 50 pixels
        panel2.setPreferredSize(new Dimension(100, 50));
        panel3.setPreferredSize(new Dimension(100, 50));
        panel4.setPreferredSize(new Dimension(100, 50));
        panel5.setPreferredSize(new Dimension(100, 50));

        // Create sub-panels that will be added inside panel5 (which uses a BorderLayout).
        JPanel panel6 = new JPanel();
        JPanel panel7 = new JPanel();
        JPanel panel8 = new JPanel();
        JPanel panel9 = new JPanel();
        JPanel panel10 = new JPanel();

        // Set different shades of gray for the background of each sub-panel.
        panel6.setBackground(Color.black);      // Black color for panel6
        panel7.setBackground(Color.darkGray);   // Dark Gray color for panel7
        panel8.setBackground(Color.gray);       // Gray color for panel8
        panel9.setBackground(Color.lightGray);  // Light Gray color for panel9
        panel10.setBackground(Color.white);     // White color for panel10

        // Set the layout of panel5 to BorderLayout to arrange its sub-panels.
        panel5.setLayout(new BorderLayout());

        // Set the preferred size for each sub-panel.
        panel6.setPreferredSize(new Dimension(50, 50)); // Panel height of 50 pixels
        panel7.setPreferredSize(new Dimension(50, 50));
        panel8.setPreferredSize(new Dimension(50, 50));
        panel9.setPreferredSize(new Dimension(50, 50));
        panel10.setPreferredSize(new Dimension(50, 50));

        // Add sub-panels to panel5 in different regions of the BorderLayout.
        panel5.add(panel6, BorderLayout.NORTH); // Adds panel6 to the top (north) of panel5
        panel5.add(panel7, BorderLayout.SOUTH); // Adds panel7 to the bottom (south) of panel5
        panel5.add(panel8, BorderLayout.WEST);  // Adds panel8 to the left (west) of panel5
        panel5.add(panel9, BorderLayout.EAST);  // Adds panel9 to the right (east) of panel5
        panel5.add(panel10, BorderLayout.CENTER); // Adds panel10 to the center of panel5

        // Re-setting the preferred size for panels 1-5 again. 
        // This is redundant here since the sizes were already set above.
        panel1.setPreferredSize(new Dimension(100, 50));
        panel2.setPreferredSize(new Dimension(100, 50));
        panel3.setPreferredSize(new Dimension(100, 50));
        panel4.setPreferredSize(new Dimension(100, 50));
        panel5.setPreferredSize(new Dimension(100, 50));

        // Add each panel to the main frame in different regions of the BorderLayout.
        frame.add(panel1, BorderLayout.NORTH); // Adds panel1 to the top (north) of the frame
        frame.add(panel2, BorderLayout.WEST);  // Adds panel2 to the left (west) of the frame
        frame.add(panel3, BorderLayout.SOUTH); // Adds panel3 to the bottom (south) of the frame
        frame.add(panel4, BorderLayout.EAST);  // Adds panel4 to the right (east) of the frame
        frame.add(panel5, BorderLayout.CENTER); // Adds panel5 (containing sub-panels) to the center of the frame
    }
}
//Layout manager = defines the natural layout for components within a container

//theres 3 common managers

//Border Layout places components in five areas, north, south, west, east and centre
//all extra spaces is places in the centre area
//the center will proportion itself according to the size of the frame
//top and bottom or noth and south will adjust not vertically but horizontally
//and the left and right or east and west will adjust not horizontally but vertically
