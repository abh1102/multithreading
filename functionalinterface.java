import java.util.*;

@FunctionalInterface
interface A {
    public void show();

}

// class B implements A {
// public void show() {
// System.out.println("Hello Abhishek Jha");
// }

// }

public class functionalinterface {
    public static void main(String[] args) {
        A obj = new A() {
            public void show() {
                System.out.println("Hello Abhishek Jha");
            }
        };
        obj.show();
    }

}
