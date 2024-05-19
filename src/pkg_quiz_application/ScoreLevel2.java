
package pkg_quiz_application;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
public class ScoreLevel2 extends JFrame implements ActionListener{
    
    JButton next,submit;
    String name;
    ScoreLevel2(String name,int score){
        this.name=name;
        setLayout(null);
        
        ImageIcon  icon= new ImageIcon(ClassLoader.getSystemResource("icons/score.jpg"));
        Image icon1=icon.getImage().getScaledInstance(300, 250, Image.SCALE_DEFAULT);
        ImageIcon icon3=new ImageIcon(icon1);
        JLabel image=new JLabel(icon3);
        image.setBounds(0, 200, 300,250);
        add(image);
        
        JLabel heading=new JLabel("<html>Thank You " + name +  " for playing Quiz <br> you gain a new and unique lesson !!!</html>");
        heading.setBounds(45,30, 700, 100);
        heading.setFont(new Font("Lucida Fax",Font.BOLD,26));
        add(heading);
        
        JLabel lbscore=new JLabel("Your Gain a Total Score in Quiz are:"+score);
        lbscore.setBounds(300,200, 450, 30);
        lbscore.setFont(new Font("Tahoma",Font.PLAIN,24));
        add(lbscore);
        
        submit= new JButton("Play Again");
        submit.setBounds(380, 270, 120, 30);
        submit.setFont(new Font("Tahoma",Font.PLAIN,16));
        submit.setBackground(Color.BLACK);
	submit.setForeground(Color.WHITE);
	submit.addActionListener(this);
	add(submit);
        
        next= new JButton("Next Page");
	next.setBounds(550, 270, 120, 30);
	next.setFont(new Font("Tahoma",Font.PLAIN,16));
	next.setBackground(Color.BLACK);
	next.setForeground(Color.WHITE);
	next.addActionListener(this);
	add(next);
	       
	       
	       
	setBounds(600,150,750,550);
        getContentPane().setBackground(new Color(41,176,165));
        setVisible(true);	
	     
	    
	       
	}
	@Override
	public void actionPerformed(ActionEvent e) {
		setVisible(false);
		//new Login();
		if(e.getSource()==next){
			//new GameLevel1(name);
		}
		
	}
	public static void main(String[] args) {
		new ScoreLevel2("Users",0);
	}
	

}




