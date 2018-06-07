package studentpackage;
import java.util.Scanner;

import student.*;
public class registerstudent extends student{
public String name,branch;
public int[][] marks=new int[4][4];
public int[][] credit=new int[4][4];
Scanner sc=new Scanner(System.in);
public registerstudent(String name,String branch) throws creditlimit
{
	this.getdetails(name,branch);
	this.getmarks();
	this.getcredits();
}

@Override
public void getdetails(String name, String branch) {
	// TODO Auto-generated method stub
	this.name=name;
	this.branch=branch;
}

public void getmarks() throws NumberFormatException
{
	System.out.println("Enter students marks semester wise");
	for(int i=0;i<4;i++)
	{
		System.out.println("Enter students marks in sem:-"+(i+1));
		for(int j=0;j<4;j++)
		{
			System.out.println("Subject:-"+(j+1));
			try {
			marks[i][j]=Integer.parseInt(sc.next());
			}
			catch(Exception e)
			{
				System.out.println("NumberFormatException");
			}
		}
	}
}
public void getcredits() throws creditlimit
{
	System.out.println("Enter subject credits semester wise");
	for(int i=0;i<4;i++)
	{	int totalcredit=0;
		System.out.println("Enter subject credit in sem:-"+(i+1));
		for(int j=0;j<4;j++)
		{
			System.out.println("Subject:-"+(j+1));
			credit[i][j]=sc.nextInt();
			totalcredit=totalcredit+credit[i][j];
		}
		if(totalcredit>30)
			throw new creditlimit("Credit limit exceeded");
	}
}

public void display()
{
	System.out.println("\nName:-"+name+"\nbranch"+branch);
}

}
