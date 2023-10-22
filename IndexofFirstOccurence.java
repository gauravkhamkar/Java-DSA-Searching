public class IndexofFirstOccurence {
    static int search(int arr[], int key, int start, int end)
    {
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
            if(mid==0 || arr[mid-1]!=arr[mid])
            {
                return mid;
            }
            else{
                return search(arr, key, start, mid-1);
            }
        }      
    }
    public static void main(String args[])
    {
        int [] arr = {10,10,10,20,20,20,30,40,50,60};
        System.out.println(search(arr,20, 0, arr.length-1));
    }
}
