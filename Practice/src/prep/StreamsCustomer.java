package prep;

import java.util.List;
import java.util.stream.Collectors;

public class StreamsCustomer {

	public static void main(String[] args) {
		
		List<Customer> customerList = DatabaseCustomers.getCustomers();

		List<String> emailList = customerList.stream().map(Customer:: getEmail).collect(Collectors.toList());
		System.out.println(emailList);
		
		List<String> phoneList = customerList.parallelStream().
								 flatMap(cust->cust.getPhoneNumbers().stream()).
								 collect(Collectors.toList());
		System.out.println(phoneList);

		List<Customer> customerFilter=customerList.stream().filter(s-> s.getEmail().equals("jah@email.com")).toList();
		customerFilter.forEach(System.out::println);
		
		Customer customerFind=customerList.stream().filter(s-> s.getEmail().equals("jah@email.com")).findAny().get();
		System.out.println(customerFind.toString());
		
	}
	
	

}
