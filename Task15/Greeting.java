package Task15;

interface Greeting {
    void sayHello();
}

class Task15 {
    public static void main(String []args) {

        greet(new Greeting() {                             // Using Anonymous Inner Class
            @Override
            public void sayHello() {
                System.out.println("Hello");
            }
        });

        greet(() -> System.out.println("hello"));         // Using Lambda expression

    }

    public static void greet(Greeting greeting){
        greeting.sayHello();
    }
}