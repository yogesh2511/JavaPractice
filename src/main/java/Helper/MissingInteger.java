package Helper;

import java.util.Arrays;
import java.util.Scanner;;

public class MissingInteger {

	static int[] array = {1,3,8,6,7,10};
	public int[] array2;
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);  
		System.out.println("Enter your rollno");  
		 int rollno=sc.nextInt(); 
		 
		Arrays.sort(array);
		getMissingNo();
	}
	public static void getMissingNo()
    {
       for(int i=0;i<array.length;i++)
		   System.out.println(array[i]+" ");
	   System.out.println("the missing number");
	   int j=0;
	   for(int i=1;i<array[array.length-1];i++)
	   {
		   if(j<array.length && i==array[j])
			   j++;
		   else
			   System.out.println(i+"");
	   }
        
    }

}
