import java.io.*;
import java.util.*;
public class array1
{
public static void main(String args[])
{
int ch,index;
String name;
ArrayList<String> obj=new ArrayList<String>();
obj.add("veera");
obj.add("sooo");
Scanner ae=new Scanner(System.in);
System.out.println("Enter ur choice=");
int n=ae.nextInt();
do
{

switch(n)
{
case 1:
System.out.println("ent the str=");
name=ae.nextRead();
System.out.println("Enter the pos=");
index=ae.nextInt();
if(index<=obj.size())
{
obj.add(index,name);
}
else
{
System.out.println("rooro");
}
break;
case 2:
System.out.println("ente teh char=");
name=ae.nextLine();
for(int i=0;i<obj.size();i++)
{
if(obj.get(i).startsWith(name))
{
System.out.println(obj.get(i));
}
}
break;
default:
System.out.println("Error");
}
}
while(n<4);

}
}