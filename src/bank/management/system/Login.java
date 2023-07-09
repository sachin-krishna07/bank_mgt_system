package bank.management.system;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.sql.*;

public class Login extends JFrame implements ActionListener{
    JButton LoginBtn, SignUpBtn,ClearBtn; //Global Define 
    JTextField CardText;
    JPasswordField PinText;
    
    Login() {
         setTitle("Bank management System");
         
        ImageIcon img=new ImageIcon(ClassLoader.getSystemResource("icons/logo.jpg"));
         Image img2=img.getImage().getScaledInstance(100,100,Image.SCALE_DEFAULT);
         ImageIcon img3= new ImageIcon(img2);
        JLabel label = new JLabel(img3);
        label.setBounds(70,10,100,100);
        add(label);
        
        JLabel text=new JLabel("Welcome to ATM");
        text.setFont(new Font("Oswerd",Font.BOLD,35));
        text.setBounds(200,40,400,40);
        add(text);
        
        JLabel Cardno=new JLabel("card no..");
        Cardno.setFont(new Font("Raleway",Font.BOLD,25));
        Cardno.setBounds(120,150,150,30);
        add(Cardno);
        
        CardText=new JTextField();
        CardText.setBounds(300,150,230,30);
        CardText.setFont(new Font("Aries",Font.BOLD,14));
        add(CardText);
        
        
        JLabel Pin=new JLabel("pin no..");
        Pin.setFont(new Font("Raleway",Font.BOLD,25));
        Pin.setBounds(120,220,150,30);
        add(Pin);
        
        PinText=new JPasswordField();
        PinText.setBounds(300,220,230,30);
        PinText.setFont(new Font("Aries",Font.BOLD,14));
        add(PinText);
        
        
        
        LoginBtn=new JButton("SIGN IN");
        LoginBtn.setBounds(300,300,100,30);
        LoginBtn.setBackground(Color.BLACK);
        LoginBtn.setForeground(Color.WHITE);
        LoginBtn.addActionListener(this);
        add(LoginBtn);
        
        
        ClearBtn=new JButton("CLEAR");
        ClearBtn.setBounds(430,300,100,30);
        ClearBtn.setBackground(Color.BLACK);
        ClearBtn.setForeground(Color.WHITE);
        ClearBtn.addActionListener(this);
        add(ClearBtn);
        
        
        SignUpBtn=new JButton("SIGN UP");
        SignUpBtn.setBounds(300,350,230,30);
        SignUpBtn.setBackground(Color.BLACK);
        SignUpBtn.setForeground(Color.WHITE);
        SignUpBtn.addActionListener(this);
        add(SignUpBtn);
        
        
        
        getContentPane().setBackground(Color.WHITE);

        // setBackgra
        setLayout(null);
        setSize(800,480);
        setVisible(true);
        setLocation(450,200);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        
    }
    public void actionPerformed(ActionEvent e){
        if(e.getSource() == ClearBtn){
           CardText.setText(""); 
           PinText.setText("");
        }else if(e.getSource()== LoginBtn){
            Conn conn =new Conn();
            String cardNumber=CardText.getText();
            String pinNumber=PinText.getText();
            String query="select * from login where CardNumber='"+cardNumber+"'and PinNumber='"+pinNumber+"'";
            try{
                ResultSet rs=conn.s.executeQuery(query);
                if(rs.next()){
                    setVisible(false);
                    new Transaction(pinNumber).setVisible(true);
                }
                else{
                    JOptionPane.showMessageDialog(null,"Incorrect Card Number or Pin");
                }
            } catch(Exception ee){
                System.out.println(ee);
            }
            
         }else if(e.getSource()== SignUpBtn){
             setVisible(false);
             new SignupOne().setVisible(true);
            
           }
        
    }
    
    public static void main(String args[]){
        new Login();
    }
    
}
