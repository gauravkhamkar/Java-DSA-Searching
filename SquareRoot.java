public class SquareRoot {
    static int squrt(int x)
    {
        int low=1;
        int high=x;
        int ans=-1;
        while(low<=high)
        {
            int mid=(low+high)/2;
            int msq=mid*mid;
            if(msq==x)
            {
                return mid;
            }
            else if(msq>x)
            {
                high=mid-1;
            }
            else
            {
                low=mid+1;
                ans=mid;
            }
        }
        return ans;
    }
    public static void main(String args[])
    {
        int x=10;
        System.out.println(squrt(x));
    }
    
}
// we have given an integer find the square root of this integer
// note-if x=14 it will return squareroot as 3.22323 as 3 only
// int sqroot(int x)
// {
//     int i=1;
//     while(i*i<=x)
//     {
//         i++;
//     }
//     return i;
// }