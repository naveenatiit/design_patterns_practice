import _04singleton_pattern._04solution.Cat;
import _04singleton_pattern._04solution.Dog;

public class Main {
    public static void main(String[] args) {

        Dog dog = new Dog();
        dog.bark();
        Cat cat = new Cat();
        cat.meow();
    }
}