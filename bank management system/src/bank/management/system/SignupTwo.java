package bank.management.system;
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;


import javax.swing.*;

public class SignupTwo extends JFrame implements ActionListener {

    JTextField aadhar,pan;
    JButton next;
    JRadioButton syes,sno,eyes,eno;
    JComboBox religion, category, occupation, income, education;
    String formno;


    SignupTwo(String formno){
        this.formno = formno;
        setLayout(null);
        setTitle("NEW ACCOUNT APPLICATION FORM - PAGE 2");

        JLabel additionalDetails = new JLabel("Page 2: Additional Details");
        additionalDetails.setFont(new Font("Raleway",Font.BOLD,22));
        additionalDetails.setBounds(290,80,400,30);
        add(additionalDetails);

        JLabel name= new JLabel("Religion :");
        name.setFont(new Font("Raleway", Font.BOLD, 20));
        name.setBounds(100,140,100,30);
        name.setBackground(Color.WHITE);
        add(name);

        String valReligion[] = {"Hindu", "Muslim", "Sikh", "Christian", "Other"};
        religion = new JComboBox(valReligion);
        religion.setBackground(Color.WHITE);
        religion.setBounds(300,140,400,30);
        add(religion);


        JLabel fname = new JLabel("Category : ");
        fname.setFont(new Font("Raleway",Font.BOLD,20));
        fname.setBounds(100,190,200,30);
        add(fname);

        String valcategory[] = {"General","OBC","SC","ST","Other"};
        category = new JComboBox(valcategory);
        category.setBounds(300,190,400,30);
        category.setBackground(Color.WHITE);
        add(category);

        JLabel dob = new JLabel("Income : ");
        dob.setFont(new Font("Raleway",Font.BOLD,20));
        dob.setBounds(100,240,200,30);
        add(dob);

        String incomecategory[] = {"Null",", 1,50,000","2,50,000","5,00,000","upto 10,00,000"};
        income = new JComboBox(incomecategory);
        income.setBounds(300,240,400,30);
        income.setBackground(Color.WHITE);
        add(income);

        JLabel gender = new JLabel("Educational");
        gender.setFont(new Font("Raleway",Font.BOLD,20));
        gender.setBounds(100,290,200,30);
        add(gender);

        JLabel email = new JLabel("Qualification: ");
        email.setFont(new Font("Raleway",Font.BOLD,20));
        email.setBounds(100,315,200,30);
        add(email);

        String educationValues[] = {"Non-Graduation","Graduate","Post-Graduate","Doctors","Other"};
        education = new JComboBox(educationValues);
        education.setBounds(300,315,400,30);
        education.setBackground(Color.WHITE);
        add(education);

        String occupationValues[] = {"Salaried","Self-Employed","Business","Student","Retired","Other"};
        occupation = new JComboBox(occupationValues);
        occupation.setBounds(300,390,400,30);
        occupation.setBackground(Color.WHITE);
        add(occupation);


        JLabel address = new JLabel("PAN Number: ");
        address.setFont(new Font("Raleway",Font.BOLD,20));
        address.setBounds(100,440,200,30);
        add(address);

        pan = new JTextField();
        pan.setBorder(BorderFactory.createLineBorder(new Color(192, 192, 192)));
        pan.setFont(new Font("Raleway", Font.BOLD,14));
        pan.setBounds(300,440,400,30);
        add(pan);


        JLabel city = new JLabel("Aadhar Number : ");
        city.setFont(new Font("Raleway",Font.BOLD,20));
        city.setBounds(100,490,200,30);
        add(city);

        aadhar= new JTextField();
        aadhar.setBorder(BorderFactory.createLineBorder(new Color(192, 192, 192)));
        aadhar.setFont(new Font("Raleway", Font.BOLD,14));
        aadhar.setBounds(300,490,400,30);
        add(aadhar);

        JLabel state = new JLabel("Senior Citizen ");
        state.setFont(new Font("Raleway",Font.BOLD,20));
        state.setBounds(100,540,200,30);
        add(state);

        syes = new JRadioButton("Yes");
        syes.setBorder(BorderFactory.createLineBorder(new Color(192, 192, 192)));
        syes.setFont(new Font("Raleway", Font.BOLD,16));
        syes.setBackground(Color.WHITE);
        syes.setBounds(300,540,100,30);
        add(syes);

        sno = new JRadioButton("No");
        sno.setFont(new Font("Raleway", Font.BOLD,16));
        sno.setBackground(Color.WHITE);
        sno.setBounds(450,540,100,30);
        add(sno);

        ButtonGroup maritalgroup = new ButtonGroup();
        maritalgroup.add(syes);
        maritalgroup.add(sno);

        JLabel marital = new JLabel("Occupation : ");
        marital.setFont(new Font("Raleway",Font.BOLD,20));
        marital.setBounds(100,390,200,30);
        add(marital);

        JLabel pincode = new JLabel("Existing Account : ");
        pincode.setFont(new Font("Raleway",Font.BOLD,20));
        pincode.setBounds(100,590,200,30);
        add(pincode);

        eyes = new JRadioButton("Yes");
        eyes.setFont(new Font("Raleway", Font.BOLD,16));
        eyes.setBackground(Color.WHITE);
        eyes.setBounds(300,590,100,30);
        add(eyes);

        eno = new JRadioButton("No");
        eno.setFont(new Font("Raleway", Font.BOLD,16));
        eno.setBackground(Color.WHITE);
        eno.setBounds(450,590,100,30);
        add(eno);

        ButtonGroup emaritalgroup = new ButtonGroup();
        emaritalgroup.add(eyes);
        emaritalgroup.add(eno);


        next = new JButton("Next");
        next.setForeground(Color.WHITE);
        next.setBackground(Color.BLACK);
        next.setFont(new Font("Raleway", Font.BOLD,14));
        next.setBounds(620,660,80,30);
        next.addActionListener(this);
        add(next);

        getContentPane().setBackground(new Color(209, 216, 222));

        setSize(850,800);
        setLocation(350,10);
        setVisible(true);
    }
    @Override
    public void actionPerformed(ActionEvent e) {
        String sreligion = (String) religion.getSelectedItem();
        String scategory = (String) category.getSelectedItem();
        String sincome = (String) income.getSelectedItem();
        String seducation = (String) education.getSelectedItem();
        String soccupation = (String) occupation.getSelectedItem();

        String seniorcictizen = null;
        if (syes.isSelected()){
            seniorcictizen = "Yes";
        } else if (sno.isSelected()) {
           seniorcictizen = "No";
        }


        String existingaccount = null;
        if (eyes.isSelected()){
            existingaccount = "Yes";
        } else if (eno.isSelected()) {
            existingaccount = "No";
        }

        String span = pan.getText();
        String saadhar = aadhar.getText();


        try {
            Conn c = new Conn();
            String query = "insert into signuptwo values('"+formno+"','"+sreligion+"'," +
                    "'"+scategory+"','"+sincome+"','"+seducation+"','"+soccupation+"','"
                    +span+"','"+saadhar+"','"+seniorcictizen+"','"+existingaccount+"')";

            c.s.executeUpdate(query);


            //Signup3 object
            setVisible(false);
            new SignupThree(formno).setVisible(true);
        }
        catch (Exception ex){
            System.out.println(ex);
        }
    }


    public static void main(String[] args) {
        new SignupTwo("");
    }


}
