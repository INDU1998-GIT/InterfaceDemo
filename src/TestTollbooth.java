interface Truck{
	
}
interface Tollbooth{
	public void calculatetolldue(Truck t);
	public void displayData();
}
class FordTruck implements Truck
{
	int a,w;
	String s;
	FordTruck(int a,int w)
	{
		this.a=a;
		this.w=w;
		s="Fordtruck";
		}
	
}
class NissanTruck implements Truck
{
	int a,w;
	String s;
	NissanTruck(int a,int w)
	{
		this.a=a;
		this.w=w;
		s="Nissantruck";
		}
	
}
class DaewooTruck implements Truck
{
	int a,w;
	String s;
DaewooTruck(int a,int w)
	{
		this.a=a;
		this.w=w;
		s="Daewootruck";
		}
}
class AlleghenyTollbooth implements Tollbooth
{
	int due,axl,weig,total=0;
	String truck;
	static int  count;
	public void calculatetolldue(Truck t)
	{}
	public void calculatetolldue(FordTruck f)
	{
		due=f.a*5+(f.w/450)*10;
		this.axl=f.a;
		this.weig=f.w;
		this.truck=f.s;
		count++;
	}
	public void calculatetolldue(NissanTruck f)
	{
		due=f.a*5+(f.w/450)*10;
		this.axl=f.a;
		this.weig=f.w;
		this.truck=f.s;
		count++;
	}
	public void calculatetolldue(DaewooTruck f)
	{
		due=f.a*5+(f.w/450)*10;
		this.axl=f.a;
		this.weig=f.w;
		this.truck=f.s;
		count++;
	}
	public void displayData()
	{
		System.out.println("type:" +truck+ "no of axles" +axl+ "the weight is:" +weig   );
		System.out.println("the total charge of vehicle is:" +due);
		total+=due;
	}
	void tillLastReceipt()
	{
		System.out.println("no of vehicles ctrossed tollbooth:" +count);
		System.out.println("total amount collected by tollbooth is:" +total);
		total=0;count=0;
	}
	
	
	
}

public class TestTollbooth {

	public static void main(String[] args) {
	AlleghenyTollbooth booth = new AlleghenyTollbooth();
	
	FordTruck ford=new FordTruck(5,12000);
	booth.calculatetolldue(ford);
	booth.displayData();
	System.out.println("*****************************************");
	NissanTruck Nissan=new NissanTruck(2,5000);
	booth.calculatetolldue(Nissan);
	booth.displayData();
	System.out.println("*****************************************");
	DaewooTruck Daewoo=new DaewooTruck(6,17000);
	booth.calculatetolldue(Daewoo);
	booth.displayData();
	System.out.println("*****************************************");
	FordTruck ford2=new FordTruck(6,17000);
	booth.calculatetolldue(ford2);
	booth.displayData();
	System.out.println("*****************************************");
	booth.tillLastReceipt();
	System.out.println("********************************");
	booth.tillLastReceipt();
			
	
	
	

	}

}
