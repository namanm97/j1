package rkp;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

import javax.swing.JFrame;
import javax.swing.JProgressBar;
import javax.swing.JTextField;

public class ProgressBarThread extends Thread {

	JFrame j;
	JTextField jt1,jt2;
	JProgressBar pb;
	public static boolean cancel=true;
	public ProgressBarThread(JFrame j,JTextField j1,JTextField j2,JProgressBar p)
	{
		this.j=j;
		this.jt1=j1;
		this.jt2=j2;
		this.pb=p;
	}
	public void run()
	{
		String src=jt1.getText();
		String des=jt2.getText();
		System.out.println("ara");
		
		try {
			System.out.println("ara2");
			FileInputStream input=new FileInputStream(new File(src));
			FileOutputStream output=new FileOutputStream(new File(des));
			byte buffer[]=new byte[5];
			BufferedInputStream in=new BufferedInputStream(input);
			BufferedOutputStream out=new BufferedOutputStream(output);
			int length;
			pb.setStringPainted(true);
			//pb.setIndeterminate(true);
			pb.setVisible(true);
			pb.setValue(0);
			pb.setMaximum(100);
			long filesize=in.available();
			long bytesread=0;
			int copyprogress=0;
			pb.setStringPainted(true);
			//pb.setString("COPYING.....");
			while((length=in.read(buffer,0,buffer.length))!=-1)
			{	System.out.println("ara3");
				out.write(buffer,0,length);
				bytesread=bytesread+length;
				sleep(1);
				copyprogress=(int)((bytesread*100.0)/filesize);
				pb.setValue(copyprogress);
				if(cancel==false)
					return;
			}
		} catch (FileNotFoundException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		} catch (IOException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} 
		
	}

	}
