package homeWork67;

public class Wolf extends Animal implements WildAnimal{

    public Wolf(String name) {
        super(name);
    }

    @Override
    void greets() {
        System.out.println("Wolf "+getName()+" says: Awooo!");

    }

    @Override
    public void hunting() {
        System.out.println("Wolf "+getName()+" goes hunting");

    }
}
