/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author asus
 */
public class Cat extends Animal implements AnimalInterface {
    
    public Cat(String name, int age) {
        super(name, age);
        int weight;
    }
    @Override
    public void vote(){
        System.out.println("miau");
    }
    public int Weight(int k){
        return k;
    }

    @Override
    public int Hi() {
        return 5;
        
    }        
    
}
