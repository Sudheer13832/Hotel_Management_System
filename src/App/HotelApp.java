package App;
import java.util.Scanner;

import Service.HotelService;
import Serviceimpl.HotelServiceImpl;

public class HotelApp 
{
	public static void main(String[] args) 
	{
		Scanner ip=new Scanner(System.in);
		HotelService h1=new HotelServiceImpl();
		System.out.println("----- WELCOME TO HOTEL MANAGEMENT SYSTEM -----");
		while(true)
		{
			System.out.println("--------------- MENU ---------------");
			System.out.println("1.Room Details\n2.Available Rooms");
			System.out.println("3.Allocate Rooms\n4.Checkout\n5.findAllCustomer\n6.getCustomerById\n7.5Exit");
			System.out.println("Enter your option :-");
			int op=ip.nextInt();
			switch(op)
			{
			case 1:
				h1.roomInfo();
				break;
			case 2:
				h1.AvailableRoom();
				break;
			case 3:
				h1.AllocateRoom();
				break;
			case 4:
				h1.Checkout();
				break;
			case 5:
				h1.findAllCustomer();
				break;
			case 6:
				h1.getCustomerById();
				break;
			case 7:
				System.out.println("Thank you Visit Again");
				System.exit(0);
			}
		}
	}
}
