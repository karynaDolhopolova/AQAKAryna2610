package homeWork67;

public class BigDog extends Dog{
    public BigDog(String name) {
        super(name);
    }

    @Override
    void greets() {
        System.out.println("Barf!");
    }

    @Override
    void greets(Dog dog) {
        System.out.println("Barf-barf!");
    }

    void greets(BigDog bigDog){
        System.out.println("Barf-barf-barf!");
    }

}
