package pkg_quiz_application;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
public class Level extends JFrame implements ActionListener{
    String name;
    JButton level1,level2,level3,level4,level5,level6,level7,level8,level9,level10;
    
    Level(String name){
        this.name=name;
        setLayout(null);
        
        JPanel p1=new JPanel();
        p1.setBounds(0, 0, 800, 80);
        p1.setBackground(Color.LIGHT_GRAY);
        add(p1);
        
        JLabel heading=new JLabel("<html> Hello!! <br>  select The Level You Want To play !!!</html> ");
        heading.setBounds(45,30, 700, 80);
        heading.setFont(new Font("Lucida Fax",Font.BOLD,26));
        heading.setForeground(Color.BLACK);
        p1.add(heading);
        
        level1=new JButton("1");
        level1.setBounds(40, 150, 50, 30);
        level1.setBackground(new Color(41,176,165));
        level1.setForeground(Color.BLACK);
        level1.addActionListener(this);
        level1.setFont(new Font("Tohma",Font.BOLD,22));
        add(level1);
        
        level2=new JButton("2");
        level2.setBounds(100, 150, 50, 30);
        level2.setBackground(new Color(41,176,165));
        level2.setForeground(Color.BLACK);
        level2.addActionListener(this);
        level2.setFont(new Font("Tohma",Font.BOLD,22));
        add(level2);
        
        level3=new JButton("3");
        level3.setBounds(160, 150, 50, 30);
        level3.setBackground(new Color(41,176,165));
        level3.setForeground(Color.BLACK);
        level3.setFont(new Font("Tohma",Font.BOLD,22));
        level3.addActionListener(this);
        add(level3);
        
        level4=new JButton("4");
        level4.setBounds(220, 150, 50, 30);
        level4.setBackground(new Color(41,176,165));
        level4.setForeground(Color.BLACK);
        level4.setFont(new Font("Tohma",Font.BOLD,22));
        level4.addActionListener(this);
        add(level4);
        
        level5=new JButton("5");
        level5.setBounds(280, 150, 50, 30);
        level5.setBackground(new Color(41,176,165));
        level5.setForeground(Color.BLACK);
        level5.setFont(new Font("Tohma",Font.BOLD,22));
        level5.addActionListener(this);
        add(level5);
        
        level6=new JButton("6");
        level6.setBounds(40, 200, 50, 30);
        level6.setBackground(new Color(41,176,165));
        level6.setForeground(Color.BLACK);
        level6.setFont(new Font("Tohma",Font.BOLD,22));
        level6.addActionListener(this);
        add(level6);
        
        level7=new JButton("7");
        level7.setBounds(100, 200, 50, 30);
        level7.setBackground(new Color(41,176,165));
        level7.setForeground(Color.BLACK);
        level7.setFont(new Font("Tohma",Font.BOLD,22));
        level7.addActionListener(this);
        add(level7);
        
        level8=new JButton("8");
        level8.setBounds(160, 200, 50, 30);
        level8.setBackground(new Color(41,176,165));
        level8.setForeground(Color.BLACK);
        level8.setFont(new Font("Tohma",Font.BOLD,22));
        level8.addActionListener(this);
        add(level8);
        level9=new JButton("9");
        level9.setBounds(220, 200, 50, 30);
        level9.setBackground(new Color(41,176,165));
        level9.setForeground(Color.BLACK);
        level9.setFont(new Font("Tohma",Font.BOLD,22));
        level9.addActionListener(this);
        add(level9);
        
        level10=new JButton("10");
        level10.setBounds(280, 200, 60, 30);
        level10.setBackground(new Color(41,176,165));
        level10.setForeground(Color.BLACK);
        level10.setFont(new Font("Tohma",Font.BOLD,22));
        level10.addActionListener(this);
        add(level10);
        
        JLabel msg=new JLabel("<html>I hope you learn awesome knowledge of Quiz</html>");
        msg.setBounds(0, 280, 800, 100);
        msg.setForeground(Color.BLACK);
        msg.setFont(new Font("Lucida Fax",Font.BOLD,22));
        add(msg);
       
        
        
        
        getContentPane().setBackground(new Color(41,176,165));
        setSize(800,700);
        setLocation(200,200);
        setVisible(true);
    }
    @Override
    public void actionPerformed(ActionEvent ae){
        if(ae.getSource()==level1){
             setVisible(false);
            new Game(name);
           
            
        }else{
            setVisible(false);
            new MainInterface();
        
    }
    }
   
    public static void main(String args[]){
        new Level("user");
    }
    
}
