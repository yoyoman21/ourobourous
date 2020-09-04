import java.util.*;
 public class Assignment4
 {
public static void main(String[] args) {
        Scanner io=new Scanner(System.in);
        
        System.out.println("enter the no elements in array");
         int n=io.nextInt();
        int arr[]=new int[n];
        System.out.println("elements in array are");
        for(int i=0;i<n;i++)
        {
          arr[i]=io.nextInt();
        }
        int temp;

        for(int i=0;i<n;i++)
        {
            for(int j=i+1;j<n;j++)
            {
                if(arr[i]>arr[j])
                {
                    temp=arr[i];
                    arr[i]=arr[j];
                    arr[j]=temp;
                }
            }

        }

        for(int i=0;i<n;i++)
        {
            System.out.print(arr[i]);
        }

    }
}

