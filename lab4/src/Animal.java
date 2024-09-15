abstract class Annimal {
    public abstract void sound();


}

class Cat extends Annimal {
    @Override
    public void sound() {
        System.out.println("cat meows");
    }
}

class Dog extends Annimal {
    @Override
    public void sound() {
        System.out.println("Dog barks");
    }
}

public class Animal {
    public static void main(String[] args) {
        Annimal cat = new Cat();
        Annimal dog = new Dog();

        cat.sound();
        dog.sound();
    }
}
