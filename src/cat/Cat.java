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
public class Cat {

  public static void main(String [] args){
       
    String str; 
str = "012345"; 

char firstChar = str.charAt(0); 
if ( firstChar == '0') { 
   System.out.println( "equals 0" ); 
} else { 
   System.out.println( "not equals 0" ); 
}

int kdsf=str.length();
for(int i=0;i<kdsf;i++){
    char ft=str.charAt(i);
    if(ft=='3'){
        System.out.println("kbkj"+i);
        continue;
    }
    
}
    
}
}

