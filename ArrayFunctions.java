public class ArrayFunctions{

    public void display(int[] arr, int size) {
        for (int i = 0; i < size; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }

    public void oddEven(int[] arr) {
        int[] odd = new int[arr.length];  
        int[] eve = new int[arr.length];  
        int odd_index = 0, even_index = 0;
        
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] % 2 == 0) {
                eve[even_index] = arr[i]; 
                even_index++;
            } else {
                odd[odd_index] = arr[i];  
                odd_index++;
            }
        }
        
        // Print odd numbers
        System.out.print("ODD NUMBERS: ");
        display(odd, odd_index);  
        
        // Print even numbers
        System.out.print("EVEN NUMBERS: ");
        display(eve, even_index); 
    }
}
