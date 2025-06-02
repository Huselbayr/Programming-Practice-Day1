class Person {
    String name;
    int age;

    Person(String name, int age) {
        this.name = name;
        this.age = age;
    }
    void greet() {
        System.out.println("Hello, my name is " + name + " and I am " + age + " years old.");
    }

}
public class HelloOOP {
    public static void main(String[] args) {
        Person person = new Person("Bat", 20);
        person.greet();
    }
}