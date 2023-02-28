import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.IOException;

import javax.swing.*;
public class Frame3 implements ActionListener {
	JFrame fr;
	JLabel choosesport;
	JButton tennisbutton,cricketbutton,footballbutton;
	 Frame3(){
		 fr = new JFrame();
		 choosesport = new JLabel("Choose Sport");
		 choosesport.setBounds(50, 100, 200, 30);
		 choosesport.setHorizontalAlignment(SwingConstants.CENTER);
		 choosesport.setFont(new Font("Veranda",Font.BOLD,24));
		 
		 tennisbutton = new JButton("Tennis");
		 tennisbutton.setBounds(50,200,100,30);
		 tennisbutton.addActionListener(this);
		 
		 cricketbutton = new JButton("Cricket");
		 cricketbutton.setBounds(50,250,100,30);
		 cricketbutton.setHorizontalAlignment(JButton.CENTER);
		 cricketbutton.setVerticalAlignment(JButton.CENTER);
		 
		 footballbutton = new JButton("Football");
		 footballbutton.setBounds(50,300,100,30);
		 
		 fr.setSize(600, 500);
		 fr.setVisible(true);
		 fr.setLayout(null);
		 fr.add(choosesport);
		 fr.add(cricketbutton);
		 fr.add(tennisbutton);
		 fr.add(footballbutton);
	 }
	 public void actionPerformed(ActionEvent e) {
			if(e.getSource()==tennisbutton) {
				fr.dispose();
				try {
					new Frame4();
				} catch (IOException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}
			}
		}
}
