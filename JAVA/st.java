import java.util.Scanner;
class item
{
 static int count;
 int number;
 int c;
 
 item()
 {
  c=0;
 }
 
 void getdata(int a)
 {
  number=a;
  count++; //Static number
  c++; //Non static number
 }

 void getcount()
 {
  System.out.println("STATIC          = "+count);
  System.out.println("NON STATIC = "+c);
 }
}

class st
{
 public static void main(String args[])
 {
  Scanner sc=new Scanner(System.in);
  item a1=new item();
  item b1=new item();
  item c1=new item();
  a1.getcount();
  b1.getcount();
  c1.getcount();
  a1.getdata(100);
  b1.getdata(200);
  c1.getdata(300);
  System.out.println("AFTER READING DATA ");
  a1.getcount();
  b1.getcount();
  c1.getcount();
 }
}