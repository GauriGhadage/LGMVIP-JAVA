import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class CurrencyConverter {
    public static void main(String[] args) {
        JFrame f = new JFrame("currency converter");


        f.setBounds(80,20,700,700);
        JLabel l1 = new JLabel("Enter your amount in Dollar $ ");
        f.add(l1);
        l1.setBounds(50,50,200,50);
        JTextField t1 = new JTextField();

        t1.setBounds(50,110,200,50);
        f.add(t1);
        JButton b1 = new JButton("Convert");
        b1.setBounds(50,170,200,50);
        f.add(b1);
        b1.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                f.setVisible(false);
                JFrame f1 = new JFrame();
                f1.setBounds(80,20,700,700);
                f1.setLayout(null);
                float d = Float.parseFloat(t1.getText());
                float inr = 82.7f*d;
                float p = .81f*d;
                float u = .38f*d;
                JLabel l2,l3,l4;
                l2 = new JLabel("in INR "+inr+" \u20B9");
                l3 = new JLabel("in Pound"+p+"  \u20AC");
                l4 = new JLabel("in Euro"+u+" \u00A3");
                l2.setBounds(300,150,200,50);
                f1.add(l2);
                l3.setBounds(300,200,201,50);
                f1.add(l3);
                l4.setBounds(300,250,270,50);
                f1.add(l4);
                f1.add(t1);
                f1.add(l1);
                f1.add(b1);
                f1.setVisible(true);
            }
        });
        f.setLayout(null);
        f.setVisible(true);
    }
}