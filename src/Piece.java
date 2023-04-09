import javax.swing.*;

public class Piece {
    private JLabel piecePanel;
    private String image;
    private int location;
    private char team;

    public Piece(JLabel piecePanel, String image, int location, char team) {
        this.piecePanel = piecePanel;
        this.image = image;
        this.location = location;
        this.team = team;
    }

    public JLabel getPieceLabel() {
        return piecePanel;
    }

    public void setPieceLabel(JLabel newPanel) {
        this.piecePanel = newPanel;
    }


    public String getImage() {
        return image;
    }

    public int getLocation() {
        return location;
    }

    public void setLocation(int location) {
        this.location = location;
    }

    public void setTeam(char team){
        this.team = team;
    }

    public char getTeam(){
        return this.team;
    }
}