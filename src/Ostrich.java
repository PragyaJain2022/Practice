public class Ostrich extends bird implements Flyable,Eating,makeSound{
    @Override
    public void makeSound() {
        System.out.println("Ostrich can make Sound");
    }

    @Override
    public void eating() {
        System.out.println("Ostrich can eat");
    }

    @Override
    public void fly() {
        System.out.println("Ostrich can fly in its own way");
    }
}
