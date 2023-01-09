package Lab2;

import java.util.Scanner;

public class demo {
	public static void main(String args[])   
	{   
	int i, j, row;
	Scanner sc = new Scanner(System.in);
	System.out.println("Nhap n: ");
	row = sc.nextInt();
	
	//i for rows and j for columns      
	//row denotes the number of rows you want to print  
	   
	//outer loop for rows  
	for(i=0; i<row; i++)   
	{   
	//inner loop for columns  
	for(j=0; j<=i; j++)   
	{   
	//prints stars   
	System.out.print("* ");   
	}   
	//throws the cursor in a new line after printing each line  
	System.out.println();   
	}   
	}   
	}  


