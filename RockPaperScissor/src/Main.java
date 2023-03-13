import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        Choice choice = new Choice();
        ArrayList<String> options = new ArrayList<>();
        options.add("rock");
        options.add("paper");
        options.add("scissors");


        int round=0;
        int userScore=0;
        int compScore=0;
        while(round<5){
            String user=userChoice.validateChoice(userChoice.getUserChoice());
            String compChoice = (String) choice.getChoice(options);

            if (user.equals(compChoice)) {
                System.out.println("Tie!");
            } else if ((user.equals("rock") && compChoice.equals("scissors"))
                    || (user.equals("paper") && compChoice.equals("rock"))
                    || (user.equals("scissors") && compChoice.equals("paper"))) {
                System.out.println("You win!\nComputer choice is "+compChoice);
                userScore++;
            } else {
                System.out.println("You lose! Computer choice is "+compChoice);
                compScore++;
        }round++;
    }System.out.println("Total score\n..................\nComputer: "+compScore+"\nYou: "+userScore);
}}
