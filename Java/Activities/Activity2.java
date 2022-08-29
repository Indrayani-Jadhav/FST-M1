package Activities;

public class Activity2 {
    public static void main(String[] args)
    {
        int[] a={10,2,3,10,5,10};
        int sum=0;

        for(int i=0;i<=6;i++)
        {
            if(a[i]==10)
            {
                sum=sum+a[i];
            }
            if(sum>30)
            {
                break;
            }
            if(sum==30)
            {
                System.out.println("Sum is: "+sum);
            }

        }
    }
}
