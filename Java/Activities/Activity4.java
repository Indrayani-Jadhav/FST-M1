package Activities;

public class Activity4
{
    public static void main(String[] args)
    {
        int[] a=new int[5];
         a[0]=100;
         a[1]=20;
         a[2]=90;
         a[3]=10;
         a[4]=3;

         for(int j=0;j<a.length-1;j++)
        {
            for(int i=j+1;i<=4;i++)
            {
                if(a[i]<a[j])
                {
                    int temp=a[i];
                    a[i]=a[j];
                    a[j]=temp;
                }
            }
        }
         for(int k=0;k<=4;k++)
         {
             System.out.println("The Sorted Array: "+a[k]);
         }

    }
}
