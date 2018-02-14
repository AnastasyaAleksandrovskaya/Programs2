

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author asus
 */
public class Binar {
    public static void main(String[] args){
        char []arr = {'a','d','f','l','o','z'};
        find(arr,'l');
    }
 public static void find(char[] arr, char ch) {
    int last = arr.length - 1;
    int first = 0;
    int mid = (last + 1) / 2;
    while (arr[mid] != ch && last != mid && first != mid) {
        if (arr[mid] < ch) {
            first = mid;
            mid = (last + first) / 2;
        } else {
            last = mid;
            mid = (last + first) / 2;
        }
    }
    if (arr[last] == ch)
        mid = last;
    if (arr[first] == ch)
        mid = first;
    System.out.print(arr[mid] == ch ? mid : "Elem not found");
}
}

