import java.util.ArrayList;

public class Queen extends Piece {
    private boolean HasPieceMoved = false;

    public Queen(String image, int x, int y, char type, char team) {
        super(image, x, y, type, team);
    }

    @Override
    public ArrayList<int[]> movesAvailable() {
        boolean collision = false;
        ArrayList<int[]> possibleMoves = new ArrayList<>();
        //collision
        for (int i = 1; i < 8; i++) {
            //
            int possibleXMove = this.getX() - i;
            int possibleYMove = this.getY() - i;
            if(CheckForCollision(possibleXMove, possibleYMove)){
                if(CheckForCollisionWithOpponent(possibleXMove, possibleYMove)){
                    int[] backwardMoves1 = {possibleXMove, possibleYMove};
                    possibleMoves.add(backwardMoves1);
                }
                break;
            }
            if (possibleXMove >= 0 && possibleXMove <= 7 && possibleYMove >= 0 && possibleYMove <= 7) {
                int[] forwardMoves = {possibleXMove, possibleYMove};
                possibleMoves.add(forwardMoves);
            }
        }

        for (int i = 1; i < 8; i++) {
            int possibleXMove = this.getX() + i;
            int possibleYMove = this.getY() + i;
            if(CheckForCollision(possibleXMove, possibleYMove)){
                if(CheckForCollisionWithOpponent(possibleXMove, possibleYMove)){
                    int[] backwardMoves1 = {possibleXMove, possibleYMove};
                    possibleMoves.add(backwardMoves1);
                }
                break;
            }
            if (possibleXMove >= 0 && possibleXMove <= 7 && possibleYMove >= 0 && possibleYMove <= 7) {
                int[] backwardMoves = {this.getX() + i, this.getY() + i};
                possibleMoves.add(backwardMoves);
            }
        }

        for (int i = 1; i < 8; i++) {
            int possibleXMove = this.getX() + i;
            int possibleYMove = this.getY() - i;
            if(CheckForCollision(possibleXMove, possibleYMove)){
                if(CheckForCollisionWithOpponent(possibleXMove, possibleYMove)){
                    int[] backwardMoves1 = {possibleXMove, possibleYMove};
                    possibleMoves.add(backwardMoves1);
                }
                break;
            }
            if (possibleXMove >= 0 && possibleXMove <= 7 && possibleYMove >= 0 && possibleYMove <= 7) {
                int[] forwardMoves1 = {possibleXMove, possibleYMove};
                possibleMoves.add(forwardMoves1);
            }
        }

        for (int i = 1; i < 8; i++) {

            int possibleXMove = this.getX() - i;
            int possibleYMove = this.getY() + i;
            if(CheckForCollision(possibleXMove, possibleYMove)){
                if(CheckForCollisionWithOpponent(possibleXMove, possibleYMove)){
                    int[] backwardMoves1 = {possibleXMove, possibleYMove};
                    possibleMoves.add(backwardMoves1);
                }
                break;
            }
            if (possibleXMove >= 0 && possibleXMove <= 7 && possibleYMove >= 0 && possibleYMove <= 7) {
                int[] backwardMoves1 = {possibleXMove, possibleYMove};
                possibleMoves.add(backwardMoves1);
            }
        }

        for (int i = 1; i < 8; i++) {
            //
            int possibleXMove = this.getX() - i;
            int possibleYMove = this.getY();
            if(CheckForCollision(possibleXMove, possibleYMove)){
                if(CheckForCollisionWithOpponent(possibleXMove, possibleYMove)){
                    int[] backwardMoves1 = {possibleXMove, possibleYMove};
                    possibleMoves.add(backwardMoves1);
                }
                break;
            }
            if (possibleXMove >= 0 && possibleXMove <= 7 && possibleYMove >= 0 && possibleYMove <= 7) {
                int[] forwardMoves =  {possibleXMove, possibleYMove};
                possibleMoves.add(forwardMoves);
            }
        }

        for (int i = 1; i < 8; i++) {
            int possibleXMove = this.getX() + i;
            int possibleYMove = this.getY();
            if(CheckForCollision(possibleXMove, possibleYMove)){
                if(CheckForCollisionWithOpponent(possibleXMove, possibleYMove)){
                    int[] backwardMoves1 = {possibleXMove, possibleYMove};
                    possibleMoves.add(backwardMoves1);
                }
                break;
            }
            if (possibleXMove >= 0 && possibleXMove <= 7 && possibleYMove >= 0 && possibleYMove <= 7) {
                int[] backwardMoves =  {possibleXMove, possibleYMove};
                possibleMoves.add(backwardMoves);
            }
        }

        for (int i = 1; i < 8; i++) {
            int possibleXMove = this.getX();
            int possibleYMove = this.getY() - i;
            if(CheckForCollision(possibleXMove, possibleYMove)){
                if(CheckForCollisionWithOpponent(possibleXMove, possibleYMove)){
                    int[] backwardMoves1 = {possibleXMove, possibleYMove};
                    possibleMoves.add(backwardMoves1);
                }
                break;
            }
            if (possibleXMove >= 0 && possibleXMove <= 7 && possibleYMove >= 0 && possibleYMove <= 7) {
                int[] forwardMoves1 = {possibleXMove, possibleYMove};
                possibleMoves.add(forwardMoves1);
            }
        }

        for (int i = 1; i < 8; i++) {

            int possibleXMove = this.getX() ;
            int possibleYMove = this.getY() + i;
            if(CheckForCollision(possibleXMove, possibleYMove)){
                if(CheckForCollisionWithOpponent(possibleXMove, possibleYMove)){
                    int[] backwardMoves1 = {possibleXMove, possibleYMove};
                    possibleMoves.add(backwardMoves1);
                }
                break;
            }
            if (possibleXMove >= 0 && possibleXMove <= 7 && possibleYMove >= 0 && possibleYMove <= 7) {
                int[] backwardMoves1 =  {possibleXMove, possibleYMove};
                possibleMoves.add(backwardMoves1);
            }
        }

        return possibleMoves;
    }
}

