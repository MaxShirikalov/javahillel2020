package Hillel;

public interface IAnimal {
    default void voice(){
        System.out.println("Hello, ");
    }
}
