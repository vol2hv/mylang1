package com.madv.mylang.arrays;

/**
 * Created by madv on 17.01.2017.
 */
public class Ex1 {
    public static void main(String[] args) {
        int[][] arr ={{10,11,12},{27,28,29}}; // определяется массив arr[2][3]
        System.out.println(arr.length);
        System.out.println(arr[0].length);
        System.out.println(arr[0][1]+" "+arr[1][2]);
        for (int i = 0; i <arr.length ; i++) {
            for (int j = 0; j < arr[0].length; j++) {
                System.out.print(arr[i][j]+" ");
            }
            System.out.println();
        }
    }
}
//        2
//        3
//        11 29
//        10 11 12
//        27 28 29