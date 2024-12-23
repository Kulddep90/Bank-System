package Bank.management.system;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.ResultSet;

public class BalanceEnquriy extends JFrame implements ActionListener {
    JLabel l2;
    JButton b1;
    String pin;

    BalanceEnquriy(String pin) {
        this.pin = pin;
        ImageIcon i1 = new ImageIcon(ClassLoader.getSystemResource("icon/atm2.png"));
        Image i2 = i1.getImage().getScaledInstance(1550, 830, Image.SCALE_DEFAULT);
        ImageIcon i3 = new ImageIcon(i2);
        JLabel image = new JLabel(i3);
        image.setBounds(0, 0, 1550, 830);
        add(image);

        JLabel l1 = new JLabel("Your Current Balance is Rs.");
        l1.setFont(new Font("Times New Roman", Font.PLAIN, 16));
        l1.setForeground(Color.WHITE);
        l1.setBackground(Color.BLACK);
        l1.setBounds(430,180,700,35);
        image.add(l1);

        l2 = new JLabel();
        l2.setFont(new Font("Times New Roman", Font.PLAIN, 16));
        l2.setForeground(Color.WHITE);
        l2.setBackground(Color.BLACK);
        l2.setBounds(430,220,400,35);
        image.add(l2);

        b1 = new JButton("BACK");
        b1.setBounds(700, 406, 150, 35);
        b1.setBackground(new Color(65, 125, 128));
        b1.setForeground(Color.WHITE);
        b1.addActionListener(this);
        image.add(b1);

        int balance =0;
        try{
            Con c =new Con();
            ResultSet res = c.statement.executeQuery("select * from bank where pin='"+pin+"' ");
            while(res.next()){
                if(res.getString("type").equals("Deposit")){
                    balance += Integer.parseInt(res.getString("amount"));
                } else {
                    balance -= Integer.parseInt(res.getString("amount"));
                }
            }
        } catch (Exception E) {
            E.printStackTrace();
        }
        l2.setText(""+balance);

        setLayout(null);
        setSize(1550,1080);
        setLocation(0,0);
        setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        setVisible(false);
        new Transcation(pin);
    }

    public static void main(String[] args) {
        new BalanceEnquriy("");
    }
}
