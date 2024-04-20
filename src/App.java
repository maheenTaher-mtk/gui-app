
import javax.swing.JOptionPane;
public class App {
    public static void main(String[] args) throws Exception {
    String name = JOptionPane.showInputDialog("Enter your name:");
    int age = Integer.parseInt(JOptionPane.showInputDialog("Enter your age:"));
    JOptionPane.showMessageDialog(null, args, name, age);
}
}
