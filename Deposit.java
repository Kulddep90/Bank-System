package Bank.management.system;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Date;


public class Deposit extends JFrame implements ActionListener {
    String pin;
    JTextField tfAmount;
    JButton b1,b2;

    Deposit(String pin){
        this.pin = pin;

        ImageIcon i1 = new ImageIcon(ClassLoader.getSystemResource("icon/atm2.png"));
        Image i2 = i1.getImage().getScaledInstance(1550, 830, Image.SCALE_DEFAULT);
        ImageIcon i3 = new ImageIcon(i2);
        JLabel image = new JLabel(i3);
        image.setBounds(0, 0, 1550, 830);
        add(image);

        JLabel label = new JLabel("ENTER AMOUNT YOU WANT TO DEPOSIT");
        label.setForeground(Color.WHITE);
        label.setFont(new Font("Times New Roman", Font.BOLD, 16));
        label.setBounds(460, 180, 400, 35);
        image.add(label);

        tfAmount = new JTextField();
        tfAmount.setBackground(new Color(65, 125, 128));
        tfAmount.setForeground(Color.WHITE);
        tfAmount.setBounds(460, 230, 320, 25);
        tfAmount.setFont(new Font("Times New Roman", Font.BOLD, 22));
        image.add(tfAmount);

        b1 = new JButton("DEPOSIT");
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
        try {
            String amount = tfAmount.getText();
            Date date =new Date();
            if(e.getSource() == b1){
                if(tfAmount.getText().equals("")){
                    JOptionPane.showMessageDialog(null,"Enter Amount to Deposit");
                } else {
                    Con c1 = new Con();
                    c1.statement.executeUpdate("insert into bank values('"+pin+"','"+date+"','Deposit','"+amount+"')");
                    JOptionPane.showMessageDialog(null,"Rs. "+amount+" Deposited Successfully");
                    setVisible(false);
                    new Transcation(pin);
                }
            }else if(e.getSource() == b2){
                setVisible(false);
                new Transcation(pin);
            }


        } catch (Exception E) {
            E.printStackTrace();
        }


    }

    public static void main(String[] args) {
        new Deposit("");
    }
}
