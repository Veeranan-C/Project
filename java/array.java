import java.io.*;
import java.util.*;
public class array
{
public static void main(String args[])
{
int x,y,m,n;
Scanner ae=new Scanner(System.in);
System.out.println("Enter the number of elements=");
int z=ae.nextInt();
System.out.println("Enter the number one by one");
int a[]=new int[z];
for(int i=0;i<z;i++)
{
a[i]=ae.nextInt();
}
y=a[0];
n=a[0];
for(int j=0;j<z;j++)
{
x=a[j];
if(x>y)
{
y=x;
}
}
System.out.println("Gratest Number="+y);
for(int t=0;t<z;t++)
{
m=a[t];
if(m<n)
{
n=m;
}
}
System.out.println("Smallest Number="+n);
}
}