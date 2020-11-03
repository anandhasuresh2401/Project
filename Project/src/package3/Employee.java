package package3;
class Phone {
	
	String ph_id;
	String ph_type;
	int ph_no;
    Phone(String ph_id,String ph_type,int ph_no)
    {
    	this.ph_id=ph_id;
    	this.ph_type=ph_type;
    	this.ph_no=ph_no;
    }
}
public class Employee
{
	String empname;
	int empid;
	Phone ph_details;
 
	public Employee(String empname,int empid,Phone ph_details)
	{
		this.empname=empname;
		this.empid=empid;
		this.ph_details=ph_details;
	}
	void display()
	{
		System.out.println("Employee name:"+empname+" "+"Employee id:"+empid);
	    System.out.println("phone id:"+ph_details.ph_id+" "+"phone type:"+ph_details.ph_type+" "+"phone number:"+ph_details.ph_no);
	}
	
public static void main(String[] args) 
{
	Phone a=new Phone("AB123456","Mobile",97654321);
	Phone a1=new Phone("AB12345678","Landline",87432100);
	Employee employee=new Employee("Sk",107,a);
	Employee employee1=new Employee("Dk",108,a1);
	employee.display();
	employee1.display();
 
	}

}
