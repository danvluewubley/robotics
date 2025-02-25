package inheritence;

public class Dog extends Animal {
  public Dog (String name, int age) {
    super(name, age);
  }

  public void sound(){
    System.out.println("bark, bark, bark");
  }

  public void movingNoises(){
    System.out.println("dog moving noises");
  }
  
}
