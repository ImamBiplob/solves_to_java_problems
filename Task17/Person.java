package Task17;

public class Person implements Cloneable {
    public String name;
    public int age;

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    @Override
    protected Object clone() throws CloneNotSupportedException {
        return super.clone();
    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }

    public static void main(String[] args) {
        Person person1 = new Person("Imam", 23);
        Person person2 = new Person("Biplob", 23);

        try {
            Person person3 = (Person) person1.clone();
            System.out.println(person3.equals(person1));
            person3.name = "Paul";
            System.out.println(person3.toString());
            System.out.println(person1.toString());
        } catch (Exception e) {
            System.out.println(e);
        }
    }

}
