package assignments;

import java.util.Scanner;

public class Program_2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter the number");
		int a =scan.nextInt();
		
		int count=1;
		for(int i =1;i<=a;i++) {
			if(i==a) {
				System.out.print(count);
			}
			else {
			System.out.print(count+",");
			count+=2;
			}
			
		}

	}

}
