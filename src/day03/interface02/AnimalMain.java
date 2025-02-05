package day03.interface02;

public interface AnimalMain {
    public static void main(String[] args) {
        Animal animal;
        Pet pet;

        animal = new Cat();
        animal.cry();

        animal = new Dog();
        animal.cry();

        pet = new Cat();
        pet.paly();

        pet = new Dog();
        pet.paly();

//        Cat.tail();
//        Dog.tail();

    }

}
