import java.util.Scanner;
 public class Assignmentno10 {
     int binary(int a[],int low,int high,int key)
    {
        int mid = (low+high)/2;

        if(key==a[mid])
        {
            return mid;
        }

        if(key<a[mid])
        {
            return binary(a,low,mid,key);
        }
        return binary(a,mid+1,high,key);
    }


    public static void main(String[] args) {

        Assignmentno10 obj1=new Assignmentno10();
        int flag=0;
        int a[]=new int[]{15,4,32,10,12};

        Scanner sc=new Scanner(System.in);

        System.out.println("Enter the Key to be find : ");
        int key=sc.nextInt();

        for(int i=0;i<a.length-1;i++)
        {
            for(int j=0;j<a.length-1;j++)
            {
                flag=0;
                if(a[j]>a[j+1])
                {
                    int temp=a[j];
                    a[j]=a[j+1];
                    a[j+1]=temp;
                    flag=1;
                }

            }
            if(flag==0)
            {
                System.out.println("Sorted");

                break;
            }
        }
        System.out.println("Sorted array : ");
        for(int i=0;i<a.length;i++)
        {
            System.out.print("\t"+a[i]);
        }

        int low,high;
        low=0;
        high=a.length-1;

        int position=obj1.binary(a,low,high,key);
        System.out.println("\nElement found at position : "+(position+1));
    }
}
