package Serviceimpl;

import java.util.LinkedHashMap;
import java.util.Scanner;

import Entity.Address;
import Entity.Customer;
import Service.HotelService;
import dao.HotelRepo;

public class HotelServiceImpl implements HotelService,HotelRepo
{
	Scanner ip=new Scanner(System.in);
	{
		for(int i=1;i<=10;i++)
		{
			cm.put(i, null);
		}
		for(int i=1;i<=8;i++)
		{
			sm.put(i, null);
		}
		for(int i=1;i<=5;i++)
		{
			dm.put(i, null);
		}
	}
	@Override
	public void roomInfo()
	{
		System.out.println("********* Classic Rooms *********");
		System.out.println("PRICE :- RS.2000");
		System.out.println("WIFI:NO");
		System.out.println("TV:NO");
		System.out.println("AC:NO");
		System.out.println("HOT WATER:YES");
		System.out.println("********* DELUX Rooms *********");
		System.out.println("PRICE :- RS.3000");
		System.out.println("WIFI:YES");
		System.out.println("TV:YES");
		System.out.println("AC:NO");
		System.out.println("HOT WATER:YES");
		System.out.println("********* SUPER DELUX Rooms *********");
		System.out.println("PRICE :- RS.5000");
		System.out.println("WIFI:YES");
		System.out.println("TV:YES");
		System.out.println("AC:YES");
		System.out.println("HOT WATER:YES");
	}

	public void classicRoom(LinkedHashMap<Integer,Customer> l1)
	{
		boolean flag=false;
		for(Integer ele:cm.keySet())
		{
			if(cm.get(ele)==null)
			{
				System.out.print(ele+" ");
				flag=true;
			}
		}
		System.out.println();
		if(flag==false)
		{
			System.out.println("No Classic Rooms Available ");
		}
	}

	public void deluxRoom(LinkedHashMap<Integer,Customer> l1)
	{
		boolean flag=false;
		for(Integer ele:sm.keySet())
		{
			if(sm.get(ele)==null)
			{
				System.out.print(ele+" ");
				flag=true;
			}
		}
		System.out.println();
		if(flag==false)
		{
			System.out.println("No Delux Rooms Available ");
		}
	}

	public void superdeluxRoom(LinkedHashMap<Integer,Customer> l1)
	{
		boolean flag=false;
		for(Integer ele:dm.keySet())
		{
			if(dm.get(ele)==null)
			{
				System.out.print(ele+" ");
				flag=true;
			}
		}
		System.out.println();
		if(flag==false)
		{
			System.out.println("No Super delux Rooms Available ");
		}
	}

