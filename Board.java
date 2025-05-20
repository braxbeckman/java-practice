public class Board {
    private char[] board = {'1', '2', '3', '4', '5', '6', '7', '8', '9'};

    void changeBoard(int pos, char icon) {
        board[pos] = icon;
    }

    char getSymbol(int pos) {
        return board[pos];
    }

    public String pp() {
        String output = board[0] + " | " +  board[1] +  " | " +  board[2]
                + "\n---------"
                + "\n" + board[3] + " | " +  board[4] +  " | " +  board[5]
                + "\n---------"
                + "\n" + board[6] + " | " +  board[7] +  " | " +  board[8];
        return output;
    }
}
