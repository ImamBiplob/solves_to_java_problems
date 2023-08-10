package InterfaceDefaultAndStaticMethodsConflict;

public interface MyInterface {

    default void myMethod() {
        System.out.println("My Method");
    }

    static void staticMethod() {
        System.out.println("Static Method of Interface");
    }
}
