package pkg_quiz_application;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
public class Condition extends JFrame implements ActionListener{

	String name;
	JButton start, back;
        
	
	Condition(String name){
            setLayout(null);
            
            JLabel heading= new JLabel("Welcome "+ name +" For Quiz ");
            heading.setBounds(50, 20, 700, 30);
            heading.setFont(new Font("Lucida Fax",Font.BOLD,28));
            heading.setForeground(Color.BLACK);
            add(heading);
            
            JLabel rules= new JLabel();
            rules.setBounds(20, 90, 700, 350);
	    rules.setFont(new Font("Tahoma",Font.PLAIN,16));
	    rules.setText(
                    "<html>"+
                            
                            "1. You are trained to be a programmer and not a story teller, answer point to point" + "<br><br>" +
			    "2. Do not unnecessarily smile at the person sitting next to you, they may also not know the answer" + "<br><br>" +
			    "3. You may have lot of options in life but here all the questions are compulsory" + "<br><br>" +
			    "4. Crying is allowed but please do so quietly." + "<br><br>" +
			    "5. Only a fool asks and a wise answers (Be wise, not otherwise)" + "<br><br>" +
			     "6. Do not get nervous if your friend is answering more questions, may be he/she is doing Jai Mata Di" + "<br><br>" +
			     "7. Brace yourself, this paper is not for the faint hearted" + "<br><br>" +
			    "8. May you know more than what John Snow knows, Good Luck" + "<br><br>" +
			"<html>"  
                    );
            
	   add(rules);
           
           start= new JButton("Play");
	   start.setBounds(250, 500, 100, 30);
           start.setBackground(Color.BLACK);
           start.setForeground(Color.WHITE);
           start.addActionListener(this);
           add(start);
           
            back= new JButton("Back");
            back.setBounds(400, 500, 100, 30);
            back.setBackground(Color.BLACK);
            back.setForeground(Color.WHITE);
            back.addActionListener(this);
            add(back);
            
            
			
			
	   getContentPane().setBackground(new Color(41,175,165));
	   setSize(800,650);
	   setLocation(350,100);
	   setVisible(true);
		
	}
        
	@Override
	public void actionPerformed(ActionEvent e) {
		if(e.getSource()==start) {
			setVisible(false);
			new Level(name);
		}else {
			setVisible(false);
			//new Login();
		}
		
        }
	public static void main(String[] args) {
		new Condition("User");
	

}
  
}
