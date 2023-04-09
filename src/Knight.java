import java.util.ArrayList;

public class Knight extends Piece {
    private boolean HasPieceMoved = false;

    public Knight(String image, int x, int y, char type, char team) {
        super(image, x, y, type, team);
    }

    @Override
    public ArrayList<int[]> movesAvailable() {
        boolean collision = false;
        ArrayList<int[]> possibleMoves = new ArrayList<>();

        int possibleXMove = this.getX() + 2;
        int possibleYMove = this.getY() + 1;

        if(!CheckForCollisionWithOwnTeam(possibleXMove, possibleYMove) && (possibleXMove >= 0 && possibleXMove <= 7 && possibleYMove >= 0 && possibleYMove <= 7)){
            int[] possibleMove = {possibleXMove, possibleYMove};
            possibleMoves.add(possibleMove);
        }

        possibleXMove = this.getX() + 1;
        possibleYMove = this.getY() + 2;

        if(!CheckForCollisionWithOwnTeam(possibleXMove, possibleYMove) && (possibleXMove >= 0 && possibleXMove <= 7 && possibleYMove >= 0 && possibleYMove <= 7)){
            int[] possibleMove = {possibleXMove, possibleYMove};
            possibleMoves.add(possibleMove);
        }

        possibleXMove = this.getX() - 2;
        possibleYMove = this.getY() - 1;

        if(!CheckForCollisionWithOwnTeam(possibleXMove, possibleYMove) && (possibleXMove >= 0 && possibleXMove <= 7 && possibleYMove >= 0 && possibleYMove <= 7)){
            int[] possibleMove = {possibleXMove, possibleYMove};
            possibleMoves.add(possibleMove);
        }

        possibleXMove = this.getX() - 1;
        possibleYMove = this.getY() - 2;

        if(!CheckForCollisionWithOwnTeam(possibleXMove, possibleYMove) && (possibleXMove >= 0 && possibleXMove <= 7 && possibleYMove >= 0 && possibleYMove <= 7)){
            int[] possibleMove = {possibleXMove, possibleYMove};
            possibleMoves.add(possibleMove);
        }

        possibleXMove = this.getX() + 2;
        possibleYMove = this.getY() - 1;

        if(!CheckForCollisionWithOwnTeam(possibleXMove, possibleYMove) && (possibleXMove >= 0 && possibleXMove <= 7 && possibleYMove >= 0 && possibleYMove <= 7)){
            int[] possibleMove = {possibleXMove, possibleYMove};
            possibleMoves.add(possibleMove);
        }

        possibleXMove = this.getX() - 1;
        possibleYMove = this.getY() + 2;

        if(!CheckForCollisionWithOwnTeam(possibleXMove, possibleYMove) && (possibleXMove >= 0 && possibleXMove <= 7 && possibleYMove >= 0 && possibleYMove <= 7)){
            int[] possibleMove = {possibleXMove, possibleYMove};
            possibleMoves.add(possibleMove);
        }

        possibleXMove = this.getX() - 2;
        possibleYMove = this.getY() + 1;

        if(!CheckForCollisionWithOwnTeam(possibleXMove, possibleYMove) && (possibleXMove >= 0 && possibleXMove <= 7 && possibleYMove >= 0 && possibleYMove <= 7)){
            int[] possibleMove = {possibleXMove, possibleYMove};
            possibleMoves.add(possibleMove);
        }

        possibleXMove = this.getX() + 1;
        possibleYMove = this.getY() - 2;

        if(!CheckForCollisionWithOwnTeam(possibleXMove, possibleYMove) && (possibleXMove >= 0 && possibleXMove <= 7 && possibleYMove >= 0 && possibleYMove <= 7)){
            int[] possibleMove = {possibleXMove, possibleYMove};
            possibleMoves.add(possibleMove);
        }
        System.out.println(possibleMoves);
        return possibleMoves;
    }
}

