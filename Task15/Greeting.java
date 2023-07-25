package Task15;

interface Greeting {
    void sayHello();
}

class Task15 {
    public static void main(String args[]) {

        Greeting greeting= new Greeting(){
            public void sayHello(){
                System.out.println("Hello");
            }
        };
//        public void greet(Greeting greeting){
//            greeting.sayHello();
//        }


        greeting.sayHello();

//        greet(greeting);

    }
}