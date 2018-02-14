/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author asus
 */
public class dgzg {
    public static void main(String[] args) {

    int x = 2, y = 5;
char a = 'a', b = 'b';
System.out.println(x + y);
System.out.println(x + y + "");
System.out.println("" + x + y);
System.out.println(x - y + "");
System.out.println(a + b);
System.out.println(a + b + "");
System.out.println("" + a + b);
System.out.println(a + y);
System.out.println("" + a + y);

    getSum();
    int lkj=factorial(6);
    System.out.println(lkj);
    int [] l=new int[5];
    boolean hg=arrayHasZero(l);
    System.out.println(hg);
    
    
    }


    
    public static int factorial(int n) {
        int p = 1;
        for (int i = 1; i <= n; i++) {
        p *= i;
        }
        return p;
    }
    static void getSum(){
        int m=2;
        int n=3;
        System.out.println(n+m);
    }
    public static boolean arrayHasZero(int[] array) {
        for (int i = 0; i < array.length; i++) {
        if (array[i] == 0)
        return true;
        }
        return false;
    }
    
}
    


