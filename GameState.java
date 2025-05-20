public class GameState {
    Board board;

    GameState(Board b) {
        board = b;
    }
    public boolean getWinState() {

        //Horizontal Wins
        if (board.getSymbol(0) == board.getSymbol(1) && board.getSymbol(0) == board.getSymbol(2)) {
            return true;
        }
        else if (board.getSymbol(3) == board.getSymbol(4) && board.getSymbol(3) == board.getSymbol(5)) {
            return true;
        }
        else if (board.getSymbol(6) == board.getSymbol(7) && board.getSymbol(6) == board.getSymbol(8)) {
            return true;
        }

        //Vertical Wins
        else if (board.getSymbol(0) == board.getSymbol(3) && board.getSymbol(0) == board.getSymbol(6)) {
            return true;
        }
        else if (board.getSymbol(1) == board.getSymbol(4) && board.getSymbol(1) == board.getSymbol(7)) {
            return true;
        }
        else if (board.getSymbol(2) == board.getSymbol(5) && board.getSymbol(2) == board.getSymbol(8)) {
            return true;
        }

        //Diagonal Wins
        else if (board.getSymbol(0) == board.getSymbol(4) && board.getSymbol(0) == board.getSymbol(8)) {
            return true;
        }
        else if (board.getSymbol(2) == board.getSymbol(4) && board.getSymbol(2) == board.getSymbol(6)) {
            return true;
        }

        //Game not won
        else {
            return false;
        }
    }
}
