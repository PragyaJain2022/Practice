public class Penguin extends bird implements Eating,makeSound{

    @Override
    public void eating() {
        System.out.println("Penguin can eat");
    }

    @Override
    public void makeSound() {
        System.out.println("Penguin can make Sound ");
    }
}
