import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
public class SixXSix implements ActionListener {
    JFrame sixXSixFrame = new JFrame();
    JPanel topPanel = new JPanel();
    JLabel topLabel = new JLabel();
    JButton menu = new JButton();
    JButton reset = new JButton();
    ImageIcon image = new ImageIcon("zaverecnapracelogo.png");
    JPanel buttonPanel = new JPanel();
    JButton[] buttons = new JButton[36];
    boolean player1Turn;

    public void setButtons(JButton[] buttons) {
        this.buttons = buttons;
    }


    SixXSix() {

        topLabel.setText("6x6 - match 4 in a row / O turn");
        topLabel.setFont(new Font("Arial", Font.PLAIN, 30));
        topLabel.setBounds(0, 0, 800, 100);

        menu.addActionListener(this);
        menu.setText("Menu");
        menu.setFont(new Font("Arial Black", Font.PLAIN, 25));
        menu.setBounds(639, 25, 150, 50);
        menu.setBackground(new Color(160, 215, 245));

        reset.addActionListener(this);
        reset.setText("Reset");
        reset.setFont(new Font("Arial Black", Font.PLAIN, 25));
        reset.setBounds(464, 25, 150, 50);
        reset.setBackground(new Color(160, 215, 245));

        topPanel.setLayout(null);
        topPanel.setBackground(new Color(150, 200, 255));
        topPanel.setBounds(0, 0, 800, 100);
        topPanel.add(topLabel);
        topPanel.add(menu);
        topPanel.add(reset);

        buttonPanel.setLayout(new GridLayout(6, 6));
        buttonPanel.setBackground(new Color(170, 170, 170));
        buttonPanel.setBounds(0, 100, 800, 700);

        for (int i = 0; i < 36; i++) {
            buttons[i] = new JButton();
            buttonPanel.add(buttons[i]);
            buttons[i].setFont(new Font("Monospaced", Font.PLAIN, 100));
            buttons[i].setFocusable(false);
            buttons[i].addActionListener(this);

        }

        sixXSixFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        sixXSixFrame.setTitle("TicTacToe - 6x6");
        sixXSixFrame.setResizable(false);
        sixXSixFrame.setSize(816, 838);
        sixXSixFrame.setVisible(true);
        sixXSixFrame.setLayout(null);
        sixXSixFrame.setIconImage(image.getImage());
        sixXSixFrame.add(topPanel);
        sixXSixFrame.add(buttonPanel);
    }

