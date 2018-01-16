package Helper;

import java.util.Calendar;
import java.util.HashSet;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.SerializationFeature;
import com.fasterxml.jackson.databind.module.SimpleModule;

public class SerializationTest {

	public static void main(String[] args) throws JsonProcessingException {
		 	User user = new User();
	        user.setId(1L);
	        user.setName("User");
	        user.setBirthDate(Calendar.getInstance());
	        user.setEmails(new HashSet<String>());
	        user.getEmails().add("user@gmail.com");
	        user.getEmails().add("user@yahoo.com");
	         
	        ObjectMapper mapper = new ObjectMapper();
	        mapper.enable(SerializationFeature.INDENT_OUTPUT);
	        String json = mapper.writeValueAsString(user);
	        	        
	      
	        System.out.println(json);
	        
	       /* System.out.println("********************************");
	         SimpleModule module = new SimpleModule();
	        module.addSerializer(Calendar.class, new CalendarToDateStringSerializer());
	        
	        ObjectMapper mapper1 = new ObjectMapper();
	        mapper1.registerModule(module);
	         
	       

	        System.out.println(json);
	        System.out.println("********************************");*/
	}

}
