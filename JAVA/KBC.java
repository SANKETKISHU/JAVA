import java.util.Scanner;
class KBC 
{
    public static void main(String args[])
    {
        int price=0;
        int s=0,c=0,ch;
        int m,a=1; 
        Scanner sc=new Scanner(System.in);
        System.out.println("WELCOME TO JAVA KBC VIRTUAL MACHINE ");
        while(a==1)
        {
            System.out.println("*************************************************** ");
            System.out.println("[1] START KBC ");
            System.out.println("[2] SCORE ");
            System.out.println("[3] WIN PRICE ");
            System.out.println("[4] EXIT ");
            System.out.println("ONCE YOU START YOU HAVE TO COMPLETE ");
            System.out.println("*************************************************** ");
            System.out.println("ENTER YOUR CHOICE ");
            ch=sc.nextInt();
            switch(ch)
            {
                case 1:
                System.out.println("\n\n1st QUESTION PRICE 10000 ");
                System.out.println("\n\nWhich of the following option leads to the portability and security of Java? ");
                System.out.println("\n\n1: Bytecode is executed by JVM\t\t2: The applet makes the Java code secure and portable\n3: Use of exception handling\t\t4: Dynamic binding between objects");
                System.out.print("ENTER YOUR OPTION ");
                m=sc.nextInt();
                if(m==1)
                {
                    System.out.println(" CORRECT ANSWER ");
                    price=10000;
                    s=s+1;
                }
                else
                {
                    System.out.println("WRONG ANSWER ");
                }
                m=0;
                System.out.println("\n\n2nd QUESTION PRICE 20000 ");
                System.out.println("\n\nThe \u0021 article referred to as a ");
                System.out.println("\n\n1: Unicode escape sequence\t\t2: Octal escape\n3: Hexadecimal\t\t4: Line feed");
                System.out.print("ENTER YOUR OPTION ");
                m=sc.nextInt();
                if(m==1)
                {
                    System.out.println(" CORRECT ANSWER ");
                    price=price+20000;
                    s=s+1;
                }
                else
                {
                    System.out.println("WRONG ANSWER ");
                }
                m=0;
                System.out.println("\n\n3rd QUESTION PRICE 30000 ");
                System.out.println("\n\n_____ is used to find and fix bugs in the Java programs. ");
                System.out.println("\n\n1: JVM\t\t2: JRE\n3: JDK\t\t4: JDB");
                System.out.print("ENTER YOUR OPTION ");
                m=sc.nextInt();
                if(m==3)
                {
                    System.out.println(" CORRECT ANSWER ");
                    price=price+30000;
                    s=s+1;
                }
                else
                {
                    System.out.println("WRONG ANSWER ");
                }
                m=0;
                System.out.println("\n\n4th QUESTION PRICE 40000 ");
                System.out.println("\n\nWhat is the return type of the hashCode() method in the Object class? ");
                System.out.println("\n\n1: Object\t\t2: int\n3: long\t\t4: void");
                System.out.print("ENTER YOUR OPTION ");
                m=sc.nextInt();
                if(m==2)
                {
                    System.out.println(" CORRECT ANSWER ");
                    price=price+40000;
                    s=s+1;
                }
                else
                {
                    System.out.println("WRONG ANSWER ");
                }
                m=0;
                System.out.println("\n\n5th QUESTION PRICE 50000 ");
                System.out.println("\n\nWhat does the expression float a = 35 / 0 return? ");
                System.out.println("\n\n1: 0\t\t2: Not a Number\n3: Infinity\t\t4: Run time exception");
                System.out.print("ENTER YOUR OPTION ");
                m=sc.nextInt();
                if(m==3)
                {
                    System.out.println(" CORRECT ANSWER ");
                    price=price+50000;
                    s=s+1;
                }
                else
                {
                    System.out.println("WRONG ANSWER ");
                }
                m=0;
                System.out.println("\n\n6th QUESTION PRICE 60000 ");
                System.out.println("\n\nWhich package contains the Random class? ");
                System.out.println("\n\n1: java.util package\t\t2: java.lang package\n3: java.awt package\t\t4: java.awt package");
                System.out.print("ENTER YOUR OPTION ");
                m=sc.nextInt();
                if(m==1)
                {
                    System.out.println(" CORRECT ANSWER ");
                    price=price+60000;
                    s=s+1;
                }
                else
                {
                    System.out.println("WRONG ANSWER ");
                }
                m=0;
                System.out.println("\n\n7th QUESTION PRICE 70000 ");
                System.out.println("\n\nAn interface with no fields or methods is known as a ______. ");
                System.out.println("\n\n1: Runnable Interface\t\t2: Marker Interface\n3: Abstract Interface\t\t4: CharSequence Interface");
                System.out.print("ENTER YOUR OPTION ");
                m=sc.nextInt();
                if(m==2)
                {
                    System.out.println(" CORRECT ANSWER ");
                    price=price+70000;
                    s=s+1;
                }
                else
                {
                    System.out.println("WRONG ANSWER ");
                }
                m=0;
                System.out.println("\n\n8th QUESTION PRICE 80000 ");
                System.out.println("\n\nWhich of the following is an immediate subclass of the Panel class?");
                System.out.println("\n\n1: Applet class\t\t2: Window class\n3: Frame class\t\t4: Dialog class");
                System.out.print("ENTER YOUR OPTION ");
                m=sc.nextInt();
                if(m==1)
                {
                    System.out.println(" CORRECT ANSWER ");
                    price=price+80000;
                    s=s+1;
                }
                else
                {
                    System.out.println("WRONG ANSWER ");
                }
                m=0;
                System.out.println("\n\n9th QUESTION PRICE 90000 ");
                System.out.println("\n\nWhich of the following is a reserved keyword in Java?");
                System.out.println("\n\n1: object\t\t2: strictfp\n3: main\t\t4: system");
                System.out.print("ENTER YOUR OPTION ");
                m=sc.nextInt();
                if(m==2)
                {
                    System.out.println(" CORRECT ANSWER ");
                    price=price+90000;
                    s=s+1;
                }
                else
                {
                    System.out.println("WRONG ANSWER ");
                }
                m=0;
                System.out.println("\n\n10th QUESTION PRICE 100000 ");
                System.out.println("\n\nWhich keyword is used for accessing the features of a package?");
                System.out.println("\n\n1: package\t\t2: import\n3: extends\t\t4: export");
                System.out.print("ENTER YOUR OPTION ");
                m=sc.nextInt();
                if(m==2)
                {
                    System.out.println(" CORRECT ANSWER ");
                    price=price+100000;
                    s=s+1;
                }
                else
                {
                    System.out.println("WRONG ANSWER ");
                }
                m=0;
                System.out.println("\n\n11th QUESTION PRICE 110000 ");
                System.out.println(" \n\nIn java, jar stands for_____.");
                System.out.println("\n\n1: Java Archive Runner\t\t2: Java Application Resource\n3: Java Application Runner\t\t4: None of the above");
                System.out.print("ENTER YOUR OPTION ");
                m=sc.nextInt();
                if(m==4)
                {
                    System.out.println(" CORRECT ANSWER ");
                    price=price+110000;
                    s=s+1;
                }
                else
                {
                    System.out.println("WRONG ANSWER ");
                }
                m=0;
                System.out.println("\n\n12th QUESTION PRICE 120000 ");
                System.out.println("\n\n What is the default encoding for an OutputStreamWriter?");
                System.out.println("\n\n1: UTF-8\t\t2: Default encoding of the host platform\n3: UTF-12\t\t4: None of the above");
                System.out.print("ENTER YOUR OPTION ");
                m=sc.nextInt();
                if(m==2)
                {
                    System.out.println(" CORRECT ANSWER ");
                    price=price+120000;
                    s=s+1;
                }
                else
                {
                    System.out.println("WRONG ANSWER ");
                }
                m=0;
                System.out.println("\n\n13th QUESTION PRICE 130000 ");
                System.out.println("\n\n What is the initial quantity of the ArrayList list?");
                System.out.println("\n\n1: 5\t\t2: 10\n3: 0\t\t4: 0");
                System.out.print("ENTER YOUR OPTION ");
                m=sc.nextInt();
                if(m==2)
                {
                    System.out.println(" CORRECT ANSWER ");
                    price=price+130000;
                    s=s+1;
                }
                else
                {
                    System.out.println("WRONG ANSWER ");
                }
                m=0;
                
                System.out.println("\n\n14th QUESTION PRICE 140000 ");
                System.out.println("\n\n Which of the following is a mutable class in java?");
                System.out.println("\n\n1: java.lang.String\t\t2: java.lang.Byte\n3: java.lang.Byte\t\t4: java.lang.StringBuilder");
                System.out.print("ENTER YOUR OPTION ");
                m=sc.nextInt();
                if(m==4)
                {
                    System.out.println(" CORRECT ANSWER ");
                    price=price+140000;
                    s=s+1;
                }
                else
                {
                    System.out.println("WRONG ANSWER ");
                }
                m=0;
                System.out.println("\n\n15th QUESTION PRICE 150000 ");
                System.out.println("\n\n How many threads can be executed at a time?");
                System.out.println("\n\n1: Only one thread\t\t2: Multiple threads\n3: Only main (main() method) thread\t\t4: Two threads");
                System.out.print("ENTER YOUR OPTION ");
                m=sc.nextInt();
                if(m==2)
                {
                    System.out.println(" CORRECT ANSWER ");
                    price=price+150000;
                    s=s+1;
                }
                else
                {
                    System.out.println("WRONG ANSWER ");
                }
                m=0;
                break;
                case 2:
                System.out.println("TOTAL SCORE ="+s );
                break;
                case 3:
                System.out.println("WIN PRICE ="+price );
                break;
                case 4:
                System.exit(0);
                default:
                System.out.println("WRONG CHOICE");
            }
        }
    }
}
                
                
        
    
    
