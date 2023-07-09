package bank.management.system;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.util.*;
public class Deposit extends JFrame implements ActionListener {
    JButton backBtn, depositBtn;
    JTextField amount;
    String PinNumber;
    Deposit(String PinNumber){
        this.PinNumber=PinNumber;
    
        setLayout(null);
        ImageIcon img=new ImageIcon(ClassLoader.getSystemResource("icons/atm.jpg"));
        Image img2=img.getImage().getScaledInstance(900,900,Image.SCALE_DEFAULT);
        ImageIcon img3=new ImageIcon(img2);
        JLabel image=new JLabel(img3);
        image.setBounds(0,0,900,900);
        add(image);
        
        JLabel text =new JLabel("Enter the amount you want to Depoosit");
        text.setForeground(Color.white);
        text.setFont(new Font("System",Font.BOLD,17));
        text.setBounds(177,300,400,20);
        image.add(text);
        
        amount=new JTextField();
        amount.setFont(new Font("System",Font.BOLD,22));
        amount.setBounds(175,350,320,30);
        image.add(amount);
        
        depositBtn=new JButton("Deposit");
        depositBtn.setBounds(355,480,150,30);
        depositBtn.addActionListener(this);
        image.add(depositBtn);
        
        backBtn=new JButton("< Back");
        backBtn.setBounds(355,515,150,30);
        backBtn.addActionListener(this);
        image.add(backBtn);
        
        
        
        
        
        
        setSize(900,900);
        setVisible(true);
        setLocation(300,0);
        
        setDefaultCloseOperation(EXIT_ON_CLOSE);
    
    }
    public void actionPerformed(ActionEvent ee){
        if(ee.getSource()==depositBtn){
            String DepositAmount=amount.getText();
            Date Date=new Date();
            if(DepositAmount.equals("")){
                JOptionPane.showMessageDialog(null,"Please Enter the amount you want to deposit");
            }
            else{
                try{
                   Conn conn=new Conn();
                String query="insert into bank values('"+PinNumber+"','"+Date+"','Deposit','"+DepositAmount+"')";
                conn.s.executeUpdate(query);
                JOptionPane.showMessageDialog(null,"Rs "+DepositAmount+"Deposited SuccessFuly"); 
                setVisible(false);
                new Transaction(PinNumber).setVisible(true);
                
                }catch(Exception e){
                    System.out.println(e);
                    
                }
                
            }
        }else if(ee.getSource()==backBtn){
            setVisible(false);
            new Transaction(PinNumber).setVisible(true);
            
        }
    }
    
    public static void main(String args[]){
        new Deposit("");
    }
    
}
