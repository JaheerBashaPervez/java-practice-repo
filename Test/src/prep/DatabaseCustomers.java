package prep;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class DatabaseCustomers {
	
	public static List<Customer> getCustomers(){
		
		List<Customer> customerList = new ArrayList<>();
		
		customerList.add(new Customer("Jaheer", "jah@email.com", Arrays.asList("123","234","1124")));
		customerList.add(new Customer("Nazia", "naz@email.com",  Arrays.asList("323","734","1224")));
		customerList.add(new Customer("Akbar", "Akb@email.com",  Arrays.asList("423","834","1234")));
		customerList.add(new Customer("Jeelan", "jee@email.com", Arrays.asList("523","934","32454")));
		customerList.add(new Customer("Akhila", "Akhi@email.com",Arrays.asList("623","1034","32443")));
		
		return customerList;
	} 

}
