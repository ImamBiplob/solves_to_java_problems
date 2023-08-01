public class Cat extends Animal implements Swim{
    public void makeSound() {
        System.out.println("Cat Meows!");
    }

    public void swim() {
        System.out.println("Cat can not swim");
    }
}
