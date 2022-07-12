package arrays;

public class String_split_method {

	public static void main(String[] args) {
		// I LOVE MY INDIA
		String q="I LOVE MY INDIA";
		//System.out.println(q.split(" "));
		String ar[]=q.split(" ");
		for (int i=0;i<=ar.length-1;i++)
		{System.out.println(ar[i]);
			
		}
		System.out.println("==============");
		String w="THIS_IS_MY_COUNTRY";
		String f[]=w.split("_");
		for (int i=0;i<=f.length-1;i++)
		{
			System.out.println(f[i]);
		}
		
		
	}

}
