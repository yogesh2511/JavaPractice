package PropetyReader;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Enumeration;
import java.util.Hashtable;
import java.util.Map;
import java.util.Properties;

public class PropertyReaderExample {

	public static void main(String[] args) throws IOException {
		FileInputStream fis=new FileInputStream("D:\\Java_Project\\com.qa.javapractice\\Test.properties");
		Properties prob=new Properties();
		prob.load(fis);
		Map<String,String> sp=new Hashtable<String, String>();
		for (String key : prob.stringPropertyNames()) 
		{
			sp.put(key, prob.getProperty(key));
			System.out.println(sp.get(key));
		}
		
		
		
		
	}

}
