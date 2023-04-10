

import javax.swing.*;
import javax.swing.colorchooser.AbstractColorChooserPanel;
import java.awt.*;
import java.awt.event.*;
import java.util.ArrayList;

public class SteelDickChess extends JFrame {
    private final int ROWS = 8;
    private final int COLS = 8;
    public Color lightColor = Color.LIGHT_GRAY;
    public Color darkColor = Color.DARK_GRAY;
    private JButton[][] squares = new JButton[ROWS][COLS];
    private Piece[][] gamePieces = new Piece[ROWS][COLS];
    private Piece selectedPiece;
    public JPanel gridPanel = new JPanel();
    private JButton selectedSquare;
    private static int turn = 0;
    public static ArrayList<Piece> GamePieces = Configurations.Configurations();

    private Image image;
    private int imageRow = -1;
    private int imageCol = -1;
    private boolean restartGame = true;

    public Piece[][] GetAllOccupiedPositions(){

        return gamePieces;
    }

    //Turn 0 will be white's turn. Turn 1 will be black's turn.

    public void ToggleTurn(){
        if(turn == 0){
            turn = 1;
        }
        else{
            turn = 0;
        }
    }

    public static char GetTurn(){
        if(turn == 0){
            return 'w';
        }
        else{
            return 'b';
        }
    }


