package telephone;

public class mainclass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		telephone t=new telephone();
		t.filcallerlist("rupesh0", 1001);
		t.filcallerlist("rupesh1", 1002);
		t.filcallerlist("rupesh2", 1003);
		t.filcallerlist("rupesh3", 1004);
		
		t.filmissedcall(new missedcall(17.5,1001));
		t.filmissedcall(new missedcall(19.5,1000));
		t.filmissedcall(new missedcall(199.5,1009));
		t.filmissedcall(new missedcall(1799.5,1004));
		
		t.showmissedcall();
	}

}
