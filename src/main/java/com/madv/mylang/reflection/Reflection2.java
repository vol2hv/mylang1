package com.madv.mylang.reflection;

class A {}

class B<T> {
    private final Class<T> clazz;

    public B(Class<T> clazz) {
        this.clazz = clazz;
    }
    public Class<T> getT(){
        return clazz;
    }
}

class C <T> {
    private T t;
    private final Class<?> clazz;

    public C(T t) {
        this.t = t;
        this.clazz = t.getClass();
    }

    public Class<?> getT(){
        return clazz;
    }

}

public class Reflection2 {
    public static void main(String[] args)  {
        /*
        * В Java есть класс Class<T>. Наследуется от Object.
        * Создается только транслятором ( операция new не допустима)
        * получить ссылку не этот объект можно двумя способами
        * */
        Class<A> aClass = A.class;
        A a = new A();
        Class<? extends A> aClass1 = a.getClass();

        // Получение имени класса
        System.out.printf("%s  %d \n", "Vovan",123);
        System.out.printf("%s %s \n", aClass.getName(),aClass1.getName());

        // Genericи до RunTime не доживают и Generic-параметры надо сохранять самому
        B<A> b = new B(A.class); // Вариант 1
        System.out.printf("Типизирующий параметр %s \n", b.getT());
        C<Integer> c = new C<>(new Integer(77)); // Вариант 2
        System.out.printf("Типизирующий параметр %s \n", c.getT());
    }
}
