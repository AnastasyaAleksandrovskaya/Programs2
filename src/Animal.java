/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author asus
 */
public class Animal {
        String name;
        int age;
        public Animal(String name, int age){
            this.name=name;
            this.age=age;
        }
        public String getname(){
            return name;
        }
        public void setname(){
            this.name=name;
        }
        public int getage(){
            return age;
        }
        public void setage(){
            this.age=age;
        }
        public void vote(){
            System.out.println("MEOW");
        }
        @Override
        public  String toString(){
            return name;
        }
}
