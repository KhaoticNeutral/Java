import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class myFrame extends JFrame implements ActionListener {

    JButton b1;
    JLabel l1;

    myFrame() {

        ImageIcon imageIcon = new ImageIcon("hurtButton.png");
        ImageIcon image = new ImageIcon("face");

        l1 = new JLabel();
        l1.setIcon(image);
        l1.setBounds(300,200, 550, 550);
        l1.setVisible(false);

        b1 = new JButton();
        b1.setBounds(200,100,550,550);
        b1.addActionListener(e -> System.out.println("Ouch!")); //advanced way of writing an action listener (landux expressions)
        b1.setText("Press to hurt the button");
        b1.setFocusable(false);
        b1.setIcon(imageIcon);
        b1.setHorizontalTextPosition(JButton.CENTER);
        b1.setVerticalTextPosition(JButton.BOTTOM);
        b1.setFont(new Font("Comic Sans MS",Font.BOLD,20));
        b1.setBackground(Color.BLACK);
        b1.setBorder(BorderFactory.createLineBorder(Color.BLACK));
        //b1.setEnabled(false); //This will disable a button


        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setLayout(null);
        this.setSize(500, 500);
        this.setVisible(true);
        this.add(b1);
        this.add(l1);
    }

    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == b1) {
            l1.setVisible(true);
        }
    }



}


