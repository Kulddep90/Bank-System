package Bank.management.system;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.ResultSet;

public class Mini extends JFrame implements ActionListener {
    String pin;
    JButton button;
    Mini(String pin){
        this.pin = pin;
        getContentPane().setBackground(new Color(255,204,204));
        setSize(400,600);
        setLocation(20,20);
        setLayout(null);

        JLabel label = new JLabel();
        label.setBounds(20, 140, 400, 250);
        add(label);

        JLabel label1 = new JLabel("Indian Bank");
        label1.setFont(new Font("System", Font.BOLD, 15));
        label1.setBounds(150, 20, 200, 20);
        add(label1);

        JLabel label2 = new JLabel();
        label2.setBounds(20, 80, 300, 20);
        add(label2);

        JLabel label3 = new JLabel();
        label3.setBounds(20, 400, 300, 20);
        add(label3);

        try {
            Con c = new Con();
            ResultSet res = c.statement.executeQuery("select * from login where pin =('"+pin+"')");
            while(res.next()){
                label2.setText("Card Number: "+res.getString("card_number").substring(0,4)+"XXXX-XXXX-"+res.getString("card_number").substring(12));
            }

        } catch (Exception e) {
            e.printStackTrace();
        }

        try {
            int balance = 0;
            Con c = new Con();
            ResultSet res = c.statement.executeQuery("select * from bank where pin =('"+pin+"')");
            while(res.next()){
                label.setText(label.getText()+"<html>"+res.getString("date")+"&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;"+res.getString("type")+"&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;"+res.getString("amount")+"<br><br><br><html>");
                if(res.getString("type").equals("Deposit")){
                    balance += Integer.parseInt(res.getString("amount"));
                } else {
                    balance -= Integer.parseInt(res.getString("amount"));
                }
            }
            label3.setText("Your Balance is Rs. "+balance);


        } catch (Exception e) {
            e.printStackTrace();
        }

        button = new JButton("EXIT");
        button.setBounds(20,500,100,25);
        button.setBackground(Color.BLACK);
        button.setForeground(Color.WHITE);
        button.addActionListener(this);
        add(button);

        setVisible(true);

    }

    @Override
    public void actionPerformed(ActionEvent e) {
        setVisible(false);

    }

    public static void main(String[] args) {
        new Mini("");
    }
}
