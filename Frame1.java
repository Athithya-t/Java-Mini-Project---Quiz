import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
public class Frame1 implements ActionListener
{
JFrame fr = new JFrame();
JLabel title,instruction1,instruction2,instruction3;
JButton nxtscr;

Frame1()
{
	nxtscr = new JButton("Next");
	nxtscr.setBounds(130, 150, 100, 40);
	nxtscr.addActionListener(this);
	
	title = new JLabel("JAVA QUIZ GAME");
	title.setBounds(50,50,300,30);	
	title.setFont(new Font("Veranda",Font.BOLD,24));
	
	instruction1 = new JLabel("The game consists of 10 questions.");
	instruction1.setBounds(50,100,300,30);
	
	instruction2 = new JLabel("The questions are from 3 sports.");
	instruction2.setBounds(50,115,300,30);
	
	instruction3 = new JLabel("Scores will be recorded and displayed on the LeaderBoard.");
	instruction3.setBounds(50,130,350,30);
	
	fr.setSize(600, 500);
	fr.setVisible(true);
	fr.setLayout(null);
	fr.add(nxtscr);
	fr.add(title);
	fr.add(instruction1);
	fr.add(instruction2);
	fr.add(instruction3);
}
public void actionPerformed(ActionEvent e)
{
	if(e.getSource()==nxtscr) {
		fr.dispose();
		new Frame2();
	}
}
}
