
public class Date {
	
	int dd;
	int mm;
	int yy;
	
	public void setDate(int d,int m,int y) {
		dd=d;
		mm=m;
		yy=y;
	}
	
	
	public int getDd() {
		return dd;
	}
	
	public int getMm() {
		return mm;
	}
	
	public int getYy() {
		return yy;
	}
	
	
	
	public void displayDate() {
		System.out.println("Date is :"+dd+","+mm+","+yy);
	}


}
