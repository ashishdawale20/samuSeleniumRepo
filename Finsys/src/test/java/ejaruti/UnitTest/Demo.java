package ejaruti.UnitTest;

import java.text.SimpleDateFormat;
import java.util.Arrays;
import java.util.Calendar;
import java.util.Scanner;
import java.util.TimeZone;

public class Demo {
	
		public static void main(String[] args)
		{
/*	//	1.	//multiplication table
			int n=8;
			for(int i=1;i<10;i++)
			{
			System.out.println(n*i);
			}
			
		//2.	
			/*Sample Pattern :

				   J    a   v     v  a                                                  
				   J   a a   v   v  a a                                                 
				J  J  aaaaa   V V  aaaaa                                                
				 JJ  a     a   V  a     a
			*/
			
	/*		System.out.println("   j    a     v     v    a   ");
			System.out.println("   j   a a     v   v    a a     ");
			System.out.println("j  j  aaaaa     v v    aaaaa                           ");
			System.out.println(" jj  a     a     v    a     a   ");
			
			
			
		//3.	 Find the area and perimeter of a circle   perimeter=2πr,	area=πr2  
			double radius = 7.5;
			double perimeter = 2 * Math.PI * radius;
	        double area = Math.PI * radius * radius;

			System.out.println("Perimeter is:"+" "+perimeter);
			System.out.println(" Area is:"+" "+ area);
			
			
		//4.Write a Java program that takes five numbers as input to calculate and print the average of the numbers.   Average=sum of the number/number of the number	
			
			int a=10;
			int b=30;
			double c=44;
			int d=50;
			double avg =(a+b+c+d)/4;
			System.out.println("avg of num:"+avg);
	
			
	
		//5.Perimeter of a rectangl  perimeter = 2*(height + width),area = width * height
			double width1 = 5.6;
	        double height1 = 8.5;
			
			double perimeter1= 2*(height1 + width1);
			
			double area1 = width1 * height1;
			
			System.out.println("perimeter of rectangle:"+" "+perimeter1);
			System.out.println("area of rectangle:"+" "+area1);
			
			
		//6. Write a Java program and compute the sum of the digits of an integer.eg=638
			
			int num=638;
			int sum=0;
			while(num !=0)
			{
				sum+=num%10;
				num/=10;
				
			}
			System.out.println("The sum of digits:"+" "+sum);
			
			
			
			
	//7.		Write a Java program to reverse a string...a.. The quick brown fox
			
			
			String[] letters = {"the","quick", "brown","fox"};
			System.out.print("reverse string is :");
			
			for(int i=letters.length-1;i>=0;i--)
			{
				System.out.print(letters[i]+" ");
			}
			System.out.println();
			
	//8.	Print the ascii value of a given character	
			
			int chr = 'Z';
			System.out.println("The ASCII value of Z is :"+chr);
			
		
		//9.Write a Java program that accepts an integer (n) and computes the value of n+nn+nnn. 
			int n;
			  char s1, s2, s3;
			  Scanner in = new Scanner(System.in);
			  System.out.print("Input number: ");
			  n = in .nextInt();
			  System.out.printf("%d + %d%d  + %d%d%d\n", n, n, n, n, n, n);
			
			
			//10.Display the system time
			System.out.format("\nCurrent Date time: %tc%n\n", System.currentTimeMillis());
		
			//11.
			SimpleDateFormat sdt= new SimpleDateFormat("yyyy/MM/dd HH:mm:ss.SSS");
			sdt.setCalendar(Calendar.getInstance(TimeZone.getTimeZone("GMT")));
			System.out.println(sdt.format(System.currentTimeMillis()));
			
				 
		//12. Write a Java program to calculate the sum of two integers and return true if the sum is equal to a third integer.
			
			Scanner scan=new Scanner(System.in);
			System.out.println("enter a number");
			int p=scan.nextInt();
			System.out.println("enter second number");
			int q=scan.nextInt();
			System.out.println("enter third number");
			int r=scan.nextInt();
			System.out.print("the result is:"+sumoftwo(p,q,r));
			System.out.println();
		}
		public static boolean sumoftwo(int a,int b,int c)
		{
			return ((a+b)==c || (b+c)==a||(c+a)==b);
		}
			
		
		//13.Write a Java program that accepts three integers from the user and return true if the second number is greater than first number and third number is greater than second number. If another variable "abc" is true second number does not need to be greater than first number.
		
		Scanner scan=new Scanner(System.in);
		System.out.println("enter first number");
		int q=scan.nextInt();
		System.out.println("enter second number");
		int s=scan.nextInt();
		System.out.println("enter third number");
		int t=scan.nextInt();
		System.out.println(test(q, s, t, true));
		
		}
		public static boolean test(int d,int e,int f,boolean num )
		{
			if( num)
				return(f>e);
			return(e>d && f>e);
			
		}
		
		//14.Write a Java program that accepts three integers from the user and return true if two or more of them (integers ) have the same rightmost digit. The integers are non-negative.
		
			Scanner scan=new Scanner(System.in);
			System.out.println("enetr a number");
			int a=scan.nextInt();
			System.out.println("enetr second number");
			int b=scan.nextInt();
			System.out.println("enetr third number");
			int c=scan.nextInt();
			System.out.println(test1(a,b,c,true));
		}
			
					public static boolean test1(int p,int q,int r,boolean num)
					{
				
				return (p%10==q%10)||(q%10==r%10)||(r%10==p%10);	
					}   
	//15.Write a Java program to find the number of integers within the range of two specified numbers and that are divisible by another number.				
					
			
			Scanner scan=new Scanner(System.in);
			System.out.println("eneter first number");
					int x=scan.nextInt();
					System.out.println("enter second number");
					int y=scan.nextInt();
					System.out.println("enetr third number");
					int p=scan.nextInt();
                    System.out.println(result(x,y,p));				
                     
                    }
                    public static int result(int x,int y,int p)
                    {
                         if(x%p==0)	
                          return(y/p-x/p+1);
                         return(y/p-x/p);
                   }   
		
	//16.Write a Java program to convert a given string into lowercase.
			
			Scanner scan=new Scanner(System.in);
			System.out.println("enter string");
			String line=scan.nextLine();
			        
		    line=line.toLowerCase();
			System.out.println(line);
			
			
	
//17.Write a Java program to convert a given string into Uppercase.
			
			Scanner scan=new Scanner(System.in);
			System.out.println("enter string");
			String line=scan.nextLine();
			char[] ch = line.toCharArray(); 
			 for (char c : ch) { 
		            System.out.println(c); 
		            char upperCase = Character.toUpperCase(ch[0]);
		            String str = "";

		            for (Character b : ch)
		                str += b.toString();

		            System.out.println(str);
		           
			 }
			
	//18.		 Write a Java program that accepts two integer values from the user and return the larger values. However if the two values are the same, return 0 and return the smaller value if the two values have the same remainder when divided by 6.
		       
			 Scanner scan=new Scanner(System.in);
			 System.out.println("enter number");
			 int a=scan.nextInt();
			 System.out.println("enetr second number");
			 int b=scan.nextInt();
			 System.out.println(result(a,b));
		}
		public static int result(int p,int q)
		{
			if(p==q)
				return 0;
			if(p%6==q%6)
				return (p<q)?p:q;
			    return(p>q)?p:q;
		}
			 
			 
		//19.Write a Java program to insert a word in the middle of the another string.
		    String main_string = "Python 3.0";
		    String word = "Tutorial";
		    System.out.println(main_string.substring(0, 7) + word + main_string.substring(6));
			
			

		//20.    Create a new string of 4 copies of the last 3 characters of the original string
		   
		    String mainString="Python 3.0";
		    String lastThreeCharacters=mainString.substring( mainString.length() -3);
		    System.out.println(lastThreeCharacters+lastThreeCharacters+lastThreeCharacters+lastThreeCharacters);
		    
		   
		 //21.Write a Java program to extract the first half of a string of even length.
		    
		    String main_str="samiksha";
		    System.out.println(main_str.substring(0,main_str.length()/2));
		     
		    
		   //22.Create the concatenation of the two strings except removing the first character of each string
		    
		    String str1="samiksha";
		    String str2="dawale";
		    System.out.println(str1.substring(1)+str2.substring(1));
		    
		    
		    //23.Write a Java program to test if 10 appears as either the first or last element of an array of integers. The length of the array must be greater than or equal to 2.
		    
		    int[] numArray= {10,-40,70,57,67,82,96,13};
		    System.out.println(numArray[0]==10 || numArray[numArray.length-1]==10);
		   
		   
		    //24.Write a Java program to test if the first and the last element of an array of integers are same. The length of the array must be greater than or equal to 2.
		    
		   int[] num_arr= {10,20,50,67,47,11};
		   System.out.println(num_arr.length>=2 && num_arr[0]==num_arr[num_arr.length-1]);
		    
		     
		 //25.Write a Java program to test if the first or the last elements of two arrays of integers are same. The length of the two arrays must be greater than or equal to 2.
		   int [] array1= {80,46,38,59,27,48};
		   int [] array2= {85,58,38,55,39,49};
		   System.out.println(array1[0]==array2[0] || array1[array1.length-1]==array2[array2.length-1]);
		   
		  
		//26.Write a Java program to test that a given array of integers of length 2 contains a 4 or a 7.    
		    
		    
		  int []arr = {3,6};
		  System.out.println("origional array:"+Arrays.toString(arr));
		  
		  if(arr[0]==4 ||arr[0]==7)
		  {
		  System.out.println("true");
		  }
		
		  else
		  {
			    System.out.println(arr[1] == 4 || arr[1] == 7);
		  }
		  
		  
		  
		  
	//27.Write a Java program to rotate an array (length 3) of integers in left direction.
		  int [] array= {10,60,400};
		  System.out.println("origional array:"+Arrays.toString(array));
		  int [] newArray= {array[2],array[1],array[0]};
		  System.out.println("Roteted array:"+Arrays.toString(newArray));
		  
		  
		  
	//28.Write a Java program to multiply corresponding elements of two arrays of integers.
			String result="";
			int[] leftArr= {1,5,-7,-6};
			int [] rightArr= {2,5,-4,-2};
			System.out.println(Arrays.toString(leftArr));
		  System.out.println(Arrays.toString(rightArr));
		  for(int i=0;i<leftArr.length;i++)
		  {
			  int num1=leftArr[i];
			  int num2=rightArr[i];
			  result+=Integer.toString(num1*num2)+" ";
		  }
		  System.out.println("Result:"+result);
		  
		  
	//29.Check if a string starts with a specified word
		  
		 String str= "hello how are you?";
		  System.out.println(str.startsWith("Hello"));
		   
			
	//30.Write a Java program to get the current system environment and system properties.		
		  System.out.println("Current system environment:");
	         System.out.println(System.getenv());	 
		System.out.println("\n\nCurrent system properties:");
	    System.out.println(System.getProperties());	
	    
	    
	//31.Write a Java program to check whether a security manager has already been established for the current application or not.    
	    System.out.println("System security interface:");
	    System.out.println(System.getSecurityManager());	 
	    
	    
	//32.Write a Java program to get the value of the environment variable PATH, TEMP, USERNAME.
	 // gets the value of the specified environment variable "PATH"
	      System.out.println("\nEnvironment variable PATH: ");
	      System.out.println(System.getenv("PATH"));

	      // gets the value of the specified environment variable "TEMP"
	      System.out.println("\nEnvironment variable TEMP: ");
	      System.out.println(System.getenv("TEMP"));

	      // gets the value of the specified environment variable "USERNAME"
	      System.out.println("\nEnvironment variable USERNAME: ");
	      System.out.println(System.getenv("USERNAME"));
	    
	    
	   //33.Write a Java program to count the number of even and odd elements in a given array of integers. 
	      int[] nums = {5, 7, 2, 4, 9};
	  	int ctr_even = 0, ctr_odd = 0;
	  	System.out.println("Original Array: "+Arrays.toString(nums)); 
	  	    
	      for(int i = 0; i < nums.length; i++) {
	          if(nums[i] % 2 == 0)
	        	  
	  		{     
	            ctr_even++;    
	  		}
	  		else
	  			ctr_odd++;
	      }                 
	      
	
	  	System.out.println("even:"+ctr_even);	
		System.out.println("odd:"+ctr_odd);	
	    
	    
	//34.Write a Java program to create an array (length # 0) of string values. The elements will contain "0", "1", "2" 		
			int num=5;
			String [] strArr=new String[num]; 
			for(int i=0;i<num;i++) 
			strArr[i]=String.valueOf(i);
			System.out.println("newArray:"+Arrays.toString(strArr));
			
		
	//35.Write a Java program to check if the number of 10 is greater than number to 20's in a given array of integers.
		          int a = 25; 
			  
		        System.out.println(Math.sqrt(a)); 
			
            	
	//36.Write a Java method to count all vowels in a string.
		        Scanner scan=new Scanner(System.in);
		        System.out.println("Enter the String");
			    String str=scan.nextLine();
			    System.out.println("number of vowels in String:"+countVowels(str));
		}
		public static int countVowels(String str)
		{
			int count=0;
			for(int i=0;i<str.length();i++)
			{
				if(str.charAt(i)=='a'||str.charAt(i)=='e'||str.charAt(i)=='i'
				||	str.charAt(i)=='o'||str.charAt(i)=='u'	);
				{
					count++;
				}
				return count;
			}
			
		}
			
            		*
            		*/

			
			
}			
			
			
			
			
			
			
			
			
			
			
			
			
			}