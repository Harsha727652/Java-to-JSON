package in.harsha;

import java.io.File;

import com.fasterxml.jackson.databind.ObjectMapper;

public class InsertingClass {

	public static void main(String[] args)throws Exception{
		// TODO Auto-generated method stub
		Address address = new Address();
		address.setVillage("chammachinta");
		address.setState("ap");
		address.setPincode(531115);
		Details details = new Details();
		details.setName("Swamy");
		details.setAge(26);
		details.setLocation("vizag");
		details.setAddress(address);
		ObjectMapper objectMapper = new ObjectMapper();
		objectMapper.writeValue(new File("details2.json"),details);
		System.out.println("convertion completed....................");
	}

}
