import javax.swing.JOptionPane;

public class GuessNumber {
    public static void main(String[] args) throws Exception {
        //generating a random number
        int number = (int) (Math.random() * 100) + 1;

        //loops until the validity of the user's guess is deemed true
        while (true){

            //prompt user for their guess
            int guess = Integer.parseInt(JOptionPane.showInputDialog("Guess a number between 1-100!"));
            
            //user guesses correct, program ends
            if (guess == number){
                JOptionPane.showMessageDialog(null, "You guessed right! The number was " + number + "!");
                break;
            }

            //user guesses too low
            else if (guess < number){
                JOptionPane.showMessageDialog(null, "Not quite, your guess is TOO LOW! Try again :)");
            }
            
            //user guesses too high
            else {
                JOptionPane.showMessageDialog(null, "Not quite, your guess is TOO HIGH! Try again :)");
            }
        }
    }

}
