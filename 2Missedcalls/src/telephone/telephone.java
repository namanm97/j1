package telephone;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Scanner;

public class telephone {

	HashMap<Integer,String> mp;
	ArrayList<missedcall> al;
	Scanner sc=new Scanner(System.in);
	public telephone()
	{
		mp=new HashMap<Integer,String>();
		al=new ArrayList<missedcall>(10);
	}
	
	public void filcallerlist(String name,Integer number)
	{
		mp.put(number, name);
	}
	public void filmissedcall(missedcall m)
	{
		if(al.size()<10)
		{
			al.add(m);
		}
		else
		{
			al.remove(0);
			al.add(m);
		}
	}
	public void showmissedcall()
	{
		Iterator<missedcall> li=al.iterator();
		while(li.hasNext())
		{
			missedcall m=li.next();
			System.out.println("Missed call from "+m.number);
			System.out.println("1.DElete this call 2.Next call 3.Show details");
			int ch=sc.nextInt();
			switch(ch)
			{
			case 1:li.remove();
					break;
			case 2:continue;
			case 3:showcalldetail(m);
					break;
			default:System.out.println("Invalid choice");
					break;
			}
		}
	
	}
	public void showcalldetail(missedcall m1)
	{
		if(mp.get(m1.number)!=null)
			System.out.println("Name:"+mp.get(m1.number)+m1);
		else
			System.out.println("Name:"+"Private Caller"+m1);
	}
	public void showallcalldetail()
	{
		Iterator<missedcall> li=al.iterator();
		while(li.hasNext())
		{
			showcalldetail(li.next());
		}
	}
}
