import java.util.*;
public class Larsmal {
        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);
    
            // Input for array size
            System.out.print("Enter the number of elements in the array: ");
            int n = scanner.nextInt();
    
            // Initialize the array
            int[] array = new int[n];
    
            // Input for array elements
            System.out.println("Enter the elements of the array:");
            for (int i = 0; i < n; i++) {
                array[i] = scanner.nextInt();
            }
    
            // Initialize largest and smallest with the first element
            int largest = array[0];
            int smallest = array[0];
    
            // Find largest and smallest elements
            for (int i = 1; i < n; i++) {
                if (array[i] > largest) {
                    largest = array[i];
                }
                if (array[i] < smallest) {
                    smallest = array[i];
                }
            }
    
            // Display the results
            System.out.println("Largest element in the array: " + largest);
            System.out.println("Smallest element in the array: " + smallest);
    
            // Close the scanner
            scanner.close();
        }
    }  

