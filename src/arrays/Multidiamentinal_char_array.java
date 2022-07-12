package arrays;

public class Multidiamentinal_char_array {

	public static void main(String[] args) {
		
		char gread [][]= {{'A','B'},{'C','D'}};
		
		for (int i=0;i<=gread.length-1;i++)
		{
			for(int j=0;j<=gread.length-1;j++)
			{
				System.out.print(gread[i][j]+" ");
			}
			System.out.println();
		}

	}

}
