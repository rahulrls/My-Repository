package method_study;

public class PatientInfo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		PatientInfo PatientDetail  = new PatientInfo();
		PatientDetail.patient("DKT Hospital", "Java", 5,'B', 505, 29.55d);
		PatientDetail.patient("GNPT", "Program", 6, 'G', 610, 37.66d);
		
	}

	
	public void patient(String HospitalName,String patientName,int flowrNum,long i,int bedNum,double d)
	// method with parameter
	{
		
		System.out.println("@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@");
		
		System.out.println("Hospital Name - "+HospitalName);
		System.out.println("Patieent Name - "+patientName);
		System.out.println("Flowr Number - "+flowrNum);
		System.out.println("Ward Name - "+i);
		System.out.println("Bed Number - "+bedNum );
		System.out.println("patient Tempreture - "+d);
		
		System.out.println("@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@");
	}
}
