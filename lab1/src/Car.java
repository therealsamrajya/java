public class Car {
    public String name;
    public String model;
    public long price;
    public float milage;

    public Car()
    {
    }
    public Car(String name, String model , long price , float milage)
    {
        this.name = name;
        this.model = model;
        this.price = price;
        this.milage = milage;
    }
    public void Display()
    {
        System.out.println(name +" "+model +" "+ price+" "+milage);
    }

    public static void main(String[] args) {

        Car c1 = new Car("Audi","R8",2223,22342);
        Car c2 = new Car();
        c1.Display();
        c2.Display();
    }

}
