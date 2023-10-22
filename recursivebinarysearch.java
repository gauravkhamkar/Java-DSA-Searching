public class recursivebinarysearch {
    static int search(int arr[], int key, int start, int end)
    {
        int mid = (start+end)/2;
        if(arr[mid]==key)
        {
            return mid;
        }
        else if(arr[mid]<key)
        {
            return search(arr, key, mid+1, end);
        }
        else
        {
            return search(arr, key, start, mid-1);
        }      
    }
    public static void main(String args[])
    {
        int [] arr = {10,20,30,40,50,60};
        System.out.println(search(arr,20, 0, arr.length-1));
    }
}
