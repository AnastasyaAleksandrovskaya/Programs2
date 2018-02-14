/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cat;

/**
 *
 * @author asus
 */
public class Box{
    public  int width=6; // ширина коробки
    public int height; // высота коробки
    public int depth; // глубина коробки
    public Box(int width,int height,int depth){
        this.width=width;
        this.height=height;
        this.depth=depth;
    }
    public int getwidth(){
        return width;
    }
    public void setwidth(int width){
        this.width=width;
    }
    public int getheight(){
        return height;
    }
    public void setheight(int height){
        this.height=height;
    }
    public int getdepth(){
        return depth;
    }
    public void setdepth(int depth){
        this.depth=depth;
    }
    public String sd(){
        String result="sdfs"+width;
        return result;
    }
    public void sdfg(int hours){
        System.out.println("gjh "+ hours);
    }
    public static void main(String[] args) {
        Box sdf=new Box(5,6,7);
        String result=sdf.sd();
        System.out.println(result);
        sdf.sdfg(7);
}
}