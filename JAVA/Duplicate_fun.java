class Duplicate_fun
{
	
	public static void removeDuplicate(int arr[], int n) 
	{
	    int j = 0;
	    int[] temp = new int[n];
	    
	    
	    for (int i = 0; i < n-1; i++) 
	    {
	    	
	        if (arr[i] != arr[i+1]) 
	        {
	            temp[j] = arr[i];
	            j++;
	        }
	    }
	
	    
	    temp[j++] = arr[n-1];
	
	    
	    for (int i = 0; i < j; i++)
	    {
	    	arr[i] = temp[i];
	    }
	    
	    
	    for (int i = 0; i < j; i++)
	    {
	        System.out.print(arr[i]+" ");
	    }
	
	}
	
	public static void main (String[] args)
	{
	    int arr[] = {1, 3, 5, 5, 7, 9};
	    int n = arr.length;
	    System.out.println("original array");
	    for(int m=0;m<6;m++)
            {
              System.out.print(arr[m]);
            }
            System.out.println();
	    if (n > 1)
	    {
                System.out.println("after remove duplicate array");
	        removeDuplicate(arr, n);
	    }
	}
}