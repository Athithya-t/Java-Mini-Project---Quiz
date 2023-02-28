import java.awt.Font;
import javax.swing.*;
import java.awt.event.*;
import java.io.IOException;
public class Frame2 implements ActionListener{
	JLabel namelabel;
	JTextField namefield;
	JButton Continue;
	JFrame fr;
	
	Frame2(){  
		fr=new JFrame();
		namelabel = new JLabel("User Name");
		namelabel.setBounds(50,50,130,50);
		namelabel.setFont(new Font("Veranda",Font.BOLD,18));
		
		namefield = new JTextField();
		namefield.setBounds(200,70,100,25);
		
		Continue = new JButton("Continue");
		Continue.setBounds(150, 100, 130, 50);
		Continue.addActionListener(this);
		
		fr.add(namelabel);
		fr.add(namefield);
		fr.add(Continue);
		fr.setSize(600,500);  
		fr.setLayout(null);  
		fr.setVisible(true); 
		}  
public void actionPerformed(ActionEvent e) {
	if(e.getSource()==Continue) {
		fr.dispose();
		new Sample("Java Quiz");
	}
}}

