import board.Board;
import game.Nqueen;
public class App {
    public static void main(String[] args) throws Exception {
        Board b=new Board(3);
        Nqueen game=new Nqueen(b);
        game.play(); 
    }
}
