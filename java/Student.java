import java.awt.Dimension;
import javax.swing.*; 
import java.awt.event.*; 
public class Student implements ActionListener{ 
 
 JTextField tf1,tf2; 
 JLabel l1,l2,l3,L4;
 JRadioButton r1,r2;
 JComboBox cb,cb1,cb2;
 JButton b1,b2; 
 Student(){ 
 JFrame f= new JFrame("Registration"); 
 JLabel l1=new JLabel("Name:");
 l1.setBounds(20,20,100,20);
 JLabel l2=new JLabel("Mobile number:");
 l2.setBounds(20,70,100,20);
 JLabel l3=new JLabel("Gender:");
 l3.setBounds(20,125,100,20);
 JLabel l4=new JLabel("DOB:");
 l4.setBounds(20,175,100,20);
 tf1=new JTextField(); 
 tf1.setBounds(50,50,150,20); 
 JRadioButton r1=new JRadioButton("A) Male"); 
JRadioButton r2=new JRadioButton("B) Female"); 
r1.setBounds(50,150,150,20); 
r2.setBounds(200,150,150,20); 
ButtonGroup bg=new ButtonGroup(); 
bg.add(r1);bg.add(r2); 
String date[]={"1","2","3","4","5","6","7","8","9","10","11","12","13","14","15","16","17","18","19","20","21","22","23","24","25","26","27","28","29","30","31"}; 
 JComboBox cb=new JComboBox(date); 
 cb.setBounds(50, 200,100,20);
 
 String month[]={"January","February","March","April","May","June","July","August","September","Octuber","November","December"}; 
 JComboBox cb1=new JComboBox(month); 
 cb1.setBounds(100, 200,100,20); 
 String year[]={"2000","2001","2002","2003","2005"}; 
 JComboBox cb2=new JComboBox(year); 
 cb2.setBounds(150, 200,100,20);
 tf2=new JTextField(); 
 tf2.setBounds(50,100,50,20); 
 
 b1=new JButton("Submit"); 
 b1.setBounds(50,250,50,50); 
 b2=new JButton("Reset"); 
 b2.setBounds(120,250,50,50); 
 b1.setPreferredSize(new Dimension(500, 500));
 
 b1.addActionListener(this); 
 b2.addActionListener(this); 
 
 f.add(tf1);f.add(tf2);f.add(b1);f.add(b2); 
 f.add(l1);
 f.add(l2);
 f.add(l3);
 f.add(l4);
 
 f.add(r1);
 f.add(r2);
 f.add(cb);
 f.add(cb1);
 f.add(cb2);
 f.setSize(500,500); 
 f.setLayout(null); 
 f.setVisible(true); 
 } 
 public void actionPerformed(ActionEvent e) { 
 String s1=tf1.getText(); 
 String s2=tf2.getText(); 
 
 if(e.getSource()==b1){ 
 System.out.println("submitted successfully");
 }else if(e.getSource()==b2){ 
 System.out.println("Reset");
 } 
 
 
 } 
public static void main(String[] args) { 
 new Student(); } }