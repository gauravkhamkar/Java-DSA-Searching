import java.util.Arrays;
public class MedianofTwoSortedArrays {
       static double median(int a[], int b[])
       {
        int n1=a.length;
        int n2=b.length;
        int temp[]=new int[n1+n2];
        for(int i=0; i<n1; i++)
        {
            temp[i]=a[i];
        }
        for(int j=0; j<n2; j++)
        {
            temp[n1+j]=b[j];
        }
        Arrays.sort(temp);
        int mid=(temp.length-1)/2;
        if((n1+n2)%2!=0)
        {
           return temp[temp.length/2];
        }
        else
        {
            return (temp[mid]+temp[mid+1])/2;
        }

       }
       public static void main(String args[])
       {
        int []a={10,20,30};
        int []b={5,15,25};
        System.out.println(median(a,b));
       }
}
