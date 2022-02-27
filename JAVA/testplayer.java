import java.util.Scanner;
interface player
{
 abstract void play();
}
class child implements player
{ 
 void play(String a)
 {
  System.out.println(a);
 }
}
class musician implement player
{
 void play(String a)
 {
  System.out.println(a);
 }
}
class actor implement player
{
 void play(String a)
 {
  System.out.println(a);
 }
}
class testplayer
{
 public static void main(String args[])
 {
  Scanner sc=new Scanner(System.in);
  player p;
  System.out.println("Enter about play");
  String aa=sc.nextLine();
  p=new child();
  p.play(aa);
  System.out.println("Enter about music");
  String bb=sc.nextLine();
  p=new musician();
  p.play(bb);
  System.out.println("Enter about actor");
  String cc=sc.nextLine();
  p=new actor();
  p.play(cc);
 }
}



 