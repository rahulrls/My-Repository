package string_study;

public class String_Method {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String Name="Pune";
		//length method
		System.out.println(Name.length());
		
		
		int b = Name.length();
		System.out.println(b);
	
		//toUppercase
		System.out.println("============================");
		
		System.out.println(Name.toUpperCase());
	
		String c= "abcde";
		String m = Name.toUpperCase();//Converts all of the characters in this String to uppercase using the rules of the default locale. 
										//This method is equivalent to toUpperCase(Locale.getDefault()). 
		
		System.out.println("============================");
		
		System.out.println(c.toUpperCase());
	
		//toLowercase
		System.out.println("============================");	
		
		System.out.println(Name.toLowerCase());
		
		//equals() method use
		
		String d="School";
				String e="School";
				String f=new String("School");
				String g=new String("School");
				String h=new String("SCHOOL");
				
				//==compare memory location of two operators
				//equals method compare character sequence of two object
				System.out.println("============================");	
				System.out.println(d==e);
				System.out.println(f==g);
				System.out.println(g==h);
				System.out.println(d==g);
				System.out.println(h==f);
				System.out.println("============================");
				
				// out for equals method
				System.out.println(d.equals(e));	
				System.out.println(f.equals(g));//Compares this string to the specified object.
												// The result is true if and only if the argument is not null and is a String object 
													//that represents the same sequence of characters as this object. 
				
				System.out.println(g.equals(h));
				System.out.println(d.equals(g));
				System.out.println(h.equals(f));
				
		//equalsIgnoreCase() method use
				
				
				String city ="Mumbai";
				String locality="Mumbai";
				String dist ="Mumbai";
				
				System.out.println("============================");
				
				System.out.println(city.equals(dist));
				System.out.println(city.equalsIgnoreCase(dist));
				System.out.println(locality.equalsIgnoreCase(city));
				//Compares this String to another String, ignoring case considerations.
				//Two strings are considered equal ignoring case
				// if they are of the same length and corresponding characters in the two strings are equal ignoring case
				
		//contains() method use
				
				String l="Maharastra";
				System.out.println("============================");	
				System.out.println(l.contains("ha"));
				System.out.println(l.contains("hr"));//Returns true if and only if this string contains the specified sequence of char values
				System.out.println(l.contains("rastr"));
				
		//isEmpty() method use
				
				String p="Rahul";
				String q="";
				String r=null;
				String s=" ";
				
				System.out.println("============================");
				
				System.out.println(p.isEmpty());
				System.out.println(q.isEmpty());
				//System.out.println(r.isEmpty()); //for (null) java exception is java.lang.NullPointerException
				System.out.println(s.isEmpty());//Returns true if, and only if, length() is 0
				
				// isBlank() method use 
				System.out.println("============================");
				System.out.println(p.isBlank());
				System.out.println(q.isBlank());
			//	System.out.println(r.isBlank()); //for (null) java exception is java.lang.NullPointerException
				System.out.println(s.isBlank());//Returns true if the string is empty or contains only white space codepoints,otherwise false
				
				
				
				//charAt() method use
				
				String Country="INDIA";
				
				System.out.println("============================");
				System.out.println(Country.charAt(0));//this method shows index character
				System.out.println(Country.charAt(1));
				System.out.println(Country.charAt(2));//Returns the char value at the specified index. An index ranges from 0 to length() - 1. 
														//The first char value of the sequence is 
														//at index 0, the next at index 1,and so on, as for array indexing.
				System.out.println(Country.charAt(3));
				System.out.println(Country.charAt(4));
				System.out.println("============================");
				char requiredChar= Country.charAt(2);
				System.out.println(requiredChar);
				// if -1 the java exception is java.lang.StringIndexOutOfBoundsException
				
				
				//endsWith method use
				System.out.println("============================");
				System.out.println(Country.endsWith("IND"));
				System.out.println(Country.endsWith("D"));//Tests if this string ends with the specified suffix
				System.out.println(Country.endsWith("A"));
				
				//startWith() method use
				
				System.out.println("============================");
				System.out.println(Country.startsWith("IN"));
				System.out.println(Country.startsWith("ND"));//Tests if this string starts with the specified prefix
				System.out.println(Country.startsWith("IA"));
				
				System.out.println(Country.startsWith("D",2 ));
				System.out.println(Country.startsWith("IN", 0));
				System.out.println(Country.startsWith("ND", 1));//Tests if the substring of this string beginning at the specified index 
																	//starts with the specified prefix
				
				//substring method use
				System.out.println("============================");
				String mi="I CAN GIVE MY BEST";
				String result = mi.substring(10);//Returns a string that is a substring of this string. 
												//The substring begins with the character at the specified index and extends to the end of this string
				System.out.println(result);
				System.out.println("============================");
				System.out.println(mi.substring(8, 15));//Returns a string that is a substring of this string.
														// The substring begins at the specified beginIndex and extends to the character at index endIndex - 1.
														//Thus the length of the substring is endIndex-beginIndex
				System.out.println(mi.substring(2, 17));
				System.out.println("============================");
				
				System.out.println(mi.subSequence(2, 6));
				System.out.println(mi.subSequence(3, 17));//Returns a character sequence that is a subsequence of this sequence. 
	
				
				//concat method use
				String x= "Mumbai";
				String y= "City";
				
				System.out.println("=============================");
				System.out.println(x.concat(y));
			System.out.println(l.concat(x).concat(y));
				
			System.out.println("=============================");	
				//indexOf()method use
			String state="Maharastra";
			System.out.println(state.indexOf("a"));
			System.out.println(state.indexOf("s"));
			System.out.println("=============================");
			System.out.println(state.indexOf("ha"));
			System.out.println(state.indexOf("a",4));
			System.out.println(state.indexOf("t", 7));
			System.out.println(state.indexOf("r",5));
				
			//replace method use
			System.out.println("=============================");
			String Tal="Pune Mumbai Nagapur";
			 System.out.println(Tal.repeat(2));
			 System.out.println(Tal.replace("Pune Mumbai Nagapur", "bdfkjbskjfbfj"));
			 System.out.println(Tal.replaceAll("i", "x"));
				
				
	}
	}


