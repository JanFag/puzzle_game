import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class PuzzleApp extends JFrame{
    private JPanel StartPanel;
    private JLabel label;
    private JButton STARTTHEGAMEButton;



    public PuzzleApp(JFrame frame) {


        STARTTHEGAMEButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                var puzzle = new MyPuzzle();
                //var startPuzzle = new StartPuzzle();
                //startPuzzle.setVisible(true);
                puzzle.setVisible(true);
                frame.setVisible(false);
            }
        });

    }
    public static void main(String[] args) {

        JFrame frame = new JFrame("Puzzle");
        frame.setContentPane(new PuzzleApp(frame).StartPanel);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(220, 400);
        frame.setLocationRelativeTo(null);
        frame.pack();
        frame.setVisible(true);


            }



}
