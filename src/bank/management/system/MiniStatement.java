package bank.management.system;
import javax.swing.*;
import java.awt.*;
import java.sql.*;


public class MiniStatement extends JFrame{
    String pinNumber;
    MiniStatement(String pinNumber){
        this.pinNumber=pinNumber;
        
       setTitle("Mini-Satement");
        setLayout(null);
        
        JLabel text =new JLabel();
        add(text);
        
        JLabel bank =new JLabel("Indian Bnak");
        bank.setBounds(150,20,100,20);
        add(bank);
        
        JLabel card=new JLabel();
        card.setBounds(20,80,300,20);
        add(card);
        
        try{
            Conn conn =new Conn();
            String query="Select * from login pin= '1212'";
            ResultSet rs=conn.s.executeQuery(query);
            
            while(rs.next()){
                card.setText("Card Number "+rs.getString("CardNumber"));
            }
            
        }catch(Exception e){
            System.out.println(e);
        }
        
        
        
        setSize(400,600);
        setLocation(20,20);
        getContentPane().setBackground(Color.white);
        setVisible(true);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
    }
    public static void main(String args[]){
        
        new MiniStatement("");
    }
    
}
