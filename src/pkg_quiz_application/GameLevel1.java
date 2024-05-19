
package pkg_quiz_application;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
public class GameLevel1 extends JFrame implements ActionListener{
    
    String questions[][]=new String[20][5];
    String answers[][]=new String[20][2];
    String useranswers[][]=new String[20][1];
    
    JLabel qno,question;
    JRadioButton opt1,opt2,opt3,opt4;
    ButtonGroup groupoptions;
    JButton next,submit,lifeline;
    
    public static int timer=30;
    public static int ans_given=0;
    public static int count=0;
    public static int score=0;
    
    String name;
    
    GameLevel1(String name){
        this.name=name;
	setBounds(50,0,1440,850);
	getContentPane().setBackground(new Color(41,176,165));
        
	setLayout(null);
       
	ImageIcon  icon= new ImageIcon(ClassLoader.getSystemResource("icons/quiz.jpg"));
	JLabel image=new JLabel(icon);
	image.setBounds(0, 0, 1440, 392);
	add(image);
			
	qno=new JLabel();
	qno.setBounds(100, 450, 50, 30);
	qno.setFont(new Font("Tahoma",Font.PLAIN,24));
	add(qno);
			
	question=new JLabel();
	question.setBounds(150, 450, 900, 30);
	question.setFont(new Font("Tahoma",Font.PLAIN,24));
	add(question);
			
			
	questions[0][0] = "Who invented Java Programming ? ";
	questions[0][1] = "Guido van Rossum";
	questions[0][2] = "James Gosling";
	questions[0][3] = "Dennis Ritchie";
	questions[0][4] = "Bjarne Stroustrup";
			
	questions[1][0] = "Which one of the following is not a Java Feature ? ";
        questions[1][1] = "Use of pointers";
	questions[1][2] = "object-oriented";
	questions[1][3] = "Portable";
	questions[1][4] = "Dynamic & Extensible";
			
	questions[2][0] = "Which of These cannot be used be used for a variable name in java ? ";
	questions[2][1] = "Identifier & keyword";
	questions[2][2] = "Identifier";
	questions[2][3] = "Keyword";
	questions[2][4] = "None Of the above";
			
	questions[3][0] = "what is the Extension of Java code files?";
	questions[3][1] = ".java";
	questions[3][2] = ".txt";
	questions[3][3] = ".class";
        questions[3][4] = ".js";
	      
	questions[4][0] = "Which of the Following is not an OOPs Concept?";
	questions[4][1] = "Polymorphism";
	questions[4][2] = "Encapsulation";
	questions[4][3] = "Compilation";
        questions[4][4] = "Inheritance";

	questions[5][0] = "Which Exception is thrown when java is out of memory?";
        questions[5][1] = "Memory Error";
	questions[5][2] = "Out of Memory Error";
	questions[5][3] = "Memory Out of Bounds Exception";
	questions[5][4] = "MemoryFull Exception";

	questions[6][0] = "Which of these packages contains the exception Stack Overflow in java ?";
	questions[6][1] = "java.io";
	questions[6][2] = "java.system";
	questions[6][3] = "java.lang";
	questions[6][4] = "java.util";

	questions[7][0] = "Which of these keyword are used for the block to be examined for exceptions ?";
	questions[7][1] = "check";
	questions[7][2] = "throw";
	questions[7][3] = "try";
	questions[7][4] = "catch";

	questions[8][0] = "Which one of the following is not access Modifier in java?";
	questions[8][1] = "Protected";
	questions[8][2] = "Void";
	questions[8][3] = "Public";
	questions[8][4] = "Private";

	questions[9][0] = "Which class provides system independent server side implementation";
	questions[9][1] = "Server";
	questions[9][2] = "ServerReader";
	questions[9][3] = "Socket";
	questions[9][4] = "ServerSocket";

	questions[10][0] = "Which of the below is not a java Profiler ? ";
        questions[10][1] = "JProfiler";
        questions[10][2] = "Eclipse Profiler";
        questions[10][3] = "JVM";
        questions[10][4] = "Jconsole";
			
        questions[11][0] = "Which of the following is a superclass of every class in java? ";
        questions[11][1] = "ArrayList";
	questions[11][2] = "Abstract class";
	questions[11][3] = "Object Class";
	questions[11][4] = "String";
			
	questions[12][0] = "Which of these are selection statements in java. ? ";
	questions[12][1] = "break";
	questions[12][2] = "Continue";
	questions[12][3] = "For()";
	questions[12][4] = "If()";
			
        questions[13][0] = "What is the Full Form of DBMS? ";
        questions[13][1] = "Data base Management System";
	questions[13][2] = "Database Management Service";
	questions[13][3] = "Data Backup Management System";
	questions[13][4] = "Data of Binary Managemnet System";
				
	questions[14][0] = "What is DBMS?";
	questions[14][1] = "DBMS is a collection of queries";
	questions[14][2] = "DBMS is a high-level language";
	questions[14][3] = "DBMS is a programming language";
	questions[14][4] = "DBMS stores,modifies and retrieves data";
				
	questions[15][0] = "Who created the first DBMS. ? ";
	questions[15][1] = "Edgar Frank Codd";
	questions[15][2] = "Charles Babbage";
	questions[15][3] = "Charles Bachman ";
	questions[15][4] = "Sharon B.Codd";
			
	questions[16][0] = "What is SQl? ";
        questions[16][1] = "Structure Query Language";
	questions[16][2] = "Stand Query Language";
	questions[16][3] = "System Query Language";
	questions[16][4] = "All of the Above";
				
        questions[17][0] = "Which of the Following is not a typeof database? ";
        questions[17][1] = "Hierarchical";
	questions[17][2] = "Network";
	questions[17][3] = "Distributed";
	questions[17][4] = "Decentralized";
				
	questions[18][0] = "which of the following is not an example of DBMS? ";
	questions[18][1] = "MySQL";
	questions[18][2] = "Microsoft Acess";
        questions[18][3] = "IBM DB2";
	questions[18][4] = "Google";
			
	questions[19][0] = "Which of the Following is a component of DBMS? ";
	questions[19][1] = "Storing data";
	questions[19][2] = "Data integrity";
	questions[19][3] = "Providing multi-users access control";
	questions[19][4] = "all of the above";

	        answers[0][1] = "James Gosling";
	        answers[1][1] ="Use of pointers";
	        answers[2][1] = "Keyword";
	        answers[3][1] = ".java";
	        answers[4][1] = "Compilation";
	        answers[5][1] = "Out of Memory Error";
	        answers[6][1] = "java.lang";
	        answers[7][1] = "try";
	        answers[8][1] = "Void";
	        answers[9][1] = "ServerSocket";
	        answers[10][1]="JVM";
	        answers[11][1] = "Object Class";
	        answers[12][1] ="If()";
	        answers[13][1] ="Data base Management System";
	        answers[14][1] ="DBMS stores,modifies and retrieves data";
	        answers[15][1] ="Charles Bachman";
	        answers[16][1] ="Structure Query Language";
	        answers[17][1] ="Decentralized";
	        answers[18][1] ="Google";
	        answers[19][1] ="all of the above";
			
			
	opt1=new  JRadioButton();
	opt1.setBounds(170, 520, 700, 30);
	opt1.setBackground(new Color(41,176,165));
	opt1.setFont(new Font("Dialog",Font.PLAIN,20));
	add(opt1);
	        
	        opt2=new  JRadioButton();
	        opt2.setBounds(170, 560, 700, 30);
	        opt2.setBackground(new Color(41,176,165));
	        opt2.setFont(new Font("Dialog",Font.PLAIN,20));
	        add(opt2);
	        
	opt3=new  JRadioButton();
	opt3.setBounds(170, 600, 700, 30);
	opt3.setBackground(new Color(41,176,165));
	opt3.setFont(new Font("Dialog",Font.PLAIN,20));
	add(opt3);
	        
	        opt4=new  JRadioButton();
	        opt4.setBounds(170, 640, 700, 30);
	        opt4.setBackground(new Color(41,176,165));
	        opt4.setFont(new Font("Dialog",Font.PLAIN,20));
	        add(opt4);
	        
	groupoptions= new ButtonGroup();
	groupoptions.add(opt1);
	groupoptions.add(opt2);
	groupoptions.add(opt3);
	groupoptions.add(opt4);
	        
	        next= new JButton("Next");
	        next.setBounds(1100, 550, 200, 40);
	        next.setFont(new Font("Tahoma",Font.PLAIN,22));
	        next.setBackground(Color.BLACK);
	        next.setForeground(Color.WHITE);
	        next.addActionListener(this);
	        add(next);
	        
	        lifeline= new JButton("50-50 Lifeline");
	        lifeline.setBounds(1100, 630, 200, 40);
	        lifeline.setFont(new Font("Tahoma",Font.PLAIN,22));
	        lifeline.setBackground(Color.BLACK);
	        lifeline.setForeground(Color.WHITE);
	        lifeline.addActionListener(this);
	        add(lifeline);
	        
	        submit= new JButton("Submit");
	        submit.setBounds(1100, 710, 200, 40);
	        submit.setFont(new Font("Tahoma",Font.PLAIN,22));
	        submit.setBackground(Color.BLACK);
	        submit.setForeground(Color.WHITE);
	        submit.addActionListener(this);
	        submit.setEnabled(false);
	        add(submit);
	        
	        start(count);
	        
			setVisible(true);
			
		}
		
@Override
public void actionPerformed(ActionEvent e) {
    if(e.getSource()==next) {
	repaint();
	opt1.setEnabled(true);
	opt2.setEnabled(true);
	opt3.setEnabled(true);
	opt4.setEnabled(true);
				
				
				
	ans_given=1;
        if(groupoptions.getSelection()==null) {
	 useranswers[count][0]="";
	}else {
	useranswers[count][0]=groupoptions.getSelection().getActionCommand();
	}
	if(count==18) {
	next.setEnabled(false);
	submit.setEnabled(true);
	}
	count++;
	start(count);
	}else if(e.getSource()==lifeline) {
	if(count==2 || count== 4 || count==6 ||count ==8 || count==9) {
	opt2.setEnabled(false);
	opt3.setEnabled(false);
	}else {
	opt1.setEnabled(false);
	opt4.setEnabled(false);
	}
	lifeline.setEnabled(false);
	}else if(e.getSource()==submit){
	ans_given=1;
	if(groupoptions.getSelection()==null) {
        useranswers[count][0]="";
        }else {
	useranswers[count][0]=groupoptions.getSelection().getActionCommand();
					
	}
	for(int i=0; i<useranswers.length; i++) {
        if(useranswers[i][0].equals(answers[i][1])) {
	score+=3;
						
	}else {
            score=-1;
	}
	}
	setVisible(false);
	new ScoreLevel2(name,score);
        }		
	}
		
		
public void paint(Graphics g) {
    super.paint(g);
    String time="Time left - "+ timer +"seconds";//30
    g.setColor(Color.RED);
    g.setFont(new Font("Tahoma",Font.BOLD,25));
    if(timer>0) {
         g.drawString(time, 1100, 500);
			
    
    }else {
     g.drawString("Times up!!", 1100, 500);
    }
     timer--;
     try {
     Thread.sleep(1000);
     repaint();
     }catch(Exception e) {
     e.printStackTrace();
    }
     if(ans_given==1) {
	ans_given=0;
	timer=30;
    }else if(timer<0) {
	timer=30;
	opt1.setEnabled(true);
        opt2.setEnabled(true);
	opt3.setEnabled(true);
	opt4.setEnabled(true);
    if(count==18) {
     next.setEnabled(false);
     submit.setEnabled(true);
     }
     if(count==19) {
        if(groupoptions.getSelection()==null) {
	    useranswers[count][0]="";
	}else {
	useranswers[count][0]=groupoptions.getSelection().getActionCommand();
	}
					
					
    for(int i=0; i<useranswers.length; i++) {
        if(useranswers[i][0].equals(answers[i][1])) {
	     score+=3;
	      }else {
	     score=-1;
	}
	}
	setVisible(false);
	new ScoreLevel2(name,score);
	}else {
	if(groupoptions.getSelection()==null) {
	useranswers[count][0]="";
	}else {
	useranswers[count][0]=groupoptions.getSelection().getActionCommand();
	}
	count++;//0//1
	start(count);
	}
	}
			
    }
    public void start(int count) {
	qno.setText(""+(count+1) +". ");
	question.setText(questions[count][0]);
        opt1.setText(questions[count][1]);
	opt1.setActionCommand(questions[count][1]);
			
	opt2.setText(questions[count][2]);
	opt2.setActionCommand(questions[count][2]);
			
	opt3.setText(questions[count][3]);
	opt3.setActionCommand(questions[count][3]);
			
	opt4.setText(questions[count][4]);
	opt4.setActionCommand(questions[count][4]);
			
	groupoptions.clearSelection();
	}
			
    public static void main(String[] args) {
	new GameLevel1("Users");
}
  }
