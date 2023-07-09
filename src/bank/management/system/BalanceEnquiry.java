package bank.management.system;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.sql.ResultSet;

public class BalanceEnquiry extends JFrame implements ActionListener{
    
    JButton backBtn;
    String pinNumber;
    BalanceEnquiry(String pinNumber){
        this.pinNumber=pinNumber;
         
        ImageIcon img=new ImageIcon(ClassLoader.getSystemResource("icons/atm.jpg"));
        Image img2=img.getImage().getScaledInstance(900, 900, Image.SCALE_DEFAULT);
        ImageIcon img3=new ImageIcon(img2);
        JLabel image=new JLabel(img3);
        image.setBounds(0,0,900,900);
        add(image);
        
        backBtn=new JButton("< Back");
        backBtn.setBounds(355,520,150,30);
        backBtn.addActionListener(this);
        image.add(backBtn);
        
        
        
          Conn conn=new Conn();
               int balance=0;
                try{
                    ResultSet rs = conn.s.executeQuery("select * from bank where '"+pinNumber+"' ");
                   
                    while(rs.next()){
                        if(rs.getString("Type").equals("Deposit")){ // check balance... hai ya nhii
                            balance+=Integer.parseInt(rs.getString("amount"));
                        }else{
                            balance-=Integer.parseInt(rs.getString("amount"));
                        }
                    }
                    }catch(Exception e){
                            System.out.println(e);
                    }
                
                JLabel text=new JLabel("Your current Account balance is Rs = "+balance);
                text.setForeground(Color.white);
                text.setFont(new Font("Raleway",Font.BOLD,16));
                text.setBounds(170,300,400,30);
                image.add(text);
        
        
        
        setLayout(null);
        setSize(900,900);
        setLocation(300,0);
        setVisible(true);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
    }
    
    public void actionPerformed(ActionEvent ee){
        
      
        if(ee.getSource()==backBtn){
            setVisible(false);
            new Transaction(pinNumber).setVisible(true);
        }
    }
    
    public static void main(String args[]){
        new BalanceEnquiry("");
    }
    
}
