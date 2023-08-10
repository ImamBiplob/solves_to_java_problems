package InterfaceDefaultAndStaticMethodsConflict;

public class MyClass implements MyInterface {
    static void staticMethod() {
        System.out.println("Static Method of Class");
    }

    @Override
    public void myMethod() {
        System.out.println("My Method from Class");
    }

    public static void main(String[] args) {
        MyInterface conflict = new MyClass();
        conflict.myMethod();
        MyInterface.staticMethod();
        MyClass.staticMethod();
    }
}
