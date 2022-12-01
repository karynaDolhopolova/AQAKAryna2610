package homeWork67;

public abstract class Animal {
    private String name;

    public String getName() {
        return name;
    }

    public Animal(String name) {
        this.name = name;
    }
    abstract void greets();
}
