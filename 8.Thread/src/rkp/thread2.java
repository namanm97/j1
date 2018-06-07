package rkp;

import java.util.ArrayList;
import java.util.Scanner;

public class thread2 extends Thread {

	ArrayList<Character> al;
	String word;
	Scanner sc=new Scanner(System.in);
	int v=0,c=0;
	public thread2()
	{
		al=new ArrayList<Character>();
		al.add('a');
		al.add('e');
		al.add('i');
		al.add('o');
		al.add('u');
		
	}
	
	public void run()
	{
		System.out.println("Enter a word");
		word=sc.next();
		for(int i=0;i<word.length();i++)
		{
			char ch=word.charAt(i);
			if(al.contains(ch))
				v++;
			else
				c++;
		}
		System.out.println("\nVowel="+v+"\nCons"+c);
	}
}
