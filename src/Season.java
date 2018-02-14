/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author asus
 */
public class Season { 
   
        
     enum Season1 {
        WINTER, SPRING, SUMMER, FALL//объекты
    }
     enum Color {
        RED(255, 0, 0), GREEN(0, 255, 0),
        BLUE(0, 0, 255), WHITE(255, 255, 255),
        BLACK(0, 0, 0);

        private int r, g, b;
        Color(int r, int g, int b) {
        this.r = r;
        this.g = g;
        this.b = b;
    }
        public String getRGBValues(){
            return "(" + r + "," + g + "," + b +")";
     }
     }

  
  
  
    public static void main(String [] args){
        Season1 s = Season1.SPRING;
        for (Season1 season: Season1.values()) 
            System.out.println(season);
//        Season season = Season.valueOf("WINTER");
//        System.out.println(season);

            Color color = Color.BLACK;
            System.out.println(color.getRGBValues());
    }
    
}

