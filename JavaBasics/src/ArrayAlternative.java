/*write java code to print alternative positive and negative numbers from given array

I/p = {-1, 2, 3, -4, -5, 6, 9} 
O/p= {2, -1, 3, -4, 6, -5, 9}
 */
public class ArrayAlternative
{
    public static void main(String[] args) 
    {
        int[] a = {-1, 2, 3, -4, -5, 6, 9};
        for(int i = 0; i < a.length; i++)
        {
            if(i % 2 == 0)
            {
                if(a[i] < 0)
                {
                    for(int j = i + 1; j < a.length; j++)
                    {
                        if(a[j] > 0)
                        {
                            int temp = a[i];
                            a[i] = a[j];
                            a[j] = temp;
                            break;
                        }
                    }
                }
            }
            else
            {
                if(a[i] > 0)
                {
                    for(int j = i + 1; j < a.length; j++)
                    {
                        if(a[j] < 0)
                        {
                            int temp = a[i];
                            a[i] = a[j];
                            a[j] = temp;
                            break;
                        }
                    }
                }
            }
        }
        for(int i = 0; i < a.length; i++)
        {
            System.out.print(a[i] + " ");
        }
    }
}