    /**
     * This method resets current JFrame and opens new JFrame
     * @param e the event to be processed
     */

    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == menu) {
            sixXSixFrame.dispose();
            Menu menu1 = new Menu();
        }
        if (e.getSource() == reset) {
            sixXSixFrame.dispose();
            SixXSix sixXSix = new SixXSix();
        }
        for (int i = 0; i < 36; i++) {
            if (e.getSource() == buttons[i]) {
                if (player1Turn) {
                    if (buttons[i].getText().equals("")) {
                        buttons[i].setForeground(new Color(255, 0, 0));
                        buttons[i].setText("X");
                        player1Turn = false;
                        topLabel.setText("O turn");
                        check();
                    }
                } else {
                    if (buttons[i].getText().equals("")) {
                        buttons[i].setForeground(new Color(0, 0, 255));
                        buttons[i].setText("O");
                        player1Turn = true;
                        topLabel.setText("X turn");
                        check();
                    }
                }
            }
        }
    }

    /**
     * This method check all winning combinations
     */

    public void check() {


       for (int i = 0; i < 3; i++) {
           if (
                    (buttons[i].getText().equals("X")) && (buttons[i + 1].getText().equals("X")) && (buttons[i + 2].getText().equals("X")) && (buttons[i + 3].getText().equals("X"))
           ) {
                xWins(i, i + 1, i + 2, i + 3);
           }
       }

       for (int i = 6; i < 9; i++) {
            if (
                    (buttons[i].getText().equals("X")) && (buttons[i + 1].getText().equals("X")) && (buttons[i + 2].getText().equals("X")) && (buttons[i + 3].getText().equals("X"))
            ) {
                xWins(i, i + 1, i + 2, i + 3);
            }
       }

       for (int i = 12; i < 15; i++) {
            if (
                    (buttons[i].getText().equals("X")) && (buttons[i + 1].getText().equals("X")) && (buttons[i + 2].getText().equals("X")) && (buttons[i + 3].getText().equals("X"))
            ) {
                xWins(i, i + 1, i + 2, i + 3);
            }
       }

       for (int i = 18; i < 21; i++) {
            if (
                    (buttons[i].getText().equals("X")) && (buttons[i + 1].getText().equals("X")) && (buttons[i + 2].getText().equals("X")) && (buttons[i + 3].getText().equals("X"))
            ) {
                xWins(i, i + 1, i + 2, i + 3);
            }
       }

       for (int i = 24; i < 27; i++) {
            if (
                    (buttons[i].getText().equals("X")) && (buttons[i + 1].getText().equals("X")) && (buttons[i + 2].getText().equals("X")) && (buttons[i + 3].getText().equals("X"))
            ) {
                xWins(i, i + 1, i + 2, i + 3);
            }
       }

       for (int i = 30; i < 33; i++) {
            if (
                    (buttons[i].getText().equals("X")) && (buttons[i + 1].getText().equals("X")) && (buttons[i + 2].getText().equals("X")) && (buttons[i + 3].getText().equals("X"))
            ) {
                xWins(i, i + 1, i + 2, i + 3);
            }
       }


       for (int i = 0; i < 3; i++) {
            if (
                    (buttons[(i) * 6].getText().equals("X")) && (buttons[(i + 1) * 6].getText().equals("X")) && (buttons[(i + 2) * 6].getText().equals("X")) && (buttons[(i + 3) * 6].getText().equals("X"))
            ) {
                xWins((i) * 6, (i + 1) * 6, (i + 2) * 6, (i + 3) * 6);
            }
       }

       for (int i = 1; i < 4; i++) {
            if (
                    (buttons[(i) * 6 - 5].getText().equals("X")) && (buttons[(i + 1) * 6 - 5].getText().equals("X")) && (buttons[(i + 2) * 6 - 5].getText().equals("X")) && (buttons[(i + 3) * 6 - 5].getText().equals("X"))
            ) {
                xWins((i) * 6 - 5, (i + 1) * 6 - 5, (i + 2) * 6 - 5, (i + 3) * 6 - 5);
            }
       }

       for (int i = 2; i < 5; i++) {
            if (
                    (buttons[(i) * 6 - 10].getText().equals("X")) && (buttons[(i + 1) * 6 - 10].getText().equals("X")) && (buttons[(i + 2) * 6 - 10].getText().equals("X")) && (buttons[(i + 3) * 6 - 10].getText().equals("X"))
            ) {
                xWins((i) * 6 - 10, (i + 1) * 6 - 10, (i + 2) * 6 - 10, (i + 3) * 6 - 10);
            }
       }

       for (int i = 3; i < 6; i++) {
            if (
                    (buttons[(i) * 6 - 15].getText().equals("X")) && (buttons[(i + 1) * 6 - 15].getText().equals("X")) && (buttons[(i + 2) * 6 - 15].getText().equals("X")) && (buttons[(i + 3) * 6 - 15].getText().equals("X"))
            ) {
                xWins((i) * 6 - 15, (i + 1) * 6 - 15, (i + 2) * 6 - 15, (i + 3) * 6 - 15);
            }
       }

       for (int i = 4; i < 7; i++) {
            if (
                    (buttons[(i) * 6 - 20].getText().equals("X")) && (buttons[(i + 1) * 6 - 20].getText().equals("X")) && (buttons[(i + 2) * 6 - 20].getText().equals("X")) && (buttons[(i + 3) * 6 - 20].getText().equals("X"))
            ) {
                xWins((i) * 6 - 20, (i + 1) * 6 - 20, (i + 2) * 6 - 20, (i + 3) * 6 - 20);
            }
       }

       for (int i = 5; i < 8; i++) {
            if (
                    (buttons[(i) * 6 - 25].getText().equals("X")) && (buttons[(i + 1) * 6 - 25].getText().equals("X")) && (buttons[(i + 2) * 6 - 25].getText().equals("X")) && (buttons[(i + 3) * 6 - 25].getText().equals("X"))
            ) {
                xWins((i) * 6 - 25, (i + 1) * 6 - 25, (i + 2) * 6 - 25, (i + 3) * 6 - 25);
            }
       }

       for (int i = 11; i < 13; i++) {
            if (
                    (buttons[(i) * 5 - 44].getText().equals("X")) && (buttons[(i + 1) * 5 - 44].getText().equals("X")) && (buttons[(i + 2) * 5 - 44].getText().equals("X")) && (buttons[(i + 3) * 5 - 44].getText().equals("X"))
            ) {
                xWins((i) * 5 - 44, (i + 1) * 5 - 44, (i + 2) * 5 - 44, (i + 3) * 5 - 44);
            }
       }


       if (
                (buttons[3].getText().equals("X")) && (buttons[8].getText().equals("X")) && (buttons[13].getText().equals("X")) && (buttons[18].getText().equals("X"))
       ) {
            xWins(3, 8, 13, 18);
       }


       for (int i = 4; i < 6; i++) {
            if (
                    (buttons[(i) * 5 - 16].getText().equals("X")) && (buttons[(i + 1) * 5 - 16].getText().equals("X")) && (buttons[(i + 2) * 5 - 16].getText().equals("X")) && (buttons[(i + 3) * 5 - 16].getText().equals("X"))
            ) {
                xWins((i) * 5 - 16, (i + 1) * 5 - 16, (i + 2) * 5 - 16, (i + 3) * 5 - 16);
            }
       }

       for (int i = 1; i < 4; i++) {
            if (
                    (buttons[(i) * 5].getText().equals("X")) && (buttons[(i + 1) * 5].getText().equals("X")) && (buttons[(i + 2) * 5].getText().equals("X")) && (buttons[(i + 3) * 5].getText().equals("X"))
            ) {
                xWins((i) * 5, (i + 1) * 5, (i + 2) * 5, (i + 3) * 5);
            }
       }

       for (int i = 11; i < 13; i++) {
            if (
                    (buttons[(i) * 5 - 44].getText().equals("X")) && (buttons[(i + 1) * 5 - 44].getText().equals("X")) && (buttons[(i + 2) * 5 - 44].getText().equals("X")) && (buttons[(i + 3) * 5 - 44].getText().equals("X"))
            ) {
                xWins((i) * 5 - 44, (i + 1) * 5 - 44, (i + 2) * 5 - 44, (i + 3) * 5 - 44);
            }
       }

       if (
                (buttons[17].getText().equals("X")) && (buttons[22].getText().equals("X")) && (buttons[27].getText().equals("X")) && (buttons[32].getText().equals("X"))
       ) {
            xWins(17, 22, 27, 32);
       }

       if (
                (buttons[12].getText().equals("X")) && (buttons[19].getText().equals("X")) && (buttons[26].getText().equals("X")) && (buttons[33].getText().equals("X"))
       ) {
            xWins(12, 19, 26, 33);
       }

       for (int i = 6; i < 8; i++) {
            if (
                    (buttons[(i) * 7 - 36].getText().equals("X")) && (buttons[(i + 1) * 7 - 36].getText().equals("X")) && (buttons[(i + 2) * 7 - 36].getText().equals("X")) && (buttons[(i + 3) * 7 - 36].getText().equals("X"))
            ) {
                xWins((i) * 7 - 36, (i + 1) * 7 - 36, (i + 2) * 7 - 36, (i + 3) * 7 - 36);
            }
       }

       for (int i = 0; i < 3; i++) {
            if (
                    (buttons[(i) * 7].getText().equals("X")) && (buttons[(i + 1) * 7].getText().equals("X")) && (buttons[(i + 2) * 7].getText().equals("X")) && (buttons[(i + 3) * 7].getText().equals("X"))
            ) {
                xWins((i) * 7, (i + 1) * 7, (i + 2) * 7, (i + 3) * 7);
            }
       }

       for (int i = 1; i < 3; i++) {
            if (
                    (buttons[(i) * 7 - 6].getText().equals("X")) && (buttons[(i + 1) * 7 - 6].getText().equals("X")) && (buttons[(i + 2) * 7 - 6].getText().equals("X")) && (buttons[(i + 3) * 7 - 6].getText().equals("X"))
            ) {
                xWins((i) * 7 - 6, (i + 1) * 7 - 6, (i + 2) * 7 - 6, (i + 3) * 7 - 6);
            }
       }

       if (
                (buttons[2].getText().equals("X")) && (buttons[9].getText().equals("X")) && (buttons[16].getText().equals("X")) && (buttons[23].getText().equals("X"))
       ) {
            xWins(2, 9, 16, 23);
       }


       for (int i = 0; i < 3; i++) {
            if (
                    (buttons[i].getText().equals("O")) && (buttons[i + 1].getText().equals("O")) && (buttons[i + 2].getText().equals("O")) && (buttons[i + 3].getText().equals("O"))
            ) {
                oWins(i, i + 1, i + 2, i + 3);
            }
       }

       for (int i = 6; i < 9; i++) {
            if (
                    (buttons[i].getText().equals("O")) && (buttons[i + 1].getText().equals("O")) && (buttons[i + 2].getText().equals("O")) && (buttons[i + 3].getText().equals("O"))
            ) {
                oWins(i, i + 1, i + 2, i + 3);
            }
       }

       for (int i = 12; i < 15; i++) {
            if (
                    (buttons[i].getText().equals("O")) && (buttons[i + 1].getText().equals("O")) && (buttons[i + 2].getText().equals("O")) && (buttons[i + 3].getText().equals("O"))
            ) {
                oWins(i, i + 1, i + 2, i + 3);
            }
       }

       for (int i = 18; i < 21; i++) {
            if (
                    (buttons[i].getText().equals("O")) && (buttons[i + 1].getText().equals("O")) && (buttons[i + 2].getText().equals("O")) && (buttons[i + 3].getText().equals("O"))
            ) {
                oWins(i, i + 1, i + 2, i + 3);
            }
       }

       for (int i = 24; i < 27; i++) {
            if (
                    (buttons[i].getText().equals("O")) && (buttons[i + 1].getText().equals("O")) && (buttons[i + 2].getText().equals("O")) && (buttons[i + 3].getText().equals("O"))
            ) {
                oWins(i, i + 1, i + 2, i + 3);
            }
       }

       for (int i = 30; i < 33; i++) {
            if (
                    (buttons[i].getText().equals("O")) && (buttons[i + 1].getText().equals("O")) && (buttons[i + 2].getText().equals("O")) && (buttons[i + 3].getText().equals("O"))
            ) {
                oWins(i, i + 1, i + 2, i + 3);
            }
       }


       for (int i = 0; i < 3; i++) {
            if (
                    (buttons[(i) * 6].getText().equals("O")) && (buttons[(i + 1) * 6].getText().equals("O")) && (buttons[(i + 2) * 6].getText().equals("O")) && (buttons[(i + 3) * 6].getText().equals("O"))
            ) {
                oWins((i) * 6, (i + 1) * 6, (i + 2) * 6, (i + 3) * 6);
            }
       }

       for (int i = 1; i < 4; i++) {
            if (
                    (buttons[(i) * 6 - 5].getText().equals("O")) && (buttons[(i + 1) * 6 - 5].getText().equals("O")) && (buttons[(i + 2) * 6 - 5].getText().equals("O")) && (buttons[(i + 3) * 6 - 5].getText().equals("O"))
            ) {
                oWins((i) * 6 - 5, (i + 1) * 6 - 5, (i + 2) * 6 - 5, (i + 3) * 6 - 5);
            }
       }

       for (int i = 2; i < 5; i++) {
            if (
                    (buttons[(i) * 6 - 10].getText().equals("O")) && (buttons[(i + 1) * 6 - 10].getText().equals("O")) && (buttons[(i + 2) * 6 - 10].getText().equals("O")) && (buttons[(i + 3) * 6 - 10].getText().equals("O"))
            ) {
                oWins((i) * 6 - 10, (i + 1) * 6 - 10, (i + 2) * 6 - 10, (i + 3) * 6 - 10);
            }
       }

       for (int i = 3; i < 6; i++) {
            if (
                    (buttons[(i) * 6 - 15].getText().equals("O")) && (buttons[(i + 1) * 6 - 15].getText().equals("O")) && (buttons[(i + 2) * 6 - 15].getText().equals("O")) && (buttons[(i + 3) * 6 - 15].getText().equals("O"))
            ) {
                oWins((i) * 6 - 15, (i + 1) * 6 - 15, (i + 2) * 6 - 15, (i + 3) * 6 - 15);
            }
       }

       for (int i = 4; i < 7; i++) {
            if (
                    (buttons[(i) * 6 - 20].getText().equals("O")) && (buttons[(i + 1) * 6 - 20].getText().equals("O")) && (buttons[(i + 2) * 6 - 20].getText().equals("O")) && (buttons[(i + 3) * 6 - 20].getText().equals("O"))
            ) {
                oWins((i) * 6 - 20, (i + 1) * 6 - 20, (i + 2) * 6 - 20, (i + 3) * 6 - 20);
            }
       }

       for (int i = 5; i < 8; i++) {
            if (
                    (buttons[(i) * 6 - 25].getText().equals("O")) && (buttons[(i + 1) * 6 - 25].getText().equals("O")) && (buttons[(i + 2) * 6 - 25].getText().equals("O")) && (buttons[(i + 3) * 6 - 25].getText().equals("O"))
            ) {
                oWins((i) * 6 - 25, (i + 1) * 6 - 25, (i + 2) * 6 - 25, (i + 3) * 6 - 25);
            }
       }

       for (int i = 11; i < 13; i++) {
            if (
                    (buttons[(i) * 5 - 44].getText().equals("O")) && (buttons[(i + 1) * 5 - 44].getText().equals("O")) && (buttons[(i + 2) * 5 - 44].getText().equals("O")) && (buttons[(i + 3) * 5 - 44].getText().equals("O"))
            ) {
                oWins((i) * 5 - 44, (i + 1) * 5 - 44, (i + 2) * 5 - 44, (i + 3) * 5 - 44);
            }
       }


       if (
                (buttons[3].getText().equals("O")) && (buttons[8].getText().equals("O")) && (buttons[13].getText().equals("O")) && (buttons[18].getText().equals("O"))
       ) {
            oWins(3, 8, 13, 18);
       }


       for (int i = 4; i < 6; i++) {
            if (
                    (buttons[(i) * 5 - 16].getText().equals("O")) && (buttons[(i + 1) * 5 - 16].getText().equals("O")) && (buttons[(i + 2) * 5 - 16].getText().equals("O")) && (buttons[(i + 3) * 5 - 16].getText().equals("O"))
            ) {
                oWins((i) * 5 - 16, (i + 1) * 5 - 16, (i + 2) * 5 - 16, (i + 3) * 5 - 16);
            }
       }

       for (int i = 1; i < 4; i++) {
            if (
                    (buttons[(i) * 5].getText().equals("O")) && (buttons[(i + 1) * 5].getText().equals("O")) && (buttons[(i + 2) * 5].getText().equals("O")) && (buttons[(i + 3) * 5].getText().equals("O"))
            ) {
                oWins((i) * 5, (i + 1) * 5, (i + 2) * 5, (i + 3) * 5);
            }
       }

       for (int i = 11; i < 13; i++) {
            if (
                    (buttons[(i) * 5 - 44].getText().equals("O")) && (buttons[(i + 1) * 5 - 44].getText().equals("O")) && (buttons[(i + 2) * 5 - 44].getText().equals("O")) && (buttons[(i + 3) * 5 - 44].getText().equals("O"))
            ) {
                oWins((i) * 5 - 44, (i + 1) * 5 - 44, (i + 2) * 5 - 44, (i + 3) * 5 - 44);
            }
       }

       if (
                (buttons[17].getText().equals("O")) && (buttons[22].getText().equals("O")) && (buttons[27].getText().equals("O")) && (buttons[32].getText().equals("O"))
       ) {
            oWins(17, 22, 27, 32);
       }

       if (
                (buttons[12].getText().equals("O")) && (buttons[19].getText().equals("O")) && (buttons[26].getText().equals("O")) && (buttons[33].getText().equals("O"))
       ) {
            oWins(12, 19, 26, 33);
       }

       for (int i = 6; i < 8; i++) {
            if (
                    (buttons[(i) * 7 - 36].getText().equals("O")) && (buttons[(i + 1) * 7 - 36].getText().equals("O")) && (buttons[(i + 2) * 7 - 36].getText().equals("O")) && (buttons[(i + 3) * 7 - 36].getText().equals("O"))
            ) {
                oWins((i) * 7 - 36, (i + 1) * 7 - 36, (i + 2) * 7 - 36, (i + 3) * 7 - 36);
            }
       }

       for (int i = 0; i < 3; i++) {
            if (
                    (buttons[(i) * 7].getText().equals("O")) && (buttons[(i + 1) * 7].getText().equals("O")) && (buttons[(i + 2) * 7].getText().equals("O")) && (buttons[(i + 3) * 7].getText().equals("O"))
            ) {
                oWins((i) * 7, (i + 1) * 7, (i + 2) * 7, (i + 3) * 7);
            }
       }

       for (int i = 1; i < 3; i++) {
            if (
                    (buttons[(i) * 7 - 6].getText().equals("O")) && (buttons[(i + 1) * 7 - 6].getText().equals("O")) && (buttons[(i + 2) * 7 - 6].getText().equals("O")) && (buttons[(i + 3) * 7 - 6].getText().equals("O"))
            ) {
                oWins((i) * 7 - 6, (i + 1) * 7 - 6, (i + 2) * 7 - 6, (i + 3) * 7 - 6);
            }
       }

       if (
                (buttons[2].getText().equals("O")) && (buttons[9].getText().equals("O")) && (buttons[16].getText().equals("O")) && (buttons[23].getText().equals("O"))
       ) {
            oWins(2, 9, 16, 23);
       }
    }

    /**
     * This method highlights the winning buttons for X
     * @param a first button in method check with X
     * @param b second button in method check with X
     * @param c third button in method check with X
     * @param d fourth button in method check with X
     */
    public void xWins(int a, int b, int c, int d) {
        buttons[a].setBackground(Color.GREEN);
        buttons[b].setBackground(Color.GREEN);
        buttons[c].setBackground(Color.GREEN);
        buttons[d].setBackground(Color.GREEN);

        for (int i = 0; i < 36; i++) {
            buttons[i].setEnabled(false);
        }
        topLabel.setText("X wins");
    }

    /**
     * This method highlights the winning buttons for O
     * @param a first button in method check with O
     * @param b second button in method check with O
     * @param c third button in method check with O
     * @param d fourth button in method check with O
     */
    public void oWins(int a, int b, int c, int d) {
        buttons[a].setBackground(Color.GREEN);
        buttons[b].setBackground(Color.GREEN);
        buttons[c].setBackground(Color.GREEN);
        buttons[d].setBackground(Color.GREEN);

        for (int i = 0; i < 36; i++) {
            buttons[i].setEnabled(false);
        }
        topLabel.setText("O wins");
    }
}