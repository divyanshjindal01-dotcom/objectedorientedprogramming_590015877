class A {
    final int variable = 1;

    final void show() {
        System.out.println("Final method in class A");
    }
}

final class B {
    static int variable1 = 10;
}

class C {
}

class D extends A {
}

public class UnderstandingFinal {
    public static void main(String[] args) {

        A objA = new A();

        System.out.println(objA.variable);

        B.variable1 = 20;
        System.out.println(B.variable1);
    }
}
