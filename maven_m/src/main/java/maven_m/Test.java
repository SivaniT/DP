package maven_m;
import java.util.*;
public class Test {
	static long sum=0;
public static long add(long num)
{
	sum+=num;
	return sum;
}
public static long sub(long num)
{
	sum-=num;
	return sum;
}
public static long mul(long num)
{
	sum=sum*num;
	return sum;
}
public static long div(long num)
{
	if(num==0)
	{
		System.exit(1);
	}
	sum/=num;
	return sum;
}
public static void main(String args[])
{
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter a number to start the calculator");
	long n=sc.nextLong();
	long k=add(n);
	System.out.println("Enter '+' for addition,'-' for subtraction,'*' for multiplication and '/' for division.");
	
	char a=sc.next().charAt(0);
	while(a=='+'||a=='-'||a=='*'||a=='/')
	{
	switch(a)
	{
	case '+':System.out.println("Enter a number");
	         System.out.println(add(sc.nextLong()));
	         break;
	         
	case '-':System.out.println("Enter a number");
              System.out.println(sub(sc.nextLong()));
              break;
	case '*':System.out.println("Enter a number");
             System.out.println(mul(sc.nextLong()));
             break;
	case '/':System.out.println("Enter a number");
    		 System.out.println(div(sc.nextLong()));
    		 break;
	 default:System.out.println("Calculator app stopped!");
		System.exit(1);
	}
	a=sc.next().charAt(0);
	}
}
}
