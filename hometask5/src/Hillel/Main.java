package Hillel;

public class Main {

    public static void main(String[] args) {
        Fish fish = new Fish(1, 2, 15, "blue", "Dolly", false);
        fish.voice();
        Crocodile crocodile = new Crocodile(2, 15, 350, "Dark Green", true);
        crocodile.voice();
        GuideDog guideDog = new GuideDog(3,7, 40,"brown", "Arta", true, true);
        guideDog.voice();
        Cat cat = new Cat(4, 4, 3,"fire red", "Ramzan", true);
        cat.voice();
        /*GuideDog guideDog1 = new GuideDog(5,
                14,
                78,
                "yellow",
                "Turka",
                true,
                false);
        guideDog1.voice();
        GuideDog dog = new GuideDog(false);
        dog.voice();
         */
    }
}
