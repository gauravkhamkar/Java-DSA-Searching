
public class binarySearch {
    static int search(int arr[], int key)
    {
        int start=0;
        int end = arr.length-1;
        
        while(start<=end)
        {
            int mid = start+(end-start)/2;
            if(key==arr[mid])
            {
                return mid;
            }
            else if(key<arr[mid])
            {
                end=mid-1;
            }
            else if(key>arr[mid])
            {
                start=mid+1;
            }           
        }     
        return -1;
    }

    public static void main(String args[])
    {
        int [] arr = {10,20,30,40,50,60};
        System.out.println(search(arr,20));
    }
}

