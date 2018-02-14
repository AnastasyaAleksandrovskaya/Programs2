/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author asus
 */
public class Main {
    public static void main(String [] args){
        Animal k=new Animal("Boris", 6);
        Cat l=new Cat("Vasiliy", 3);
        k.vote();
        l.vote();
        System.out.println(k.toString());
        System.out.println(l.Weight(2));
        System.out.println(l.toString());
        System.out.println(l.Hi());
        
        
        int [] a={1,4,2,6,4};
        for(int i:a)
            System.out.print(i);
        System.out.println();
        
        for(int i=0;i<a.length;i=i+2)
            System.out.print(a[i]);
            
            
    }
}
