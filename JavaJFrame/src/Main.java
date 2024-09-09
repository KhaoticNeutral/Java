import javax.swing.*;
import javax.swing.border.Border;
import java.awt.*;

public class Main {
    public static void main(String[] args) {

        //This is if you dont use a parent child class to call or create a j-frame
        /*JFrame frame = new JFrame(); //creates an instance of a frame
        frame.setTitle("Zelda Fan Boy"); //sets title of frame
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); //this is the operation you need to close it instead of hide it since the default is hide on close
        frame.setResizable(false); //prevents resizing
        frame.setSize(420, 420); //this sets the x and y dimension
        frame.setVisible(true); //makes frame visible

        ImageIcon image = new ImageIcon("zeldalogo.png"); //this will create image icon
        frame.setIconImage(image.getImage()); //this will set the icon

        frame.getContentPane().setBackground(new Color(37, 150, 190)); //change color of background*/

        /*this is the instance of the child class
        myFrame myFrame = new myFrame();
        */

        //This is where JLabel starts

        ImageIcon image = new ImageIcon("Zelda.png");
        ImageIcon image1 = new ImageIcon("zeldalogo.png");
        Border border = BorderFactory.createLineBorder(new Color(253,208,36,255), 3);


        JLabel label = new JLabel();//creates a label
        label.setText("Fanboy Club!"); //set text of label
        label.setIcon(image);
        label.setHorizontalTextPosition(JLabel.CENTER); //set text left, center and right of image
        label.setVerticalTextPosition(JLabel.TOP); //set top bottom or center of image
        label.setForeground(new Color(253,208,36,255));
        label.setFont(new Font("MV Boli", Font.PLAIN, 20)); //the font attributes
        label.setIconTextGap(5); //you can use negative numbers, this sets the gap between the text and the image
        label.setBorder(border);
        label.setVerticalAlignment(JLabel.CENTER); //set vertical position of icon+text
        label.setHorizontalAlignment(JLabel.CENTER); //set horizontal position of icon+text
        //label.setBounds(0,0,250,250); //this sets where and how big your label is 0,0 being the top left

        /*if you want to set the background width the label instead of the JFrame here is the syntax:
        label.setBackground(Color.black);
        label.setOpaque(true);
         */

        JFrame frame = new JFrame();
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(700, 800);
        //frame.setLayout(null); //this allows us to set a custom size for our label it allows you to set something in a stagnent position
        frame.setVisible(true);
        frame.setIconImage(image1.getImage());
        frame.setTitle("Zelda Fan Boy");
        frame.getContentPane().setBackground(new Color(37, 150, 190));
        frame.add(label); //always remeber to ADD your label
        frame.pack(); //this will resize the frame to include all the components there, make sure you add all your components before using pack


    }
}
//A Jframe is a GUI window to add components to
//don't be fooled if you dont have anything to say that when you click the x button of the jframe it means to close it
//it will simply hide it
// so you have to actively stop the program from running
//Do nothing on close will prevent the person from closing the frame
//hexadecimal would look something like 0x2596be
//another way you can make a jframe is by making a parent child class

//Because I don't want to make two jframes we're also discussing labels in this section so I'll divide each section by comments
//a Jlabel is a gui display area for a string of text an image or both
//the label likes to take up as much space as possible but er can set it's paremeters