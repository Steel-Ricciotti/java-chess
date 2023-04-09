//import javax.swing.*;
//import java.awt.*;
//import java.awt.event.*;
//
//public class ImageDragApp extends JFrame {
//    private JLabel imageLabel;
//    private JLabel clickedLabel;
//    private Point initialClick;
//
//    public ImageDragApp() {
//        // Create the menu bar
//        JMenuBar menuBar = new JMenuBar();
//        setJMenuBar(menuBar);
//
//        // Create the file menu
//        JMenu fileMenu = new JMenu("File");
//        menuBar.add(fileMenu);
//
//        // Create the open menu item
//        JMenuItem openMenuItem = new JMenuItem("Open");
//        fileMenu.add(openMenuItem);
//
//        // Create the image label
//        ImageIcon imageIcon = new ImageIcon("resources/king_white.png");
//        imageLabel = new JLabel(imageIcon);
//
//        // Add a mouse listener to the image label
//        imageLabel.addMouseListener(new MouseAdapter() {
//            public void mousePressed(MouseEvent e) {
//                initialClick = e.getPoint();
//            }
//
//            public void mouseReleased(MouseEvent e) {
//                imageLabel.setCursor(Cursor.getPredefinedCursor(Cursor.DEFAULT_CURSOR));
//            }
//        });
//
//        // Add a mouse motion listener to the image label
//        imageLabel.addMouseMotionListener(new MouseAdapter() {
//            public void mouseDragged(MouseEvent e) {
//                // Determine how much the mouse moved since the initial click
//                int xMoved = e.getX() - initialClick.x;
//                int yMoved = e.getY() - initialClick.y;
//
//                // Move the label to the new position
//                int x = imageLabel.getLocation().x + xMoved;
//                int y = imageLabel.getLocation().y + yMoved;
//                imageLabel.setLocation(x, y);
//                imageLabel.setCursor(Cursor.getPredefinedCursor(Cursor.MOVE_CURSOR));
//            }
//        });
//
//        // Create the clicked label
//        clickedLabel = new JLabel("");
//
//        // Create the content pane
//        JPanel contentPane = new JPanel();
//        contentPane.setLayout(new BorderLayout());
//        contentPane.add(imageLabel, BorderLayout.CENTER);
//        contentPane.add(clickedLabel, BorderLayout.SOUTH);
//
//        setContentPane(contentPane);
//        setSize(800, 600);
//        setVisible(true);
//    }
//
//    private void paintFrame() {
//        JPanel imagePanel = new JPanel();
//        imagePanel.setLayout(new GridLayout(10, 4));
//        for (int i = 0; i < 40; i++) {
//            Image image = getImagesFromResources("image" + i + ".png");
//            ImageIcon imageIcon = new ImageIcon(image);
//            JLabel imageLabel = new JLabel(imageIcon);
//            imageLabel.addMouseListener(new MouseAdapter() {
//                public void mousePressed(MouseEvent e) {
//                    initialClick = e.getPoint();
//                }
//                public void mouseReleased(MouseEvent e) {
//                    imageLabel.setCursor(Cursor.getPredefinedCursor(Cursor.DEFAULT_CURSOR));
//                }
//            });
//            imageLabel.addMouseMotionListener(new MouseMotionAdapter() {
//                public void mouseDragged(MouseEvent e) {
//                    // get location of Window
//                    int thisX = frame.getLocation().x;
//                    int thisY = frame.getLocation().y;
//
//                    // Determine how much the mouse moved since the initial click
//                    int xMoved = e.getX() - initialClick.x;
//                    int yMoved = e.getY() - initialClick.y;
//
//                    // Move window to this position
//                    int x = thisX + xMoved;
//                    int y = thisY + yMoved;
//                    frame.setLocation(x, y);
//                }
//            });
//            imagePanel.add(imageLabel);
//        }
//        frame.getContentPane().add(BorderLayout.CENTER, imagePanel);
//        frame.pack();
//    }
//
//    public static void main(String[] args) {
//        // Create the image drag app
//        ImageDragApp app = new ImageDragApp();
//    }
//}
