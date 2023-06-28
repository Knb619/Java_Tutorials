class Animal{
    void animalSound(){
        System.out.println("Animal sound");
    }
}

class Dog extends Animal{
    void animalSound(){
        System.out.println("Alf!");
    }
}

class Bird extends Animal{
    void animalSound(){
        System.out.println("Chirp!");
    }
}

public class Polymorphism {
    public static void main(String[] args) {
        Animal myAnimal = new Animal();
        Dog pochi = new Dog();
        Bird piyo = new Bird();

        myAnimal.animalSound();
        pochi.animalSound();
        piyo.animalSound();
    }
}
