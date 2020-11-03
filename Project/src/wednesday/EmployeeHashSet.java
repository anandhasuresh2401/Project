package wednesday;

import java.util.HashSet;
import java.util.Set;

public class EmployeeHashSet{
	
	
	     int empId;
	     String empName;

	    public EmployeeHashSet(int empId, String empName) {
	        super();
	        this.empId = empId;
	        this.empName = empName;
	    }

	    
	    public final int getEmpId() {
	        return empId;
	    }

	   
	    public final void setEmpId(int empId) {
	        this.empId = empId;
	    }

	    
	    public final String getEmpName() {
	        return empName;
	    }

	    
	    public final void setEmpName(String empName) {
	        this.empName = empName;
	    }

	   
	    public String toString() {
	        return "Employee [empId=" + empId + ", empName=" + empName + "]";
	    }

	    public int hashCode() {
	        return this.empId;
	    }

	   
	    public boolean equals(Object obj) {
	    	EmployeeHashSet employee = (EmployeeHashSet) obj;
	        if (employee.empId == this.empId) {
	            employee.setEmpName(this.empName);
	            return true;
	        } else {
	            return false;
	        }
	    }

	    public static void main(String[] args) {
	        Set<EmployeeHashSet> employees = new HashSet<>();
	        employees.add(new EmployeeHashSet(1, "Raj"));
	        employees.add(new EmployeeHashSet(2, "Pradeep"));
	        employees.add(new EmployeeHashSet(3, "Kumar"));
	        employees.add(new EmployeeHashSet(4, "Chandan"));

	        System.out.println(employees);
	    }
	}
