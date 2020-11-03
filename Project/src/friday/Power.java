package friday;
interface Add{  
	    int add(int a,int b);  
	}
	    public class Power
	    {  
	        public static void main(String[] args) 
	        {  
	              
	            // Multiple parameters in lambda expression  
	            Add ad1=(a,b)->(a+b);  
	            System.out.println(ad1.add(10,20));  
	              
	            // Multiple parameters with data type in lambda expression  
	            Add ad2=(int a,int b)->(a+b);  
	            System.out.println(ad2.add(100,200));  
	        }  
	    }  