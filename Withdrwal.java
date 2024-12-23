package Bank.management.system;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.ResultSet;
import java.util.Date;

public class Withdrwal extends JFrame implements ActionListener {
    JButton b1,b2;
    JTextField tfAmount;
    String pin;
    Withdrwal(String pin){
        this.pin = pin;
        ImageIcon i1 = new ImageIcon(ClassLoader.getSystemResource("icon/atm2.png"));
        Image i2 = i1.getImage().getScaledInstance(1550, 830, Image.SCALE_DEFAULT);
        ImageIcon i3 = new ImageIcon(i2);
        JLabel image = new JLabel(i3);
        image.setBounds(0, 0, 1550, 830);
        add(image);

        JLabel label = new JLabel("MAXIMUM WITHDRAWAL AMOUNT IS Rs.10,000");
        label.setForeground(Color.WHITE);
        label.setFont(new Font("Times New Roman", Font.BOLD, 16));
        label.setBounds(460, 180, 700, 35);
        image.add(label);

        JLabel label1 = new JLabel("ENTER WITHDRAWAL AMOUNT");
        label1.setForeground(Color.WHITE);
        label1.setFont(new Font("Times New Roman", Font.BOLD, 16));
        label1.setBounds(460, 220, 700, 35);
        image.add(label1);

        tfAmount = new JTextField();
        tfAmount.setBackground(new Color(65, 125, 128));
        tfAmount.setForeground(Color.WHITE);
        tfAmount.setBounds(460, 260, 320, 25);
        tfAmount.setFont(new Font("Times New Roman", Font.BOLD, 22));
        image.add(tfAmount);

        b1 = new JButton("WITHDRAW");
        b1.setBounds(700, 362, 150, 35);
        b1.setBackground(new Color(65, 125, 128));
        b1.setForeground(Color.WHITE);
        b1.addActionListener(this);
        image.add(b1);

        b2 = new JButton("CANCEL");
        b2.setBackground(new Color(65, 125, 128));
        b2.setForeground(Color.WHITE);
        b2.setBounds(700, 406, 150, 35);
        b2.addActionListener(this);
        image.add(b2);

        setLayout(null);
        setSize(1550,1080);
        setLocation(0,0);
        setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if(e.getSource() == b1) {
            try {
                String amount = tfAmount.getText();
                Date date = new Date();
                if (tfAmount.getText().equals("")) {
                    JOptionPane.showMessageDialog(null, "Please enter amount");
                } else {
                    Con c = new Con();
                    ResultSet res = c.statement.executeQuery("select * from bank where pin ='" + pin + "'");
                    int balance = 0;
                    while (res.next()) {
                        if (res.getString("type").equals("Deposit")) {
                            balance += Integer.parseInt(res.getString("amount"));
                        } else {
                            balance -= Integer.parseInt(res.getString("amount"));
                        }
                    }
                    if (balance < Integer.parseInt(amount)) {
                        JOptionPane.showMessageDialog(null, "Not enough balance");
                        return;
                    }

                    c.statement.executeUpdate("insert into bank values('" + pin + "','" + date + "','Withdrawal','" + amount + "')");
                    JOptionPane.showMessageDialog(null, "Rs. " + amount + " Debited Successfully");
                    setVisible(false);
                    new Transcation(pin);
                }

            } catch (Exception E) {
                E.printStackTrace();
            }
        } else if (e.getSource() == b2) {
            setVisible(false);
            new Transcation(pin);
        }
    }

    public static void main(String[] args) {
        new Withdrwal("");
    }
}
