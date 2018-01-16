package ExcelReaderTest;

import java.util.List;
import java.util.ArrayList;

public class ListExample {

	public static void main(String[] args) 
	{
		List a=new ArrayList();
		a.add(1);
		a.add("test");
		a.forEach(System.out::println);
		/*Collection c=new ArrayList();
		c.add("test");
		c.add(1);
		for(Object o: c)
		{
			System.out.println(o);
		}*/
	}

}
