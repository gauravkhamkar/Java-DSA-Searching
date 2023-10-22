public class count1sSortedBinaryArray {
    static int occur(int arr[])
    {
        int start=0;
        int end=arr.length-1;
        
        while(start<end)
        {
        
           int mid = start + (end - start) / 2; 
           if(arr[mid]==0)
           {
             start=mid+1;
           }
           else{
            if(mid==0 || arr[mid-1]!=arr[mid])
            {
                return arr.length-mid;
            }
            else{
                end=mid-1;
                
            }
           }
            
        }
        return -1;
       
        
    }
    public static void main(String args[])
    {
        int [] arr={1,1};
        System.out.println(occur(arr));
    }
}
// we have given a sorted array which contains only 0,1 
// and we want to find number of occuerences of 1;
// so we apply binary search 
// logic-we find the mid and if the mid is zero then ofcourse
// we need to search in the right side of the mid
// if the mid is 1 then we need to check if the previuos element
// is 1 if it is then we need to search in left side for finding the first 
// occurence beacause if we substract totan length - the first occurence index
// then we get the number of 1s || if the mid is first element.

