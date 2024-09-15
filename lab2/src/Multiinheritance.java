

interface A{
    void display();
}

interface B{
    void display();
    void say();
}

  class C implements A,B{

    @Override
    public void display() {
        System.out.println("display");
    }

    @Override
    public void say() {
        System.out.println("I am B");

    }
}

public class Multiinheritance {
    public static void main(String[] args) {

        C c = new C();
        c.display();
        c.say();

    }
}
