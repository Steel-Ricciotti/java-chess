import javax.swing.*;
import java.util.ArrayList;
import java.util.HashMap;


public class Configurations {


    public static ArrayList<Piece> GamePieces = new ArrayList<Piece>();
    public static ArrayList<Piece> Configurations() {

        GamePieces.add( new Rook("rook_black.png",0,0,'r','b'));
        GamePieces.add( new Knight( "knight_black.png",0,1,'k','b'));
        GamePieces.add( new Bishop( "bishop_black.png",0,2,'b','b'));
        GamePieces.add( new Queen( "queen_black.png",0,3,'q','b'));
        GamePieces.add( new King( "king_black.png",0,4,'k','b'));
        GamePieces.add( new Bishop( "bishop_black.png",0,5,'b','b'));
        GamePieces.add( new Knight( "knight_black.png",0,6,'k','b'));
        GamePieces.add( new Rook( "rook_black.png",0,7,'r','b'));
        GamePieces.add( new Pawn( "pawn_black.png",1,0,'p','b'));
        GamePieces.add( new Pawn( "pawn_black.png",1,1,'p','b'));
        GamePieces.add( new Pawn( "pawn_black.png",1,2,'p','b'));
        GamePieces.add( new Pawn( "pawn_black.png",1,3,'p','b'));
        GamePieces.add( new Pawn( "pawn_black.png",1,4,'p','b'));
        GamePieces.add( new Pawn( "pawn_black.png",1,5,'p','b'));
        GamePieces.add( new Pawn( "pawn_black.png",1,6,'p','b'));
        GamePieces.add( new Pawn( "pawn_black.png",1,7,'p','b'));
        GamePieces.add( new Pawn( "pawn_white.png",6,0,'p','w'));
        GamePieces.add( new Pawn( "pawn_white.png",6,1,'p','w'));
        GamePieces.add( new Pawn( "pawn_white.png",6,2,'p','w'));
        GamePieces.add( new Pawn( "pawn_white.png",6,3,'p','w'));
        GamePieces.add( new Pawn( "pawn_white.png",6,4,'p','w'));
        GamePieces.add( new Pawn( "pawn_white.png",6,5,'p','w'));
        GamePieces.add( new Pawn( "pawn_white.png",6,6,'p','w'));
        GamePieces.add( new Pawn( "pawn_white.png",6,7,'p','w'));
        GamePieces.add( new Rook( "rook_white.png",7,0,'r','w'));
        GamePieces.add( new Knight( "knight_white.png",7,1,'k','w'));
        GamePieces.add( new Bishop( "bishop_white.png",7,2,'b','w'));
        GamePieces.add( new Queen( "queen_white.png",7,3,'q','w'));
        GamePieces.add( new King( "king_white.png",7,4,'k','w'));
        GamePieces.add( new Bishop( "bishop_white.png",7,5,'b','w'));
        GamePieces.add( new Knight( "knight_white.png",7,6,'k','w'));
        GamePieces.add( new Rook( "rook_white.png",7,7,'r','w'));
        return GamePieces;
    }
    private Piece[][] gamePieces = new Piece[8][8];

    public static final HashMap<int[], String> START_PIECES_POSITION = new HashMap<int[], String>() {{
        put(new int[]{0,0},"rook_black.png");
        put(new int[]{0,1},"knight_black.png");
        put(new int[]{0,2},"bishop_black.png");
        put(new int[]{0,3},"queen_black.png");
        put(new int[]{0,4},"king_black.png");
        put(new int[]{0,5},"bishop_black.png");
        put(new int[]{0,6},"knight_black.png");
        put(new int[]{0,7},"rook_black.png");
        put(new int[]{1,0},"pawn_black.png");
        put(new int[]{1,1},"pawn_black.png");
        put(new int[]{1,2},"pawn_black.png");
        put(new int[]{1,3},"pawn_black.png");
        put(new int[]{1,4},"pawn_black.png");
        put(new int[]{1,5},"pawn_black.png");
        put(new int[]{1,6},"pawn_black.png");
        put(new int[]{1,7},"pawn_black.png");
        put(new int[]{6,0},"pawn_white.png");
        put(new int[]{6,1},"pawn_white.png");
        put(new int[]{6,2},"pawn_white.png");
        put(new int[]{6,3},"pawn_white.png");
        put(new int[]{6,4},"pawn_white.png");
        put(new int[]{6,5},"pawn_white.png");
        put(new int[]{6,6},"pawn_white.png");
        put(new int[]{6,7},"pawn_white.png");
        put(new int[]{7,0},"rook_white.png");
        put(new int[]{7,1},"knight_white.png");
        put(new int[]{7,2},"bishop_white.png");
        put(new int[]{7,3},"queen_white.png");
        put(new int[]{7,4},"king_white.png");
        put(new int[]{7,5},"bishop_white.png");
        put(new int[]{7,6},"knight_white.png");
        put(new int[]{7,7},"rook_white.png");
    }};

}
