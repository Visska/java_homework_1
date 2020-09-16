package homework8;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowEvent;
import java.util.Random;

public class CrossZeroInterface {
    public static JButton[][] map;
    public static MyWindow frame;
    public static final int SIZE = 3;
    public static final String DOT_X = "X";
    public static final String DOT_O = "O";
    public static final String DOT_EMPTY = " ";

    private static final Random rand = new Random();

    static class MyWindow extends JFrame{
        public MyWindow(){
            setBounds(500, 500, 400, 400);
            setTitle("Cross-Zero");
            setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
            setLayout(new GridLayout(SIZE, SIZE));

            map = new JButton[SIZE][SIZE];
            for (int i = 0; i < SIZE; i++) {
                for (int j = 0; j < SIZE; j++) {
                    JButton button = new JButton(DOT_EMPTY);
                    add(button);
                    button.addActionListener(getListener());

                    map[i][j] = button;
                }
            }

            setVisible(true);
        }
    }

    private static ActionListener getListener() {
        return new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                JButton selectedBtn = (JButton) e.getSource();

                for (int i = 0; i < SIZE; i++) {
                    for (int j = 0; j < SIZE; j++) {
                        if (map[i][j] == selectedBtn) {
                            if (isCellValid(j, i)) {
                                return;
                            }
                            humanTurn(i,j);
                        }
                    }
                }

                if (checkWin(DOT_X)) {
                    infoBox("Вы победили!", "Крестики-нолики");
                    System.out.println("Вы победили!");
                    frame.dispatchEvent(new WindowEvent(frame, WindowEvent.WINDOW_CLOSING));
                }
                if (isMapFull()) {
                    infoBox("Ничья!", "Крестики-нолики");
                    System.out.println("Ничья!");
                    frame.dispatchEvent(new WindowEvent(frame, WindowEvent.WINDOW_CLOSING));
                }

                aiTurn();
                if (checkWin(DOT_O)) {
                    infoBox("Вы проиграли!", "Крестики-нолики");
                    System.out.println("Вы проиграли!");
                    frame.dispatchEvent(new WindowEvent(frame, WindowEvent.WINDOW_CLOSING));
                }
                if (isMapFull()) {
                    infoBox("Ничья!", "Крестики-нолики");
                    System.out.println("Ничья!");
                    frame.dispatchEvent(new WindowEvent(frame, WindowEvent.WINDOW_CLOSING));
                }
            }
        };
    }

    public static void infoBox(String infoMessage, String titleBar)
    {
        JOptionPane.showMessageDialog(null, infoMessage, titleBar, JOptionPane.INFORMATION_MESSAGE);
    }

    private static void humanTurn(int yNumber, int xNumber) {
        JButton button = map[yNumber][xNumber];
        button.setText(DOT_X);
    }

    private static void aiTurn() {
        int xIndex, yIndex;
        do {
            xIndex = rand.nextInt(SIZE);
            yIndex = rand.nextInt(SIZE);
        } while (isCellValid(xIndex, yIndex));
        JButton button = map[yIndex][xIndex];
        button.setText(DOT_O);
    }

    private static boolean isCellValid(int xNumber, int yNumber) {
        if (xNumber < 0 || xNumber >= SIZE || yNumber < 0 || yNumber >= SIZE)
            return true;

        JButton button = map[yNumber][xNumber];
        return !button.getText().equals(DOT_EMPTY);
    }

    private static boolean checkWin(String symbol) {
        return checkDiagonal1(symbol) || checkDiagonal2(symbol) || checkCols(symbol) || checkRows(symbol);
    }

    private static boolean checkDiagonal1(String symbol) {
        for (int i = 0; i < SIZE; i++) {
            JButton button = map[i][i];
            if (!button.getText().equals(symbol))
                return false;
        }
        return true;
    }

    private static boolean checkDiagonal2(String symbol) {
        int lastIndex = SIZE - 1;
        for (int i = 0; i < SIZE; i++) {
            JButton button = map[lastIndex - i][i];
            if (!button.getText().equals(symbol))
                return false;
        }
        return true;
    }

    private static boolean checkCols(String symbol) {
        for (int i = 0; i < SIZE; i++) {
            boolean win = true;
            for (int j = 0; j < SIZE; j++) {
                JButton button = map[j][i];
                win = win && button.getText().equals(symbol);
            }

            if (win)
                return true;
        }
        return false;
    }

    private static boolean checkRows(String symbol) {
        for (int i = 0; i < SIZE; i++) {
            boolean win = true;
            for (int j = 0; j < SIZE; j++) {
                JButton button = map[i][j];
                win = win && button.getText().equals(symbol);
            }
            if (win)
                return true;
        }
        return false;
    }

    private static boolean isMapFull() {
        for (int i = 0; i < SIZE; i++) {
            for (int j = 0; j < SIZE; j++) {
                JButton button = map[i][j];
                if (button.getText().equals(DOT_EMPTY))
                    return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        frame = new MyWindow();
    }
}
