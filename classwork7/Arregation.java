package classwork7;

public class Arregation {
    private Radio1 radio;
}
class Car1{
    private Radio1 radio;

}

class Radio1{
    private String name;

    public Radio1(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
