package rkp;

import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JProgressBar;
import javax.swing.JTextArea;
import javax.swing.JTextField;

public class ProgressBar extends JFrame implements ActionListener{

private static final long serialVersionUID = 5365912754290051188L;
FileInputStream input;
FileOutputStream output;
JButton b1,b2;
JProgressBar pb;
JTextField j1,j2;
JLabel l2,l1;
String d;
ProgressBarThread t;
boolean cancel=true;
public ProgressBar()
{
setSize(500,500);
setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
setVisible(true);
setLayout(new FlowLayout());
l1=new JLabel("Source File:-");
add(l1);
j1=new JTextField(30);
add(j1);
l2=new JLabel("Destination File:-");
add(l2);
j2=new JTextField(30);
add(j2);
b1=new JButton("COPY");
add(b1);
b1.addActionListener(this);
b2=new JButton("STOP");
add(b2);
b2.addActionListener(this);
pb=new JProgressBar();
add(pb);
}

public static void main(String []args)
{
	
		new ProgressBar();
	
}

@Override
public void actionPerformed(ActionEvent e) {
	// TODO Auto-generated method stub
	System.out.println("aradasd");
	if(e.getSource()==b1)
	{	System.out.println("ara111");
		t=new ProgressBarThread(this,j1,j2,pb);
		t.start();
	}
	if(e.getSource()==b2)
	{
		ProgressBarThread.cancel=false;
	}
	
}
}
