public class Board {
    private char[] board = {'1', '2', '3', '4', '5', '6', '7', '8', '9'};

    void changeBoard(int pos, char icon) {
        board[pos] = icon;
    }

    public String pp() {
        String output = board[0] + " | " +  board[1] +  " | " +  board[2]
                + "\n---------";
        return output;
    }
}
