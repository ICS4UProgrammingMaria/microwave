package microwave;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class frmMicrowave {
    private JButton subButton;
    private JButton btnTwo;
    private JButton soupButton;
    private JButton pizzaButton;
    private JButton btnThree;
    private JButton btnOne;
    private JLabel lblTotal;
    private JPanel mainPanel;
    String nameItem1;
    double total = 0;

    double sub = 60;
    double pizza = 45;
    double soup = 105;

    double amount1 = 1;
    double amount2 = 1.5;
    double amount3 = 2;

    public static void main(String[] args) {
        JFrame frame = new JFrame("microwave");
        frame.setContentPane((new frmMicrowave().mainPanel));
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.pack();
        frame.setVisible(true);

    }

    public frmMicrowave() {
        subButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent actionEvent) {
                //lblTotal = 0;
                total = sub;

            }
        });
        pizzaButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent actionEvent) {
                total = pizza;

            }
        });
        soupButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent actionEvent) {
                total = soup;

            }
        });
        btnOne.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent actionEvent) {
                total = total + amount1;
            }
        });
        btnTwo.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent actionEvent) {
                total = total + amount2;
            }
        });
        btnThree.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent actionEvent) {
                total = total + amount3;
            }
        });
    }
}
