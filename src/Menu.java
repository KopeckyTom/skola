import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Menu implements ActionListener {
    JPanel topPanel = new JPanel();
    JPanel midTopPanel = new JPanel();
    JPanel midBottomPanel = new JPanel();
    JPanel bottomPanel = new JPanel();
    JButton threeXThreeButton = new JButton();
    JButton sixXSixButton = new JButton();
    JButton exitButton = new JButton();
    JLabel ticTacToeLabel = new JLabel();
    JFrame menuFrame = new JFrame();
    ImageIcon image = new ImageIcon("zaverecnapracelogo.png");

    Menu() {


        threeXThreeButton.setBounds(300, 50, 200, 100);
        threeXThreeButton.addActionListener(this);
        threeXThreeButton.setText("3x3");
        threeXThreeButton.setFont(new Font("Arial Black", Font.PLAIN, 40));
        threeXThreeButton.setHorizontalTextPosition(JButton.CENTER);
        threeXThreeButton.setBackground(new Color(150,200,255));

        sixXSixButton.setBounds(300, 50, 200, 100);
        sixXSixButton.addActionListener(this);
        sixXSixButton.setText("6x6");
        sixXSixButton.setFont(new Font("Arial Black", Font.PLAIN, 40));
        sixXSixButton.setHorizontalTextPosition(JButton.CENTER);
        sixXSixButton.setBackground(new Color(160, 215, 245));

        exitButton.setBounds(300, 50, 200, 100);
        exitButton.addActionListener(this);
        exitButton.setText("EXIT");
        exitButton.setFont(new Font("Arial Black", Font.PLAIN, 40));
        exitButton.setHorizontalTextPosition(JButton.CENTER);
        exitButton.setBackground(new Color(150, 200, 255));

        ticTacToeLabel.setText("Tic Tac Toe");
        ticTacToeLabel.setHorizontalAlignment(JLabel.CENTER);
        ticTacToeLabel.setVerticalAlignment(JLabel.CENTER);
        ticTacToeLabel.setBounds(0, 0, 800, 200);
        ticTacToeLabel.setFont(new Font("Sneakerhead BTN Shadow", Font.PLAIN, 80));

        topPanel.setBounds(0, 0, 800, 200);
        topPanel.setBackground(new Color(150, 200, 255));
        topPanel.setLayout(null);
        topPanel.add(ticTacToeLabel);

        midTopPanel.setBounds(0, 200, 800, 200);
        midTopPanel.setBackground(new Color(160, 215, 245));
        midTopPanel.setLayout(null);
        midTopPanel.add(threeXThreeButton);

        midBottomPanel.setBounds(0, 400, 800, 200);
        midBottomPanel.setBackground(new Color(150, 200, 255));
        midBottomPanel.setLayout(null);
        midBottomPanel.add(sixXSixButton);

        bottomPanel.setBounds(0, 600, 800, 200);
        bottomPanel.setBackground(new Color(160, 215, 245));
        bottomPanel.setLayout(null);
        bottomPanel.add(exitButton);

        menuFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        menuFrame.setTitle("TicTacToe - Menu");
        menuFrame.setResizable(false);
        menuFrame.setSize(816, 839);
        menuFrame.setVisible(true);
        menuFrame.setLayout(null);
        menuFrame.setIconImage(image.getImage());
        menuFrame.add(topPanel);
        menuFrame.add(midTopPanel);
        menuFrame.add(midBottomPanel);
        menuFrame.add(bottomPanel);


    }

    /**
     * this method opens new JFrames
     * @param e the event to be processed
     */
    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == threeXThreeButton) {
            menuFrame.dispose();
            ThreeXThree threeXThree = new ThreeXThree();
        }
        if (e.getSource() == sixXSixButton) {
            menuFrame.dispose();
            SixXSix sixXSix = new SixXSix();
        }
        if (e.getSource() == exitButton) {
            menuFrame.dispose();
        }
    }
}