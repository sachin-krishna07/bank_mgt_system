package bank.management.system;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.util.Date;
import java.util.*;

import java.sql.*;

public class FastCash extends JFrame implements ActionListener{
    JButton Btn500,Btn1000,Btn1500,Btn2000,Btn5000,Btn10000,ExitBtn;
    String pinNumber;
    FastCash(String pinNumber){
        this.pinNumber=pinNumber;
        ImageIcon img=new ImageIcon(ClassLoader.getSystemResource("icons/atm.jpg"));
        Image img2=img.getImage().getScaledInstance(900, 900, Image.SCALE_DEFAULT);
        ImageIcon img3=new ImageIcon(img2);
        JLabel image=new JLabel(img3);
        image.setBounds(0,0,900,900);
        add(image);
        
        
        JLabel text =new JLabel("SELECT WITHDRAW AMOUNT");
        text.setBounds(210,270,700,35);
        text.setForeground(Color.white);
        text.setFont(new Font("System",Font.BOLD,16));
        image.add(text); // image k uper lane k liye image.add(text) ka use kiya hai

        
        Btn500=new JButton("Rs 500");
        Btn500.setBounds(170,385,150,30);
        Btn500.addActionListener(this);
        image.add(Btn500);
        
        Btn1000=new JButton("Rs 1000");
        Btn1000.setBounds(355,385,150,30);
        Btn1000.addActionListener(this);
        image.add(Btn1000);
        
        Btn1500=new JButton("Rs 1500");
        Btn1500.setBounds(170,420,150,30);
        Btn1500.addActionListener(this);
        image.add(Btn1500);
        
        Btn2000=new JButton("2000");
        Btn2000.setBounds(355,420,150,30);
        Btn2000.addActionListener(this);
        image.add(Btn2000);
        
        Btn5000=new JButton("Rs 5000");
        Btn5000.setBounds(170,455,150,30);
        Btn5000.addActionListener(this);
        image.add(Btn5000);
        
        Btn10000=new JButton("Rs 10000");
        Btn10000.setBounds(355,455,150,30);
        Btn10000.addActionListener(this);
        image.add(Btn10000);
        
        ExitBtn=new JButton("Exit");
        ExitBtn.setBounds(355,490,150,30);
        ExitBtn.addActionListener(this);
        image.add(ExitBtn);
        
        setSize(900,900);
        setLocation(300,0);
//        setUndecorated(true);
        setVisible(true);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
    }
    public void actionPerformed(ActionEvent ee){
        if(ee.getSource()==ExitBtn){
         setVisible(false);
         new Transaction(pinNumber).setVisible(true);
         }else {
           String amount=((JButton)ee.getSource()).getText().substring(3); // typecast kiya hai Jbutton se and starting k 3 digit cut kiye hai Substring k through
            
           Date Date=new Date();
            Conn conn=new Conn();
                try{
                    ResultSet rs = conn.s.executeQuery("select * from bank where '"+pinNumber+"' ");
                    int balance=0;
                    while(rs.next()){
                        if(rs.getString("Type").equals("Deposit")){ // check balance... hai ya nhii
                            balance+=Integer.parseInt(rs.getString("amount"));
                        }else{
                            balance-=Integer.parseInt(rs.getString("amount"));
                        }
                    }
                    if(ee.getSource()!=ExitBtn && balance<Integer.parseInt(amount)){
                        JOptionPane.showMessageDialog(null,"Insufficient Balance");
                        return;
                    }
                    Date date=new Date();
                    String query="insert into bank Values('"+pinNumber+"','"+date+"','Withrawl','"+amount+"')";
                    conn.s.executeUpdate(query);
                    JOptionPane.showMessageDialog(null, "Rs "+amount+" Successfully.");
                   
                    setVisible(false);
                    new Transaction(pinNumber).setVisible(true);
                    
                }catch(Exception e){
                    System.out.println(e);
                    
                }
             
         }
        
    }
    
    public static void main(String args[]){
        new FastCash("");
    }
    
}
