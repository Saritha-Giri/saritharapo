package Pack2;
import java.util.Scanner;
public class Array
{
	public void m1()
	{     
int arr[]=new int[8];
java.util.Scanner sc=new Scanner(System.in);
System.out.println("enter values");

	for(int i=0;i<5;i++)
	{
		arr[i]=sc.nextInt();
	}
	System.out.println("output");
	for(int i=0;i<5;i++)
	{
		System.out.println(arr[i]);
	}
}
public static void main(String[] args) {
	Array a=new Array();
	a.m1();
}

}