	public void checkRoom(LinkedHashMap<Integer,Customer> l1)
	{
		boolean flag=false;
		for(Integer ele:l1.keySet())
		{
			if(l1.get(ele)==null)
			{
				System.out.print(ele+" ");
				flag=true;
			}
		}
		System.out.println();
		if(flag==false)
		{
			System.out.println("No Super delux Rooms Available ");
		}

	}
	@Override
	public void AvailableRoom()
	{
		System.out.println("********* Available Rooms *********");
		System.out.println("---------- Classic Rooms ---------- ");
		checkRoom(cm);
		System.out.println("---------- Delux Rooms ---------- ");
		checkRoom(dm);
		System.out.println("---------- Super Delux Rooms ---------- ");
		checkRoom(sm);
	}
	Customer createCustomer()
	{
		System.out.println("***** Enter Customer Details *****");
		System.out.println("Enter Customer id :-");
		int cid=ip.nextInt();
		System.out.println("Enter Customer Name :-");
		String cname=ip.next();
		System.out.println("Enter Phone Number :-");
		long cphno=ip.nextLong();
		System.out.println("Enter Your Email :-");
		String cemail=ip.next();
		System.out.println("Enter Customer age :-");
		int cage=ip.nextInt();
		System.out.println("Enter Amount :-");
		double camt=ip.nextDouble();
		System.out.println("Enter the Door No ;-");
		String doorno=ip.next();
		System.out.println("Enter the Street Name :-");
		String street=ip.next();
		System.out.println("Enter District Name :-");
		String dst=ip.next();
		System.out.println("Enter State Name :-");
		String state=ip.next();
		System.out.println("Enter Country Name ;-");
		String country=ip.next();
		System.out.println("Enter PinCode :-");
		int pincode=ip.nextInt();
		Address ad=new Address(doorno,street,dst,state,country,pincode);
		return new Customer(cname, cid, cphno, cemail, cage, ad);

	}
	void mapRoom(LinkedHashMap<Integer,Customer> l1,int roomNo,double amt)
	{
		if(l1.get(roomNo)==null)
		{
			Customer c=createCustomer();
			a1.add(c);
			l1.put(roomNo, c);
			c.setCamt(amt);
			System.out.println("Room No :- "+roomNo+" had been allocated for "+c.getCname());
			System.out.println("******************************  ");
		}
		else
		{
			System.out.println("Room Not Available");
		}
	}
	public void AllocateRoom()
	{
		System.out.println("***** MENU *****");
		System.out.println("1.Classic Room\n2.Delux Room\n3.Super Delux Room");
		System.out.println("Enter Room Type :-");
		int op=ip.nextInt();
		switch(op)
		{
		case 1:
			System.out.println("Enter the RoomNo :-");
			int roomNo1=ip.nextInt();
			if(roomNo1>=1&&roomNo1<=10)
			{
				mapRoom(cm,roomNo1,2000);
			}
			else
			{
				System.out.println("Enter Valid Room No...");
			}
			break;
		case 2:
			System.out.println("Enter the RoomNo :-");
			int roomNo2=ip.nextInt();
			if(roomNo2>=1&&roomNo2<=5)
			{
				mapRoom(dm,roomNo2,3000);
			}
			else
			{
				System.out.println("Enter Valid Room No...");
			}
			break;
		case 3:
			System.out.println("Enter the RoomNo :-");
			int roomNo3=ip.nextInt();
			if(roomNo3>=1&&roomNo3<=8)
			{
				mapRoom(sm,roomNo3,5000.0);
			}
			else
			{
				System.out.println("Enter Valid Room No...");
			}
			break;
		default:
			System.out.println("Enter Correct Room no");
			break;
		}
	}
	void unmapRoom(LinkedHashMap<Integer,Customer> l1,int roomNo)
	{
		if(l1.get(roomNo)!=null)
		{
			Customer c1=l1.get(roomNo);
			System.out.println(c1);
			System.out.println(c1.getCname()+" need to pay Rs. "+c1.getCamt());
			l1.put(roomNo, null);
			//			l1.remove(c1);
		}
		else
		{
			System.out.println("Invalid Room No");
		}
	}
	@Override
	public void Checkout()
	{
		System.out.println("***** MENU *****");
		System.out.println("1.Classic Room\n2.Delux Room\n3.Super Delux Room");
		System.out.println("Enter Room Type :-");
		int op=ip.nextInt();
		System.out.println("Enter which room u check out :- ");
		int roomNo=ip.nextInt();
		switch(op)
		{
		case 1:
			if(roomNo>=1&&roomNo<=10)
			{
				unmapRoom(cm,roomNo);
			}
			else
			{
				System.out.println("Invalid Room No");
			}
			break;
		case 2:
			if(roomNo>=1&&roomNo<=5)
			{
				unmapRoom(sm,roomNo);
			}
			else
			{
				System.out.println("Invalid Room No");
			}
			break;
		case 3:
			if(roomNo>=1&&roomNo<=8)
			{
				unmapRoom(dm,roomNo);
			}
			else
			{
				System.out.println("Invalid Room No");
			}
			break;
		default:
			System.out.println("Enter Correct Room no");
			break;
		}
	}
	@Override
	public void findAllCustomer() 
	{
		if(a1.size()==0)
		{
			System.out.println("Database is Empty...");
		}
		else
		{
			for(Customer ele:a1)
			{
				System.out.print(ele+" ");
			}
		}
	}

	@Override
	public void getCustomerById() 
	{
		boolean flag=false;
		System.out.println("Enter the Customer Id :-");
		int cid=ip.nextInt();
		for(Customer ele:a1)
		{
			if(ele.getCid()==cid)
			{
				System.out.print(ele+" " );
				flag=true;
				break;
			}
		}
		if(flag==false)
		{
			System.out.println("Invalid Customer Id....");
		}
	}
}