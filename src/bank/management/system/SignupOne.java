package bank.management.system;
import javax.swing.*;
import java.awt.*;
import java.util.*;
import com.toedter.calendar.JDateChooser;
import java.awt.event.*;


public class SignupOne extends JFrame implements ActionListener{
    Long random;
    JTextField Nametx , FNametx,DoBChooser,Emailtx,Addresstx,Citytx,Statetx,Countrytx,Pincodetx;
    JButton nextBtn;
    JRadioButton Male,Female, Merried,Unmerried,Other;
    JDateChooser DateChooser;
    
    
    SignupOne(){
        setLayout(null);
        
        
        Random ran=new Random();
        random=(Math.abs(ran.nextLong()%9000L));
        
        JLabel Form=new JLabel("APPLICATION FORM NO: "+random);
        Form.setFont(new Font("Raleway",Font.BOLD,38));
        Form.setBounds(140,20,600,40);
        add(Form);
        
        
        
        JLabel PersonalDetails=new JLabel("Page 1: Personal Deatils");
        PersonalDetails.setFont(new Font("Raleway",Font.BOLD,22));
        PersonalDetails.setBounds(290,80,400,30);
        add(PersonalDetails);
        
        JLabel name=new JLabel("Name :");
        name.setFont(new Font("Raleway",Font.BOLD,20));
        name.setBounds(100,140,100,30);
        add(name);
        
        Nametx=new JTextField();
        Nametx.setFont(new Font("Raleway",Font.BOLD,14));
        Nametx.setBounds(300,140,400,30);
        add(Nametx);
        
        JLabel fname=new JLabel("Father's Name :");
        fname.setFont(new Font("Raleway",Font.BOLD,20));
        fname.setBounds(100,190,200,30);
        add(fname);
        
        FNametx=new JTextField();
        FNametx.setFont(new Font("Raleway",Font.BOLD,14));
        FNametx.setBounds(300,190,400,30);
        add(FNametx);
        
        JLabel Dob=new JLabel("Date of Birth:");
        Dob.setFont(new Font("Raleway",Font.BOLD,20));
        Dob.setBounds(100,240,200,30);
        add(Dob);
        
       DateChooser = new JDateChooser();
        DateChooser.setBounds(300,240,400,30);
        DateChooser.setFont(new Font("Raleway",Font.BOLD,20));
        DateChooser.setForeground(new Color(105,105,105));
        add(DateChooser);
        
        JLabel Gender=new JLabel("Gender:");
        Gender.setFont(new Font("Raleway",Font.BOLD,20));
        Gender.setBounds(100,290,200,30);
        add(Gender);
        
        Male=new JRadioButton("Male");
        Male.setBounds(300,290,60,30);
        Male.setBackground(Color.white);
        add(Male);
        
        Female=new JRadioButton("Female");
        Female.setBounds(450,290,120,30);
        Female.setBackground(Color.white);
        add(Female);
        ButtonGroup GenderGroup=new ButtonGroup();
        GenderGroup.add(Male);
        GenderGroup.add(Female);
        
        JLabel Email=new JLabel("Email:");
        Email.setFont(new Font("Raleway",Font.BOLD,20));
        Email.setBounds(100,340,200,30);
        add(Email);
        
        Emailtx=new JTextField();
        Emailtx.setFont(new Font("Raleway",Font.BOLD,14));
        Emailtx.setBounds(300,340,400,30);
        add(Emailtx);
        
        JLabel Merital=new JLabel("Merital Status:");
        Merital.setFont(new Font("Raleway",Font.BOLD,20));
        Merital.setBounds(100,390,200,30);
        add(Merital);
        
        
        Merried=new JRadioButton(" Merried");
        Merried.setBounds(300,390,100,30);
        Merried.setBackground(Color.white);
        add(Merried);
        
        Unmerried=new JRadioButton("Unmerried");
        Unmerried.setBounds(450,390,100,30);
        Unmerried.setBackground(Color.white);
        add(Unmerried);
        
        Other=new JRadioButton("Other");
        Other.setBounds(630,390,100,30);
        Other.setBackground(Color.white);
        add(Other);
        
        ButtonGroup MeritalGroup=new ButtonGroup();
        MeritalGroup.add(Merried);
        MeritalGroup.add(Unmerried);
        MeritalGroup.add(Other);
        
        JLabel Address=new JLabel("Address:");
        Address.setFont(new Font("Raleway",Font.BOLD,20));
        Address.setBounds(100,440,200,30);
        add(Address);
        
        Addresstx=new JTextField();
        Addresstx.setFont(new Font("Raleway",Font.BOLD,14));
        Addresstx.setBounds(300,440,400,30);
        add(Addresstx);
        
        JLabel City=new JLabel("City:");
        City.setFont(new Font("Raleway",Font.BOLD,20));
        City.setBounds(100,490,200,30);
        add(City);
        
        Citytx=new JTextField();
        Citytx.setFont(new Font("Raleway",Font.BOLD,14));
        Citytx.setBounds(300,490,400,30);
        add(Citytx);
        
        
        JLabel State=new JLabel("State:");
        State.setFont(new Font("Raleway",Font.BOLD,20));
        State.setBounds(100,540,200,30);
        add(State);
        
        Statetx=new JTextField();
        Statetx.setFont(new Font("Raleway",Font.BOLD,14));
        Statetx.setBounds(300,540,400,30);
        add(Statetx);
        
        JLabel PinCode=new JLabel("PinCode:");
        PinCode.setFont(new Font("Raleway",Font.BOLD,20));
        PinCode.setBounds(100,590,200,30);
        add(PinCode);
        
        Pincodetx=new JTextField();
        Pincodetx.setFont(new Font("Raleway",Font.BOLD,14));
        Pincodetx.setBounds(300,590,400,30);
        add(Pincodetx);
        
        
        JButton NextBtn=new JButton("NEXT");
        NextBtn.setBounds(620,660,100,30);
        NextBtn.setBackground(Color.black);
        NextBtn.setForeground(Color.white);
        NextBtn.setFont(new Font("Raleway",Font.BOLD,14));
        NextBtn.addActionListener(this);
        add(NextBtn);
        
        
        
        
        
        setTitle("BAnk MANAGEMENT SYSTEM");
        getContentPane().setBackground(Color.white);
        setSize(850,800);
        setLocation(350,10);
        setVisible(true);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
    }
    public void actionPerformed(ActionEvent e){
        String Formno=""+random; //long
        String Name=Nametx.getText();
        String Father_Name=FNametx.getText();
        String Dob=((JTextField)DateChooser.getDateEditor().getUiComponent()).getText();
        String gender=null;
        if(Male.isSelected()){
        gender="Male";
        }
        if(Female.isSelected()){
        gender="Female";
        }
        String Email=Emailtx.getText();
        String Marital=null;
        if(Merried.isSelected()){
            Marital="Merried";
        }else if(Merried.isSelected()){
            Marital="Unmerried";
        }else if(Merried.isSelected()){
            Marital="Other";
        }
        String Address=Addresstx.getText();
        String City=Citytx.getText();
        String State=Statetx.getText();
        String PinCode=Pincodetx.getText();
         try{
             if(Name.equals("")){
                 JOptionPane.showMessageDialog(null, "Name is required.");
             }
             else if(Father_Name.equals("")){
                 JOptionPane.showMessageDialog(null, "Father's name is required.");
             }
             else if(Dob.equals("")){
                 JOptionPane.showMessageDialog(null, "DOb is required.");
             }
             else if(Email.equals("")){
                 JOptionPane.showMessageDialog(null, "Email is required.");
             }
             else if(Address.equals("")){
                 JOptionPane.showMessageDialog(null, "Address is required.");
             }
             else if (State.equals("")){
                 JOptionPane.showMessageDialog(null, "State is required.");
             }
             else{
                 Conn c=new Conn();
                 String query ="insert into signup values('"+Formno+"','"+Name+"','"+Father_Name+"','"+Dob+"','"+gender+"','"+Email+"','"+Marital+"','"+Address+"','"+City+"','"+State+"','"+PinCode+"')";
                 c.s.executeUpdate(query) ;//DML query..
                 
                 setVisible(false);
                 new SignupTwo(Formno).setVisible(true);
             }
             
         } catch (Exception ee){
             System.out.println(ee);
         }
    }
    
    public static void main(String args[]){
        new SignupOne();
    }
}
