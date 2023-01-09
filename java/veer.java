import java.io.*;
class veer
{
int a,b;
public void out(int x)
{
a=3.14*x*x;
System.out.println("area of circle="+a);
}
public void out(int y,int z)
{
b=y*z;
System.out.println("area of rectangle="+b);
}
}
public class area
{
public static void main(String args[])throws IOException
{
DataInputStream s=new DataInputStream(System.in());
System.out.println("radius of circle=");
int a=Integer.parseInt(s.readLine());
System.out.println("length of rectangle=");
int b=Integer.parseInt(s.readLine());
System.out.println("breath of rectangle=");
int c=Integer.parseInt(s.readLine());
veer g=new veer();
g.out(a);
g.out(b,a);
}
}
