package assignments;

import java.util.Scanner;

public class Program_1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan=new Scanner(System.in);
		
		double a,b,result ;
		System.out.println("Enter the first number");
		a=scan.nextDouble();
		System.out.println("Enter the second number");
		b=scan.nextDouble();
		System.out.println("choose a opreation +,-,*,/");
		String opreator =scan.next();
		
		switch (opreator) {
		 
		case "+" :
			result=a+b;
			System.out.println(a+"+"+b+" = "+ result);
			break;
		
		case "-":
			result=a-b;
			System.out.println(a+"-"+b+" = "+ result);
			break;
			
		case "*":
			result=a*b;
			System.out.println(a+"*"+b+" = "+ result);
			break;
			
		case "/":
			result=a/b;
			System.out.println(a+"/"+b+" = "+ result);
			break;
			
		default:
			System.out.println("Enter valid opreator");
			break;
		}

	}

}
