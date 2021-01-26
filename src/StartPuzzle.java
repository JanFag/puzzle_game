/*
import javax.imageio.ImageIO;
import javax.swing.*;
import javax.swing.border.EmptyBorder;
import java.awt.*;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;

public class StartPuzzle extends JFrame {
    private JPanel startPanel;
    private Image image1;
    private Image image2;
    private BufferedImage source;
    private final int DESIRED_WIDTH = 300;
    private BufferedImage resized;
    private int width, height;
    private JPanel contentPanel;


    public StartPuzzle () {
        initUI0();
    }

    public void initUI0() {
        startPanel = new JPanel();
        startPanel.setLayout(new GridLayout(3, 4, 0, 0));
        startPanel.setBorder(BorderFactory.createLineBorder(Color.red));


        try {
            source = loadImage0();
            int h = getNewHeight(source.getWidth(), source.getHeight());
            resized = resizeImage(source, DESIRED_WIDTH, h,
                    BufferedImage.TYPE_INT_ARGB);

        } catch (IOException ex) {
            JOptionPane.showMessageDialog(this, "Could not load image", "Error",
                    JOptionPane.ERROR_MESSAGE);
        }
        width = resized.getWidth(null);
        height = resized.getHeight(null);
        add(startPanel, BorderLayout.LINE_START);

        pack();

        setTitle("Puzzle");
        setResizable(false);
        setBounds(100,100,450,300);
        contentPanel = new JPanel();
        contentPanel.setBorder((new EmptyBorder(5,5,5,5)));
        contentPanel.setLayout(new BorderLayout(0,0));
        setContentPane(contentPanel);
        ImageIcon icon = new ImageIcon("birds.jpg");
       // icon.paintIcon(this, 50,50);
        contentPanel.add(icon, BorderLayout.CENTER);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);
    }

    private BufferedImage loadImage0() throws IOException {

        var bimg = ImageIO.read(new File("birds.jpg"));

        return bimg;
    }
    private int getNewHeight(int w, int h) {

        double ratio = DESIRED_WIDTH / (double) w;
        int newHeight = (int) (h * ratio);
        return newHeight;
    }

    private BufferedImage loadImage() throws IOException {

        var bimg = ImageIO.read(new File("birds.jpg"));

        return bimg;
    }

    private BufferedImage resizeImage(BufferedImage originalImage, int width,
                                      int height, int type) {

        var resizedImage = new BufferedImage(width, height, type);
        var g = resizedImage.createGraphics();
        g.drawImage(originalImage, 0, 0, width, height, null);
        g.dispose();

        return resizedImage;
    }

    //private class ClickAction extends AbstractAction {

    //  @Override
    //  public void actionPerformed(ActionEvent e) {

    //      checkButton(e);
    //     checkSolution();
    // }
    // }



}
*/
