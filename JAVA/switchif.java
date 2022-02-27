import java.util.Scanner;
public class switchif
{
 public static void main(String args[])
 {
   int ch,theory,practical,wet,wep,avg,n=1;
   Scanner sc = new Scanner(System.in);
   while(n==1)
   {
     System.out.println(" 1 FOR CALCULATE THE RESULT OF STUDENT ");
     System.out.println(" 2 FOR MARKS DETAILS ");
     System.out.println(" 3 EXIT ");
     System.out.println(" ENTER YOUR CHOICE ");
     ch=sc.nextInt();
     switch(ch)
     {
       case 1:
       System.out.println(" ENTER THE TOTAL MARKS IN THEORY ");
       theory=sc.nextInt();
       System.out.println(" ENTER THE TOTAL MARKS IN PRACTICAL ");
       practical=sc.nextInt();
       wet=theory*40/100;
       wep=practical*60/100;
       avg=wet+wep;
       if(avg>=90)
      {
        System.out.println(" EXCELLENT = "+avg);
      }
      else if(avg<90 && avg>=80)
      {
        System.out.println(" VERY GOOD = "+avg);
      }
      else if(avg<80 && avg>=60)
      {
        System.out.println (" GOOD = "+avg); 
      }
      else if(avg<60 && avg>=50)
      {
        System.out.println(" SATISFACTORY = "+avg);
      }
      else
     {
       System.out.println(" FAIL = "+avg); 
     }
     break;
     case 2:
     System.out.println("AVRAGE IS GREATER THAN OR EQUAL TO 90 SO THE RESULT IS EXCELLENT");
     System.out.println("AVRAGE IS GREATER THAN 80 OR EQUAL TO 80 BUT LESS THAN 90 SO THE RESULT IS VERY GOOD");
     System.out.println("AVRAGE IS GREATER THAN 60 OR EQUAL TO 60 BUT LESS THAN 80 SO THE RESULT IS GOOD");
     System.out.println("AVRAGE IS GREATER THAN 50 OR EQUAL TO 50 BUT LESS THAN 60 SO THE RESULT IS SATISFACTORY ");
     System.out.println("AVRAGE IS LESS THAN 50 SO THE RESULT IS FAIL");
     break;
     case 3:
     System.exit(0);
     default:
     System.out.println("WRONG CHOICE");
     break;
    }
   }
 }
}
   


 
