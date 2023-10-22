public class SearchinSortedRotatedArray {
    static int search(int arr[], int x)
    {
        int s=0;
        int e=arr.length-1;
        while(s<=e)
        {
            int mid=(s+(e-s)/2);
            if(arr[mid]==x)
            {
                return mid;
            }
            else if(arr[s]<arr[mid])
            {
                if(x>=arr[s]&& x<arr[mid])
                {
                    e=mid-1;
                }
                else
                {
                    s=mid+1;
                }
            }
            else
            {
                if(x>arr[mid] && x<=arr[e])
                {
                    s=mid+1;
                }
                else
                {
                    e=mid-1;
                }
            }
        }
        return -1;
    }
    public static void main(String args[])
    {
        int [] arr={10,20,40,60,5,8};
        System.out.println(search(arr,5));
    }

}
