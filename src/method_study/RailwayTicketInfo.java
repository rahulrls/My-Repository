package method_study;

public class RailwayTicketInfo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		RailwayTicketInfo passenderdetail = new RailwayTicketInfo();
		passenderdetail.TicketInfo("Sayadhri Express", 1009, "Pune", "Mumbai", "Rahul Shinde", 'M', 20, 1766230275, "Upper", 3.22d, "06/04/2022");
		
		
	}

	public void TicketInfo(String TrainName,int trainNo,String Destination,String BordingPoint,String passengerName ,long i,int passengerage,long mobno,String berth, double d,String date)
	{
		System.out.println("##############################");
		System.out.println("Train Name - "+TrainName);
		System.out.println("Train Number - "+trainNo);
		System.out.println("Passenger Destination - "+Destination);
		System.out.println("Passenger Bording Point - "+BordingPoint);
		System.out.println("Passenger Name - "+passengerName);
		System.out.println("Passenger Gender - "+i);
		System.out.println("Passenger Age - "+passengerage);
		System.out.println("Passenger Mob.No - "+mobno);
		System.out.println("passenger berth - "+berth);
		System.out.println("Train time - "+d);
		System.out.println("Journy Date - "+date);
		System.out.println("##############################");
		
	}	
	
	
	
	
	
	
	
	
}
