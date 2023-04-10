import java.util.ArrayList;

public class King extends Piece {
    private boolean HasPieceMoved = false;

    public King(String image, int x, int y, char type, char team) {
        super(image, x, y, type, team);
    }

    @Override
    public ArrayList<int[]> movesAvailable() {
        boolean collision = false;
        ArrayList<int[]> possibleMoves = new ArrayList<>();
        //collision
        int i =1;
        int possibleXMove = this.getX() - i;
        int possibleYMove = this.getY() - i;
        if(CheckForCollision(possibleXMove, possibleYMove)){
            if(CheckForCollisionWithOpponent(possibleXMove, possibleYMove)){
                int[] backwardMoves1 = {possibleXMove, possibleYMove};
                possibleMoves.add(backwardMoves1);
            }
        }
        if (possibleXMove >= 0 && possibleXMove <= 7 && possibleYMove >= 0 && possibleYMove <= 7 && !CheckForCollision(possibleXMove, possibleYMove)) {
            int[] forwardMoves = {possibleXMove, possibleYMove};
            possibleMoves.add(forwardMoves);
        }

        possibleXMove = this.getX() + i;
        possibleYMove = this.getY() + i;
        if(CheckForCollision(possibleXMove, possibleYMove)){
            if(CheckForCollisionWithOpponent(possibleXMove, possibleYMove)){
                int[] backwardMoves1 = {possibleXMove, possibleYMove};
                possibleMoves.add(backwardMoves1);
            }
        }
        if (possibleXMove >= 0 && possibleXMove <= 7 && possibleYMove >= 0 && possibleYMove <= 7 && !CheckForCollision(possibleXMove, possibleYMove)) {
            int[] backwardMoves = {this.getX() + i, this.getY() + i};
            possibleMoves.add(backwardMoves);
        }

        possibleXMove = this.getX() + i;
        possibleYMove = this.getY() - i;
        if(CheckForCollision(possibleXMove, possibleYMove)){
            if(CheckForCollisionWithOpponent(possibleXMove, possibleYMove)){
                int[] backwardMoves1 = {possibleXMove, possibleYMove};
                possibleMoves.add(backwardMoves1);
            }
        }
        if (possibleXMove >= 0 && possibleXMove <= 7 && possibleYMove >= 0 && possibleYMove <= 7 && !CheckForCollision(possibleXMove, possibleYMove)) {
            int[] forwardMoves1 = {possibleXMove, possibleYMove};
            possibleMoves.add(forwardMoves1);
        }

        possibleXMove = this.getX() - i;
        possibleYMove = this.getY() + i;
        if(CheckForCollision(possibleXMove, possibleYMove)){
            if(CheckForCollisionWithOpponent(possibleXMove, possibleYMove)){
                int[] backwardMoves1 = {possibleXMove, possibleYMove};
                possibleMoves.add(backwardMoves1);
            }
        }
        if (possibleXMove >= 0 && possibleXMove <= 7 && possibleYMove >= 0 && possibleYMove <= 7 && !CheckForCollision(possibleXMove, possibleYMove)) {
            int[] backwardMoves1 = {possibleXMove, possibleYMove};
            possibleMoves.add(backwardMoves1);
        }

        possibleXMove = this.getX() - i;
        possibleYMove = this.getY();
        if(CheckForCollision(possibleXMove, possibleYMove)){
            if(CheckForCollisionWithOpponent(possibleXMove, possibleYMove)){
                int[] backwardMoves1 = {possibleXMove, possibleYMove};
                possibleMoves.add(backwardMoves1);
            }
        }
        if (possibleXMove >= 0 && possibleXMove <= 7 && possibleYMove >= 0 && possibleYMove <= 7 && !CheckForCollision(possibleXMove, possibleYMove)) {
            int[] forwardMoves =  {possibleXMove, possibleYMove};
            possibleMoves.add(forwardMoves);
        }

        possibleXMove = this.getX() + i;
        possibleYMove = this.getY();
        if(CheckForCollision(possibleXMove, possibleYMove)){
            if(CheckForCollisionWithOpponent(possibleXMove, possibleYMove)){
                int[] backwardMoves1 = {possibleXMove, possibleYMove};
                possibleMoves.add(backwardMoves1);
            }
        }
        if (possibleXMove >= 0 && possibleXMove <= 7 && possibleYMove >= 0 && possibleYMove <= 7 && !CheckForCollision(possibleXMove, possibleYMove)) {
            int[] backwardMoves =  {possibleXMove, possibleYMove};
            possibleMoves.add(backwardMoves);
        }

        possibleXMove = this.getX();
        possibleYMove = this.getY() - i;
        if(CheckForCollision(possibleXMove, possibleYMove)){
            if(CheckForCollisionWithOpponent(possibleXMove, possibleYMove)){
                int[] backwardMoves1 = {possibleXMove, possibleYMove};
                possibleMoves.add(backwardMoves1);
            }
        }
        if (possibleXMove >= 0 && possibleXMove <= 7 && possibleYMove >= 0 && possibleYMove <= 7 && !CheckForCollision(possibleXMove, possibleYMove)) {
            int[] forwardMoves1 = {possibleXMove, possibleYMove};
            possibleMoves.add(forwardMoves1);
        }

        possibleXMove = this.getX() ;
        possibleYMove = this.getY() + i;
        if(CheckForCollision(possibleXMove, possibleYMove)){
            if(CheckForCollisionWithOpponent(possibleXMove, possibleYMove)){
                int[] backwardMoves1 = {possibleXMove, possibleYMove};
                possibleMoves.add(backwardMoves1);
            }
        }
        if (possibleXMove >= 0 && possibleXMove <= 7 && possibleYMove >= 0 && possibleYMove <= 7 && !CheckForCollision(possibleXMove, possibleYMove)) {
            int[] backwardMoves1 =  {possibleXMove, possibleYMove};
            possibleMoves.add(backwardMoves1);
        }
        return possibleMoves;
    }
}

