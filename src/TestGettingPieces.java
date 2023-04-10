import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class TestGettingPieces {
    public static final HashMap<int[], String> gameState = Configurations.START_PIECES_POSITION;

    public static ArrayList<Piece> GamePieces = Configurations.Configurations();

    public static void main(String[] args) {
        for (Piece piece : Configurations.GamePieces) {
            System.out.println(piece);
        }
    }
}
