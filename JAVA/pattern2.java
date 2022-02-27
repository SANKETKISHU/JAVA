class pattern2
{
 public static void main(String abc[])
 {
  int alphabet=65;
  for(int i=1;i<5;i++)
  {
   for(int j=1;j<=i;j++)
   {
    System.out.print((char)alphabet);
   }
   System.out.println();
   alphabet++;
  }
 }
}