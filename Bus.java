package busReserv;

public class Bus {
	private int busNo;
	private boolean ac;
	private int capacity;
	Bus(int no,boolean ac, int cap)
	{
		this.busNo=no;
		this.ac=ac;
	    this.capacity=cap;
	}
	public boolean isAc() {
		return ac;
	}
	public int getcapacity() {
		return capacity;
	}
	public void setAc(boolean val)
	{
		ac=val;
	}
	public void setcapacity(int cap)
	{
		capacity=cap;
	}
	public void displayBusInfo() {
		System.out.println("BusNo:"+ busNo + " Ac:" + ac + " Total capacity:" + capacity);
	}
	public int getBusNo() {
		// TODO Auto-generated method stub
		return busNo;
	}
}
