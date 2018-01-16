package Helper;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class CollectionExample {

	public static void main(String[] args) {
		Map<String,String> map= new LinkedHashMap();
		map.put("978", "A");
		map.put("2454", "B");
		map.put("5454", "C");
		map.put("4554", "A");
		/*	Set<String> sett = map.keySet();
			for(String se:sett)
			{
				System.out.println(map.get(se));
			}*/
		//	System.out.println(map.get("1"));
			Set<Entry<String, String>> keys = map.entrySet();
			for(Entry<String, String> e:keys)
			{
				System.out.println("Key:"+e.getKey()+"\tValue:"+e.getValue());
			}
	}

}
