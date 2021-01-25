package com.madv.mylang.proba;


interface Set1{
    int polyn(int x);
    public Set1 getSet(int a);
}
class HashSet implements Set1 {

    @Override
    public int polyn(int x) {
        return x*x+4;
    }

    @Override
    public Set1 getSet(int a){
        Set1 sss =new HashSet();
        if (a > 0){
            throw new RuntimeException ("Кота не существует");
        }
        return new HashSet();
    }
}
public class GetSet {
}
