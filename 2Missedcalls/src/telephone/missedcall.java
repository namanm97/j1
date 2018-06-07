package telephone;

public class missedcall {

	double time;
	int number;
	
	public missedcall(double time,int number)
	{
		this.time=time;
		this.number=number;
	}
	
	public String toString()
	{
		return "\time:"+time+"\nnumber:"+number;
	}
}
