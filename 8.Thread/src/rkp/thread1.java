package rkp;

import java.util.HashMap;
import java.util.Scanner;

public class thread1 extends Thread {
	
HashMap<Integer,String> mp;
String number;
Scanner sc=new Scanner(System.in);
public thread1()
{
	mp=new HashMap<Integer,String>();
	mp.put(1, "one");
	mp.put(2, "two");
	mp.put(3, "three");
	mp.put(4, "four");
}

public void run()
{
	System.out.println("Enter a number");
	number=sc.next();
	for(int i=0;i<number.length();i++)
	{
		int ch=Integer.parseInt(number.charAt(i)+"");
		System.out.println(ch+"-->"+mp.get(ch));
	}
}
}
