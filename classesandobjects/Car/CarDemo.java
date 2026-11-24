package classesandobjects.Car;

public class CarDemo {

    public static void main(String[] args) {

        Car c1 = new Car("Lamborghini", "Black", 6200);
        Car c2 = new Car("Mahindra","Black",3000);
        System.out.println(c1.tyres);
        System.out.println(c1.colour);
        System.out.println(c2.enginecc);
    }
}

class Car {
    String model;
    String colour;
    int enginecc;

    static int tyres = 4;

    Car(String model, String colour, int enginecc) {
        this.model = model;
        this.colour = colour;
        this.enginecc = enginecc;
    }
}