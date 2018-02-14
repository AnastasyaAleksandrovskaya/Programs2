
import java.io.PrintStream;
import java.util.Arrays;
import java.util.Scanner;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author asus
 */
public class NewClass {
    public static void main(String[] args) {
        int x=1;
        int y=2;
        double p=(double)x/y;
        int k=x/y;
        
        System.out.println(p);
        System.out.println(k);
        
        
      // Scanner sc = new Scanner(System.in);
        //int n = sc.nextInt();
        //int [] a = new int[n];
        //int s = 0;
        //for (int i = 0; i < n; i++) {
        // s = s + sc.nextInt();
        //}
        //System.out.println(s);
       //}
       
       
       // Scanner in = new Scanner(System.in);
        //System.out.print("Введите имя: ");
        //String name = in.nextLine();
        //System.out.print("Введите возраст: ");
        //int age = in.nextInt();
        //System.out.println("Ваше имя: " + name + "   Ваш возраст: " + age);
        
        
        // int r = Integer.parseInt("9");// преобразует из String в int
         //System.out.println(r);
         
         
       // int e=Integer.parseInt(args[0]);
         //int [] arr=new int [e];
         //int[] mice = { 0, 1, 2, 3, 4, 5, 6, 7, 8, 9 };
      //char df='a';// сам символ
      //char ds=9;//код переменной
      //System.out.println(df+ds);
      
      
     
      
      String Str = ("Добро пожаловать на ProgLang.su");

      System.out.print("Возвращаемое значение: ");
      System.out.println(Str.toString());
      
      int [] dfsfd={0,4,2,3};
      Arrays.copyOf(dfsfd, k);//копирование массива dfsfd в массив k
      
      int kdsf=Str.length();//считает количество символов в массиве Str
      System.out.println(kdsf);
      
      
      char sdf=Str.charAt(2);//Выводим 2 элемент строки(б) Str
      System.out.println(sdf);
      
      
       String s = "Я буду хорошим программистом!";
      char result1 = s.charAt(8);
      char result2 = s.charAt(11);
      System.out.println("Восьмой символ строки - " + result1);
      System.out.println("Одиннадцатый символ строки - " + result2);
     
      
      int [] arr1={0,5,6,7};
      int [] arr2={0,8,7,6};
      
      System.out.println(Arrays.equals(arr1, arr2));//сравнивает два массива и выводит false
      System.out.println( Arrays.toString(arr1));//выводит массив одной строкой
      
      String[] stringArray = { "a", "b", "c", "d", "e" };//выводит [a, b, c, d, e]
      System.out.println((Arrays.asList(stringArray)));
      
      
      String[] stringArray1 = { "a", "b", "c", "d", "e" };//Проверка массива на наличие конкретного значения; выведет true
       System.out.println(Arrays.asList(stringArray1).contains("a"));
         
       
//       int[] intArray = { 1, 2, 3, 4, 5 };//Объединение двух массивов
//        int[] intArray2 = { 6, 7, 8, 9, 10 };
//        int[] combinedIntArray = ArrayUtils.addAll(intArray, intArray2);
        
        String [] a = {"s","2","-","9","-"};
        for (int i=0;i<a.length;i++){
            if (a[i].equals("-"))
                a[i]="0";
            System.out.print(a[i]);
        }
        System.out.println();
        
        
         String str1 = "Я буду хорошим программистом!";
      String str2 = "Я буду хорошим программистом!";
      String str3 = "Я буду хорошим дворником!";

      int result = str1.compareTo(str2);
      System.out.println(result);
	  
      result = str2.compareTo(str3);
      System.out.println(result);
	 
      result = str3.compareTo(str1);
      System.out.println(result);
        
        String str = new String("Welcome to BeginnersBook.com");
       char[] array= str.toCharArray();
       System.out.print("Content of Array:");
       for(char c: array){
           System.out.print(c);
       }
    }
}

