package task4;
import java.util.*;  
public class Alphabetical {  
    static boolean PositiveString(String a)  
    {  
        int n = a.length();  
        char c[] = new char [n];  
        
        for (int i = 0; i < n; i++) 
        {  
            c[i] = a.charAt(i);  
        }  
        Arrays.sort(c);  
        for (int i = 0; i < n; i++)  
            if (c[i] != a.charAt(i))   
                return false;         
        return true;      
    }  
      
    public static void main(String args[]) 
    { 
        String a = "ANT";  
        if (PositiveString(a))  
        {
           System.out.println("Yes");  
        }
        else
            System.out.println("No");        
    } 

}
