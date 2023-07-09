
package bank.management.system;
import java.awt.*;
import javax.swing.*;
import java.awt.event.*;


public class PinChange extends JFrame implements ActionListener{
        JButton changeBtn,backBtn;
        JPasswordField RetextPin,textPin;
        String pinNumber;
    PinChange(String pinNumber){
        this.pinNumber=pinNumber;
        
        ImageIcon img=new ImageIcon(ClassLoader.getSystemResource("icons/atm.jpg"));
        Image img2=img.getImage().getScaledInstance(900, 900, Image.SCALE_DEFAULT);
        ImageIcon img3=new ImageIcon(img2);
        JLabel image=new JLabel(img3);
        image.setBounds(0,0,900,900);
        add(image);
        
        JLabel text =new JLabel("Change your PIN");
        text.setBounds(270,260,700,35);
        text.setForeground(Color.white);
        text.setFont(new Font("System",Font.BOLD,16));
        image.add(text); // i
        
        JLabel Pin =new JLabel("New PIN");
        Pin.setBounds(165,320,180,25);
        Pin.setForeground(Color.white);
        Pin.setFont(new Font("System",Font.BOLD,14));
        image.add(Pin); // 
        
        
        textPin=new JPasswordField ();
        textPin.setBounds(300,320,180,25);
        textPin.setFont(new Font("Raleway",Font.BOLD,20));
        image.add(textPin);
        
        
        JLabel RePin =new JLabel("Re-PIN");
        RePin.setBounds(165,360,180,25);
        RePin.setForeground(Color.white);
        RePin.setFont(new Font("System",Font.BOLD,14));
        image.add(RePin); 
        
        RetextPin=new JPasswordField ();
        RetextPin.setBounds(300,360,180,25);
       RetextPin.setFont(new Font("Raleway",Font.BOLD,20));
        image.add(RetextPin);
        
        
        changeBtn=new JButton("Change");
        changeBtn.setBounds(355,455,150,30);
        changeBtn.addActionListener(this);
        image.add(changeBtn);
        
        
        backBtn=new JButton("< Back");
        backBtn.setBounds(355,490,150,30);
        backBtn.addActionListener(this);
        image.add(backBtn);
        
        setSize(900,900);
        setVisible(true);
        setLayout(null);
        setLocation(300,0);
//        setUndecora?
        setVisible(true);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
    }
    
     public void actionPerformed(ActionEvent ee){
        if(ee.getSource()==changeBtn){
          
            try{
                  String nPin=textPin.getText();
                String rPin=RetextPin.getText();
                if(!nPin.equals(rPin)){
                    JOptionPane.showMessageDialog(null,"Enter Pin does not matched...");
                    return;
                }
                
                
               Conn conn=new Conn();
               String query1 ="update bank set PinNumber='"+rPin+"' where PinNumber='"+pinNumber+"'";
               String query2 ="update login set PinNumber='"+rPin+"' where PinNumber='"+pinNumber+"'";
               String query3 ="update signupthree set PinNumber='"+rPin+"' where PinNumber='"+pinNumber+"'";
               
               conn.s.executeUpdate(query1);
               conn.s.executeUpdate(query2);
               conn.s.executeUpdate(query3);
               JOptionPane.showMessageDialog(null,"Pin changed Successfuly..");
               
               setVisible(false);
               new Transaction(rPin).setVisible(true);

            }catch(Exception e){
                System.out.println(e);
                
            }
          
        }
        else{
            setVisible(false);
            new Transaction(pinNumber).setVisible(true);
        }
    }
    public static void main(String args[]){
       new PinChange("");
    }

}