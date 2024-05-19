package pkg_quiz_application;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
public class MainInterface extends JFrame implements ActionListener{
    JButton next, back;
    JTextField tfname;
    
    MainInterface(){
        
        setLayout(null);
        
        JPanel c1=new JPanel();
        c1.setBackground(Color.CYAN);
        c1.setBounds(0, 0, 800, 50);
        add(c1);
        
          JLabel heading= new JLabel("Programming Related Codes");
	  heading.setBounds(200, 20, 400, 45);
          heading.setFont(new Font("Lucida Fax",Font.BOLD,24));
          heading.setForeground(Color.BLACK);
          c1.add(heading);
           
          JLabel name= new JLabel("Enter your name");
          name.setBounds(10, 150, 300, 20);
          name.setFont(new Font("Mangolian Baiti",Font.BOLD,18));
          name.setForeground(Color.BLACK);
          add(name);
           
          tfname=new JTextField();
          tfname.setBounds(200, 150, 300, 30);
          tfname.setFont(new Font("Calibri",Font.BOLD,20));
          add(tfname);
          
          JCheckBox j1=new JCheckBox("Accept all Term and Condition");
          j1.setBounds(20, 200, 600, 30);
          j1.setBackground(Color.BLACK);
          j1.setForeground(Color.WHITE);
          add(j1);
		
	 next= new JButton("Term & Condition");
	 next.setBounds(180, 270, 150, 30);
	 next.setBackground(Color.BLACK);
	 next.setForeground(Color.WHITE);
	 next.addActionListener(this);
	 add(next);
	 
	 back= new JButton("Back");
	 back.setBounds(360, 270, 150, 30);
	 back.setBackground(Color.BLACK);
	 back.setForeground(Color.WHITE);
	 back.addActionListener(this);
	 add(back);

        getContentPane().setBackground(new Color(41,176,165));
        setSize(800,700);
        setLocation(200,200);
        setVisible(true);
    }
@Override
public void actionPerformed(ActionEvent e) {
    if(e.getSource()==next) {
        String name= tfname.getText();
        setVisible(false);
       // new Level(name);
        new Condition(name);
        }else if(e.getSource()== back) {
            setVisible(false);
            }				
    }
			
    public static void main(String args[]){
        new MainInterface();
    }
}
