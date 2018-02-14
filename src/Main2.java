/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author asus
 */
public class Main2{
    public static void main(String [] args){
   Device[] devices = new Device[10];
    for (int i = 0; i < devices.length; i += 2) {
 devices[i] = new Phone();
 devices[i+1]= new Camera();
}
for (Device device : devices) {
 System.out.println(device.getInfo());
 
}
}
}
