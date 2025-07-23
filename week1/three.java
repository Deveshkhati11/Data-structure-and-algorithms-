/*Given an already sorted array of positive integers, design an algorithm and implement it using a
 program to find whether a given key element is present in the sorted array or not. For an array
 arr[n], search at the indexes arr[0], arr[2], arr[4],.....,arr[2k] and so on. Once the interval (arr[2k] <
 key < arr[ 2k+1] ) is found, perform a linear search operation from the index 2k to find the element
 key. (Complexity < O(n), where n is the number of elements need to be scanned for searching):
 Jump Search */
 
package week1;
import java.util.*;

public class three {
    public static int search(int[] array, int x) {
        int n = array.length;
        if (n == 0) {
            return -1;
        }
        int Size = (int) Math.floor(Math.sqrt(n));
        int prev = 0;
        while (array[Math.min(Size, n) - 1] < x) {
            prev = Size;
            Size += (int) Math.floor(Math.sqrt(n));

            if (prev >= n) {
                return -1;
            }
        }
        while (array[prev] < x) {
            prev++;
            if (prev == Math.min(Size, n)) {
                return -1;
            }
        }
        if (array[prev] == x) {
            return prev;
        }
        return -1;
    }
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        if (n <= 0) {
            System.out.println("Array size must be positive.");
            s.close();
            return;
        }
        int[] array = new int[n];
        ;
        for (int i = 0; i < n; i++) {
            array[i] = s.nextInt();
        }
       Arrays.sort(array); 
        int key = s.nextInt();
        int result = search(array, key);
        if (result != -1) {
            System.out.println("Element " + key + " found at index " + result);
        } else {
            System.out.println("Element " + key + " not found in the array.");
        }
        s.close();
    }
}
