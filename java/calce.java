import java.awt.event.*;
import javax.swing.*;
public class calce implements ActionListener
{
JFrame f;
JTextField f1,f2,f3;
JButton b1,b2,b3,b4;
calce()
{
f =new JFrame("Calculator");
JLabel l1=new JLabel("First num:");
l1.setBounds(20,20,150,50);
JLabel l2=new JLabel("Second num:");
l2.setBounds(20,70,150,50);
f1=new JTextField();
f1.setBounds(50,50,150,50);
f2=new JTextField();
f2.setBounds(50,100,150,50);
f3=new JTextField();
f3.setBounds(50,150,150,50);
f3.setEditable(false);
b1=new JButton("ADD");
b1.setBounds(20,200,200,50);
b2=new JButton("SUB");
b2.setBounds(50,200,200,50);
b3=new JButton("MUL");
b3.setBounds(80,200,200,50);
b4=new JButton("DIV");
b4.setBounds(100,200,200,50);
b1.addActionListener(this);
b2.addActionListener(this);
b3.addActionListener(this);
b4.addActionListener(this);
f.add(l1);
f.add(l2);
f.add(f1);
f.add(f2);
f.add(f3);
f.add(b1);
f.add(b2);
f.add(b3);
f.add(b4);
f.setSize(300,300);
f.setLayout(null);
f.setVisible(true);
}
public void actionPerformed(ActionEvent e)
{
String s1,s2;
s1=f1.getText();
s2=f2.getText();
int a,b,c;
a=Integer.parseInt(s1);
b=Integer.parseInt(s2);
c=0;
if(e.getSource()==b1)
{
c=a+b;
}
if(e.getSource()==b2)
{
c=a-b;
}
if(e.getSource()==b3)
{
c=a*b;
}
if(e.getSource()==b4)
{
c=a/b;
}
String r=String.valueOf(c);
f3.setText(r);
}
public static void main(String args[])
{
new calce();
}
}