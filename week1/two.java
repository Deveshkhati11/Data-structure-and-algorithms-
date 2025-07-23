/* Given an already sorted array of positive integers, design an algorithm and implement it using a
 program to find whether given key element is present in the array or not. Also, find total number
 of comparisons for each input case. (Time Complexity = O(nlogn), where n is the size of input) */
package week1;

import java.util.*; 

 public class two {
    public static int search(int array[] , int start , int end , int key ){
        if(start >= end ) return -1;
        int mid = start + ( end -start )/2 ;
        if(array[mid] == key)return key ;
        if(array[mid] > key){ 
            return search(array , 0 ,mid-1 , key );
        }
        else {
            return search(array , mid+1 , end , key );
        }
    }
    public static void main(String[] args) {
       Scanner s = new Scanner(System.in);
       int n = s.nextInt();
       int array[] = new int[n];
       for (int i = 0 ; i < n ; i++){
        array[i]=s.nextInt();
       }
       int key = s.nextInt();
       Arrays.sort(array);
       int result = search(array , 0 , n-1 , key );
       if(result == -1){
        System.out.println("Not found !!");
       }
       else{
        System.out.println("found at index ="+result);
       }
       s.close();
    }
}
