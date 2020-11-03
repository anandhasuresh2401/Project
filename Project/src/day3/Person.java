package day3;
import day3.Account.*;



public class Person{
 Account acc_holder;
   public Account getAcc_holder()
   {
	   return acc_holder;
   }
   public void setAcc_holder(Account acc_holder)
   {
	   this.acc_holder = acc_holder;
	   
   }
   private String name;
   public String getName()
   {
	   return name;
   }
   public void setName(String name)
   {
	   this.name=name;
	   
   }
   public int getAge()
   {
	   return age;
   }
   public void setAge(int age)
   {
	   this.age=age;
	   
   }
   private int age;
   
  
   public static void main(String[] args) {
     
	   Account obj = new Account();
	   obj.setAccNum(34567);
	   obj.getAccNum();
	   obj.setBalance(2000d);
	   
	   
	   Person a1=new Person();
	   a1.setAcc_holder(obj);
	   a1.getAcc_holder();
	   
	   a1.setName("smith");
	   a1.getName();
	   a1.setAge(30);
	   
	   Account obj1=new Account();
       obj1.setAccNum(5678);
       obj1.getAccNum();
       obj1.setBalance(3000d);
       Person b1=new Person();
       b1.setAcc_holder(obj1);
       b1.getAcc_holder();
       
	   b1.setName("Kathy");
	   b1.setAge(25);
	   
	   obj.deposit(2000d);
	   obj1.withdraw(2000d);
	   obj.getBalance();
	   obj1.getBalance();
	   
	   System.out.println(a1.getName()+" "+a1.getAge()+" "+obj.getAccNum()+" "+obj.getBalance());
	   System.out.println(b1.getName()+" "+b1.getAge()+" "+obj1.getAccNum()+" "+obj1.getBalance());

   }

}
