package inheritence;

public class Furry extends Animal {
  public Furry (String name, int age) {
    super(name, age);
  }

  public void sound(){
    System.out.println("what da skibidi");
  }

  public void movingNoises(){
    System.out.println("furry moving noises");
  }

}
