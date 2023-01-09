import java.util.*;
import java.io.*;
class one
{
int t,c;
public void withdraw(int b,int w)
{
t=b-w;
System.out.println("Total amount="+t);
}
public void deposit(int b,int d)
{
c=b+d;
System.out.println("Total amount="+c);
}
}
public class account
{
public static void main(String args[])
{
Scanner ae=new Scanner(System.in);
System.out.println("account no:");
int x=ae.nextInt();
System.out.println("balance:");
int y=ae.nextInt();
System.out.println("withdraw or deposit:");
String z=ae.nextLine();
one j=new one();
if(z.equals("withdraw"))
{
System.out.println("Enter the withdraw amount=");
int m=ae.nextInt();
j.withdraw(y,m);
}
else
{
System.out.println("Enter the deposite amount=");
int n=ae.nextInt();
j.deposit(y,n);
}
}
}