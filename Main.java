public class Main {
    public static void main(String[] args) {
        Board b = new Board();
        Player p1 = new Player('X', b);
        Player p2 = new Player('O', b);
        GameState gs = new GameState(b);
        GameLogic game = new GameLogic(b, p1, p2, gs);

        game.playGame();
    }
}
