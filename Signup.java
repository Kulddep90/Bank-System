package Bank.management.system;

import com.toedter.calendar.JDateChooser;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Random;

public class Signup  extends JFrame  implements ActionListener {

    JTextField username,fatherName,email,address,city,pin,state;
    JDateChooser dateChooser;
    JRadioButton r1,r2,r3,m1,m2,m3;
    JButton next;

    Random rand = new Random();
    long firstFour = (rand.nextLong() %900L)+1000L;
    String first = " " +Math.abs(firstFour);

    Signup() {
        super("APPLICATION FORM");

        ImageIcon i1 = new ImageIcon(ClassLoader.getSystemResource("icon/bank.png"));
        Image i2 = i1.getImage().getScaledInstance(100, 100, Image.SCALE_DEFAULT);
        ImageIcon i3 = new ImageIcon(i2);
        JLabel image = new JLabel(i3);
        image.setBounds(25, 10, 100, 100);
        add(image);

        JLabel label1 = new JLabel("APPLICATION FORM NO."+first);
        label1.setBounds(160, 30, 600, 40);
        label1.setFont(new Font("Times New Roman", Font.BOLD, 38));
        add(label1);

        JLabel label2 = new JLabel("Page 1");
        label2.setFont(new Font("Times New Roman", Font.BOLD, 22));
        label2.setBounds(330, 70, 600, 30);
        add(label2);

        JLabel label3 = new JLabel("Personal Details");
        label3.setFont(new Font("Times New Roman", Font.BOLD, 22));
        label3.setBounds(290, 100, 600, 30);
        add(label3);

        JLabel labelName = new JLabel("Name :");
        labelName.setFont(new Font("Times New Roman", Font.BOLD, 20));
        labelName.setBounds(100, 190, 100, 30);
        add(labelName);

        username = new JTextField();
        username.setFont(new Font("Times New Roman", Font.BOLD, 14));
        username.setBounds(300, 190, 400, 30);
        add(username);

        JLabel labelFather = new JLabel("Father`s Name :");
        labelFather.setFont(new Font("Times New Roman", Font.BOLD, 20));
        labelFather.setBounds(100, 240, 200, 30);
        add(labelFather);

        fatherName = new JTextField();
        fatherName.setFont(new Font("Times New Roman", Font.BOLD, 14));
        fatherName.setBounds(300, 240, 400, 30);
        add(fatherName);

        JLabel DOB = new JLabel("Date Of Birth :");
        DOB.setFont(new Font("Times New Roman", Font.BOLD, 20));
        DOB.setBounds(100, 290, 200, 30);
        add(DOB);

        dateChooser = new JDateChooser();
        dateChooser.setForeground(new Color(105,105,105));
        dateChooser.setBounds(300, 290, 400, 30);
        add(dateChooser);

        JLabel labelG = new JLabel("Gender :");
        labelG.setFont(new Font("Times New Roman", Font.BOLD, 20));
        labelG.setBounds(100, 340, 200, 30);
        add(labelG);

        r1 = new JRadioButton("Male");
        r1.setFont(new Font("Times New Roman", Font.BOLD, 14));
        r1.setBounds(300, 340, 60, 30);
        r1.setBackground(new Color(222,255,228));
        add(r1);

        r2 = new JRadioButton("Female");
        r2.setFont(new Font("Times New Roman", Font.BOLD, 14));
        r2.setBounds(400, 340, 90, 30);
        r2.setBackground(new Color(222,255,228));
        add(r2);

        r3 = new JRadioButton("Other");
        r3.setFont(new Font("Times New Roman", Font.BOLD, 14));
        r3.setBounds(500, 340, 90, 30);
        r3.setBackground(new Color(222,255,228));
        add(r3);

        ButtonGroup group = new ButtonGroup();
        group.add(r1);
        group.add(r2);
        group.add(r3);

        JLabel labelEmail = new JLabel("Email Address : ");
        labelEmail.setFont(new Font("Times New Roman", Font.BOLD, 20));
        labelEmail.setBounds(100, 390, 200, 30);
        add(labelEmail);

        email = new JTextField();
        email.setFont(new Font("Times New Roman", Font.BOLD, 14));
        email.setBounds(300, 390, 400, 30);
        add(email);

        JLabel labelMs = new JLabel("Marital Status :");
        labelMs.setFont(new Font("Times New Roman", Font.BOLD, 20));
        labelMs.setBounds(100, 440, 200, 30);
        add(labelMs);

        m1 = new JRadioButton("Single");
        m1.setFont(new Font("Times New Roman", Font.BOLD, 14));
        m1.setBounds(300, 440, 90, 30);
        m1.setBackground(new Color(222,255,228));
        add(m1);

        m2 = new JRadioButton("Married");
        m2.setFont(new Font("Times New Roman", Font.BOLD, 14));
        m2.setBounds(400, 440, 90, 30);
        m2.setBackground(new Color(222,255,228));
        add(m2);

        m3 = new JRadioButton("Other");
        m3.setFont(new Font("Times New Roman", Font.BOLD, 14));
        m3.setBounds(500, 440, 90, 30);
        m3.setBackground(new Color(222,255,228));
        add(m3);

        ButtonGroup group1 = new ButtonGroup();
        group1.add(m1);
        group1.add(m2);
        group1.add(m3);

        JLabel labelAdd = new JLabel("Address :");
        labelAdd.setFont(new Font("Times New Roman", Font.BOLD, 20));
        labelAdd.setBounds(100, 490, 200, 30);
        add(labelAdd);

        address = new JTextField();
        address.setFont(new Font("Times New Roman", Font.BOLD, 14));
        address.setBounds(300, 490, 400, 30);
        add(address);

        JLabel labelCity = new JLabel("City :");
        labelCity.setFont(new Font("Times New Roman", Font.BOLD, 20));
        labelCity.setBounds(100, 540, 200, 30);
        add(labelCity);

        city = new JTextField();
        city.setFont(new Font("Times New Roman", Font.BOLD, 14));
        city.setBounds(300, 540, 400, 30);
        add(city);

        JLabel labelPin = new JLabel("Pin Code :");
        labelPin.setFont(new Font("Times New Roman", Font.BOLD, 20));
        labelPin.setBounds(100, 590, 200, 30);
        add(labelPin);

        pin = new JTextField();
        pin.setFont(new Font("Times New Roman", Font.BOLD, 14));
        pin.setBounds(300, 590, 400, 30);
        add(pin);

        JLabel labelState = new JLabel("State :");
        labelState.setFont(new Font("Times New Roman", Font.BOLD, 20));
        labelState.setBounds(100, 630, 200, 30);
        add(labelState);

        state = new JTextField();
        state.setFont(new Font("Times New Roman", Font.BOLD, 14));
        state.setBounds(300, 630, 400, 30);
        add(state);

        next = new JButton("Next");
        next.setFont(new Font("Times New Roman", Font.BOLD, 14));
        next.setBounds(620, 700, 80, 30);
        next.setBackground(Color.black);
        next.setForeground(Color.white);
        next.addActionListener(this);
        add(next);


        getContentPane().setBackground(new Color(222,255,228));
        setLayout(null);
        setSize(850, 800);
        setLocation(360,40);
        setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        String formNo = first;
        String name = username.getText();
        String fName = fatherName.getText();
        String dob = ((JTextField) dateChooser.getDateEditor().getUiComponent()).getText();
        String gender = null;
        if(r1.isSelected()){
            gender = "Male";
        } else if(r2.isSelected()){
            gender = "Female";
        } else if(r3.isSelected()){
            gender = "Other";
        }
        String Email = email.getText();
        String martialStatus = null;
        if(m1.isSelected()){
            martialStatus = "Single";
        } else if(m2.isSelected()){
            martialStatus = "Married";
        } else if(m3.isSelected()){
            martialStatus = "Other";
        }
        String add = address.getText();
        String City = city.getText();
        String PinCode = pin.getText();
        String State = state.getText();

        try {
            if(username.getText().equals("")){
                JOptionPane.showMessageDialog(null, "Please enter your name");

            } else {
                Con con1 = new Con();
                String q = "insert into signup values('"+formNo+"','"+name+"','"+fName+"','"+dob+"','"+gender+"','"+Email+"','"+martialStatus+"','"+add+"','"+City+"','"+PinCode+"','"+State+"')";
                con1.statement.executeUpdate(q);
                new Singup2(first);
                setVisible(false);

            }


        } catch (Exception E) {
            E.printStackTrace();
        }
    }

    public static void main(String[] args) {
        new Signup();
    }
}
