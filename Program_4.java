package assignments;

import java.util.Scanner;

public class Program_4 {

	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
        int arr[]= {1,2,3,4,5,6,7,8,9};
       System.out.println("enter the length for input array");
          int len =scan.nextInt();
        int arr2[]=new int[len];
        //Enter input array values 
        System.out.println("Enter input array values ");
        for(int i=0;i<=arr2.length-1;i++) {
        	System.out.println("enter input array value at index : "+i);
        	arr2[i]=scan.nextInt();
        }
        //entering result values in res array
        String res[]=new String [arr.length];
        for(int i=0;i<=arr.length-1;i++) {
        	int count=0;
        	for(int j=0;j<=arr2.length-1;j++) {
        		if(arr2[j]%arr[i]==0) {
        			count++;
        		}
        		
        	}
        	res[i]=arr[i]+":"+count;
        }
        
        //Output array values 
        System.out.print("{");
        for(int i=0;i<=res.length-1;i++) {
        	if(i==res.length-1) {
        		System.out.print(res[i]+"}");
        	}
        	else {
        		System.out.print(res[i]+",");
        	}
        }
         
	}

}
