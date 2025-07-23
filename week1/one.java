/*Given an array of nonnegative integers, design a linear algorithm and implement it using a
 program to find whether given key element is present in the array or not. Also, find total number
 of comparisons for each input case. (Time Complexity = O(n), where n is the size of input)*/

 package week1;
 import java.util.*; 
 public class one{
    public static int search(int array[] , int key){
        for(int i = 0 ; i < array.length ; i++){
            if(array[i]==key)return i ;
        }
        return -1;
    }
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in); 
        int n = s.nextInt();
        int array[] = new int[n];
        for(int i = 0 ; i < n ; i++){
            array[i] = s.nextInt();
        }    
        int key  = s.nextInt();
        int result = search(array , key );
        if(result == -1){
            System.out.println("Not found !!");
        }
        else{
            System.out.println("Key found at index ="+result);
        }
     s.close();
    }
 }