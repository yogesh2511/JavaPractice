package StringConcept;

import java.util.HashMap;
import java.util.Hashtable;
import java.util.Map;

import org.testng.annotations.Test;

public class StringVsStrinBuffer {

	Map<String,Integer> om=new Hashtable<String, Integer>();
	
	
	@Test
	public void StringExample()
	{
		String s="value";
		String s1="value";
		s.equals(s1);
		for(int i=1;i<10000;i++)
		{
			s=s+s1;
		}
	}
	@Test
	public void StringBuffer()
	{
		StringBuffer s3 = new StringBuffer("Value1");
		String s2 = "Value2";
		for (int i = 0; i < 100000; ++i) {
		s3.append(s2);
		}
	}

}
