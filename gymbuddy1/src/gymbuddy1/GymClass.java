package gymbuddy1;

import java.util.ArrayList;
import java.util.Scanner;


public class GymClass implements Comparable{// all classes are 30 min
	String name;
	int month;
	int day;
	int hour;
	int minute;
	boolean pm;
	int capacity;
	ArrayList<userTree.User> enrolled;
	Scanner scan;
	
	public GymClass(String names)
	{
		name=names;
		modify();
	}
	
	public void modify()
	{
		scan=new Scanner(System.in);
		System.out.println("Please enter the number of the desired month for this class");
		int m1=scan.nextInt();
		System.out.println("Please enter the number of the day for this class");
		int m2=scan.nextInt();
		System.out.println("Please enter the numerical hour this class is at(between 1 and 12)");
		int m3=scan.nextInt();
		System.out.println("Please enter the (numerical) minutes for this class(between zero and 60)");
		int m4=scan.nextInt();
		System.out.println("Please enter the capacity for this class");
		int m5=scan.nextInt();
		scan.nextLine();
		System.out.println("Please enter AM or PM for morning or afternoon classes respectively");
		String m6=scan.nextLine();
		capacity=m5;
		
		if(m6.toLowerCase().contains("pm")||m6.toLowerCase().contains("am"))
		{
			if(m6.toLowerCase().contains("am"))
			setDate(m1,m2,m3,m4,false);
		}
		else
			setDate(m1,m2,m3,m4,true);
		
	}
	
	public void setDate(int m, int d, int h, int mi, boolean Pm)
	{
		month=m;
		day=d;
		hour=h;
		minute=mi;
		
	}
	
	public int compareTo(Object u)
	{
		GymClass x=(GymClass)u;
		if(this.month-x.month>0)
		{
			return 1;
		}
		if(this.month-x.month<0)
		{
			return -1;
		}
		else
		{
			if(this.day-x.day>0)
			{
			return 1;
			}
			if(this.day-x.day<0)
			{
			return -1;
			}
			else
			{
				if(this.hour-x.hour>0)
				{
				return 1;
				}
				if(this.hour-x.hour<0)
				{
				return -1;
				}
				else
				{
					if(this.minute-x.minute>0)
					{
					return 1;
					}
					if(this.minute-x.minute<0)
					{
					return -1;
					}
					else
					{
						if(this.pm==false&&x.pm==true)
						{
							return 1;
						}
						
						if(this.pm==true&&x.pm==false)
						{
							return -1;
						}
						else return 0;
					}
				}
			}
			
		}
		
	}
	public void close()
	{
		scan.close();
	}
	

}
