import java.io.*;
class one
{
double z;
public void out(int a1)
{
if(a1<=100)
{
z=a1*1.5;
System.out.println("amount="+z);
}
else if(100<a1 &&  a1<500)
{
z=a1*4.5;
System.out.println("amount="+z);
}
else
{
z=a1*7;
System.out.println("amount="+z);
}
}
static double x;
public void out1(int a2)
{
if(a2<=0)
{
x=a2*2.5;
System.out.println("amount="+x);
}
else if(200<a2 && a2<500)
{
x=a2*6.5;
System.out.println("amount="+x);
}
else
{
x=a2*9;
System.out.println("amount="+x);
}
}
}
public class ebill
{
public static void main(String args[])throws IOException
{
int l,n;
{
n=1;
while(n!=0)
{
DataInputStream i=new DataInputStream(System.in);
System.out.println("consumer no:");
int a=Integer.parseInt(i.readLine());
System.out.println("consumer name:");
String name=i.readLine();
System.out.println("current month reading=");
int k=Integer.parseInt(i.readLine());
System.out.println("domestic or commercial:");
String m=i.readLine();
one j=new one();
if(m.equals("domestic"))
{
j.out(k);
}
else
{
//two j=new two();
j.out1(k);
}
}
}
}
}