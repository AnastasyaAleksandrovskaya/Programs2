/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author asus
 */
public abstract class Device {
 private String name;
 public String getName() {
 return name;
 }
 abstract public void on();
 abstract public void off();
 abstract public String getInfo();
}
