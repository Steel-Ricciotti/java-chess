//import javax.imageio.ImageIO;
//import javax.swing.*;
//import java.awt.*;
//import java.awt.event.*;
//import java.awt.image.BufferedImage;
//import java.io.File;
//import java.io.IOException;
//import java.util.ArrayList;
//import java.util.HashMap;
//import java.util.Map;
//
//public class SimpleGui3 extends JFrame implements ActionListener {
//    private JFrame frame;
//    private JLabel label;
//    private Point initialClick;
//    private JPanel piecePanel;
//    private Image pieceImage;
//    private JLabel pieceLabel;
//    private JPanel selectedPanel = null;
//    public static ArrayList<Piece> gamepieces_ = Configurations.Configurations();
//    public static final HashMap<int[], String> gameState = Configurations.START_PIECES_POSITION;
//    public static HashMap<Integer, Color> boardColors = new HashMap<>();
//    JPanel panel = new JPanel();
//
//    private static final int SQUARE_SIZE = 80;
//    private static final int BOARD_SIZE = 8 * SQUARE_SIZE;
//
//
//    private void DrawBoard(){
//
//        //Draw the pieces
//        for (Map.Entry<int[], String> entry : gameState.entrySet()) {
//            int[] key = entry.getKey();
//            String value = entry.getValue();
//            pieceImage = new ImageIcon("resources/" + value).getImage();
//            pieceLabel = new JLabel(new ImageIcon(pieceImage));
//            char team = value.contains("white") ? 'w' : (value.contains("black") ? 'b' : ' ');
//
//            Piece gamePiece = new Piece(pieceLabel, value, key[0],team);
//
//            // Add a mouse listener to the image label
//            gamePiece.getPieceLabel().addMouseListener(new MouseAdapter() {
//                public void mousePressed(MouseEvent e) {
//                    CheckIfPlayerClickedOwnPiece();
//                    CalculatePossibleMoves();
//                    //selectedPanel = (JPanel) gamePiece.getPieceLabel().getParent();
//                    //System.out.println(panel.getComponent(gamePiece.getLocation()+8));
//
//
//                    selectedPanel = (JPanel)panel.getComponent(gamePiece.getLocation()-8);
//                    boardColors.put(gamePiece.getLocation()-8,selectedPanel.getBackground());
//                    selectedPanel.setBackground(Color.YELLOW);
//                    selectedPanel = (JPanel)panel.getComponent(gamePiece.getLocation()-16);
//                    boardColors.put(gamePiece.getLocation()-16,selectedPanel.getBackground());
//                    selectedPanel.setBackground(Color.YELLOW);
//                    //selectedPanel = (JPanel) gamePiece.getPieceLabel();
//                    System.out.println(selectedPanel);
//                    //selectedPanel.
//                    selectedPanel.setBackground(Color.YELLOW);
//                    initialClick = e.getPoint();
//                    pieceLabel = (JLabel) e.getComponent();
//                    pieceLabel.setCursor(Cursor.getPredefinedCursor(Cursor.MOVE_CURSOR));
//                }
//
//                private void CheckIfPlayerClickedOwnPiece() {
//                }
//
//                private void CalculatePossibleMoves() {
//                }
//
//                public void mouseReleased(MouseEvent e) {
//                    pieceLabel.setCursor(Cursor.getPredefinedCursor(Cursor.DEFAULT_CURSOR));
//                    for (Map.Entry<Integer, Color> entry : boardColors.entrySet()) {
//                        int key = entry.getKey();
//                        Color value = entry.getValue();
//                        selectedPanel = (JPanel)panel.getComponent(key);
//                        selectedPanel.setBackground(value);
//                    }
//
//                    DrawBoard();
//                    boardColors.clear();
//                }
//            });
//            gamePiece.getPieceLabel().addMouseMotionListener(new MouseAdapter() {
//                public void mouseDragged(MouseEvent e) {
//                    // Determine how much the mouse moved since the initial click
//                    int thisX = gamePiece.getPieceLabel().getLocation().x;
//                    int thisY = gamePiece.getPieceLabel().getLocation().y;
//
//                    // Determine how much the mouse moved since the initial click
//                    int xMoved = e.getX() - initialClick.x;
//                    int yMoved = e.getY() - initialClick.y;
//                    // Move window to this position
//                    int x = thisX + xMoved;
//                    int y = thisY + yMoved;
//                    pieceLabel.setLocation(x, y);
//                    if(gamePiece.getTeam()=='w') {
//                        piecePanel = (JPanel) panel.getComponent(gamePiece.getLocation() - 8); // Get the third square panel
//                        gamePiece.setLocation(gamePiece.getLocation() - 8);
//                    }
//                    else{
//                        piecePanel = (JPanel) panel.getComponent(gamePiece.getLocation() + 8); // Get the third square panel
//                        gamePiece.setLocation(gamePiece.getLocation() + 8);
//                    }
//                    piecePanel.add(pieceLabel);
//                    piecePanel.setLayout(new BorderLayout());
//                    piecePanel.add(pieceLabel, BorderLayout.CENTER);
//                    System.out.println(gamepieces_);
//                    //PaintFrame();
//                }
//            });
//
//            piecePanel = (JPanel) panel.getComponent(key[0]); // Get the third square panel
//            piecePanel.setLayout(new BorderLayout());
//            piecePanel.add(pieceLabel, BorderLayout.CENTER);
//        }
//    }
//
//    public boolean DetectCollision(){return false;}
//    public void PaintFrame() {
//        //ChessboardFrame();
//        JButton labelButton = new JButton("Change Black Chess Piece");
//        JButton colorButton = new JButton("Change White Chess Piece");
//
//        JButton button = new JButton("New Button");
//        button.addActionListener(this);
//        JMenuBar menuBar =  new JMenuBar();
//        JMenu menu = new JMenu("File");
//        JMenuItem menuItem = new JMenuItem("New");
//        frame.setJMenuBar(menuBar);
//        panel.setLayout(new GridLayout(8, 8));
//        menu.add(menuItem );
//        menuBar.add(menu);
//
//        for (int row = 0; row < 8; row++) {
//            for (int col = 0; col < 8; col++) {
//                JPanel squarePanel = new JPanel();
//                squarePanel.setPreferredSize(new Dimension(SQUARE_SIZE, SQUARE_SIZE));
//                if ((row + col) % 2 == 0) {
//                    squarePanel.setBackground(Color.LIGHT_GRAY);
//                } else {
//                    squarePanel.setBackground(Color.BLUE);
//                }
//                panel.add(squarePanel);
//            }
//        }
//        label = new JLabel("I'm a label");
//
//        DrawBoard();
//        frame = new JFrame();
//        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
//        panel.setPreferredSize(new Dimension(400, 400));
//        frame.add(panel);
//        frame.setJMenuBar(menuBar);
//        frame.pack();
//        frame.setSize(500,500);
//        frame.setTitle("Steel.Dick.Software Chess Challenge");
//
//// Create a JLabel with the image and add it to the first square of the chessboard
//
//        frame.setVisible(true);
//    }
//
//    @Override
//    public void actionPerformed(ActionEvent e) {
//        frame.repaint();
//    }
//
//    class ColorListener implements ActionListener{
//        public void actionPerformed(ActionEvent e) {
//            label.setText("Changed");
//        }
//    }
//
//    class LabelListener implements ActionListener{
//
//        public void actionPerformed(ActionEvent e) {
//            frame.repaint();
//        }
//    }
//
//}
//
//
