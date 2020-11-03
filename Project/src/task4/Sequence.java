package task4;

public class Sequence {
	    static int checkSorted(int arr[],int n)
	    {
	        if (n==1 || n==0)
	        {
	         return 1;
	        }
	        if (arr[n-1] < arr[n-2])
	        {
	            return 0;
	        }
	        return checkSorted(arr,n-1);
	    }
	    public static void main(String[] args)
	    {
	        int arr[] = {98,35,1,32,3,40,400};
	        int n =arr.length;
	        if (checkSorted(arr,n)!=0)
	        {
	            System.out.println("True");
	        }
	            else
	            System.out.println("False");
	    }
	}


