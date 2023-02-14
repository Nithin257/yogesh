import java.util.Scanner;
class Tester
{
public static void main(String[] args)
{
Scanner sc= new Scanner(System.in);
for(int i=2; i<=100; i++)
	{
int num=i;
boolean flag=true;
for(int j=2; i<=num/2; j++)
{
if(num%j==0)
{
flag=false;
break;
}
}
	}
if(flag==true)
{
System.out.println("the number is prime number");
}
}
}