import javax.swing.JOptionPane;

public class Main {
    public static void main(String[] args) {

      String name = JOptionPane.showInputDialog("What is your name?");
      JOptionPane.showMessageDialog(null, "Hello " + name + "!");


      int age = Integer.parseInt(JOptionPane.showInputDialog("What is your age?"));
      JOptionPane.showInputDialog(null, "You are " + age + "!");

      double height = Double.parseDouble(JOptionPane.showInputDialog("What is your height?"));
      JOptionPane.showInputDialog(null, "You are " + height + "!");
    }
}