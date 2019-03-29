package com.madv.mylang.innerclass;

public class Outer {
    /*
    * Супер класс для анонимного класса
    */
    class Demo {
        public void show() {
            System.out.println("Метод суперкласса");
        }
    }
    /*
    * интерфейс для анонимного класса
    */
    interface Hello {
        void show();
    }
    // Простой вложенный класс
    // Dвложенный внутренний класс не может содержать в себе статических методов или статических полей
    class Inner {
        public void show() {
            System.out.println("Метод внутреннего класса");
        }
    }

    static class StaticInner {
        public void show() {
            System.out.println("Метод статического внутреннего класса");
        }
    }

    void outerMethod() {
        System.out.println("Метод внешнего класса");
            /*
            Чтобы переменная Х была лоступна по внутреннем классе, она должна быть final
             */
        final int x = 98;
        // Внутренний класс является локальным для метода outerMethod()
            /*
            Внутренний класс в локальном методе не может быть помечен как private, protected, static и transient,
            но может быть помечен как abstract и final, но не оба одновременно.
            */
        class Inner {
            public void innerMethod() {
                System.out.println("Метод внутреннего класса");
                System.out.println("x = " + x);
            }
        }
        Inner inner = new Inner();
        inner.innerMethod();
    }

    // Анонимный класс наследуется от класса Demo
    Demo demo = new Demo() {
        @Override
        public void show() {
            super.show();
            System.out.println("Переопределенный метод внутреннего анонимного класса");
        }
    };
    // Анонимный класс, который реализует интерфейс Hello
    Hello h = new Hello() {
        public void show() {
            System.out.println("Метод внутреннего анонимного класса. Реализация интерфейса Hello");
        }
    };
    public static void main(String[] args) {
        Outer.Inner inner = new Outer().new Inner();
        inner.show();

        Outer.StaticInner staticInner = new StaticInner();
        staticInner.show();

        Outer outer = new Outer();
        outer.outerMethod();

        outer.demo.show();
        outer.h.show();

    }
}

