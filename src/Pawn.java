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
                int possibleXMove = this.getX()-1;
                int possibleYMove = this.getY();
                if(!CheckForCollision(possibleXMove, possibleYMove)) {
                    int[] firstMove = {possibleXMove, possibleYMove};
                    possibleMoves.add(firstMove);
                }
            }
            else{
                int possibleXMove = this.getX()-1;
                int possibleYMove = this.getY();
                if(!CheckForCollision(possibleXMove, possibleYMove)){
                    int[] firstMove = {possibleXMove, possibleYMove};
                    possibleMoves.add(firstMove);

                    possibleXMove = this.getX()-2;
                    possibleYMove = this.getY();
                    int[] secondMove = {possibleXMove, possibleYMove};
                    possibleMoves.add(secondMove);
                }
            }
        }
        else{
            if(this.hasMoved()){
                int possibleXMove = this.getX()+1;
                int possibleYMove = this.getY();
                if(!CheckForCollision(possibleXMove, possibleYMove)) {
                    int[] firstMove = {possibleXMove, possibleYMove};
                    possibleMoves.add(firstMove);
                }
            }
            else{
                int possibleXMove = this.getX()+1;
                int possibleYMove = this.getY();
                if(!CheckForCollision(possibleXMove, possibleYMove)){
                    int[] firstMove = {possibleXMove, possibleYMove};
                    possibleMoves.add(firstMove);

                    possibleXMove = this.getX()+2;
                    possibleYMove = this.getY();
                    int[] secondMove = {possibleXMove, possibleYMove};
                    possibleMoves.add(secondMove);
                }
            }
        }

        //Check Attack Moves:
        if(this.getTeam()=='w'){
                int possibleXMove = this.getX()-1;
                int possibleYMove = this.getY()-1;
                if(CheckForCollisionWithOpponent(possibleXMove, possibleYMove)) {
                    int[] firstMove = {possibleXMove, possibleYMove};
                    possibleMoves.add(firstMove);
                }
            possibleXMove = this.getX()-1;
            possibleYMove = this.getY()+1;
            if(CheckForCollisionWithOpponent(possibleXMove, possibleYMove)) {
                int[] firstMove = {possibleXMove, possibleYMove};
                possibleMoves.add(firstMove);
            }
        }
        else{
                int possibleXMove = this.getX()+1;
                int possibleYMove = this.getY()+1;
                if(CheckForCollisionWithOpponent(possibleXMove, possibleYMove)) {
                    int[] firstMove = {possibleXMove, possibleYMove};
                    possibleMoves.add(firstMove);
                }
            possibleXMove = this.getX()+1;
            possibleYMove = this.getY()-1;
            if(CheckForCollisionWithOpponent(possibleXMove, possibleYMove)) {
                int[] firstMove = {possibleXMove, possibleYMove};
                possibleMoves.add(firstMove);
            }
        }
        return possibleMoves;
    }
}
