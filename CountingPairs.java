/*Given a sorted array and a sum, find if there is a
 * pair with given sum.
 */

public class CountingPairs{
    static int getpair(int arr[], int x)
    {
      int count=0;
      int l=0;
      int h=arr.length-1;
      while(l<h)
      {
        if(arr[l]+arr[h]==x)
        {
           count++;
           
           l++;
           h--;
           
        }
        if(arr[l]+arr[h]>x)
        {
            h--;
        }
        else{
            l++;
        }
       
      }
      return count;
    
    }
    public static void main(String args[])
    {
        int [] arr={2,5,8,12,30};
        System.out.println(getpair(arr,13));
        
    }
}

