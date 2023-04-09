import java.util.ArrayList;

public class Pawn extends Piece {
    private boolean HasPieceMoved = false;
    public Pawn(String image, int x, int y, char type, char team) {
        super(image, x, y, type, team);
    }

    public void setMoved(){
        this.HasPieceMoved = true;
    }

    public boolean hasMoved(){
        return this.HasPieceMoved;
    }

    @Override
    public ArrayList<int[]> movesAvailable(){
        boolean collision = false;
        ArrayList<int[]> possibleMoves = new ArrayList<>();
        //collision
        if(this.getTeam()=='w'){
            if(this.hasMoved()){

                int[] move = {this.getX()-1, this.getY()};
                possibleMoves.add(move);
            }
            else{
                int[] firstMove = {this.getX()-1, this.getY()};
                possibleMoves.add(firstMove);
                int[] secondMove = {this.getX()-2, this.getY()};
                possibleMoves.add(secondMove);
            }
        }
        else{
            if(this.hasMoved()){
                int[] move = {this.getX()+1, this.getY()};
                possibleMoves.add(move);
            }
            else{
                int[] firstMove = {this.getX()+1, this.getY()};
                possibleMoves.add(firstMove);
                int[] secondMove = {this.getX()+2, this.getY()};
                possibleMoves.add(secondMove);
            }
        }

        return possibleMoves;
    }

}
