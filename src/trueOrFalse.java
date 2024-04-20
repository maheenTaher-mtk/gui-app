//Maheen Taher, 2024
import javax.swing.JOptionPane;

public class trueOrFalse {
    public static void main(String[] args) throws Exception {
    //loop that breaks when the opinion is deemed true
    while (true){
        //prompt user t/f question
        int opinion = JOptionPane.showConfirmDialog(null, "Is Ms. Richards an awesome teacher?", "Urgent True or False Question!", JOptionPane.YES_NO_OPTION);
        
        //if user answers yes, display a congratulatory message and break the loop
        if (opinion == JOptionPane.YES_OPTION){
        JOptionPane.showMessageDialog(null, "You are correct!", "Congratulations!", JOptionPane.INFORMATION_MESSAGE);
        break;
        } 

        //if user attempts to close the prompt, display an error message
        else if (opinion == JOptionPane.CLOSED_OPTION){
        JOptionPane.showMessageDialog(null, "You gotta answer the question bro 😭", "HEY!", JOptionPane.ERROR_MESSAGE);    
        }

        //otherwise (if the user answers no), display an error message
        else {
        JOptionPane.showMessageDialog(null, "Ermm... please try again.", "WRONG!", JOptionPane.ERROR_MESSAGE);
        }
    }
    }
}