package classwork7;

public class Composition {
    public static void main(String[] args){
        Car car1 = new Car("Porsche");
        Car car2 = new Car("Narodnoe");
        System.out.println(car1.getRadio().getName());
    }
}

class Car{
    private Radio radio;

    public Car(String name) {
        this.radio = new Radio(name);
    }

    public Car(Radio radio) {
        this.radio = radio;
    }

    public Radio getRadio() {
        return radio;
    }

    public void setRadio(Radio radio) {
        this.radio = radio;
    }
}
class Radio{
    private String name;

    public Radio(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}