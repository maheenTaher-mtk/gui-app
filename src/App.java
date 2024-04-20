//Maheen Taher, 2024
import javax.swing.JOptionPane;
public class App {
    public static void main(String[] args) throws Exception {
        //code-along
        String name = JOptionPane.showInputDialog("Please enter your name:");
        JOptionPane.showMessageDialog(null, "Hi there, " +name+"!");
        int age = Integer.parseInt(JOptionPane.showInputDialog("How old are you?"));
        JOptionPane.showMessageDialog(null, "Wow! I can't believe you're only " +age+" years old!");

        //instantiating the trueOrFalse class and running the true or false game
        trueOrFalse trueOrFalse = new trueOrFalse();
        trueOrFalse.TOFgame();

        //instantiating the GuessNumber class and running the number guessing game
        GuessNumber GuessNumber = new GuessNumber();
        GuessNumber.GNgame();

}
}
