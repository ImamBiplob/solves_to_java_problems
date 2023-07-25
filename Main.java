public class Main {
    public static void main(String[] args) {
        //Task01
        Shape circle = new Circle(5);
        Shape rectangle = new Rectangle(2,4);
        Shape[] shapes = {circle, rectangle};
        for(Shape shape : shapes) System.out.println("Area: " + shape.calculateArea());

        //Task02
        BankAccount bc1 = new BankAccount(1, 4500, "Imam");
        bc1.deposit(7500);
        bc1.withdraw(2000);
        System.out.println(bc1.getBalance());

        //Task03
        Animal dog = new Dog();
        Animal cat = new Cat();
        dog.makeSound();
        cat.makeSound();
        ((Dog) dog).swim();
        ((Cat)cat).swim();

        //Task04
        Employee employee1 = new Employee("Imam");
        Employee employee2 = new Employee("Rakib", "a1b2", "CSE");
        Employee employee3 = new Employee("Paul", "a2b3");
        System.out.println(employee1.getEmployeeId());
        System.out.println(employee2.getDepartment());
        System.out.println(employee3.getDepartment());

        //Task05
        Vehicle car = new Car();
        car.displayInfo();

        //Task06
        Book book = new Book("Jotno", "2019", new Author("Sir Samson", "100", "male"));
        book.displayDetails();

        //Task07
        Printer printer = new Printer();
        printer.print();
        Scanner scanner = new Scanner();
        scanner.scan();
        AllInOnePrinter aioprinter = new AllInOnePrinter();
        aioprinter.print();
        aioprinter.scan();

        //Task08
        MaxFinder maxFinder = new MaxFinder();
        System.out.println(maxFinder.findMax(1,2,3,4,6));

        //Task09
        //Abstract classes can have both abstract and concrete methods whereas interfaces can only have abstract methods.

        //Task10
        Parent parent = new Parent();
        Child child = new Child();
        parent.showInfo();     // Instance method calling
        Parent.displayInfo();  // Static method calling
        child.showInfo();     // Instance method calling
        Child.displayInfo();  // Static method calling

        //Task11
        String[] courses = {"OOP", "DSA", "AI", "Quantum Computing"};
        University.department = new University.Department("CSE", courses );
        University.showDetails();

        //Task12
        Person person = new Person("Imam", 23);
        System.out.println("Name: " + person.name);
        System.out.println("Age: " + person.age);

        //Task13
        Calculator calculator = new Calculator();
        try {
            System.out.println(calculator.divide(3,0));
        }

        catch (DivideByZeroException e) {
            System.out.println(e);
        }

        //Task14
        ImmutablePoint point = new ImmutablePoint(2,3);
        System.out.println("X: " + point.getX() + ", Y: " + point.getY());

    }
}