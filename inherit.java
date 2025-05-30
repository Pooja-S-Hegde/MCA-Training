public class inherit {
    public static void main(String[] args) {
        Dog dog=new Dog();
    dog.bark();    }

}

 class Animal {
public void eat(){
    System.out.println("Animal can eat");
}
public void walk(){
    System.out.println("Animals can walk!");
}
    
}
class Dog extends Animal{
  public void bark(){
    System.out.println("Dog can bark");
  }
  public void eat(){
    System.out.println("Dogs like to eat bones!");
  }
}
