package com.madv.mylang;

public class MetodParametr {
    public static void main(String[] args) {
        SampleInterface metod=(x)->x*x+4;
        showCoord(5,metod);
        showCoord(3,MetodParametr::getCoord1);
    }
    static int getCoord1(int x){
        final java.util.Random random = new java.util.Random(System.currentTimeMillis());
        int t=random.nextInt(100);
        System.out.println(t);
        return t+x;
    }
    public static void showCoord(int p,SampleInterface metod){

        System.out.println(metod.getCoord(p)+11);
    }
}
interface SampleInterface{
    int getCoord(int x);
}

