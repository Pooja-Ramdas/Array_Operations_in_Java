import java.util.*;
public class ArrayFunctions{
    public void display(ArrayList<Integer> arr)
    {
        System.out.println("Array: "+arr);
    }
    public void oddEven(int[] arr)
    {
        ArrayList<Integer> odd = new ArrayList<Integer>();
        ArrayList<Integer> eve = new ArrayList<Integer>();
        int odd_index = 0, even_index = 0;
        int i=0;
        for(i=0; i<arr.length; i++)
        {
            if(arr[i]%2 == 0)
            {
                eve.add(arr[i]);
                even_index++;
            }
            else
            {
                odd.add(arr[i]);
                odd_index++;
            }
        }
        System.out.print("ODD NUMBERS ");
        display(odd);
        System.out.print("EVEN NUMBERS: ");
        display(eve);

    }
}
