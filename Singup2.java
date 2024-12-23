package Bank.management.system;


import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Singup2 extends JFrame  implements ActionListener {
    JComboBox comboBox,comboBox1,comboBox2,comboBox3,comboBox4;
    JTextField pan,aadhar;
    JRadioButton radioButton1,radioButton2;
    JRadioButton radioB1,radioB2;
    JButton next;
    String form_no;

    Singup2(String first) {
        super("APPLICATION FORM");

        ImageIcon i1 = new ImageIcon(ClassLoader.getSystemResource("icon/bank.png"));
        Image i2 = i1.getImage().getScaledInstance(100,100,Image.SCALE_DEFAULT);
        ImageIcon i3 = new ImageIcon(i2);
        JLabel image = new JLabel(i3);
        image.setBounds(150,5,100,100);
        add(image);
        form_no = first;

        JLabel l1 = new JLabel("Page 2:");
        l1.setFont(new Font("Times New Roman", Font.BOLD, 22));
        l1.setBounds(300,30,600,40);
        add(l1);

        JLabel l2 = new JLabel("Additional Details");
        l2.setFont(new Font("Times New Roman", Font.BOLD, 22));
        l2.setBounds(300,60,600,40);
        add(l2);

        JLabel l3 = new JLabel("Religion :");
        l3.setFont(new Font("Times New Roman", Font.BOLD, 18));
        l3.setBounds(100,120,100,30);
        add(l3);

        String religion[] = {"Hindu","Muslim","Sikh","Christan","Others"};
        comboBox = new JComboBox(religion);
        comboBox.setFont(new Font("Times New Roman", Font.BOLD, 14));
        comboBox.setBackground(new Color(252,208,76));
        comboBox.setBounds(300,120,320,30);
        add(comboBox);

        JLabel l4 = new JLabel("Category :");
        l4.setFont(new Font("Times New Roman", Font.BOLD, 18));
        l4.setBounds(100,170,100,30);
        add(l4);

        String category[] = {"General", "OBC", "SC", "ST", "Others"};
        comboBox1 = new JComboBox(category);
        comboBox1.setFont(new Font("Times New Roman", Font.BOLD, 14));
        comboBox1.setBackground(new Color(252,208,76));
        comboBox1.setBounds(300,170,320,30);
        add(comboBox1);

        JLabel l5 = new JLabel("Income :");
        l5.setFont(new Font("Times New Roman", Font.BOLD, 18));
        l5.setBounds(100,220,100,30);
        add(l5);

        String income[] = {"Null","<150000","<250000","<500000","Upto 100000","Above 1000000"};
        comboBox2 = new JComboBox(income);
        comboBox2.setFont(new Font("Times New Roman", Font.BOLD, 14));
        comboBox2.setBackground(new Color(252,208,76));
        comboBox2.setBounds(300,220,320,30);
        add(comboBox2);

        JLabel l6 = new JLabel("Educational :");
        l6.setFont(new Font("Times New Roman", Font.BOLD, 18));
        l6.setBounds(100,270,150,30);
        add(l6);

        String education[] = {"Non-Graduate","Graduate","Post-Graduate","Doctorate","Others"};
        comboBox3 = new JComboBox(education);
        comboBox3.setFont(new Font("Times New Roman", Font.BOLD, 14));
        comboBox3.setBackground(new Color(252,208,76));
        comboBox3.setBounds(300,270,320,30);
        add(comboBox3);

        JLabel l7 = new JLabel("Occupation :");
        l7.setFont(new Font("Times New Roman", Font.BOLD, 18));
        l7.setBounds(100,320,150,30);
        add(l7);

        String occupation[] = {"Salaried","Self-Employed","Business","Student","Retired", "others"};
        comboBox4 = new JComboBox(occupation);
        comboBox4.setFont(new Font("Times New Roman", Font.BOLD, 14));
        comboBox4.setBackground(new Color(252,208,76));
        comboBox4.setBounds(300,320,320,30);
        add(comboBox4);

        JLabel l8 = new JLabel("PAN Number :");
        l8.setFont(new Font("Times New Roman", Font.BOLD, 18));
        l8.setBounds(100,370,150,30);
        add(l8);

        pan = new JTextField();
        pan.setFont(new Font("Times New Roman", Font.BOLD, 14));
        pan.setBounds(300,370,320,30);
        add(pan);

        JLabel l9 = new JLabel("Aadhar Number :");
        l9.setFont(new Font("Times New Roman", Font.BOLD, 18));
        l9.setBounds(100,420,150,30);
        add(l9);

        aadhar = new JTextField();
        aadhar.setFont(new Font("Times New Roman", Font.BOLD, 14));
        aadhar.setBounds(300,420,320,30);
        add(aadhar);

        JLabel l10 = new JLabel("Senior Citizen :");
        l10.setFont(new Font("Times New Roman", Font.BOLD, 18));
        l10.setBounds(100,470,150,30);
        add(l10);

        radioButton1 = new JRadioButton("Yes");
        radioButton1.setFont(new Font("Times New Roman", Font.BOLD, 14));
        radioButton1.setBackground(new Color(252,208,76));
        radioButton1.setBounds(300,470,80,30);
        add(radioButton1);

        radioButton2 = new JRadioButton("No");
        radioButton2.setFont(new Font("Times New Roman", Font.BOLD, 14));
        radioButton2.setBackground(new Color(252,208,76));
        radioButton2.setBounds(450,470,80,30);
        add(radioButton2);

        ButtonGroup buttonGroup = new ButtonGroup();
        buttonGroup.add(radioButton1);
        buttonGroup.add(radioButton2);

        JLabel l11 = new JLabel("Existing Account :");
        l11.setFont(new Font("Times New Roman", Font.BOLD, 18));
        l11.setBounds(100,520,150,30);
        add(l11);

        radioB1 = new JRadioButton("Yes");
        radioB1.setFont(new Font("Times New Roman", Font.BOLD, 14));
        radioB1.setBackground(new Color(252,208,76));
        radioB1.setBounds(300,520,80,30);
        add(radioB1);

        radioB2 = new JRadioButton("No");
        radioB2.setFont(new Font("Times New Roman", Font.BOLD, 14));
        radioB2.setBackground(new Color(252,208,76));
        radioB2.setBounds(450,520,80,30);
        add(radioB2);

        JLabel l12 = new JLabel("Form No :");
        l12.setFont(new Font("Times New Roman", Font.BOLD, 18));
        l12.setBounds(650,10,100,30);
        add(l12);

        JLabel l13 = new JLabel(form_no);
        l13.setFont(new Font("Times New Roman", Font.BOLD, 18));
        l13.setBounds(730,10,100,30);
        add(l13);

        next = new JButton("Next");
        next.setFont(new Font("Times New Roman", Font.BOLD, 14));
        next.setBackground(Color.white);
        next.setForeground(Color.BLACK);
        next.setBounds(570,640,100,30);
        next.addActionListener(this);
        add(next);

        setLayout(null);
        setSize(850,750);
        setLocation(450,80);
        getContentPane().setBackground(new Color(252,208,76));
        setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        String religion = (String) comboBox.getSelectedItem();
        String category = (String) comboBox1.getSelectedItem();
        String income = (String) comboBox2.getSelectedItem();
        String education = (String) comboBox3.getSelectedItem();
        String occupation = (String) comboBox4.getSelectedItem();
        String pan_no = pan.getText();
        String aadhar_no = aadhar.getText();
        String senior = null;
        if(radioButton1.isSelected()){
            senior = "Yes";
        } else if(radioButton2.isSelected()){
            senior = "No";
        }

        String existing = null;
        if(radioB1.isSelected()){
            existing = "Yes";
        } else if(radioB2.isSelected()){
            existing = "No";
        }
        try {
            if(pan.getText().equals("") || aadhar.getText().equals("")){
                JOptionPane.showMessageDialog(null, "Please enter the PAN number and Aadhar Number");
            } else {
                Con c1 = new Con();
                String q = "insert into signup2 values('"+form_no+"','"+religion+"','"+category+"','"+income+"','"+education+"','"+occupation+"','"+pan_no+"','"+aadhar_no+"','"+senior+"','"+existing+"')";
                c1.statement.executeUpdate(q);
                new Singup3(form_no);
                setVisible(false);
            }
        }catch (Exception E) {
            E.printStackTrace();
        }
    }

    public static void main(String[] args) {
        new Singup2("");
    }
}
