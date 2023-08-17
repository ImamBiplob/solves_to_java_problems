package DynamicMethodDispatch;

public class Animal {
    public void makeSound() {
        System.out.println("Animal Sound");
    }

    public static void main(String[] args) {
        Animal dog = new Dog();
        Animal cat = new Cat();

        Animal[] animals = {dog, cat};

        for(Animal animal : animals) {
            animal.makeSound();
        }
    }

}
