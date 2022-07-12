package loop_Study;

public class prime_no {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		for(int i=2;i<=100;i++) {
			boolean prime = true;
			for(int j=2;j<=i;j++) {
				if(i%j == 0) {
					prime  = false;
					break;
				}
			}
			if(prime) {
				System.out.println(i);
			}
		}
	}

}
