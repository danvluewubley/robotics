package inheritence;

public class Main {
    public static void main(String[] args) {
        Animal cat = new Cat("bob", 5);
        Animal dog = new Dog("other bob", 7);
        Animal furry = new Furry("Jacob", 16);

        cat.sound();
        cat.movingNoises();
        System.out.println(cat.name);
        System.out.println(cat.age);

        dog.sound();
        dog.movingNoises();
        System.out.println(dog.name);
        System.out.println(dog.age);
        
        furry.sound();
        furry.movingNoises();
        System.out.println(furry.name);
        System.out.println(furry.age);
    }
}