public class Duplicate {

public static void main(String[] args) {
int index=0;
int[] arr = {10,20,20,50,50,45};
int size = arr.length;
int duplicate,flag=0,count;
int[] anti_dup= new int[size];
int i,j;
System.out.println("Before removing duplicate from the array:");
for(i=0;i<size;i++)
{
System.out.println(arr[i]);
}

for(i=0;i<size;i++)
{
count=0;
for(j=i+1;j<size;j++)
{
if(arr[i]==arr[j])
{
count=count+1;
break;
}

} 
if(count==0)
{
anti_dup[index]=arr[i];
index++;
}
}

for(i=0;i<index;i++)
{
arr[i]=anti_dup[i];
}
System.out.println("After removing duplicate from the array");
for(i=0;i<index;i++)
{
System.out.println(arr[i]);
}

}
}