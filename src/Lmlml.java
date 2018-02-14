
//import java.util.Scanner;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author asus
 */
public class Lmlml {
    int f(int a,int b){
        switch(a&b){
            case 8: return a/b;
            case 5: return a%b;
            default: return 6;
        }
    }
    int x=f(14,9);
    public static void main(String [] args){
        Lmlml h=new Lmlml();
        System.out.println(h.f(14,9));
        
        
//        Scanner scanner=new Scanner(System.in);
//        int n=scanner.nextInt();
//        char [] arr1=new char[n];
//        for( int i=0;i<n;i++){
//            arr1[i] = scanner.next().charAt(i);
//            System.out.println(arr1[i]);
//    }
        }

    }

