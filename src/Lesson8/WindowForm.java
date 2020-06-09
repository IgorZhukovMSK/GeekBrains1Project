package Lesson8;

import javax.swing.*;
import java.awt.*;

public class WindowForm extends JFrame {

    public WindowForm () {
        JFrame windowJF = new JFrame();
        windowJF.setTitle("Мой калькулятор");
        windowJF.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        windowJF.setSize(300, 420);
        windowJF.setLocationRelativeTo(null);
        windowJF.setResizable(false);
        windowJF.add(new CalculatorForm());
        windowJF.setVisible(true);



    }
}
