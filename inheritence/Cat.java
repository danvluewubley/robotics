package inheritence;

public class Cat extends Animal {

  public Cat (String name, int age) {
    super(name, age);
  }

  public void sound(){
    System.out.println("meow");
  }
  public void movingNoises(){
    System.out.println("cat moving noises");
  }
}
