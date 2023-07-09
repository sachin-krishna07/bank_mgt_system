package bank.management.system;
import javax.swing.*;
import java.awt.*;
import java.util.*;
import com.toedter.calendar.JDateChooser;
import java.awt.event.*;

import static javax.swing.WindowConstants.EXIT_ON_CLOSE;

public class SignupTwo extends JFrame implements ActionListener{
    JTextField Aadhartx , PANtx,Statetx,Countrytx,Pincodetx;
    JButton nextBtn;
    JRadioButton SYes,SNo,EYes,ENo,Other;
    JDateChooser DateChooser;
    JComboBox ReligionChoose,CatagoryChoose,incomeChoose,OccupationChoose,EducationChoose;
    String Formno;
    
    SignupTwo(String Formno){
        setLayout(null);
        this.Formno=Formno;

        
        
        
        JLabel AdditionalDetails=new JLabel("Page 2: Additional Deatils");
        AdditionalDetails.setFont(new Font("Raleway",Font.BOLD,22));
        AdditionalDetails.setBounds(290,80,400,30);
        add(AdditionalDetails);
        
        JLabel Religion=new JLabel("Religion :");
        Religion.setFont(new Font("Raleway",Font.BOLD,20));
        Religion.setBounds(100,140,100,30);
        add(Religion);
        
        String valReligion[]={"Hindu", "Muslim" ,"Sikh","Chrstian","Other"}; 
        ReligionChoose =new JComboBox(valReligion);
        ReligionChoose.setBackground(Color.white);
        ReligionChoose.setFont(new Font("Raleway",Font.BOLD,14));
        ReligionChoose.setBounds(300,140,400,30);
        add(ReligionChoose);
        
        
//       ........................... catagory  ..................
        

        JLabel Catagory=new JLabel("Catagory :");
        Catagory.setFont(new Font("Raleway",Font.BOLD,20));
        Catagory.setBounds(100,190,200,30);
        add(Catagory);
        
        String valCatagory[]={"Genral", "OBC" ,"SC","ST","Other"}; 
        CatagoryChoose = new JComboBox(valCatagory);
        CatagoryChoose.setFont(new Font("Raleway",Font.BOLD,14));
        CatagoryChoose.setBackground(Color.white);
        CatagoryChoose.setBounds(300,190,400,30);
        add(CatagoryChoose);
        
//        ................income ......................
    
        
        JLabel Income=new JLabel("Income :");
        Income.setFont(new Font("Raleway",Font.BOLD,20));
        Income.setBounds(100,240,200,30);
        add(Income);
        
        String valincome[]={"Null", "< 2,50,00" ,"< 2,50,000","< 5,00,000","Upto 10,00,000"}; 
        incomeChoose = new JComboBox( valincome);
        incomeChoose.setFont(new Font("Raleway",Font.BOLD,14));
        incomeChoose.setBackground(Color.white);
        incomeChoose.setBounds(300,240,400,30);
        add(incomeChoose);
        
  //............................  Education .................
  
        JLabel Educational=new JLabel("Educational");
        Educational.setFont(new Font("Raleway",Font.BOLD,20));
        Educational.setBounds(100,290,200,30);
        add(Educational);
        
        JLabel Qulificatio=new JLabel("Qulification :");
        Qulificatio.setFont(new Font("Raleway",Font.BOLD,20));
        Qulificatio.setBounds(100,315,200,30);
        add(Qulificatio);
        
        String valEducation[]={"Non graduaction", "Graduate" ,"Post Graduation","Doctrate","Other"}; 
        EducationChoose = new JComboBox(valEducation);
        EducationChoose.setFont(new Font("Raleway",Font.BOLD,14));
        EducationChoose.setBackground(Color.white);
        EducationChoose.setBounds(300,315,400,30);
        add(EducationChoose);
      
 //     ..................... Occupation..................
 
        JLabel Occupation=new JLabel("Occupation :");
        Occupation.setFont(new Font("Raleway",Font.BOLD,20));
        Occupation.setBounds(100,390,200,30);
        add(Occupation);
        
        String valOccupation[]={"Salaried", "Self Empolyed" ,"Bussiness","Student","Other"}; 
        OccupationChoose = new JComboBox(valOccupation);
        OccupationChoose .setFont(new Font("Raleway",Font.BOLD,14));
        OccupationChoose .setBackground(Color.white);
        OccupationChoose .setBounds(300,390,400,30);
        add(OccupationChoose);

        
        JLabel PAN=new JLabel("PAN Number:");
        PAN.setFont(new Font("Raleway",Font.BOLD,20));
        PAN.setBounds(100,440,200,30);
        add(PAN);
        
        PANtx=new JTextField();
        PANtx.setFont(new Font("Raleway",Font.BOLD,14));
        PANtx.setBounds(300,440,400,30);
        add(PANtx);
        
        JLabel Aadhar=new JLabel("Addhar Number:");
        Aadhar.setFont(new Font("Raleway",Font.BOLD,20));
        Aadhar.setBounds(100,490,200,30);
        add(Aadhar);
        
        Aadhartx=new JTextField();
        Aadhartx.setFont(new Font("Raleway",Font.BOLD,14));
        Aadhartx.setBounds(300,490,400,30);
        add(Aadhartx);
        
        
        JLabel State=new JLabel("Senior Citizen :");
        State.setFont(new Font("Raleway",Font.BOLD,20));
        State.setBounds(100,540,200,30);
        add(State);
        
        SYes= new JRadioButton("Yes");
        SYes.setBounds(300,540,100,30);
        SYes.setBackground(Color.white);
        add(SYes); 
        
        SNo= new JRadioButton("NO");
        SNo.setBounds(400,540,100,30);
        SNo.setBackground(Color.white);
        add(SNo);
        
        ButtonGroup CitizenGroup=new ButtonGroup();
        CitizenGroup.add(SYes);
        CitizenGroup.add(SNo);
        
 //     ................... Exisiting Account ...............
 
        JLabel PinCode=new JLabel("Exisiting Account:");
        PinCode.setFont(new Font("Raleway",Font.BOLD,20));
        PinCode.setBounds(100,590,200,30);
        add(PinCode);
        
        EYes= new JRadioButton("Yes");
        EYes.setBounds(300,590,100,30);
        EYes.setBackground(Color.white);
        add(EYes); 
        
        ENo= new JRadioButton("NO");
        ENo.setBounds(400,590,100,30);
        ENo.setBackground(Color.white);
        add(ENo);
        
        ButtonGroup ExisitingGroup=new ButtonGroup();
        ExisitingGroup.add(EYes);
        ExisitingGroup.add(ENo);
        
        
        JButton NextBtn=new JButton("NEXT");
        NextBtn.setBounds(620,660,100,30);
        NextBtn.setBackground(Color.black);
        NextBtn.setForeground(Color.white);
        NextBtn.setFont(new Font("Raleway",Font.BOLD,14));
        NextBtn.addActionListener(this);
        add(NextBtn);
        
        
        
        
        
        setTitle("NEW ANCCOUNT APPLICATION FORM - PAGE 2");
        getContentPane().setBackground(Color.white);
        setSize(850,800);
        setLocation(350,10);
        setVisible(true);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
    }
    public void actionPerformed(ActionEvent e){
        String Religion=(String) ReligionChoose.getSelectedItem(); // convert into string usning (String)   //called typeCating
        String Catagory=(String) CatagoryChoose.getSelectedItem();
        String Income= (String) incomeChoose.getSelectedItem();
        String Education =(String)EducationChoose.getSelectedItem();
        String Occupation =(String)OccupationChoose.getSelectedItem();
        
        String SeniorCitizen=null;
        if(SYes.isSelected()){
        SeniorCitizen="Yes";
        }
        else if(SNo.isSelected()){
        SeniorCitizen="No";
        }
        
        String ExisitingAccount=null;
        if(EYes.isSelected()){
            ExisitingAccount="Yes";
        }else if(ENo.isSelected()){
            ExisitingAccount="No";
        }
        
        
        String PAN=PANtx.getText();
        String Aadhar=Aadhartx.getText();
       
        try{
                 Conn c=new Conn();
                 String query ="insert into signupTwo values('"+Formno+"','"+Religion+"','"+Catagory+"','"+Income+"','"+Education+"','"+Occupation+"','"+PAN+"','"+Aadhar+"','"+SeniorCitizen+"','"+ExisitingAccount+"')";
                 c.s.executeUpdate(query) ;//DML query..
                 
                 setVisible(false);
                 new SignupThree(Formno).setVisible(true);
                 
        }catch (Exception ee){
             System.out.println(ee);
        }
    }
    
    public static void main(String args[]){
        new SignupTwo("");
    }
}
