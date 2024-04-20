import javax.swing.JOptionPane;

public class test {
    public static void main(String[] args) throws Exception {
    
        String name = JOptionPane.showInputDialog("Enter your name ");
        JOptionPane.showMessageDialog(null, "Oh Hello... " +name);
        int age = Integer.parseInt(JOptionPane.showInputDialog("how old are ya??"));
        JOptionPane.showMessageDialog(null, "Oh wow! you're only " +age+" years old??");

    }
}