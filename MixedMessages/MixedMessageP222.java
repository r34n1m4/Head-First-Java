package MixedMessages;

class A {
    int ivar = 7;
    void m1() {
        System.out.println("A's m1, ");
    }
    void m2() {
        System.out.println("A's m2, ");
    }
    void m3() {
        System.out.println("A's m3, ");
    }
}

class B extends A {
    void m1() {
        System.out.println("B's m1. ");
    }
}

class C extends B {
    void m3() {
        System.out.println("C's m3, " + (ivar + 6));
    }
}

public class MixedMessageP222 {
    public static void main(String[] args) {
        A a = new A();
        B b = new B();
        C c = new C();
        A a2 = new C();
        //insert missing code here
        /*
        b.m1();
        c.m2();
        a.m3();
        B's m1, A's m2, A's m3
        */
        /*
        c.m1();
        c.m2();
        c.m3();
        B's m1, A's m2, C's m3, 13
         */
        /*
        a.m1();
        b.m2();
        c.m3();
        A's m1, A's m2, C's m3, 13
        */
        /*
        a2.m1();
        a2.m2();
        a2.m3();
        B's m1, A's m2, C's m3, 13
        */
    }
}
