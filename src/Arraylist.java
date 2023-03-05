import java.util.List;

public class ArrayList {
    public static void main(String[] args) {
    	
    	
    	Employee e1 = new Employee(1,26,"Abhishek",new Address("Ahmedabad",111));
    	Employee e2 = new Employee(2,25,"Chinmay",new Address("Hyderabad",222));
    	
    	List<Employee> empList = new ArrayList();
    	empList.add(e1);
    	empList.add(e2);

    	System.out.println(empList);
    
    }
}

class Employee
{
	int id;
	int age;
	String name;
	Address address;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public Address getAddress() {
		return address;
	}
	public void setAddress(Address address) {
		this.address = address;
	}
	public Employee(int id, int age, String name, Address address) {
		super();
		this.id = id;
		this.age = age;
		this.name = name;
		this.address = address;
	}
	
	
	
}
