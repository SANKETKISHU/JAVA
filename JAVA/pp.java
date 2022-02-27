import java.util.Scanner;
class person
{
 String name;
 int age;
 int salary;

 void accept(String n,int a,int s)
 {
  name=n;
  age=a;
  salary=s;
 }
 void display()
 {
  System.out.println(" NAME   ="+name);
  System.out.println(" AGE    ="+age);
  System.out.println(" SALARY ="+salary);
 }
}
class pp
{
 public static void main(String args[])
 {
  Scanner sc=new Scanner(System.in);
  person p=new person();
  System.out.print(" ENTER THE NAME   =");
  String n1=sc.nextLine();
  System.out.println();
  System.out.print(" ENTER THE AGE    =");
  int a1=sc.nextInt();
  System.out.println();
  System.out.print(" ENTER THE SALARY =");
  int s1=sc.nextInt();
  System.out.println();
  p.accept(n1,a1,s1);
  p.display();
 }
}