package result;
import student.*;
import studentpackage.*;
public class result1 {
float[] sgpa=new float[4];
int tgp=0;
int tc=0;
int ttgp=0;
int ttc=0;
float cgpa;
registerstudent rs;

public result1(registerstudent rs) throws invalidsgpa
{
	this.rs=rs;
	this.calculate();
}

public void calculate() throws invalidsgpa
{
	for(int i=0;i<4;i++)
	{
		for(int j=0;j<4;j++)
		{
			if(rs.marks[i][j]>=100)
			{
				tgp=tgp+(20*rs.credit[i][j]);
				tc=tc+rs.credit[i][j];	
				System.out.println("Grade in subject"+(j+1)+"Invalid marks");
			}
			else if(rs.marks[i][j]>=90 && rs.marks[i][j]<100)
			{
				tgp=tgp+(10*rs.credit[i][j]);
				tc=tc+rs.credit[i][j];	
				System.out.println("Grade in subject"+(j+1)+"S");
			}
			else if(rs.marks[i][j]>=75 && rs.marks[i][j]<90)
			{	tgp=tgp+(9*rs.credit[i][j]);
				tc=tc+rs.credit[i][j];
				System.out.println("Grade in subject"+(j+1)+"A");
			}
			else if(rs.marks[i][j]>=60 && rs.marks[i][j]<75)
			{	tgp=tgp+(8*rs.credit[i][j]);
				tc=tc+rs.credit[i][j];
				System.out.println("Grade in subject"+(j+1)+"B");
			}
			else if(rs.marks[i][j]>=50 && rs.marks[i][j]<60)
			{	tgp=tgp+(7*rs.credit[i][j]);
				tc=tc+rs.credit[i][j];
				System.out.println("Grade in subject"+(j+1)+"C");
			}
			else if(rs.marks[i][j]>=40 && rs.marks[i][j]<50)
			{	tgp=tgp+(6*rs.credit[i][j]);
				tc=tc+rs.credit[i][j];
				System.out.println("Grade in subject"+(j+1)+"D");
			}
			else
			{
				System.out.println("Grade in subject"+(j+1)+"F");
			}
			
		}
		sgpa[i]=tgp/tc;
		ttgp=ttgp+tgp;
		ttc=ttc+tc;
		if(sgpa[i]>10)
			throw new invalidsgpa("SGPA FOUND TO BE MORE THAN 10");
		System.out.printf("SGPA = %.2f \n",sgpa[i]);
	}
	cgpa=ttgp/ttc;
	System.out.printf("CGPA = %.2f \n",cgpa);
}
}
