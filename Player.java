import java.util.Scanner;

public class Player {
    private char icon;
    Board board;

    public Player(char i, Board b) {
        icon = i;
        board = b;
    }

    public void getMoveInput() {
        Scanner scan = new Scanner(System.in);
        System.out.print("Please select the square you would like to play: ");

        while(true) {
            String input = scan.nextLine();
            int intInput = 0;

            try {
                intInput = Integer.parseInt(input);
            }
            catch(NumberFormatException nfe) {
                System.out.println("Invalid input, please enter an integer digit");
            }

            if (intInput > 8 || intInput < 1) {
                System.out.println("Invalid input, please select a number between 1 and 9");
            }
            else {
                board.changeBoard(intInput - 1, icon);
                break;
            }
        }

    }
}
