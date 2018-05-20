public class Customer 
{
	private static int numCustomers = 0;
	String customerName;
	
	public Customer(String fullName)
	{
		customerName = fullName;
		numCustomers++;
	}
	
	public void CustomerInfo()
	{
		System.out.println(customerName + " has entered the store, there"
						   + " are now " + numCustomers + " people in the"
						   + " store.\n" );
	}

}
