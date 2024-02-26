package busReserv;
import java.util.Scanner;
import java.util.ArrayList;

public class BusDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<Bus> buses=new ArrayList<Bus>();
		ArrayList<Booking>bookings=new ArrayList<Booking>();
		buses.add(new Bus(1,true,45));
		buses.add(new Bus(2,false,48));
		buses.add(new Bus(3,true,50));
		for(Bus b:buses)
		{
			b.displayBusInfo();
		}
		Scanner sc=new Scanner(System.in);
		int userOpt=1;
		while(userOpt==1)
		{
			System.out.println("Enter 1 to book and 2 to exit");
			userOpt=sc.nextInt();
			if(userOpt==1)
			{
				Booking booking=new Booking();
				if(booking.isAvailable(bookings,buses))
				{
					bookings.add(booking);
					System.out.println("Your booking is Confirmed");
					
				}
				else
				{
					System.out.println("Sorry. Bus is full.Try another bus or date");
				}
			}
		}
		
		

	}

}