    public SteelDickChess() {
        super("Steel Dick Chess Challenge");

        //Only Runs Once per game
        CreateGamePieces();

        JMenuBar menuBar =  new JMenuBar();
        JMenu menu = new JMenu("File");
        JMenu about = new JMenu("About");
        JMenu preferences = new JMenu("Preferences");
        JMenuItem aboutItem = new JMenuItem("About");
        JMenuItem preferenceItem = new JMenuItem("Preferences");


        JMenuItem menuItem = new JMenuItem("New Game");
//        JMenuItem undoMove = new JMenuItem("Undo Move");
        JMenuItem exit = new JMenuItem("Exit");

        aboutItem.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                //Start New Game
                JDialog dialog = new JDialog();
                JPanel dialogPanel = new JPanel();
                dialog.add(dialogPanel);

                JLabel label = new JLabel("Copy Right Steel Dick Software 2023");
                dialogPanel.add(label);

                dialog.setSize(300, 100);

                // Get the screen size
                Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();

                // Calculate the center position of the dialog
                int centerX = (int) ((screenSize.getWidth() - dialog.getWidth()) / 2);
                int centerY = (int) ((screenSize.getHeight() - dialog.getHeight()) / 2);

                // Set the position of the dialog to the center of the screen
                dialog.setLocation(centerX, centerY);

                dialog.setVisible(true);
            }
        });
        preferenceItem.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                Color selectedColor = JColorChooser.showDialog(null, "Select Color Preference", null);

            }
        });



        menuItem.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                //Start New Game
                restartGame = true;
                CreateGamePieces();
                System.out.println("New Game Initialized");
            }
        });
        preferences.add(preferenceItem);
        about.add(aboutItem);
        menu.add(menuItem);
        menu.add(preferences);
        menu.add(exit);
        menuBar.add(menu);
        menuBar.add(about);

        setJMenuBar(menuBar);
        pack();

        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        // Create the grid layout

        gridPanel.setLayout(new GridLayout(ROWS, COLS));

        // Load the piece
        image = new ImageIcon("resources/knight_black.png").getImage();

        //Create Squares and action listeners.
        for (int row = 0; row < ROWS; row++) {
            for (int col = 0; col < COLS; col++) {
                squares[row][col] = new JButton();
                if((row%2==0 && col % 2 == 0) || (row%2!=0 && col % 2 != 0)){
                    squares[row][col].setBackground(lightColor);
                } else
                {
                    squares[row][col].setBackground(darkColor);
                }
            }
        }

        //Add the icons/
            for (Piece piece : Configurations.GamePieces) {
                squares[piece.getX()][piece.getY()].setIcon(new ImageIcon("resources/"+piece.getImage()));
        }

        // Create the squares and add them to the grid
        for (int row = 0; row < ROWS; row++) {
            for (int col = 0; col < COLS; col++) {
                squares[row][col].addActionListener(new SquareListener(row, col));
                gridPanel.add(squares[row][col]);
            }
        }
        getContentPane().add(gridPanel);
        // Pack the frame and make it visible
        pack();
        setVisible(true);
    }
    public void DrawBoard(){
        gridPanel.removeAll();
        for (int row = 0; row < ROWS; row++) {
            for (int col = 0; col < COLS; col++) {
                squares[row][col] = new JButton();
                if((row%2==0 && col % 2 == 0) || (row%2!=0 && col % 2 != 0)){
                    squares[row][col].setBackground(Color.LIGHT_GRAY);
                } else
                {
                    squares[row][col].setBackground(Color.DARK_GRAY);
                }
            }
        }

        for (Piece[] piece : gamePieces) {
            if(piece != null){
                for (Piece nextPiece : piece){
                    if(nextPiece != null) {
                        squares[nextPiece.getX()][nextPiece.getY()].setIcon(new ImageIcon("resources/" + nextPiece.getImage()));
                    }
                    }
            }
        }

        // Create the squares and add them to the grid
        for (int row = 0; row < ROWS; row++) {
            for (int col = 0; col < COLS; col++) {
                squares[row][col].addActionListener(new SquareListener(row, col));
                gridPanel.add(squares[row][col]);
            }
        }
        getContentPane().add(gridPanel);

        // Pack the frame and make it visible
        pack();
        setVisible(true);
    }

    public void CreateGamePieces(){
        if(restartGame){
            for (int row = 0; row < gamePieces.length; row++) {
                for (int col = 0; col < gamePieces[row].length; col++) {
                    gamePieces[row][col] = null; // or set to default value
                }
            }

            for (Piece piece : GamePieces) {
                gamePieces[piece.getX()][piece.getY()] = piece;
            }
        }
        restartGame = false;
    }
    private class SquareListener implements ActionListener {
        private int row, col;

        public SquareListener(int row, int col) {
            this.row = row;
            this.col = col;
        }


        public void actionPerformed(ActionEvent e) {
                System.out.println("Clicked square at (" + row + ", " + col + ")");
                //Only allow click if it's the player's turn.
                selectedPiece = gamePieces[row][col];
                if(selectedPiece.getTeam() == GetTurn()) {
                    selectedSquare = squares[row][col];
                    DrawBoard();
                    DisplayPossibleMoves(row, col);
                }
        }


        private void DisplayPossibleMoves (int row, int col) {

            ArrayList<int[]> PossibleMoves = gamePieces[row][col].movesAvailable();

            for (int[] PossibleMove : PossibleMoves) {
                int possibleRow = PossibleMove[0];
                int possibleCol = PossibleMove[1];
                  squares[possibleRow][possibleCol].setBackground(Color.BLUE);
                  squares[possibleRow][possibleCol].addActionListener(new MoveListener(row, col, possibleRow, possibleCol));
                }
            }
    }

    public class MoveListener implements ActionListener {
        private int row;
        private int col;
        private int newRow;
        private int newColumn;

        public MoveListener(int row, int col, int newRow, int newColumn) {
            this.row = row;
            this.col = col;
            this.newRow = newRow;
            this.newColumn = newColumn;
        }

        @Override
        public void actionPerformed(ActionEvent e) {
            Piece piece = gamePieces[row][col];
            piece.setX(newRow);
            piece.setY(newColumn);
            gamePieces[row][col] = null;
            piece.setMoved();
            gamePieces[newRow][newColumn] = piece;
            System.out.println(gamePieces[newRow][newColumn].getX());
            System.out.println(gamePieces[newRow][newColumn].getY());
            //Toggle Turn After Move Is Completed.
            ToggleTurn();
            DrawBoard();
        }

        private void IsSquareOccupied(int row, int col) {
            if(gamePieces[row][col] != null) {
                System.out.println("Square is occupied");
            }
            else{
                System.out.println("Square is not occupied");
            }
        }
    }


    public static void main(String[] args) {
        new SteelDickChess();
    }
}
