package com.example;

import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.request;

import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
@RestController
public class Mycontroller {
	
	@RequestMapping(value="/employee", method=RequestMethod.GET,produces = MediaType.APPLICATION_JSON_VALUE)
	public Employee getEmployee(){
		
		Employee emp=new Employee();
		emp.setFirstName("Daulat");
		emp.setLastName("Bachhav");
		emp.setMobile("9823403093");
		emp.setRollNumber(18);
		
		//Address
		Address address=new Address();
		address.setArea("Chinchwad");
		address.setLine1("Kunal park");
		address.setPincode("423301");
		emp.setAddress(address);
		return emp;
	}

}
