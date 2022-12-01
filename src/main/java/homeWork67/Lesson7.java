package homeWork67;

public class Lesson7 {
    public static void main(String[] args) {
        Cat cat=new Cat("Stepan");
        Dog dog=new Dog("Patron");
        BigDog bigDog=new BigDog("Beethoven");
        Lion lion=new Lion("Simba");
        Wolf wolf=new Wolf("Balto");
        wild(lion);
        wild(wolf);
        pet(cat);

    }
    public static void wild(WildAnimal wildAnimal){
        wildAnimal.hunting();
    }
    public static void pet(Pet pet){
        pet.feed();
        pet.play();
        pet.walk();
    }
}
