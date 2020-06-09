package Lesson8;

import javax.swing.*;
import java.awt.*;

public class CalculatorForm extends JPanel {

    private JButton numbers[] = new JButton[17];
    private JTextField output = new JTextField();
    private Font font = new Font("SanSerif", Font.BOLD, 20);

    public CalculatorForm() {
        setLayout(null);

        output.setBounds(30, 10, 230, 50);
        output.setEnabled(false);
        add(output);
        lineOne();
        lineTwo();
        lineThree();
        lineFour();
        lineFive();

    }

    private void lineOne() {
        numbers[0] = new JButton("C");
        numbers[0].setBounds(30, 70, 50, 50);
        numbers[0].setFont(font);
        add(numbers[0]);

        numbers[1] = new JButton("/");
        numbers[1].setBounds(90, 70, 50, 50);
        numbers[1].setFont(font);
        add(numbers[1]);

        numbers[2] = new JButton("*");
        numbers[2].setBounds(150, 70, 50, 50);
        numbers[2].setFont(font);
        add(numbers[2]);

        numbers[3] = new JButton("-");
        numbers[3].setBounds(210, 70, 50, 50);
        numbers[3].setFont(font);
        add(numbers[3]);
    }

    private void lineTwo() {
        numbers[4] = new JButton("7");
        numbers[4].setBounds(30, 130, 50, 50);
        numbers[4].setFont(font);
        add(numbers[4]);

        numbers[5] = new JButton("8");
        numbers[5].setBounds(90, 130, 50, 50);
        numbers[5].setFont(font);
        add(numbers[5]);

        numbers[6] = new JButton("9");
        numbers[6].setBounds(150, 130, 50, 50);
        numbers[6].setFont(font);
        add(numbers[6]);

        numbers[6] = new JButton("+");
        numbers[6].setBounds(210, 130, 50, 110);
        numbers[6].setFont(font);
        add(numbers[6]);
    }

    private void lineThree() {
        numbers[7] = new JButton("4");
        numbers[7].setBounds(30, 190, 50, 50);
        numbers[7].setFont(font);
        add(numbers[7]);

        numbers[8] = new JButton("5");
        numbers[8].setBounds(90, 190, 50, 50);
        numbers[8].setFont(font);
        add(numbers[8]);

        numbers[9] = new JButton("6");
        numbers[9].setBounds(150, 190, 50, 50);
        numbers[9].setFont(font);
        add(numbers[9]);
    }

    private void lineFour() {
        numbers[10] = new JButton("1");
        numbers[10].setBounds(30, 250, 50, 50);
        numbers[10].setFont(font);
        add(numbers[10]);

        numbers[11] = new JButton("2");
        numbers[11].setBounds(90, 250, 50, 50);
        numbers[11].setFont(font);
        add(numbers[11]);

        numbers[12] = new JButton("3");
        numbers[12].setBounds(150, 250, 50, 50);
        numbers[12].setFont(font);
        add(numbers[12]);

        numbers[13] = new JButton("=");
        numbers[13].setBounds(210, 250, 50, 110);
        numbers[13].setFont(font);
        add(numbers[13]);
    }

    private void lineFive() {
        numbers[14] = new JButton("0");
        numbers[14].setBounds(30, 310, 110, 50);
        numbers[14].setFont(font);
        add(numbers[14]);

        numbers[15] = new JButton(".");
        numbers[15].setBounds(150, 310, 50, 50);
        numbers[15].setFont(font);
        add(numbers[15]);

    }


//        char [] numChar = {'1', '2', '3','4','5','6','7','8','9'};
//
//        for (int i =0; i < numChar.length; i++){
//            numbers[3+i] = new JButton(String.valueOf(numChar[i]));
//            numbers[3+i].setBounds( i * 50 + (60) + 10,  (60) + 130, 50,50);
//            add(numbers[3+i]);
//        }


//        for (int x = 0; x < 3; x++){
//            for (int y = 3; y > 0; y--) {
//
//                numbers [x * 3 + y + 1] = new JButton((x * 1 + y -3) + "");
//                numbers [x * 3 + y + 1].setBounds(x * (60) + 10, y * (60) + 130, 50,50);
//                numbers [x * 3 + y + 1].setFont(font);
//                add (numbers [x * 3 + y + 1]);
//
//            }
//        }

}
