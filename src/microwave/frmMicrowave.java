/*
 * Created by: Maria Temu
 * Created on: 10-Feb-2020
 * Created for: ICS4U
 * Day #7 (Microwave)
 * This program allows the user to enter the length of log they have
 * which is then used to find out the max amount of logs that will fit in a truck
 */
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
                String display = Double.toString(total);
                lblTotal.setText(display);

            }
        });
        pizzaButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent actionEvent) {
                total = pizza;
                String display = Double.toString(total);
                lblTotal.setText(display);


            }
        });
        soupButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent actionEvent) {
                total = soup;
                String display = Double.toString(total);
                lblTotal.setText(display);


            }
        });
        btnOne.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent actionEvent) {
                total = total + amount1;
                String display = Double.toString(total);
                lblTotal.setText(display);

            }
        });
        btnTwo.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent actionEvent) {
                total = total + amount2;
                String display = Double.toString(total);
                lblTotal.setText(display);

            }
        });
        btnThree.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent actionEvent) {
                total = total + amount3;
                String display = Double.toString(total);
                lblTotal.setText(display);

            }
        });
    }
}
