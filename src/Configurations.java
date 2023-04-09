import javax.swing.*;
import java.util.ArrayList;
import java.util.HashMap;


public class Configurations {


    public static ArrayList<Piece> GamePieces = new ArrayList<Piece>();
    public static ArrayList<Piece> Configurations() {

        GamePieces.add( new Piece(new JLabel(), "rook_black.png",0,'b'));
        GamePieces.add( new Piece(new JLabel(), "knight_black.png",1,'b'));
        GamePieces.add( new Piece(new JLabel(), "bishop_black.png",2,'b'));
        GamePieces.add( new Piece(new JLabel(), "queen_black.png",3,'b'));
        GamePieces.add( new Piece(new JLabel(), "king_black.png",4,'b'));
        GamePieces.add( new Piece(new JLabel(), "bishop_black.png",5,'b'));
        GamePieces.add( new Piece(new JLabel(), "knight_black.png",6,'b'));
        GamePieces.add( new Piece(new JLabel(), "rook_black.png",7,'b'));
        GamePieces.add( new Piece(new JLabel(), "pawn_black.png",8,'b'));
        GamePieces.add( new Piece(new JLabel(), "pawn_black.png",9,'b'));
        GamePieces.add( new Piece(new JLabel(), "pawn_black.png",10,'b'));
        GamePieces.add( new Piece(new JLabel(), "pawn_black.png",11,'b'));
        GamePieces.add( new Piece(new JLabel(), "pawn_black.png",12,'b'));
        GamePieces.add( new Piece(new JLabel(), "pawn_black.png",13,'b'));
        GamePieces.add( new Piece(new JLabel(), "pawn_black.png",14,'b'));
        GamePieces.add( new Piece(new JLabel(), "pawn_black.png",15,'b'));
        GamePieces.add( new Piece(new JLabel(), "pawn_white.png",48,'w'));
        GamePieces.add( new Piece(new JLabel(), "pawn_white.png",49,'w'));
        GamePieces.add( new Piece(new JLabel(), "pawn_white.png",50,'w'));
        GamePieces.add( new Piece(new JLabel(), "pawn_white.png",51,'w'));
        GamePieces.add( new Piece(new JLabel(), "pawn_white.png",52,'w'));
        GamePieces.add( new Piece(new JLabel(), "pawn_white.png",53,'w'));
        GamePieces.add( new Piece(new JLabel(), "pawn_white.png",54,'w'));
        GamePieces.add( new Piece(new JLabel(), "pawn_white.png",55,'w'));
        GamePieces.add( new Piece(new JLabel(), "rook_white.png",56,'w'));
        GamePieces.add( new Piece(new JLabel(), "knight_white.png",57,'w'));
        GamePieces.add( new Piece(new JLabel(), "bishop_white.png",58,'w'));
        GamePieces.add( new Piece(new JLabel(), "queen_white.png",59,'w'));
        GamePieces.add( new Piece(new JLabel(), "king_white.png",60,'w'));
        GamePieces.add( new Piece(new JLabel(), "bishop_white.png",61,'w'));
        GamePieces.add( new Piece(new JLabel(), "knight_white.png",62,'w'));
        GamePieces.add( new Piece(new JLabel(), "rook_white.png",63,'w'));
        return GamePieces;
    }


    public static final HashMap<Integer, String> START_PIECES_POSITION = new HashMap<Integer, String>() {{
        put(0,"rook_black.png");
        put(1,"knight_black.png");
        put(2,"bishop_black.png");
        put(3,"queen_black.png");
        put(4,"king_black.png");
        put(5,"bishop_black.png");
        put(6,"knight_black.png");
        put(7,"rook_black.png");
        put(8,"pawn_black.png");
        put(9,"pawn_black.png");
        put(10,"pawn_black.png");
        put(11,"pawn_black.png");
        put(12,"pawn_black.png");
        put(13,"pawn_black.png");
        put(14,"pawn_black.png");
        put(15,"pawn_black.png");
        put(48,"pawn_white.png");
        put(49,"pawn_white.png");
        put(50,"pawn_white.png");
        put(51,"pawn_white.png");
        put(52,"pawn_white.png");
        put(53,"pawn_white.png");
        put(54,"pawn_white.png");
        put(55,"pawn_white.png");
        put(56,"rook_white.png");
        put(57,"knight_white.png");
        put(58,"bishop_white.png");
        put(59,"queen_white.png");
        put(60,"king_white.png");
        put(61,"bishop_white.png");
        put(62,"knight_white.png");
        put(63,"rook_white.png");
    }};

}
