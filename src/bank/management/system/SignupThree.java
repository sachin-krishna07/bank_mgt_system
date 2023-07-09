package bank.management.system;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.util.*;

public class SignupThree extends JFrame implements ActionListener{
    JRadioButton r1,r2,r3,r4;
    JCheckBox c1,c2,c3,c4,c5,c6,c7;
    JButton Submit,Cancel;
    String Formno;
    SignupThree(String Formno){
        this.Formno=Formno;
        setLayout(null);

        JLabel l1 =new JLabel("Page 3: Account Details");
        l1.setFont(new Font("Raleway",Font.BOLD,22));
        l1.setBounds(280,40,400,40);
        add(l1);
        
        JLabel Type =new JLabel("Account Type :");
        Type.setFont(new Font("Raleway",Font.BOLD,22));
        Type.setBounds(100,140,200,30);
        add(Type);
        
        r1 =new JRadioButton("Saving Account");
        r1.setBounds(100,180,250,20);
        r1.setFont(new Font("Raleway",Font.BOLD,16));
        r1.setBackground(Color.white);
        add(r1);
        
        r2 =new JRadioButton("Fixed Deposit Account");
        r2.setBounds(350,180,250,20);
        r2.setFont(new Font("Raleway",Font.BOLD,16));
        r2.setBackground(Color.white);
        add(r2);
        
        r3 =new JRadioButton("Current Account");
        r3.setBounds(100,220,250,20);
        r3.setFont(new Font("Raleway",Font.BOLD,16));
        r3.setBackground(Color.white);
        add(r3);
        
        r4 =new JRadioButton("Recurring Deposit Account");
        r4.setBounds(350,220,250,20);
        r4.setFont(new Font("Raleway",Font.BOLD,16));
        r4.setBackground(Color.white);
        add(r4);
        
        ButtonGroup GrouupAcount=new ButtonGroup();
        GrouupAcount.add(r1);
        GrouupAcount.add(r2);
        GrouupAcount.add(r3);
        GrouupAcount.add(r4);
        
        
        JLabel Card=new JLabel("Card Number :");
        Card.setFont(new Font("Raleway",Font.BOLD,22));
        Card.setBounds(100,300,200,30);
        add(Card);
        
        JLabel Number=new JLabel("XXXX-XXXX-XXXX-9274");
        Number.setFont(new Font("Raleway",Font.BOLD,18));
        Number.setBounds(330,300,300,30);
        add(Number);
        JLabel CardDetails=new JLabel("Your 16 Digit Card Number.");
        CardDetails.setFont(new Font("Raleway",Font.BOLD,10));
        CardDetails.setBounds(100,330,300,17);
        add(CardDetails);
        
       
        JLabel Pin=new JLabel("PIN :");
        Pin.setFont(new Font("Raleway",Font.BOLD,22));
        Pin.setBounds(100,370,200,30);
        add(Pin);
        JLabel PinDetails=new JLabel("Your 4 Digit Password.");
        PinDetails.setFont(new Font("Raleway",Font.BOLD,10));
        PinDetails.setBounds(100,400,300,17);
        add(PinDetails);
        
        JLabel PinNumber=new JLabel("XXXX");
        PinNumber.setFont(new Font("Raleway",Font.BOLD,18));
        PinNumber.setBounds(330,370,300,30);
        add(PinNumber);
        
        JLabel Service=new JLabel("Services Required: ");
        Service.setFont(new Font("Raleway",Font.BOLD,22));
        Service.setBounds(100,450,300,30);
        add(Service);
        
        c1=new JCheckBox("ATM Card");
        c1.setBackground(Color.white);
        c1.setFont(new Font("Raleway",Font.BOLD,16));
        c1.setBounds(100,500,200,30);
        add(c1);
        
        c2=new JCheckBox("Internet banking");
        c2.setBackground(Color.white);
        c2.setFont(new Font("Raleway",Font.BOLD,16));
        c2.setBounds(350,500,200,30);
        add(c2);
        
        c3=new JCheckBox("Mobile Banking");
        c3.setBackground(Color.white);
        c3.setFont(new Font("Raleway",Font.BOLD,16));
        c3.setBounds(100,550,200,30);
        add(c3);
        
        c4=new JCheckBox("Email & SMS Alert");
        c4.setBackground(Color.white);
        c4.setFont(new Font("Raleway",Font.BOLD,16));
        c4.setBounds(350,550,200,30);
        add(c4);
        
        c5=new JCheckBox("Check Box");
        c5.setBackground(Color.white);
        c5.setFont(new Font("Raleway",Font.BOLD,16));
        c5.setBounds(100,600,200,30);
        add(c5);
        
        c6=new JCheckBox("E-Statement");
        c6.setBackground(Color.white);
        c6.setFont(new Font("Raleway",Font.BOLD,16));
        c6.setBounds(350,600,200,30);
        add(c6);
        
        c7=new JCheckBox("I hereby declared that the above enter details are correct to best of my knowledge.");
        c7.setBackground(Color.white);
        c7.setFont(new Font("Raleway",Font.BOLD,10));
        c7.setBounds(100,680,600,30);
        add(c7);
        
        Submit = new JButton("Submit");
        Submit.setBackground(Color.black);
        Submit.setForeground(Color.white);
        Submit.setFont(new Font("Raleway",Font.BOLD,14));
        Submit.setBounds(250,720,100,30);
        Submit.addActionListener(this);
        add(Submit);
        
        Cancel = new JButton("Cancel");
        Cancel.setBackground(Color.black);
        Cancel.setForeground(Color.white);
        Cancel.setFont(new Font("Raleway",Font.BOLD,14));
        Cancel.setBounds(420,720,100,30);
        Cancel.addActionListener(this);
        add(Cancel);
        
        
        
        
        
        setSize(770 ,820);
        setVisible(true);
        setLocation(350,0);
        getContentPane().setBackground(Color.white);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        
    }
    public void actionPerformed(ActionEvent e){
        if(e.getSource()==Submit){
            String AccountType=null;
            if(r1.isSelected()){
                AccountType="Saving Account";
            }else if(r2.isSelected()){
                AccountType="Fixed Deposit Account";
            }
            else if(r3.isSelected()){
                AccountType="Current Account";
            }else if(r4.isSelected()){
                AccountType="Reccuring Deposit Account";
            }
            
            
            Random random=new Random();
            String CardNumber="" + Math.abs((random.nextLong()%90000000L)+5040936000000000L);
            String PinNumber =""+ Math.abs((random.nextLong()%9000L)+1000L);
            
            
            String facility="";
            if(c1.isSelected()){
                facility=facility+"ATM Card";
            }else if(c2.isSelected()){
                facility=facility+"internet Banking";
            }else if(c3.isSelected()){
                facility=facility+"internet Banking";
            }else if(c4.isSelected()){
                facility=facility+"Bobile Banking";
            }else if(c5.isSelected()){
                facility=facility+"Email & SMS Alert";
            }else if(c6.isSelected()){
                facility=facility+"Cheque Book";
            }else if(c7.isSelected()){
                facility=facility+"E-Statement";
            }
            
            try{
                if(AccountType.equals("")){
                    JOptionPane.showMessageDialog(null,"Account type is Required");
                }else{
                    Conn conn=new Conn();
                    String query1="insert into SignupThree values('"+Formno+"','"+AccountType+"','"+CardNumber+"','"+PinNumber+"','"+facility+"')";
                    String query2="insert into login values('"+Formno+"','"+CardNumber+"','"+PinNumber+"')";
                    conn.s.execute(query1);
                    conn.s.execute(query2);
                    setVisible(false);
                    new Deposit(PinNumber).setVisible(true);
                    JOptionPane.showMessageDialog(null,"Card Number-> "+CardNumber+"\n Pin-> "+PinNumber);
                }
            }catch(Exception ee){
                System.out.println(ee);
            }
            
        }else if(e.getSource()==Cancel){
            new Login().setVisible(true);
            
        }
        
    }
    
    
    public static void main(String args[]){
        new SignupThree("");
    }
}