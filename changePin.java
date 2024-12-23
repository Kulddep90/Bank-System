package Bank.management.system;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class changePin extends JFrame implements ActionListener {
    JButton b1,b2;
    JPasswordField p1,p2;
    String pin;
    changePin(String pin){
        this.pin = pin;
        ImageIcon i1 = new ImageIcon(ClassLoader.getSystemResource("icon/atm2.png"));
        Image i2 = i1.getImage().getScaledInstance(1550, 830, Image.SCALE_DEFAULT);
        ImageIcon i3 = new ImageIcon(i2);
        JLabel image = new JLabel(i3);
        image.setBounds(0, 0, 1550, 830);
        add(image);

        JLabel label = new JLabel("Change YOUR PIN");
        label.setForeground(Color.WHITE);
        label.setFont(new Font("Times New Roman", Font.BOLD, 16));
        label.setBounds(430, 180, 400, 35);
        image.add(label);

        JLabel label1 = new JLabel("New PIN :");
        label1.setForeground(Color.WHITE);
        label1.setFont(new Font("Times New Roman", Font.BOLD, 16));
        label1.setBounds(430, 220, 150, 35);
        image.add(label1);

        p1 = new JPasswordField();
        p1.setBackground(new Color(65, 125, 128));
        p1.setForeground(Color.WHITE);
        p1.setFont(new Font("Times New Roman", Font.BOLD, 16));
        p1.setBounds(600,220,180,25);
        image.add(p1);

        JLabel label2 = new JLabel("Re-Enter New PIN :");
        label2.setForeground(Color.WHITE);
        label2.setFont(new Font("Times New Roman", Font.BOLD, 16));
        label2.setBounds(430, 250, 200, 35);
        image.add(label2);

        p2 = new JPasswordField();
        p2.setBackground(new Color(65, 125, 128));
        p2.setForeground(Color.WHITE);
        p2.setFont(new Font("Times New Roman", Font.BOLD, 16));
        p2.setBounds(600,255,180,25);
        image.add(p2);

        b1 = new JButton("CHANGE");
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


        setSize(1550,1080);
        setLayout(null);
        setLocation(0,0);
        setVisible(true);

    }

    @Override
    public void actionPerformed(ActionEvent e) {
        try {
            String pin1 = p1.getText();
            String pin2 = p2.getText();

            if(!pin1.equals(pin2)){
                JOptionPane.showMessageDialog(null,"PIN Does Not Match");
                return;
            }
            if(pin.equals(pin1)){
                JOptionPane.showMessageDialog(null,"New PIN and old PIN Match.");
                return;
            }
            if(e.getSource() == b1){
                if(p1.getText().equals("") || p2.getText().equals("")){
                    JOptionPane.showMessageDialog(null,"PIN is Empty");
                    return;
                }
                Con c = new Con();
                String q1 = "update bank set pin =('"+pin1+"') where pin =('"+pin+"')";
                String q2 = "update login set pin =('"+pin1+"') where pin =('"+pin+"')";
                String q3 = "update signup3 set pin =('"+pin1+"') where pin =('"+pin+"')";
                c.statement.executeUpdate(q1);
                c.statement.executeUpdate(q2);
                c.statement.executeUpdate(q3);

                JOptionPane.showMessageDialog(null,"PIN Changed Successfully");
                setVisible(false);
                new Transcation(pin1);
            } else if(e.getSource() == b2){
                new Transcation(pin);
                setVisible(false);
            }

        } catch (Exception ex) {
            ex.printStackTrace();
        }
    }

    public static void main(String[] args) {
        new changePin("");
    }
}
