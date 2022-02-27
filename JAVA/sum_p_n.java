import java.util.Scanner;
void sum(int arr[],int n)
{
  int p=0,n=0;
  for(int i=0;i<n-1;i++)
  {
    if(arr[i]>=0)
    {
     p=p+1;
    }
    elseif(arr[i]<0)
    {
      n=n+1; 
    }
    System.out.println("SUM OF +VE NUMBER = "+p);
    System.out.println("SUM OF -VE NUMBER = "+n);
   }
class sum_p_n
{
 public static void main(String args[])
 {
  int arr[]={1,2,4,6,-9,-10,-8};
  int n=arr.length;
  System.out.println(" elements ");
  for(int m;m<n-1;m++)
  {
   System.out.println(arr[m]);
  }
  sum(arr,n);
 }
}