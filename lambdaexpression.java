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

class lambdaexpression {
    public static void main(String[] args) {
        A obj = () -> System.out.println("bhello");

        obj.show();
    }

}
