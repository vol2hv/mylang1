package com.madv.mylang.proba;

class ScopeTest {
    static int mx(int s){
        for(int i=0; i<3; i++){
            s=s+i;
        }
        return s;
    }
    public static void main(String[] args) {
        int s = 5;
        s += s + mx(s) + ++s;
        System.out.println(s);
    }
}


