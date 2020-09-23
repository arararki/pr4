package ikbo081904;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class Match{
    private int A=0,B=0;
    private String C ="AC Milan",D="Real Madrid";
    private JButton button1;
    private JButton button2;
    private JButton SuperButton;
    private JLabel label1;
    private JLabel label2;
    private JLabel label3;
    private JFrame frame;
    private JPanel panel;

    public Match(){

        frame = new JFrame("Match");
        frame.setVisible(true);
        frame.setSize(750,750);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        button1 = new JButton("AC Milan");
        button2 = new JButton("Real Madrid");
        panel = new JPanel();
        label1 = new JLabel("Result: ");
        label2 = new JLabel("Last Score: ");
        label3 = new JLabel("Winner: ");
        button1.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                A++;
                label2.setText("Last Score: "+C);
                label1.setText("Result: " +A+" X "+B);
                if(A==B)
                {
                    label3.setText("Winner: Draw");
                }
                if(A>B)
                {
                    label3.setText("Winner: "+C);
                }
                if(A<B)
                {
                    label3.setText("Winner: "+D);
                }
            }
        });
        button2.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                B++;
                label2.setText("Last Score: "+D);
                label1.setText("Result: " +A+" X "+B);
                if(A==B)
                {
                    label3.setText("Winner: Draw");
                }
                if(A>B)
                {
                    label3.setText("Winner: "+C);
                }
                if(A<B)
                {
                    label3.setText("Winner: "+D);
                }
            }
        });

        panel.add(label1);
        panel.add(button1);
        panel.add(button2);
        panel.add(label3);
        panel.add(label2);
        frame.add(panel);
    }

    public static void main(String[] args) {
        new Match();
    }
}
