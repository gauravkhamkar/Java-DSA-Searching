/*
 * to find majority element in an array if it exist
 * the element is a majority element if it appears more
 * than n/2 times in an array n is the size of an array
 * if you have array of size 5 then majority element should appear
 * 5/2=2.5 ie. at least 3 times
 * if array size is 6 then it should occur at least 4 times.
 */

public class MajorityElementInArray {
    static int findmajority(int arr[])
    {
        int res=0,count=1;
        for(int i=0; i<arr.length; i++)
        {
            if(arr[res]==arr[i])
            {
               count++;
            }
            else
            {
                count--;
                if(count==0)
            {
                res=i;
                count=1;
            }
            }
           
        }
        int cnt=0;
        for(int i=0; i<arr.length; i++)
        {
            if(arr[res]==arr[i])
            {
                cnt++;
            }
        }
        if(cnt<=arr.length/2)
        {
            res=-1;
        }
        
        return res;
    }
    public static void main(String args[])
    {
        int[]arr={8,8,8,8,8,6,6,6,4,6};
        System.out.println(findmajority(arr));
    }


}
/*
 * naive solution O(n^2)
 * for(int i=0; i<n; i++)
 * {
 *  int count=1;
 *  for(int j=i+1; j<n; j++)
 *  {
 *   if(arr[i]===arr[j])
 *   {
 *    count++;
 *    }
 *  }
 * if(count>n/2)
 * {
 * return i;
 * }
 * }
 * return -1;
 */
