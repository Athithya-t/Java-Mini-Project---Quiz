import java.awt.*; 
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;

import org.apache.poi.openxml4j.exceptions.InvalidFormatException;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

import java.awt.event.*;
import java.io.IOException;
import java.util.Arrays;

import javax.swing.*;    
class Main extends JFrame implements ActionListener
{  
    JLabel l; 
    JRadioButton jb[]=new JRadioButton[5];  
    JButton b1,b2;  
    ButtonGroup bg = new ButtonGroup();  
    int count=0,current=0,x=1,y=1,now=0;  
    int m[]=new int[10];      
    Main(String s)  
    {  
        super(s);  
        l=new JLabel();  
        add(l);    
        for(int i=0;i<5;i++)  
        {  
            jb[i]=new JRadioButton();     
            add(jb[i]);  
            bg.add(jb[i]);  
        }  
        b1=new JButton("Previous");  
        b2=new JButton("Next");  
        b1.addActionListener(this);  
        b2.addActionListener(this);  
        add(b1);add(b2);  
        try {
        set();}catch(Exception e) {e.printStackTrace();}  
        l.setBounds(30,40,450,20);  
        jb[0].setBounds(50,80, 1000,20);  
        jb[1].setBounds(50,110,1000,20);  
        jb[2].setBounds(50,140,1000,20);  
        jb[3].setBounds(50,170,1000,20);  
        b1.setBounds(100,240,100,30);  
        b2.setBounds(270,240,100,30);  
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);  
        setLayout(null);  
        setLocation(250,100);  
        setVisible(true);  
        setSize(600,350);  
    }  
    public void actionPerformed(ActionEvent e)  
    {  
        if(e.getSource()==b2)  
        {  
            try {
				if(check(e))  
				    count=count+1;
			} catch (IOException e2) {
				e2.printStackTrace();
			}  
            	current++;  
            try {
				set();
			} catch (IOException e1) {
				e1.printStackTrace();
			}    
            if(current==9)  
            {  
                b1.setEnabled(false);  
                b2.setText("Result");  
            }  
        }  
        if(e.getActionCommand().equals("Previous"))  
        {     
            x++;  
            current--;  
            try {
				set();
			} catch (IOException e1) {
				e1.printStackTrace();
			}    
            if(current==9)  
                b2.setText("Result");  
            setVisible(false);  
            setVisible(true);  
        }  
        if(e.getActionCommand().equals("Result"))  
        {  
            try {
				if(check(e)) {  
				    count=count+1;}
			} catch (IOException e1) {
				e1.printStackTrace();
			}  
            current++;    
            JOptionPane.showMessageDialog(this,"correct ans="+count);  
        }  
    }  
    void set() throws IOException  
    {  
    	Frame4 f = new Frame4();
        jb[4].setSelected(true); 
        if(current==0)  
        {  
            l.setText(f.questions[current][0]);  
            for(int i=0;i<4;i++) {
            	jb[i].setText(f.questions[current][i+1]);
            	jb[i].setActionCommand(f.questions[current][i+1]);
            }
        }  
        if(current==1)  
        {  
        	l.setText(f.questions[current][0]);  
            for(int i=0;i<4;i++) {
            	jb[i].setText(f.questions[current][i+1]);
            	jb[i].setActionCommand(f.questions[current][i+1]);}}
        if(current==2)  
        {  
        	l.setText(f.questions[current][0]);  
            for(int i=0;i<4;i++) {
            	jb[i].setText(f.questions[current][i+1]);
            	jb[i].setActionCommand(f.questions[current][i+1]);}
        }if(current==3)  
        {  
        	l.setText(f.questions[current][0]);  
            for(int i=0;i<4;i++) {
            	jb[i].setText(f.questions[current][i+1]);
            	jb[i].setActionCommand(f.questions[current][i+1]);}
        }if(current==4)  
        {  
        	l.setText(f.questions[current][0]);  
            for(int i=0;i<4;i++) {
            	jb[i].setText(f.questions[current][i+1]);
            	jb[i].setActionCommand(f.questions[current][i+1]);
        }}if(current==5)  
        {  
        	l.setText(f.questions[current][0]);  
            for(int i=0;i<4;i++) {
            	jb[i].setText(f.questions[current][i+1]);
            	jb[i].setActionCommand(f.questions[current][i+1]);
        }}if(current==6)  
        {  
        	l.setText(f.questions[current][0]);  
            for(int i=0;i<4;i++) {
            	jb[i].setText(f.questions[current][i+1]);
            	jb[i].setActionCommand(f.questions[current][i+1]);
        }}if(current==7)  
        {  
        	l.setText(f.questions[current][0]);  
            for(int i=0;i<4;i++) {
            	jb[i].setText(f.questions[current][i+1]);
            	jb[i].setActionCommand(f.questions[current][i+1]);
        }}if(current==8)  
        {  
        	l.setText(f.questions[current][0]);  
            for(int i=0;i<4;i++) {
            	jb[i].setText(f.questions[current][i+1]);
            	jb[i].setActionCommand(f.questions[current][i+1]);
        }}if(current==9)  
        {  
        	l.setText(f.questions[current][0]);  
            for(int i=0;i<4;i++) {
            	jb[i].setText(f.questions[current][i+1]);
            	jb[i].setActionCommand(f.questions[current][i+1]);
            }}l.setBounds(30,40,450,20);  
        for(int i=0,j=0;i<=90;i+=30,j++)  
            jb[j].setBounds(50,80+i,200,20);  
    }  
    boolean check(ActionEvent e) throws IOException  
    {  
    	Frame4 f = new Frame4();
    	for(int current1 = 0;current1<9;current1++) {
    			if(e.getActionCommand().equals("Next")) {
    				if(bg.getSelection().getActionCommand().equals(f.questions[current1][5]))
    				{System.out.println(bg.getSelection().getActionCommand());
    				return true;}
    			}
    	}
    	return false;
       
    }  
    public static void main(String args[]) throws IOException  
    {  
        new Frame1(); 
    }  
}  