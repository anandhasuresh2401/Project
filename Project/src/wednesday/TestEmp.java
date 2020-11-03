package wednesday;

import java.util.HashSet;

public class TestEmp {

	public static void main(String[] args) {
       Emp e1=new Emp(12,"fds");
       Emp e2=new Emp(43,"cds");
       Emp e3=new Emp(56,"qwr");
       
       HashSet<Emp> ha=new HashSet<Emp>();
       ha.add(e1);
       ha.add(e2);
       ha.add(e3);
       System.out.println(ha.size());
	}

}
