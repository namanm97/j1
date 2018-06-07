package student;

import result.*;
import studentpackage.*;
public class MainClass {

	public static void main(String[] args) throws creditlimit, invalidsgpa {
		// TODO Auto-generated method stub
		registerstudent r=new registerstudent("rkp","ise");
		r.display();
		result1 r1=new result1(r);
		r1.calculate();
	}

}
