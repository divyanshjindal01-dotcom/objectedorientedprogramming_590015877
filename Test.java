public class A {
    A() {
        System.out.println("Constructor of class A");
    }
}

class B extends A {
    B() {
        super();   
        super();
    }
}

public class Test {
    public static void main(String[] args) {
        B obj = new B();
    }
}
 Test {
    
}
