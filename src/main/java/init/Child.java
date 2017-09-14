package init;

public class Child extends Parent {

    static {
        System.out.println("Child static");
    }

    public Child() {
        System.out.println("child constructor");
    }
}
