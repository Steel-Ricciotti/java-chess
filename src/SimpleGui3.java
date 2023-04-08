import javax.imageio.ImageIO;
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import java.util.Map;

public class SimpleGui3 extends JFrame implements ActionListener {
    private JFrame frame;
    private JLabel label;
    private static final int SQUARE_SIZE = 80;
    private static final int BOARD_SIZE = 8 * SQUARE_SIZE;
//    class MyDrawPanel extends JPanel{
//        public void paintComponent(Graphics g){
//            g.setColor(Color.ORANGE);
//            g.fillOval(x,y,100,100);
//        }
//    }

    public void ChessboardFrame(){
        setTitle("SteelDickSoftware Chess");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

    }
    public void PaintFrame() {

        JButton labelButton = new JButton("Change Black Chess Piece");
        JButton colorButton = new JButton("Change White Chess Piece");

        JButton button = new JButton("New Button");
        button.addActionListener(this);
        JMenuBar menuBar =  new JMenuBar();
        JMenu menu = new JMenu("File");
        JMenuItem menuItem = new JMenuItem("New");
        JPanel panel = new JPanel();
        panel.setLayout(new GridLayout(8, 8));
        menu.add(menuItem );
        menuBar.add(menu);

        for (int row = 0; row < 8; row++) {
            for (int col = 0; col < 8; col++) {
                JPanel squarePanel = new JPanel();
                squarePanel.setPreferredSize(new Dimension(SQUARE_SIZE, SQUARE_SIZE));
                if ((row + col) % 2 == 0) {
                    squarePanel.setBackground(Color.LIGHT_GRAY);
                } else {
                    squarePanel.setBackground(Color.BLUE);
                }
                panel.add(squarePanel);
            }
        }
        label = new JLabel("I'm a label");


        //Add pieces to screen.
        JPanel piecePanel;
        JLabel pieceLabel;
        Image pieceImage;
        //Draw the pieces
        for (Map.Entry<Integer, String> entry : Configurations.START_PIECES_POSITION.entrySet()) {
            Integer key = entry.getKey();
            String value = entry.getValue();
            pieceImage = new ImageIcon("resources/" + value).getImage();
            pieceLabel = new JLabel(new ImageIcon(pieceImage));
            piecePanel = (JPanel) panel.getComponent(key); // Get the third square panel
            piecePanel.add(pieceLabel);
            piecePanel.setLayout(new BorderLayout());
            piecePanel.add(pieceLabel, BorderLayout.CENTER);

        }
        
        frame = new JFrame();
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        panel.setPreferredSize(new Dimension(400, 400));
        frame.add(panel);
        frame.setJMenuBar(menuBar);
        frame.pack();
        frame.setSize(500,500);
        frame.setTitle("Steel.Dick.Software Chess Challenge");

// Create a JLabel with the image and add it to the first square of the chessboard

        frame.setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        frame.repaint();
    }

    class ColorListener implements ActionListener{
        public void actionPerformed(ActionEvent e) {
            label.setText("Changed");
        }
    }

    class LabelListener implements ActionListener{

        public void actionPerformed(ActionEvent e) {
            frame.repaint();
        }
    }

}


