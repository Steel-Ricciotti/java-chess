import javax.swing.*;
import java.util.ArrayList;

public class Piece {
    private String image;
    private int x;
    private int y;
    private char type;
    private char team;

    public Piece(String image, int x, int y, char type, char team) {
        this.image = image;
        this.x = x;
        this.y=y;
        this.type = type;
        this.team = team;
    }

    public String getImage() {
        return image;
    }

    public int getY() {
        return this.y;
    }

    public void setY(int y) {
        this.y = y;
    }

    public int getX() {
        return this.x;
    }

    public void setX(int x) {
        this.x = x;
    }

    public void setTeam(char team){
        this.team = team;
    }

    public char getTeam(){
        return this.team;
    }

    public char getType(){
        return this.type;
    }

    public void setType(char type){
        this.type = type;
    }

    public ArrayList<int[]>  movesAvailable(){
        ArrayList<int[]> possibleMoves = new ArrayList<>();

        return possibleMoves;
    }

    public boolean CheckForCollisionWithOpponent(int x, int y) {
        for(int i = 0; i<SteelDickChess.GamePieces.size(); i++){
            if(x == SteelDickChess.GamePieces.get(i).getX() && y == SteelDickChess.GamePieces.get(i).getY())
            {
                if(SteelDickChess.GamePieces.get(i).getTeam() != SteelDickChess.GetTurn()) {
                    return true;
                }
            }
        }
        return false;
    }



    public boolean CheckForCollision(int x, int y) {
        for(int i = 0; i<SteelDickChess.GamePieces.size(); i++){
            if(x == SteelDickChess.GamePieces.get(i).getX() && y == SteelDickChess.GamePieces.get(i).getY())
            {
                return true;
            }
        }
        return false;
    }

    public boolean CheckForCollisionWithOwnTeam(int x, int y) {

        for(int i = 0; i<SteelDickChess.GamePieces.size(); i++){
            System.out.println(SteelDickChess.GamePieces.get(i).getTeam() == SteelDickChess.GetTurn());
            if(x == SteelDickChess.GamePieces.get(i).getX() && y == SteelDickChess.GamePieces.get(i).getY() && SteelDickChess.GamePieces.get(i).getTeam() == SteelDickChess.GetTurn());
            {
                System.out.println("Found Collision at");
                System.out.println(x);
                System.out.println(y);
                return false;
            }
        }
        return false;
    }

    public void setMoved() {

    }
}

