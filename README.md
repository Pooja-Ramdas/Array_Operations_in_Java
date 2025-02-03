# Array_Operations_in_Java
Operations on arrays &amp; arrayLists

Variable List
| Variable Name   | Datatype          | Use                                                            |
|-----------------|-------------------|----------------------------------------------------------------|
| `arr`           | `int[]`           | Stores 5 user-input numbers entered through `Scanner`          |
| `odd`           | `ArrayList<Integer>` | Stores odd numbers from the input array                        |
| `eve`           | `ArrayList<Integer>` | Stores even numbers from the input array                       |
| `odd_index`     | `int`             | Keeps track of the index for adding odd numbers to the `odd` array |
| `even_index`    | `int`             | Keeps track of the index for adding even numbers to the `eve` array |
| `minIndex`      | `int`             | Stores the index of the smallest difference between neighboring numbers |
| `minDiff`       | `int`             | Stores the smallest absolute difference between neighboring numbers |

List of Functions
| Function Name                     | Return Type     | Use                                                            |
|------------------------------------|-----------------|----------------------------------------------------------------|
| `arrayInput()`                     | `int[]`         | Prompts the user to enter 5 numbers and returns them in an array |
| `display(ArrayList<Integer> arr)`  | `void`          | Prints the elements of the passed `ArrayList`                  |
| `oddEven(int[] arr)`               | `void`          | Splits the array into odd and even numbers and prints them     |
| `findSmallestDistanceIndex(int[] arr)` | `int`           | Finds and returns the index of the smallest absolute difference between neighboring elements in the array |


