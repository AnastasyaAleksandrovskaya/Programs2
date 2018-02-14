
import java.util.Scanner;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author asus
 */
public class Binar2 {
    public static void main(String[] args){
        int [] arr2={1,3,4,6,7};
        
        find(arr2,4);

    }
    public static void find(int [] arr,int st){
        int last = arr.length - 1;
        int first = 0;
        int mid = (last + 1) / 2;
        while(arr[mid]!=st&&last!=mid&&first!=mid){
            if (arr[mid] < st) {
            first = mid;
            mid = (last + first) / 2;
            }
            else {
                last = mid;
                mid = (last + first) / 2;
            }
        }  
    if (arr[last] == st)
        mid = last;
    if (arr[first] == st)
        mid = first;
    System.out.print(arr[mid] == st ? mid : "Elem not found");
    }
}

//Scanner scanner=new Scanner(System.in);
  //      int n=scanner.nextInt();
  //      Scanner sc = new Scanner(System.in);
     //   int [] arr = new int[n];
     //   for (int i = 0; i < n; i++) {
     //   arr[i]= sc.nextInt();
      //  }
    

