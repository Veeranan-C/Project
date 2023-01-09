import java.io.*;
public class rs
{
public static void main(String args[])throws IOException
{
double x,y,z;
y=68.01;
z=80.31;
DataInputStream a=new DataInputStream(System.in);
System.out.println("press 1 to dollar and press 2 to euro:");
int a1=Integer.parseInt(a.readLine());
System.out.println("amount:");
int b=Integer.parseInt(a.readLine());
if(a1==1)
{
x=b*y;
System.out.println("Rs="+x);
}
else
{
x=b*z;
System.out.println("Rs="+x);
}
}
}
