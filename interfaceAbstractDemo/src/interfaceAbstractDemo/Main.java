package interfaceAbstractDemo;

import Abstract.BaseCustomerManager;
import Abstract.CustomerCheckService;
import Concrete.CustomerCheckManager;
import Concrete.NeroCustomerManager;
import Concrete.StarbucksCustomerManager;
import Entities.Customer;

public class Main {

	public static void main(String[] args) {
		
		Customer customer = new Customer();
		customer.setId(1);
		customer.setFirstName("Betülay");
		customer.setLastName("Namver");
		customer.setNationalityId("1234567890");
		customer.setBirthYear(2000);
		
		CustomerCheckManager customerCheckManager = new CustomerCheckManager();
		customerCheckManager.CheckIfRealPerson(customer);
		
		BaseCustomerManager customerManager = new NeroCustomerManager();
		customerManager.save(customer);

			
		}

	}
