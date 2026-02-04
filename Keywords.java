class Parent {
    int val = 50;
}

class Child extends Parent {
    int val = 100;
    void display() {
        int val = 150;
        System.out.println(val);
        System.out.println(this.val);
        System.out.println(super.val);
    }
}

public class Keywords {
    public static void main(String[] args) {
        Child obj = new Child();
        obj.display();
    }
}