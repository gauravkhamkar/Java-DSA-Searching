public class IndexOfLastOccurence {
    static int search(int arr[], int key, int start, int end)
    {   if(start>end)
        {
            return -1;
        }
        
        int mid = (start+end)/2;

        if(arr[mid]<key)
        {
            return search(arr, key, mid+1, end);
        }
        else if(arr[mid]>key)
        {
            return search(arr, key, start, mid-1);
        }
        else
        {
            if(mid==arr.length-1 || arr[mid+1]!=arr[mid])
            {
                return mid;
            }
            else{
                return search(arr, key, mid+1, end);
            }
        }      
    }
    public static void main(String args[])
    {
        int [] arr = {10,10,10,20,20,20,30,40,50,60};
        System.out.println(search(arr,21, 0, arr.length-1));
    }
}
