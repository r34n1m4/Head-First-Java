package Compiler;

class CompilerP340 {
    static {
        System.out.println("Parent static block");
    }

    CompilerP340() {
        System.out.println("Parent constructor");
    }
}

class StaticTests extends CompilerP340 {
    static int rand;

    static {
       rand = (int) (Math.random() * 6);
        System.out.println("Static block " + rand);
    }

    StaticTests() {
        System.out.println("Constructor");
    }

    public static void main(String[] args) {
        System.out.println("Inside main");
        StaticTests st = new StaticTests();
    }
}
