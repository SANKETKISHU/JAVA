import java.util.Scanner;
class time
{
  int hours,minutes,seconds;
  time(int h,int m,int s) 
  {
    hours=h;
    minutes=m;
    seconds=s;
  }
 void display()
 {
   System.out.println(hours+":"+minutes+":"+seconds);
 }
 void add(time t1,time t2)
 { 
   int m=0;
   t1.seconds=t1.seconds+t2.seconds;
   if(t1.seconds==60)
  {
      t1.seconds=0;
      t1.minutes=t1.minutes+1;
  }
  if(t1.seconds>60)
  {
    t1.seconds=t1.seconds/60;
    m=t1.seconds%60;
  }
  t1.minutes=t1.minutes+t2.minutes+m;
  if(t1.minutes==60)
  {
       t1.minutes=0;
       t1.hours=t1.hours+1;
  }
  if(t1.minutes>60)
  {
    t1.minutes=t1.minutes/60;
    m=t1.minutes%60;
    t1.hours=t1.hours+t2.hours+m;
  }
  else if(t1.hours==24)
  {
     t1.hours=0;
     t1.hours=t1.hours+t2.hours+1;
  }
  else
  {
    t1.hours=t1.hours+t2.hours;
   }
 }
}
class timetest
{
  public static void main(String args[])
  {
    Scanner sc=new Scanner(System.in);
    int h1,m1,s1;
    System.out.println("ENTER THE TIME 1");
    System.out.println("ENTER HOURS = ");
    h1=sc.nextInt();
    System.out.println("ENTER MINUTES = ");
    m1=sc.nextInt();
    System.out.println("ENTER SECONDS = ");
    s1=sc.nextInt();
    time t4=new time(h1,m1,s1);
    t4.display();
    System.out.println("ENTER THE TIME 2");
    System.out.println("ENTER HOURS = ");
    h1=sc.nextInt();
    System.out.println("ENTER MINUTES = ");
    m1=sc.nextInt();
    System.out.println("ENTER SECONDS = ");
    s1=sc.nextInt();
    time t5=new time(h1,m1,s1);
    t5.display();
    t4.add(t4,t5);
    System.out.print("ADD BOTH THE TIMES = ");
    t4.display();
  }
}

  

