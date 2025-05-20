public class GameLogic {
    private Board board;
    private GameState gameState;
    private Player player1;
    private Player player2;

    public GameLogic(Board b, Player p1, Player p2, GameState gs) {
        board = b;
        player1 = p1;
        player2 = p2;
        gameState = gs;
    }

    public void playGame() {
        while (!gameState.getWinState()) {
            if (!gameState.getWinState()) {
                System.out.println(board.pp());
                player1.getMoveInput();
            }
            if (!gameState.getWinState()) {
                System.out.println(board.pp());
                player2.getMoveInput();
            }
        }
        System.out.println("Someone has won the game!!!\n");
        System.out.println(board.pp());
    }
}
