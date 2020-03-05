package hometask6.src.Hillel;


public class GuideDog extends Pet implements IAnimal {
    private boolean Trained = false;


    public GuideDog(int id, int age, float weight, String color, String name, boolean Vaccinated, boolean Trained) {
        super(id, age, weight, color, name, Vaccinated);
        this.Trained = Trained;
    }

    public boolean Trained() {
        return Trained;
    }

    public void setTrained(boolean trained) {
        Trained = trained;
    }

    @Override
    public void voice(){
        System.out.println("I can take you home");
    }

}

