package com.madv.mylang.proba;

class Triangle{
    public int base;
    public int height;
    private double ANGLE;
    public void setAngle(double a){ ANGLE = a; }
    public static void main(String[] args) {
        Triangle t = new Triangle();
        t.setAngle(90);
    }
}
