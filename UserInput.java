//UserInput.java
import java.util.*;
public class UserInput{
    int[] arrayInput(){
        Scanner sc = new Scanner(System.in);
        int[] arr = new int[5];
        System.out.println("Enter 5 numbers: ");
        for(int i = 0; i < arr.length; i++)
        {
            arr[i]= sc.nextInt();
        }
        return(arr);
    }
}
