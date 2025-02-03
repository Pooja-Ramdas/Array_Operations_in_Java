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
    
    public static int findSmallestDistanceIndex(int[] arr) {
        if (arr == null || arr.length < 2) {
            throw new IllegalArgumentException("Array must have at least two elements.");
        }
    
        int minIndex = 0;
        int minDiff = (arr[1] > arr[0]) ? arr[1] - arr[0] : arr[0] - arr[1];
    
        for (int i = 1; i < arr.length - 1; i++) {
            int diff = (arr[i + 1] > arr[i]) ? arr[i + 1] - arr[i] : arr[i] - arr[i + 1];
            if (diff < minDiff) {
                minDiff = diff;
                minIndex = i;
            }
        }
        return minIndex;
        
    }
}
    

