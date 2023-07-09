package bank.management.system;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class Transaction extends JFrame implements ActionListener{
    JButton DepositBtn,WithdrawBtn,FastBtn, MiniBtn,PinBtn,BalanceBtn,ExitBtn;
    String pinNumber;
    Transaction(String pinNumber){
        this.pinNumber=pinNumber;
        ImageIcon img=new ImageIcon(ClassLoader.getSystemResource("icons/atm.jpg"));
        Image img2=img.getImage().getScaledInstance(900, 900, Image.SCALE_DEFAULT);
        ImageIcon img3=new ImageIcon(img2);
        JLabel image=new JLabel(img3);
        image.setBounds(0,0,900,900);
        add(image);
        
        
        JLabel text =new JLabel("Please Select your Transaction");
        text.setBounds(210,270,700,35);
        text.setForeground(Color.white);
        text.setFont(new Font("System",Font.BOLD,16));
        image.add(text); // image k uper lane k liye image.add(text) ka use kiya hai

        
        DepositBtn=new JButton("Deposit");
        DepositBtn.setBounds(170,385,150,30);
        DepositBtn.addActionListener(this);
        image.add(DepositBtn);
        
        WithdrawBtn=new JButton("Cash withdraw");
        WithdrawBtn.setBounds(355,385,150,30);
        WithdrawBtn.addActionListener(this);
        image.add(WithdrawBtn);
        
        FastBtn=new JButton("Fast Cash");
        FastBtn.setBounds(170,420,150,30);
        FastBtn.addActionListener(this);
        image.add(FastBtn);
        
        MiniBtn=new JButton("Mini Statement");
        MiniBtn.setBounds(355,420,150,30);
        MiniBtn.addActionListener(this);
        image.add(MiniBtn);
        
        PinBtn=new JButton("Pin Change");
        PinBtn.setBounds(170,455,150,30);
        PinBtn.addActionListener(this);
        image.add(PinBtn);
        
        BalanceBtn=new JButton("Balance Enquiry");
        BalanceBtn.setBounds(355,455,150,30);
        BalanceBtn.addActionListener(this);
        image.add(BalanceBtn);
        
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
         System.exit(0);
         }else if(ee.getSource()==DepositBtn){
             setVisible(false);
             new Deposit(pinNumber).setVisible(true);
             
         }else if(ee.getSource()==BalanceBtn){
             setVisible(false);
             new BalanceEnquiry(pinNumber).setVisible(true);
             
         }else if(ee.getSource()==MiniBtn){
             
         }else if(ee.getSource()==PinBtn){
             setVisible(false);
             new PinChange(pinNumber).setVisible(true);
         }else if(ee.getSource()==FastBtn){
             setVisible(false);
             new FastCash(pinNumber).setVisible(true);
         }else if(ee.getSource()==WithdrawBtn){
             setVisible(false);
             new Withdrawl(pinNumber).setVisible(true);
         }
        
    }
    
    public static void main(String args[]){
        new Transaction("");
    }
    
}
