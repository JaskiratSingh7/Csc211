public class Pet {
    protected String name;

    public Pet(String name) {
        this.name = name;
    }

    public void speak() {
        System.out.println(name + " makes a sound.");
    }
}

public class Dog extends Pet {
    public Dog(String name) {
        super(name);
    }

    @Override
    public void speak() {
        System.out.println(name + " says: Woof!");
    }
}
public class Cat extends Pet {
    public Cat(String name) {
        super(name);
    }

    @Override
    public void speak() {
        System.out.println(name + " says: Meow!");
    }
}

public class Owner {
    private String ownerName;
    private Pet pet; // Composition: Owner "has a" Pet

    public Owner(String ownerName, Pet pet) {
        this.ownerName = ownerName;
        this.pet = pet;
    }

    public void introducePet() {
        System.out.println(ownerName + "'s pet:");
        pet.speak(); // Polymorphism: pet could be a Dog or Cat
    }
}

public class PetCareMain {
    public static void main(String[] args) {
        Pet dog = new Dog("Buddy");
        Pet cat = new Cat("Whiskers");

        Owner owner1 = new Owner("Alice", dog);
        Owner owner2 = new Owner("Bob", cat);

        owner1.introducePet(); // Buddy says: Woof!
        owner2.introducePet(); // Whiskers says: Meow!
    }
}
