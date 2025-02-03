//Name: Pooja Mandar Ramdas
//PRN: 23070126091
//Batch: AIML B1  (2023-2027)
public class Main {
    public static void main(String args[])
    {
        UserInput ui = new UserInput();
        ArrayFunctions fn = new ArrayFunctions();
        //fn.display(ui.arrayInput());
        fn.oddEven(ui.arrayInput());
        fn.findSmallestDistanceIndex(ui.arrayInput());
    }
}
