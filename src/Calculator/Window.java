package Calculator;

import javax.swing.*;
import java.awt.*;

public class Window {
    int num1 = 0;
    int num2 = 0;
    char a;
    public static String result = "";


    public void getFrame() {


        JFrame jFrame = new JFrame();
        jFrame.setVisible(true);
        jFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        Toolkit t = Toolkit.getDefaultToolkit();
        Dimension d = t.getScreenSize();
        jFrame.setBounds(d.width / 2 - 132, d.height / 2 - 132, 265, 265);
        jFrame.setResizable(false);
        JPanel jPanel = new JPanel();
        jFrame.add(jPanel);
        jFrame.setTitle("Calculator");
        jPanel.setLayout(new GridLayout(4, 4));
        JButton b0 = new JButton("0");
        JButton b1 = new JButton("1");
        JButton b2 = new JButton("2");
        JButton b3 = new JButton("3");
        JButton b4 = new JButton("4");
        JButton b5 = new JButton("5");
        JButton b6 = new JButton("6");
        JButton b7 = new JButton("7");
        JButton b8 = new JButton("8");
        JButton b9 = new JButton("9");
        JButton bPlus = new JButton("+");
        JButton bMinus = new JButton("-");
        JButton bMultiply = new JButton("*");
        JButton bDivision = new JButton("/");
        JButton bClear = new JButton("C");
        JButton bResult = new JButton("=");
        TextField jtx = new TextField();
        jtx.setVisible(true);
        jFrame.add(jtx, BorderLayout.NORTH);
        jPanel.add(b7);
        jPanel.add(b8);
        jPanel.add(b9);
        jPanel.add(bDivision);
        jPanel.add(b4);
        jPanel.add(b5);
        jPanel.add(b6);
        jPanel.add(bMultiply);
        jPanel.add(b1);
        jPanel.add(b2);
        jPanel.add(b3);
        jPanel.add(bMinus);
        jPanel.add(b0);
        jPanel.add(bClear);
        jPanel.add(bResult);
        jPanel.add(bPlus);
        b7.addActionListener(e -> {
            if (e.getSource() == b7) {
                jtx.setText(jtx.getText() + b7.getText());
            }
        });
        b8.addActionListener(e -> {
            if (e.getSource() == b8) {
                jtx.setText(jtx.getText() + b8.getText());
            }
        });
        b9.addActionListener(e -> {
            if (e.getSource() == b9) {
                jtx.setText(jtx.getText() + b9.getText());
            }
        });
        b4.addActionListener(e -> {
            if (e.getSource() == b4) {
                jtx.setText(jtx.getText() + b4.getText());
            }
        });
        b5.addActionListener(e -> {
            if (e.getSource() == b5) {
                jtx.setText(jtx.getText() + b5.getText());
            }
        });
        b6.addActionListener(e -> {
            if (e.getSource() == b6) {
                jtx.setText(jtx.getText() + b6.getText());
            }
        });
        b1.addActionListener(e -> {
            if (e.getSource() == b1) {
                jtx.setText(jtx.getText() + b1.getText());
            }
        });
        b2.addActionListener(e -> {
            if (e.getSource() == b2) {
                jtx.setText(jtx.getText() + b2.getText());
            }
        });
        b3.addActionListener(e -> {
            if (e.getSource() == b3) {
                jtx.setText(jtx.getText() + b3.getText());
            }
        });
        b0.addActionListener(e -> {
            if (e.getSource() == b0) {
                jtx.setText(jtx.getText() + b0.getText());
            }
        });
        bDivision.addActionListener(e -> {
            num1 = Integer.parseInt(jtx.getText());
            a = '/';
            if (e.getSource() == bDivision) {
                jtx.setText(jtx.getText() + bDivision.getText());
                jtx.setText("");

            }
        });
        bMultiply.addActionListener(e -> {
            num1 = Integer.parseInt(jtx.getText());
            a = '*';
            if (e.getSource() == bMultiply) {
                jtx.setText(jtx.getText() + bMultiply.getText());
                jtx.setText("");

            }
        });
        bMinus.addActionListener(e -> {
            num1 = Integer.parseInt(jtx.getText());
            a = '-';
            if (e.getSource() == bMinus) {
                jtx.setText(jtx.getText() + bMinus.getText());
                jtx.setText("");

            }

        });
        bClear.addActionListener(e -> {
            if (e.getSource() == bClear) {
                jtx.setText("");

            }
        });
        bPlus.addActionListener(e -> {
            num1 = Integer.parseInt(jtx.getText());
            a = '+';
            if (e.getSource() == bPlus) {
                jtx.setText(jtx.getText() + bPlus.getText());
                jtx.setText("");
            }
        });
        bResult.addActionListener(e -> {
            num2 = Integer.parseInt(jtx.getText());
            if (e.getSource() == bResult) {
                try {


                    jtx.setText(operetion(num1, num2, a));
                } catch (ArithmeticException v) {
                    JOptionPane.showMessageDialog(null, "Division by zero", "Error",
                            JOptionPane.ERROR_MESSAGE);

                }

            }
        });

    }


    public static String operetion(int num1, int num2, char a) {
        switch (a) {
            case '+':
                result = String.valueOf(num1 + num2);
                break;
            case '-':
                result = String.valueOf(num1 - num2);
                break;
            case '*':
                result = String.valueOf(num1 * num2);
                break;
            case '/':
                result = String.valueOf(num1 / num2);
                break;
        }
        return result;
    }
}







